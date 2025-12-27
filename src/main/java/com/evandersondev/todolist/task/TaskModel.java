package com.evandersondev.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_tasks")
public class TaskModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String description;

    // @Column(length = 50)
    private String title;
    private String priority;

    @Column(name = "start_at")
    private LocalDateTime startAt;

    @Column(name = "end_at")
    private LocalDateTime endAt;

    @CreationTimestamp
    private LocalDateTime createdAt;

    private UUID userId;

    public void setTitle(String title) throws Exception {
        if (title.length() > 50) {
            throw new Exception("Title must have less than 50 characters");
        }
        this.title = title;
    }

}

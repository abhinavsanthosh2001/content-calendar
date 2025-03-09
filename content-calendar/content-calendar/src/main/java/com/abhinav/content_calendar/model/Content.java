package com.abhinav.content_calendar.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String title;
    String description;

    @Enumerated(EnumType.STRING)
    Status status;
    @Enumerated(EnumType.STRING)
    Type contentType;
    LocalDateTime dateCreated;
    LocalDateTime dateUpdated;
    String url;
}

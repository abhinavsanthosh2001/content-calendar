package com.abhinav.content_calendar.repository;

import com.abhinav.content_calendar.model.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content, Integer> { }

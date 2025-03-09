//package com.abhinav.content_calendar.repository;
//
//import com.abhinav.content_calendar.model.Content;
//import com.abhinav.content_calendar.model.Status;
//import com.abhinav.content_calendar.model.Type;
//import jakarta.annotation.PostConstruct;
//import org.springframework.stereotype.Repository;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public class ContentCollectionRepository {
//
//    private final List<Content> contents = new ArrayList<>();
//
//    public ContentCollectionRepository(){
//
//    }
//
//    public List<Content> finadAll() {
//        return contents;
//    }
//
//    public Optional<Content> findById(int id){
//        return contents.stream().filter(c-> c.id().equals(id)).findFirst();
//    }
//
//    @PostConstruct
//    private void init(){
//        Content c = new Content(
//                1,
//                "My First Post",
//                "description",
//                Status.IDEA,
//                Type.ARTICLE,
//                LocalDateTime.now(),
//                null,
//                ""
//                );
//        contents.add(c);
//    }
//
//    public void save(Content content) {
//        contents.removeIf(c-> c.id().equals(content.id()));
//        contents.add(content);
//    }
//
//    public boolean existsById(Integer id) {
//        return contents.stream().anyMatch(c-> c.id().equals(id));
//    }
//
//    public void delete(Integer id) {
//        contents.removeIf(c-> c.id().equals(id));
//    }
//}

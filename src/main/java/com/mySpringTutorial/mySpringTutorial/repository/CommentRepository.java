package com.mySpringTutorial.mySpringTutorial.repository;

import com.mySpringTutorial.mySpringTutorial.model.Comment;
import com.mySpringTutorial.mySpringTutorial.model.Post;
import com.mySpringTutorial.mySpringTutorial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
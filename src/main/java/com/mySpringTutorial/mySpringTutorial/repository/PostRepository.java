package com.mySpringTutorial.mySpringTutorial.repository;


import com.mySpringTutorial.mySpringTutorial.model.Post;
import com.mySpringTutorial.mySpringTutorial.model.Subreddit;
import com.mySpringTutorial.mySpringTutorial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}

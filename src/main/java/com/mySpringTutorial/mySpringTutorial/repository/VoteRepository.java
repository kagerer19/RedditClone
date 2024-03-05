package com.mySpringTutorial.mySpringTutorial.repository;

import com.mySpringTutorial.mySpringTutorial.model.Post;
import com.mySpringTutorial.mySpringTutorial.model.User;
import com.mySpringTutorial.mySpringTutorial.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
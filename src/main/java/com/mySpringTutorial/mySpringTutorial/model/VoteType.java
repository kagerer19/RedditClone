package com.mySpringTutorial.mySpringTutorial.model;

public enum VoteType {
    UPVOTE(1), DOWNVOTE(-1),
    ;
    VoteType(int direction){

    }
}

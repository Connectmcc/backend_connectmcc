package com.mcc.connectMcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcc.connectMcc.modal.Comment;

public interface CommentRepository extends JpaRepository<Comment,Integer> {

}

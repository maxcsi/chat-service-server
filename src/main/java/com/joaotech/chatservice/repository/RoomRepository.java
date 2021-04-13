package com.joaotech.chatservice.repository;

import com.joaotech.chatservice.model.RoomDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoomRepository extends MongoRepository<RoomDocument, String> {

    Optional<RoomDocument> findByToken(String token);

    Optional<RoomDocument> findBySender_TokenAndRecipient_TokenAndClosedOnIsNull(String senderToken, String recipientToken);

}
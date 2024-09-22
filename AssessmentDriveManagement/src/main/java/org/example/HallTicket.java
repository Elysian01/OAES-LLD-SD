package org.example;


public class HallTicket {
    int ticketId;

    // foreign key from session table - one hall ticket can be a part of only a single session
    int sessionId;
    String candidateName;
    String candidateRollNumber;

}

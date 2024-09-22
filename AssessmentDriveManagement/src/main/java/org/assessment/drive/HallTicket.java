package org.assessment.drive;


public class HallTicket {
    int ticketId;

    // foreign key from session table - one hall ticket can be a part of only a single session
    int sessionId;
    String candidateName;

    public HallTicket(int sessionId, String candidateName, String candidateRollNumber) {
        this.sessionId = sessionId;
        this.candidateName = candidateName;
        this.candidateRollNumber = candidateRollNumber;
    }

    @Override
    public String toString() {
        return "HallTicket{" +
                "sessionId=" + sessionId +
                ", candidateName='" + candidateName + '\'' +
                ", candidateRollNumber='" + candidateRollNumber + '\'' +
                '}';
    }

    String candidateRollNumber;

    public int getSessionId() {
        return sessionId;
    }

    public int getTicketId() {
        return ticketId;
    }


    public String getCandidateName() {
        return candidateName;
    }

    public String getCandidateRollNumber() {
        return candidateRollNumber;
    }


    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }


    public void setCandidateName(String name) {
        candidateName = name;
    }

    public void setCandidateRollNumber(String rollNumber) {
        candidateRollNumber = rollNumber;
    }

}

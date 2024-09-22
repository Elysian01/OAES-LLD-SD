package org.assessment.manager;

import org.assessment.drive.HallTicket;
import org.assessment.pack.AssessmentInboundPack;
import org.assessment.pack.AssessmentOutboundPack;

import java.time.LocalDateTime;
import java.util.List;

public class SessionManager {

    int sessionId;
    LocalDateTime startTime;

    LocalDateTime endTime;

    String Location;

    List<HallTicket> hallTicketList;

    AssessmentInboundPack assessmentInboundPack;
    AssessmentOutboundPack assessmentOutboundPack;

    public SessionManager(int sessionId, List<HallTicket> hallTicketList) {
        this.sessionId = sessionId;
        this.hallTicketList = hallTicketList;
    }

    public int getSessionId() {
        return sessionId;
    }
    public SessionManager(int sessionId) {
        this.sessionId = sessionId;
    }

    public SessionManager createSession(int sessionId) {
        SessionManager sessionManager = new SessionManager(sessionId);
        System.out.println("Session Created with ID: " + sessionId);

        return sessionManager;
    }

    public void setAssessmentInboundPack(AssessmentInboundPack assessmentInboundPack) {
        assessmentInboundPack.setHallTicketList(hallTicketList);
        this.assessmentInboundPack = assessmentInboundPack;
    }

    public void setAssessmentOutboundPack(AssessmentOutboundPack assessmentOutboundPack) {
        this.assessmentOutboundPack = assessmentOutboundPack;
    }

    public void addHallTicket(HallTicket hallTicket) {
        hallTicketList.add(hallTicket);
    }

    public void deleteHallTicket(HallTicket hallTicket) {
        hallTicketList.remove(hallTicket);
    }

    void updateHallTicketCandidateName(HallTicket hallTicket, String name) {
        int i = hallTicketList.indexOf(hallTicket);
        hallTicketList.get(i).setCandidateName(name);
    }

    void updateHallTicketRollNumber(HallTicket hallTicket, String rollNumber) {
        int i = hallTicketList.indexOf(hallTicket);
        hallTicketList.get(i).setCandidateRollNumber(rollNumber);
    }

    public List<HallTicket> getHallTicketList() {
        return hallTicketList;
    }

}

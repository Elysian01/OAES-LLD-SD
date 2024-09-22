package org.assessment.drive;

import org.assessment.manager.SessionManager;

import java.util.List;

public class AssessmentDriveFacade {
    private AssessmentDrive assessmentDrive = AssessmentDrive.getInstance();
    public void conductSessionAssessmentProcess(int driveId, int sessionId, List<HallTicket> hallTicketList) {

        // Creating Session, InboundPack, and OutboundPack
//        for (int i = 1; i <= numOfSession; i++) {
//
//            SessionManager session = new SessionManager(i);
//            assessmentDrive.addSessionManager(session);
//
//            assessmentDrive.generateInBoundPack(session);
//            assessmentDrive.startAssessmentManager(session);
//        }

        SessionManager session = new SessionManager(sessionId, hallTicketList);

        List<HallTicket> hallTickets = session.getHallTicketList();

        for(HallTicket hallTicket:hallTickets) {
            System.out.println(hallTicket.toString());
        }

        assessmentDrive.addSessionManager(session);

        assessmentDrive.generateInBoundPack(session);
        assessmentDrive.startAssessmentManager(session);



        assessmentDrive.evaluateAllSessions();
    }

}

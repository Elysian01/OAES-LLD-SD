package org.assessment;

import org.assessment.drive.AssessmentDriveFacade;
import org.assessment.drive.HallTicket;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AssessmentDriveFacade assessmentDriveFacade = new AssessmentDriveFacade();
        int driveId = 1, sessionId=1;
        HallTicket hallTicket1 = new HallTicket(sessionId,"Abhishek", "1");
        HallTicket hallTicket2 = new HallTicket(sessionId,"Nikhil", "2");

        List<HallTicket> hallTicketList = new ArrayList<>();
        hallTicketList.add(hallTicket1);
        hallTicketList.add(hallTicket2);

        assessmentDriveFacade.conductSessionAssessmentProcess(driveId, sessionId, hallTicketList);

    }
}
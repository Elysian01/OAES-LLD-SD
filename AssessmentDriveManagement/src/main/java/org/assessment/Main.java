package org.assessment;

import org.assessment.drive.AssessmentDriveFacade;

public class Main {
    public static void main(String[] args) {
        AssessmentDriveFacade assessmentDriveFacade = new AssessmentDriveFacade();
        int driveId = 1;
        int numOfSession = 2;

        assessmentDriveFacade.conductFullAssessmentProcess(driveId, numOfSession);

    }
}
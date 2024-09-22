package org.assessment.drive;

import org.assessment.manager.SessionManager;

public class AssessmentDriveFacade {
    private AssessmentDrive assessmentDrive = AssessmentDrive.getInstance();

    public void conductFullAssessmentProcess(int driveId, int numOfSession) {

        // Creating Session, InboundPack, and OutboundPack
        for (int i = 1; i <= numOfSession; i++) {
            SessionManager session = assessmentDrive.createSession(i);
            assessmentDrive.generateInBoundPack(session);
            assessmentDrive.startAssessmentManager(session);
        }

        assessmentDrive.evaluateAllSessions();
    }

}

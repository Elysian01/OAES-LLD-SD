package org.assessment.drive;

import org.assessment.manager.SessionManager;
import org.assessment.pack.AssessmentInboundPack;
import org.assessment.pack.AssessmentOutboundPack;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssessmentDrive {

    public static AssessmentDrive assessmentDrive = null;

    int driveId;

    String name;

    Date startDate, endDate;
    List<SessionManager> sessionManagerList;

    private AssessmentDrive() {
        sessionManagerList = new ArrayList<>();
    }

    public static AssessmentDrive getInstance() {
        if (assessmentDrive == null) {
            assessmentDrive = new AssessmentDrive();
        }
        return assessmentDrive;
    }

    public SessionManager createSession(int sessionId) {
        SessionManager sessionManager = new SessionManager(sessionId);
        sessionManagerList.add(sessionManager);
        System.out.println("Session Created with ID: " + sessionId);
        return sessionManager;
    }
    public AssessmentInboundPack generateInBoundPack(SessionManager sessionManager) {
        AssessmentInboundPack assessmentInboundPack = null;
        System.out.println("Inbound Package Generated for Session-ID: " + sessionManager.getSessionId());
        return assessmentInboundPack;
    }
    public AssessmentOutboundPack startAssessmentManager(SessionManager sessionManager) {
        AssessmentOutboundPack assessmentOutboundPack = null;
        System.out.println("Outbound Package Generated for Session-ID: " + sessionManager.getSessionId() + "\n\n");
        return assessmentOutboundPack;
    }
    public AssessmentDriveResult evaluateAllSessions() {
        System.out.println("Calculating All Sessions Result....");

        AssessmentDriveResult assessmentDriveResult = null;
        System.out.println("Complete Assessment Result Computed");
        return assessmentDriveResult;
    }
}

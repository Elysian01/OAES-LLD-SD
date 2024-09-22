package org.assessment.manager;

import org.assessment.pack.AssessmentInboundPack;
import org.assessment.pack.AssessmentOutboundPack;

import java.time.LocalDateTime;

public class SessionManager {

    int sessionId;
    LocalDateTime startTime;

    LocalDateTime endTime;

    String Location;

    AssessmentInboundPack assessmentInboundPack;

    AssessmentOutboundPack assessmentOutboundPack;

    public int getSessionId() {
        return sessionId;
    }
    public SessionManager(int sessionId) {
        this.sessionId = sessionId;
    }

    public void setAssessmentInboundPack(AssessmentInboundPack assessmentInboundPack) {
        this.assessmentInboundPack = assessmentInboundPack;
    }

    public void setAssessmentOutboundPack(AssessmentOutboundPack assessmentOutboundPack) {
        this.assessmentOutboundPack = assessmentOutboundPack;
    }
}

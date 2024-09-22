package org.assessment.pack;

import org.assessment.drive.HallTicket;
import org.assessment.response.AssessmentResponse;

import java.util.List;

public class AssessmentOutboundPack {
    List<AssessmentResponse> assessmentResponseList;

    List<HallTicket> attendanceList;

    public void setAssessmentResponseList(List<AssessmentResponse> assessmentResponseList) {
        this.assessmentResponseList = assessmentResponseList;
    }

    public void setAttendanceList(List<HallTicket> attendanceList) {
        this.attendanceList = attendanceList;
    }
}

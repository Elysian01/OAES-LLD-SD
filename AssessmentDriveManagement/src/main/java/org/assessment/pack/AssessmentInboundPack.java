package org.assessment.pack;

import org.assessment.drive.HallTicket;
import org.assessment.itemHandler.AssessmentInstrument;
import org.assessment.manager.SessionManager;

import java.util.List;

public class AssessmentInboundPack {
    int inboundPackId;

    List<HallTicket> hallTicketList;
    AssessmentInstrument assessmentInstrument;

    public void setHallTicketList(List<HallTicket> hallTicketList) {
        this.hallTicketList = hallTicketList;
    }

    public void setAssessmentInstrument(AssessmentInstrument ai){
        this.assessmentInstrument = ai;
    }

}

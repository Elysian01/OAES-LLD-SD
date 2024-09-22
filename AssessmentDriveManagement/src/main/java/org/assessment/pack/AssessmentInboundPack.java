package org.assessment.pack;

import org.assessment.drive.HallTicket;
import org.assessment.itemHandler.AssessmentInstrument;

import java.util.List;

public class AssessmentInboundPack {
    int inboundPackId;

    int sessionId;
    List<HallTicket> hallTicketList;
    AssessmentInstrument assessmentInstrument;

    public void addHallTicket(HallTicket ht) {
        hallTicketList.add(ht);
    }

    public void setAssessmentInstrument(AssessmentInstrument ai){
        this.assessmentInstrument = ai;
    }

}

package org.assessment.drive;

import java.time.LocalDateTime;
import java.util.List;

public class Session {
    int sessionId;

    int driveId;
    String center;
    String name;

    String subject;

    LocalDateTime start, end;

    // a session can have multiple hall tickets
    List<HallTicket> hallTicketList;

}

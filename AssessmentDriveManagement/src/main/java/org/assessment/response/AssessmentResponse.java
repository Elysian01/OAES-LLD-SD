package org.assessment.response;

import java.util.List;

public class AssessmentResponse {
    int assessmentResponseId;

    List<ItemResponse> itemResponseList;

    int hallTicketId;

    public void addItemResponse(ItemResponse itemResponse) {
        itemResponseList.add(itemResponse);
    }

}

package org.assessment.response;

public class ItemResponse {

    int itemResponseId;
    int itemId;
    String response;

    public ItemResponse(int itemId, String response) {
//        this.itemResponseId =
        this.itemId = itemId;
        this.response = response;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}

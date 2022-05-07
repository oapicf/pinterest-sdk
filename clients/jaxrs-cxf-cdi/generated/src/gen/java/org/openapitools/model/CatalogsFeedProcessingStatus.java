package org.openapitools.model;

import javax.validation.constraints.*;


public enum CatalogsFeedProcessingStatus {

    COMPLETED(String.valueOf("COMPLETED")), COMPLETED_EARLY(String.valueOf("COMPLETED_EARLY")), DISAPPROVED(String.valueOf("DISAPPROVED")), FAILED(String.valueOf("FAILED")), PROCESSING(String.valueOf("PROCESSING")), QUEUED_FOR_PROCESSING(String.valueOf("QUEUED_FOR_PROCESSING")), UNDER_APPEAL(String.valueOf("UNDER_APPEAL")), UNDER_REVIEW(String.valueOf("UNDER_REVIEW"));


    private String value;

    CatalogsFeedProcessingStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CatalogsFeedProcessingStatus fromValue(String value) {
        for (CatalogsFeedProcessingStatus b : CatalogsFeedProcessingStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}




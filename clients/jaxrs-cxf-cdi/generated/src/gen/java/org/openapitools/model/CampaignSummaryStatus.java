package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * Summary status for campaign
 **/

public enum CampaignSummaryStatus {

    RUNNING(String.valueOf("RUNNING")), PAUSED(String.valueOf("PAUSED")), NOT_STARTED(String.valueOf("NOT_STARTED")), COMPLETED(String.valueOf("COMPLETED")), ADVERTISER_DISABLED(String.valueOf("ADVERTISER_DISABLED")), ARCHIVED(String.valueOf("ARCHIVED"));


    private String value;

    CampaignSummaryStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CampaignSummaryStatus fromValue(String value) {
        for (CampaignSummaryStatus b : CampaignSummaryStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}




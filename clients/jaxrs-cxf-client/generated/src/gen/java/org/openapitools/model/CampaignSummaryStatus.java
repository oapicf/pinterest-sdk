package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Summary status for campaign
 */
public enum CampaignSummaryStatus {
  
  RUNNING("RUNNING"),
  
  PAUSED("PAUSED"),
  
  NOT_STARTED("NOT_STARTED"),
  
  COMPLETED("COMPLETED"),
  
  ADVERTISER_DISABLED("ADVERTISER_DISABLED"),
  
  ARCHIVED("ARCHIVED"),
  
  DRAFT("DRAFT"),
  
  DELETED_DRAFT("DELETED_DRAFT");

  private String value;

  CampaignSummaryStatus(String value) {
    this.value = value;
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


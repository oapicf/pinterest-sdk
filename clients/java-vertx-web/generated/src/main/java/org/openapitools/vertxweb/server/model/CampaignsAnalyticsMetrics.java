package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignsAnalyticsMetrics   {
  
  private String CAMPAIGN_ID;
  private LocalDate DATE;

  public CampaignsAnalyticsMetrics () {

  }

  public CampaignsAnalyticsMetrics (String CAMPAIGN_ID, LocalDate DATE) {
    this.CAMPAIGN_ID = CAMPAIGN_ID;
    this.DATE = DATE;
  }

    
  @JsonProperty("CAMPAIGN_ID")
  public String getCAMPAIGNID() {
    return CAMPAIGN_ID;
  }
  public void setCAMPAIGNID(String CAMPAIGN_ID) {
    this.CAMPAIGN_ID = CAMPAIGN_ID;
  }

    
  @JsonProperty("DATE")
  public LocalDate getDATE() {
    return DATE;
  }
  public void setDATE(LocalDate DATE) {
    this.DATE = DATE;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignsAnalyticsMetrics campaignsAnalyticsMetrics = (CampaignsAnalyticsMetrics) o;
    return Objects.equals(CAMPAIGN_ID, campaignsAnalyticsMetrics.CAMPAIGN_ID) &&
        Objects.equals(DATE, campaignsAnalyticsMetrics.DATE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CAMPAIGN_ID, DATE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignsAnalyticsMetrics {\n");
    
    sb.append("    CAMPAIGN_ID: ").append(toIndentedString(CAMPAIGN_ID)).append("\n");
    sb.append("    DATE: ").append(toIndentedString(DATE)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

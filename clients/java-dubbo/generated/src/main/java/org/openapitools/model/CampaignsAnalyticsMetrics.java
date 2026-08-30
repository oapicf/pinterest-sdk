package org.openapitools.model;

import java.time.LocalDate;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CampaignsAnalyticsMetrics implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
   */
  @JsonProperty("CAMPAIGN_ID")
  private String CAMPAIGN_ID;

  /**
   * Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)
   */
  @JsonProperty("DATE")
  private LocalDate DATE;

  /**
   * The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
   * @return CAMPAIGN_ID
   */
  public String getCAMPAIGNID() {
    return CAMPAIGN_ID;
  }

  public void setCAMPAIGNID(String CAMPAIGN_ID) {
    this.CAMPAIGN_ID = CAMPAIGN_ID;
  }

  /**
   * Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)
   * @return DATE
   */
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
    return Objects.equals(this.CAMPAIGN_ID, campaignsAnalyticsMetrics.CAMPAIGN_ID) &&
        Objects.equals(this.DATE, campaignsAnalyticsMetrics.DATE);
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

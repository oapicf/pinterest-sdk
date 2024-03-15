package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CampaignsAnalyticsResponseInner extends HashMap<String, Object> {
  
 /**
  * The ID of the campaing that this metrics belongs to.
  */
  @ApiModelProperty(required = true, value = "The ID of the campaing that this metrics belongs to.")
  private String CAMPAIGN_ID;

 /**
  * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  */
  @ApiModelProperty(value = "Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate DATE;
 /**
  * The ID of the campaing that this metrics belongs to.
  * @return CAMPAIGN_ID
  */
  @JsonProperty("CAMPAIGN_ID")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getCAMPAIGNID() {
    return CAMPAIGN_ID;
  }

  /**
   * Sets the <code>CAMPAIGN_ID</code> property.
   */
 public void setCAMPAIGNID(String CAMPAIGN_ID) {
    this.CAMPAIGN_ID = CAMPAIGN_ID;
  }

  /**
   * Sets the <code>CAMPAIGN_ID</code> property.
   */
  public CampaignsAnalyticsResponseInner CAMPAIGN_ID(String CAMPAIGN_ID) {
    this.CAMPAIGN_ID = CAMPAIGN_ID;
    return this;
  }

 /**
  * Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)
  * @return DATE
  */
  @JsonProperty("DATE")
  public LocalDate getDATE() {
    return DATE;
  }

  /**
   * Sets the <code>DATE</code> property.
   */
 public void setDATE(LocalDate DATE) {
    this.DATE = DATE;
  }

  /**
   * Sets the <code>DATE</code> property.
   */
  public CampaignsAnalyticsResponseInner DATE(LocalDate DATE) {
    this.DATE = DATE;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignsAnalyticsResponseInner campaignsAnalyticsResponseInner = (CampaignsAnalyticsResponseInner) o;
    return super.equals(o) && Objects.equals(this.CAMPAIGN_ID, campaignsAnalyticsResponseInner.CAMPAIGN_ID) &&
        Objects.equals(this.DATE, campaignsAnalyticsResponseInner.DATE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), CAMPAIGN_ID, super.hashCode(), DATE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignsAnalyticsResponseInner {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    CAMPAIGN_ID: ").append(toIndentedString(CAMPAIGN_ID)).append("\n");
    sb.append("    DATE: ").append(toIndentedString(DATE)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


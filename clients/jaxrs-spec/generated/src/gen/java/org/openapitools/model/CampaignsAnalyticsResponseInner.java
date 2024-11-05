package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CampaignsAnalyticsResponse_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CampaignsAnalyticsResponseInner extends HashMap<String, Object>  {
  private String CAMPAIGN_ID;
  private LocalDate DATE;

  /**
   * The ID of the campaing that this metrics belongs to.
   **/
  public CampaignsAnalyticsResponseInner CAMPAIGN_ID(String CAMPAIGN_ID) {
    this.CAMPAIGN_ID = CAMPAIGN_ID;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the campaing that this metrics belongs to.")
  @JsonProperty("CAMPAIGN_ID")
  @NotNull  @Pattern(regexp="^\\d+$")public String getCAMPAIGNID() {
    return CAMPAIGN_ID;
  }

  @JsonProperty("CAMPAIGN_ID")
  public void setCAMPAIGNID(String CAMPAIGN_ID) {
    this.CAMPAIGN_ID = CAMPAIGN_ID;
  }

  /**
   * Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)
   **/
  public CampaignsAnalyticsResponseInner DATE(LocalDate DATE) {
    this.DATE = DATE;
    return this;
  }

  
  @ApiModelProperty(value = "Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)")
  @JsonProperty("DATE")
  public LocalDate getDATE() {
    return DATE;
  }

  @JsonProperty("DATE")
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
    CampaignsAnalyticsResponseInner campaignsAnalyticsResponseInner = (CampaignsAnalyticsResponseInner) o;
    return Objects.equals(this.CAMPAIGN_ID, campaignsAnalyticsResponseInner.CAMPAIGN_ID) &&
        Objects.equals(this.DATE, campaignsAnalyticsResponseInner.DATE) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CAMPAIGN_ID, DATE, super.hashCode());
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}


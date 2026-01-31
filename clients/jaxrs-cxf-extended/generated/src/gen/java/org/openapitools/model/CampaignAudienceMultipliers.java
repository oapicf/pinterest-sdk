package org.openapitools.model;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * This represents a mapping from Audience ID to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified audience in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */
@ApiModel(description="This represents a mapping from Audience ID to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified audience in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).")

public class CampaignAudienceMultipliers extends HashMap<String, Double> {
  
  @ApiModelProperty(value = "")
  private String AUDIENCE_ID;
 /**
  * Get AUDIENCE_ID
  * @return AUDIENCE_ID
  */
  @JsonProperty("AUDIENCE_ID")
 @Pattern(regexp="^\\d+$")  public String getAUDIENCEID() {
    return AUDIENCE_ID;
  }

  /**
   * Sets the <code>AUDIENCE_ID</code> property.
   */
 public void setAUDIENCEID(String AUDIENCE_ID) {
    this.AUDIENCE_ID = AUDIENCE_ID;
  }

  /**
   * Sets the <code>AUDIENCE_ID</code> property.
   */
  public CampaignAudienceMultipliers AUDIENCE_ID(String AUDIENCE_ID) {
    this.AUDIENCE_ID = AUDIENCE_ID;
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
    CampaignAudienceMultipliers campaignAudienceMultipliers = (CampaignAudienceMultipliers) o;
    return super.equals(o) && Objects.equals(this.AUDIENCE_ID, campaignAudienceMultipliers.AUDIENCE_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), AUDIENCE_ID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignAudienceMultipliers {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    AUDIENCE_ID: ").append(toIndentedString(AUDIENCE_ID)).append("\n");
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


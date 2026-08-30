package org.openapitools.model;

import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * This represents a mapping from Audience ID to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified audience in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */
public class CampaignAudienceMultipliers extends HashMap<String, Double> {
  private static final long serialVersionUID = 1L;

  /**
   * Audience ID for the multiplier.
   */
  @JsonProperty("AUDIENCE_ID")
  private String AUDIENCE_ID;

  /**
   * Audience ID for the multiplier.
   * @return AUDIENCE_ID
   */
  public String getAUDIENCEID() {
    return AUDIENCE_ID;
  }

  public void setAUDIENCEID(String AUDIENCE_ID) {
    this.AUDIENCE_ID = AUDIENCE_ID;
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
    return Objects.equals(this.AUDIENCE_ID, campaignAudienceMultipliers.AUDIENCE_ID) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AUDIENCE_ID, super.hashCode());
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

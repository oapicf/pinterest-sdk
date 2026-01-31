package apimodels;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * This represents a mapping from Audience ID to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified audience in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CampaignAudienceMultipliers extends HashMap<String, Double>  {
  @JsonProperty("AUDIENCE_ID")
  @Pattern(regexp="^\\d+$")

  private String AUDIENCE_ID;

  public CampaignAudienceMultipliers AUDIENCE_ID(String AUDIENCE_ID) {
    this.AUDIENCE_ID = AUDIENCE_ID;
    return this;
  }

   /**
   * Get AUDIENCE_ID
   * @return AUDIENCE_ID
  **/
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
    return Objects.equals(AUDIENCE_ID, campaignAudienceMultipliers.AUDIENCE_ID) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AUDIENCE_ID, super.hashCode());
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


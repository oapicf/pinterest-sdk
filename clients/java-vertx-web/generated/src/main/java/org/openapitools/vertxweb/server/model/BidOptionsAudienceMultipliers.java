package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/**
 * This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BidOptionsAudienceMultipliers   {
  
  private String audienceId;
  private BigDecimal multiplier;

  public BidOptionsAudienceMultipliers () {

  }

  public BidOptionsAudienceMultipliers (String audienceId, BigDecimal multiplier) {
    this.audienceId = audienceId;
    this.multiplier = multiplier;
  }

    
  @JsonProperty("audience_id")
  public String getAudienceId() {
    return audienceId;
  }
  public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

    
  @JsonProperty("multiplier")
  public BigDecimal getMultiplier() {
    return multiplier;
  }
  public void setMultiplier(BigDecimal multiplier) {
    this.multiplier = multiplier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BidOptionsAudienceMultipliers bidOptionsAudienceMultipliers = (BidOptionsAudienceMultipliers) o;
    return Objects.equals(audienceId, bidOptionsAudienceMultipliers.audienceId) &&
        Objects.equals(multiplier, bidOptionsAudienceMultipliers.multiplier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceId, multiplier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BidOptionsAudienceMultipliers {\n");
    
    sb.append("    audienceId: ").append(toIndentedString(audienceId)).append("\n");
    sb.append("    multiplier: ").append(toIndentedString(multiplier)).append("\n");
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

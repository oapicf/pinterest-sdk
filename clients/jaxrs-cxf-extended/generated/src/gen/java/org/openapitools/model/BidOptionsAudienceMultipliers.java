package org.openapitools.model;

import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */
@ApiModel(description="This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.")

public class BidOptionsAudienceMultipliers  {
  
  @ApiModelProperty(required = true, value = "")
  private String audienceId;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private BigDecimal multiplier;
 /**
  * Get audienceId
  * @return audienceId
  */
  @JsonProperty("audience_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getAudienceId() {
    return audienceId;
  }

  /**
   * Sets the <code>audienceId</code> property.
   */
 public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

  /**
   * Sets the <code>audienceId</code> property.
   */
  public BidOptionsAudienceMultipliers audienceId(String audienceId) {
    this.audienceId = audienceId;
    return this;
  }

 /**
  * Get multiplier
  * @return multiplier
  */
  @JsonProperty("multiplier")
  @NotNull
  public BigDecimal getMultiplier() {
    return multiplier;
  }

  /**
   * Sets the <code>multiplier</code> property.
   */
 public void setMultiplier(BigDecimal multiplier) {
    this.multiplier = multiplier;
  }

  /**
   * Sets the <code>multiplier</code> property.
   */
  public BidOptionsAudienceMultipliers multiplier(BigDecimal multiplier) {
    this.multiplier = multiplier;
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
    BidOptionsAudienceMultipliers bidOptionsAudienceMultipliers = (BidOptionsAudienceMultipliers) o;
    return Objects.equals(this.audienceId, bidOptionsAudienceMultipliers.audienceId) &&
        Objects.equals(this.multiplier, bidOptionsAudienceMultipliers.multiplier);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


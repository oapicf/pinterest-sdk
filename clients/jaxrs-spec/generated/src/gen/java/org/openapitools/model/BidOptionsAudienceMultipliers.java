package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 **/
@ApiModel(description = "This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.")
@JsonTypeName("BidOptionsAudienceMultipliers")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BidOptionsAudienceMultipliers   {
  private String audienceId;
  private BigDecimal multiplier;

  public BidOptionsAudienceMultipliers() {
  }

  @JsonCreator
  public BidOptionsAudienceMultipliers(
    @JsonProperty(required = true, value = "audience_id") String audienceId,
    @JsonProperty(required = true, value = "multiplier") BigDecimal multiplier
  ) {
    this.audienceId = audienceId;
    this.multiplier = multiplier;
  }

  /**
   **/
  public BidOptionsAudienceMultipliers audienceId(String audienceId) {
    this.audienceId = audienceId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "audience_id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getAudienceId() {
    return audienceId;
  }

  @JsonProperty(required = true, value = "audience_id")
  public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

  /**
   **/
  public BidOptionsAudienceMultipliers multiplier(BigDecimal multiplier) {
    this.multiplier = multiplier;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "multiplier")
  @NotNull @Valid public BigDecimal getMultiplier() {
    return multiplier;
  }

  @JsonProperty(required = true, value = "multiplier")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}

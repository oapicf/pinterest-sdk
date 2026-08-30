package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
 * Range audience size for an ad group.
 **/
@ApiModel(description = "Range audience size for an ad group.")
@JsonTypeName("CampaignPlanningAdGroupAudienceSize")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignPlanningAdGroupAudienceSize   {
  private Integer countLower;
  private Integer countUpper;

  public CampaignPlanningAdGroupAudienceSize() {
  }

  /**
   * Lower bound of the audience size estimate.
   * minimum: 0
   **/
  public CampaignPlanningAdGroupAudienceSize countLower(Integer countLower) {
    this.countLower = countLower;
    return this;
  }

  
  @ApiModelProperty(example = "1000000", value = "Lower bound of the audience size estimate.")
  @JsonProperty("count_lower")
   @Min(0)public Integer getCountLower() {
    return countLower;
  }

  @JsonProperty("count_lower")
  public void setCountLower(Integer countLower) {
    this.countLower = countLower;
  }

  /**
   * Upper bound of the audience size estimate.
   * minimum: 0
   **/
  public CampaignPlanningAdGroupAudienceSize countUpper(Integer countUpper) {
    this.countUpper = countUpper;
    return this;
  }

  
  @ApiModelProperty(example = "2000000", value = "Upper bound of the audience size estimate.")
  @JsonProperty("count_upper")
   @Min(0)public Integer getCountUpper() {
    return countUpper;
  }

  @JsonProperty("count_upper")
  public void setCountUpper(Integer countUpper) {
    this.countUpper = countUpper;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignPlanningAdGroupAudienceSize campaignPlanningAdGroupAudienceSize = (CampaignPlanningAdGroupAudienceSize) o;
    return Objects.equals(this.countLower, campaignPlanningAdGroupAudienceSize.countLower) &&
        Objects.equals(this.countUpper, campaignPlanningAdGroupAudienceSize.countUpper);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countLower, countUpper);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignPlanningAdGroupAudienceSize {\n");
    
    sb.append("    countLower: ").append(toIndentedString(countLower)).append("\n");
    sb.append("    countUpper: ").append(toIndentedString(countUpper)).append("\n");
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

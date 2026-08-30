package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Range audience size for an ad group.
 **/

@ApiModel(description = "Range audience size for an ad group.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignPlanningAdGroupAudienceSize   {
  @JsonProperty("count_lower")
  private Integer countLower;

  @JsonProperty("count_upper")
  private Integer countUpper;

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
  public Integer getCountLower() {
    return countLower;
  }
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
  public Integer getCountUpper() {
    return countUpper;
  }
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
    return Objects.equals(countLower, campaignPlanningAdGroupAudienceSize.countLower) &&
        Objects.equals(countUpper, campaignPlanningAdGroupAudienceSize.countUpper);
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


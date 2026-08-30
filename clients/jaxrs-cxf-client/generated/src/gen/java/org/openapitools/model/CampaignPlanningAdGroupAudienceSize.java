package org.openapitools.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Range audience size for an ad group.
 */
@ApiModel(description="Range audience size for an ad group.")

public class CampaignPlanningAdGroupAudienceSize  {
  
 /**
  * Lower bound of the audience size estimate.
  */
  @ApiModelProperty(example = "1000000", value = "Lower bound of the audience size estimate.")

  private Integer countLower;

 /**
  * Upper bound of the audience size estimate.
  */
  @ApiModelProperty(example = "2000000", value = "Upper bound of the audience size estimate.")

  private Integer countUpper;
 /**
   * Lower bound of the audience size estimate.
   * minimum: 0
   * @return countLower
  **/
  @JsonProperty("count_lower")
  public Integer getCountLower() {
    return countLower;
  }

  public void setCountLower(Integer countLower) {
    this.countLower = countLower;
  }

  public CampaignPlanningAdGroupAudienceSize countLower(Integer countLower) {
    this.countLower = countLower;
    return this;
  }

 /**
   * Upper bound of the audience size estimate.
   * minimum: 0
   * @return countUpper
  **/
  @JsonProperty("count_upper")
  public Integer getCountUpper() {
    return countUpper;
  }

  public void setCountUpper(Integer countUpper) {
    this.countUpper = countUpper;
  }

  public CampaignPlanningAdGroupAudienceSize countUpper(Integer countUpper) {
    this.countUpper = countUpper;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Range audience size for an ad group.
 */
public class CampaignPlanningAdGroupAudienceSize implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Lower bound of the audience size estimate.
   */
  @JsonProperty("count_lower")
  private Integer countLower;

  /**
   * Upper bound of the audience size estimate.
   */
  @JsonProperty("count_upper")
  private Integer countUpper;

  /**
   * Lower bound of the audience size estimate.
   * @return countLower
   */
  public Integer getCountLower() {
    return countLower;
  }

  public void setCountLower(Integer countLower) {
    this.countLower = countLower;
  }

  /**
   * Upper bound of the audience size estimate.
   * @return countUpper
   */
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

package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Range audience size for an ad group.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignPlanningAdGroupAudienceSize   {
  
  private Integer countLower;
  private Integer countUpper;

  public CampaignPlanningAdGroupAudienceSize () {

  }

  public CampaignPlanningAdGroupAudienceSize (Integer countLower, Integer countUpper) {
    this.countLower = countLower;
    this.countUpper = countUpper;
  }

    
  @JsonProperty("count_lower")
  public Integer getCountLower() {
    return countLower;
  }
  public void setCountLower(Integer countLower) {
    this.countLower = countLower;
  }

    
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

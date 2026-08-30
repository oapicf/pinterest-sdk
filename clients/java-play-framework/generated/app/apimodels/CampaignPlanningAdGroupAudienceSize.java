package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Range audience size for an ad group.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CampaignPlanningAdGroupAudienceSize   {
  @JsonProperty("count_lower")
  @Min(0)

  private Integer countLower;

  @JsonProperty("count_upper")
  @Min(0)

  private Integer countUpper;

  public CampaignPlanningAdGroupAudienceSize countLower(Integer countLower) {
    this.countLower = countLower;
    return this;
  }

   /**
   * Lower bound of the audience size estimate.
   * minimum: 0
   * @return countLower
  **/
  public Integer getCountLower() {
    return countLower;
  }

  public void setCountLower(Integer countLower) {
    this.countLower = countLower;
  }

  public CampaignPlanningAdGroupAudienceSize countUpper(Integer countUpper) {
    this.countUpper = countUpper;
    return this;
  }

   /**
   * Upper bound of the audience size estimate.
   * minimum: 0
   * @return countUpper
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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


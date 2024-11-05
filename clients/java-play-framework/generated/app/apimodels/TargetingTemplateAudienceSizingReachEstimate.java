package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TargetingTemplateAudienceSizingReachEstimate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TargetingTemplateAudienceSizingReachEstimate   {
  @JsonProperty("estimate")
  
  private Long estimate;

  @JsonProperty("lower_bound")
  
  private Long lowerBound;

  @JsonProperty("upper_bound")
  
  private Long upperBound;

  public TargetingTemplateAudienceSizingReachEstimate estimate(Long estimate) {
    this.estimate = estimate;
    return this;
  }

   /**
   * Get estimate
   * @return estimate
  **/
  public Long getEstimate() {
    return estimate;
  }

  public void setEstimate(Long estimate) {
    this.estimate = estimate;
  }

  public TargetingTemplateAudienceSizingReachEstimate lowerBound(Long lowerBound) {
    this.lowerBound = lowerBound;
    return this;
  }

   /**
   * Get lowerBound
   * @return lowerBound
  **/
  public Long getLowerBound() {
    return lowerBound;
  }

  public void setLowerBound(Long lowerBound) {
    this.lowerBound = lowerBound;
  }

  public TargetingTemplateAudienceSizingReachEstimate upperBound(Long upperBound) {
    this.upperBound = upperBound;
    return this;
  }

   /**
   * Get upperBound
   * @return upperBound
  **/
  public Long getUpperBound() {
    return upperBound;
  }

  public void setUpperBound(Long upperBound) {
    this.upperBound = upperBound;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetingTemplateAudienceSizingReachEstimate targetingTemplateAudienceSizingReachEstimate = (TargetingTemplateAudienceSizingReachEstimate) o;
    return Objects.equals(estimate, targetingTemplateAudienceSizingReachEstimate.estimate) &&
        Objects.equals(lowerBound, targetingTemplateAudienceSizingReachEstimate.lowerBound) &&
        Objects.equals(upperBound, targetingTemplateAudienceSizingReachEstimate.upperBound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimate, lowerBound, upperBound);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingTemplateAudienceSizingReachEstimate {\n");
    
    sb.append("    estimate: ").append(toIndentedString(estimate)).append("\n");
    sb.append("    lowerBound: ").append(toIndentedString(lowerBound)).append("\n");
    sb.append("    upperBound: ").append(toIndentedString(upperBound)).append("\n");
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


package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OptimizationGoalMetadataScrollupGoalMetadata  {
  
  @ApiModelProperty(value = "")
  private String scrollupGoalValueInMicroCurrency;
 /**
  * Get scrollupGoalValueInMicroCurrency
  * @return scrollupGoalValueInMicroCurrency
  */
  @JsonProperty("scrollup_goal_value_in_micro_currency")
 @Pattern(regexp="^[0-9]+$")  public String getScrollupGoalValueInMicroCurrency() {
    return scrollupGoalValueInMicroCurrency;
  }

  /**
   * Sets the <code>scrollupGoalValueInMicroCurrency</code> property.
   */
 public void setScrollupGoalValueInMicroCurrency(String scrollupGoalValueInMicroCurrency) {
    this.scrollupGoalValueInMicroCurrency = scrollupGoalValueInMicroCurrency;
  }

  /**
   * Sets the <code>scrollupGoalValueInMicroCurrency</code> property.
   */
  public OptimizationGoalMetadataScrollupGoalMetadata scrollupGoalValueInMicroCurrency(String scrollupGoalValueInMicroCurrency) {
    this.scrollupGoalValueInMicroCurrency = scrollupGoalValueInMicroCurrency;
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
    OptimizationGoalMetadataScrollupGoalMetadata optimizationGoalMetadataScrollupGoalMetadata = (OptimizationGoalMetadataScrollupGoalMetadata) o;
    return Objects.equals(this.scrollupGoalValueInMicroCurrency, optimizationGoalMetadataScrollupGoalMetadata.scrollupGoalValueInMicroCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scrollupGoalValueInMicroCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizationGoalMetadataScrollupGoalMetadata {\n");
    
    sb.append("    scrollupGoalValueInMicroCurrency: ").append(toIndentedString(scrollupGoalValueInMicroCurrency)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


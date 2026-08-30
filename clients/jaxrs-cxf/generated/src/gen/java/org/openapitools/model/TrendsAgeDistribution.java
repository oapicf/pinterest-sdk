package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.TrendsAgeBucket;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 */
@ApiModel(description="This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.")

public class TrendsAgeDistribution extends HashMap<String, Double> {
  
  @ApiModelProperty(value = "")

  @Valid

  private TrendsAgeBucket ageDistribution;
 /**
   * Get ageDistribution
   * @return ageDistribution
  **/
  @JsonProperty("age_distribution")
  public TrendsAgeBucket getAgeDistribution() {
    return ageDistribution;
  }

  public void setAgeDistribution(TrendsAgeBucket ageDistribution) {
    this.ageDistribution = ageDistribution;
  }

  public TrendsAgeDistribution ageDistribution(TrendsAgeBucket ageDistribution) {
    this.ageDistribution = ageDistribution;
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
    TrendsAgeDistribution trendsAgeDistribution = (TrendsAgeDistribution) o;
    return Objects.equals(this.ageDistribution, trendsAgeDistribution.ageDistribution) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageDistribution, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendsAgeDistribution {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ageDistribution: ").append(toIndentedString(ageDistribution)).append("\n");
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


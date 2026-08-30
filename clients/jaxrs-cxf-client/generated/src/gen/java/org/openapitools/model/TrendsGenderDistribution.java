package org.openapitools.model;

import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.TrendsGender;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 */
@ApiModel(description="This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.")

public class TrendsGenderDistribution extends HashMap<String, Double> {
  
  @ApiModelProperty(value = "")

  private TrendsGender genderDistribution;
 /**
   * Get genderDistribution
   * @return genderDistribution
  **/
  @JsonProperty("gender_distribution")
  public TrendsGender getGenderDistribution() {
    return genderDistribution;
  }

  public void setGenderDistribution(TrendsGender genderDistribution) {
    this.genderDistribution = genderDistribution;
  }

  public TrendsGenderDistribution genderDistribution(TrendsGender genderDistribution) {
    this.genderDistribution = genderDistribution;
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
    TrendsGenderDistribution trendsGenderDistribution = (TrendsGenderDistribution) o;
    return Objects.equals(this.genderDistribution, trendsGenderDistribution.genderDistribution) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genderDistribution, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendsGenderDistribution {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    genderDistribution: ").append(toIndentedString(genderDistribution)).append("\n");
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


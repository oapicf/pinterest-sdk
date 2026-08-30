package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.TrendsGender;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.")
public class TrendsGenderDistribution extends HashMap<String, Double>  {
  
  private TrendsGender genderDistribution;

  /**
   **/
  public TrendsGenderDistribution genderDistribution(TrendsGender genderDistribution) {
    this.genderDistribution = genderDistribution;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("gender_distribution")
  public TrendsGender getGenderDistribution() {
    return genderDistribution;
  }
  public void setGenderDistribution(TrendsGender genderDistribution) {
    this.genderDistribution = genderDistribution;
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
    return super.equals(o) && Objects.equals(this.genderDistribution, trendsGenderDistribution.genderDistribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), genderDistribution);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


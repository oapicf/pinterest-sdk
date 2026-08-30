package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.TrendsGender;

/**
 * This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 */
@ApiModel(description = "This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TrendsGenderDistribution extends HashMap<String, Double>  {
  @JsonProperty("gender_distribution")
  private TrendsGender genderDistribution;

  public TrendsGenderDistribution genderDistribution(TrendsGender genderDistribution) {
    this.genderDistribution = genderDistribution;
    return this;
  }

   /**
   * Get genderDistribution
   * @return genderDistribution
  **/
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


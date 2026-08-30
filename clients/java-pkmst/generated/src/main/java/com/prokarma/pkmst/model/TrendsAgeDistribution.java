package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.TrendsAgeBucket;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 */
@ApiModel(description = "This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TrendsAgeDistribution extends HashMap<String, Double>  {
  @JsonProperty("age_distribution")
  private TrendsAgeBucket ageDistribution;

  public TrendsAgeDistribution ageDistribution(TrendsAgeBucket ageDistribution) {
    this.ageDistribution = ageDistribution;
    return this;
  }

  /**
   * Get ageDistribution
   * @return ageDistribution
   */
  @ApiModelProperty(value = "")
  public TrendsAgeBucket getAgeDistribution() {
    return ageDistribution;
  }

  public void setAgeDistribution(TrendsAgeBucket ageDistribution) {
    this.ageDistribution = ageDistribution;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


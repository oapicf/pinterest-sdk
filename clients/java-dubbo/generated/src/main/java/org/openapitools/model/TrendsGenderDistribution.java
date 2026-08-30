package org.openapitools.model;

import org.openapitools.model.TrendsGender;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 */
public class TrendsGenderDistribution extends HashMap<String, Double> {
  private static final long serialVersionUID = 1L;

  @JsonProperty("gender_distribution")
  private TrendsGender genderDistribution;

  /**
   * 
   * @return genderDistribution
   */
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
    return Objects.equals(this.genderDistribution, trendsGenderDistribution.genderDistribution) && super.equals(o);
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

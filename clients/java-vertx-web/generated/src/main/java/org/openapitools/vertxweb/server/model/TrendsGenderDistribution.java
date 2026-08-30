package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.vertxweb.server.model.TrendsGender;

/**
 * This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrendsGenderDistribution extends HashMap<String, Double>  {
  
  private TrendsGender genderDistribution;

  public TrendsGenderDistribution () {

  }

  public TrendsGenderDistribution (TrendsGender genderDistribution) {
    this.genderDistribution = genderDistribution;
  }

    
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
    return super.equals(o) && Objects.equals(genderDistribution, trendsGenderDistribution.genderDistribution);
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

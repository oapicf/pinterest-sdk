package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TrendingKeywordDemographicsGenderDistribution extends HashMap<String, Double>  {
  /**
   * Gets or Sets genderDistribution
   */
  public enum GenderDistributionEnum {
    MALE("male"),
    
    FEMALE("female"),
    
    UNSPECIFIED("unspecified");

    private final String value;

    GenderDistributionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GenderDistributionEnum fromValue(String value) {
      for (GenderDistributionEnum b : GenderDistributionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("gender_distribution")
  
  private GenderDistributionEnum genderDistribution;

  public TrendingKeywordDemographicsGenderDistribution genderDistribution(GenderDistributionEnum genderDistribution) {
    this.genderDistribution = genderDistribution;
    return this;
  }

   /**
   * Get genderDistribution
   * @return genderDistribution
  **/
  public GenderDistributionEnum getGenderDistribution() {
    return genderDistribution;
  }

  public void setGenderDistribution(GenderDistributionEnum genderDistribution) {
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
    TrendingKeywordDemographicsGenderDistribution trendingKeywordDemographicsGenderDistribution = (TrendingKeywordDemographicsGenderDistribution) o;
    return Objects.equals(genderDistribution, trendingKeywordDemographicsGenderDistribution.genderDistribution) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genderDistribution, super.hashCode());
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingKeywordDemographicsGenderDistribution {\n");
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


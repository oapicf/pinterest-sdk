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
 * This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TrendingKeywordDemographicsAgeDistribution extends HashMap<String, Double>  {
  /**
   * Gets or Sets ageDistribution
   */
  public enum AgeDistributionEnum {
    _18_24("18-24"),
    
    _25_34("25-34"),
    
    _35_44("35-44"),
    
    _45_49("45-49"),
    
    _50_54("50-54"),
    
    _55_64("55-64"),
    
    _65_("65+");

    private final String value;

    AgeDistributionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AgeDistributionEnum fromValue(String value) {
      for (AgeDistributionEnum b : AgeDistributionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("age_distribution")
  
  private AgeDistributionEnum ageDistribution;

  public TrendingKeywordDemographicsAgeDistribution ageDistribution(AgeDistributionEnum ageDistribution) {
    this.ageDistribution = ageDistribution;
    return this;
  }

   /**
   * Get ageDistribution
   * @return ageDistribution
  **/
  public AgeDistributionEnum getAgeDistribution() {
    return ageDistribution;
  }

  public void setAgeDistribution(AgeDistributionEnum ageDistribution) {
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
    TrendingKeywordDemographicsAgeDistribution trendingKeywordDemographicsAgeDistribution = (TrendingKeywordDemographicsAgeDistribution) o;
    return Objects.equals(ageDistribution, trendingKeywordDemographicsAgeDistribution.ageDistribution) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageDistribution, super.hashCode());
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingKeywordDemographicsAgeDistribution {\n");
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


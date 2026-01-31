package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 */

@Schema(name = "TrendingKeyword_demographics_age_distribution", description = "This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.")
@JsonTypeName("TrendingKeyword_demographics_age_distribution")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TrendingKeywordDemographicsAgeDistribution {

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable AgeDistributionEnum ageDistribution;

  public TrendingKeywordDemographicsAgeDistribution ageDistribution(@Nullable AgeDistributionEnum ageDistribution) {
    this.ageDistribution = ageDistribution;
    return this;
  }

  /**
   * Get ageDistribution
   * @return ageDistribution
   */
  
  @Schema(name = "age_distribution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("age_distribution")
  public @Nullable AgeDistributionEnum getAgeDistribution() {
    return ageDistribution;
  }

  public void setAgeDistribution(@Nullable AgeDistributionEnum ageDistribution) {
    this.ageDistribution = ageDistribution;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Double> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public TrendingKeywordDemographicsAgeDistribution putAdditionalProperty(String key, Double value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Double>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Double> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Double getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
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
    return Objects.equals(this.ageDistribution, trendingKeywordDemographicsAgeDistribution.ageDistribution) &&
    Objects.equals(this.additionalProperties, trendingKeywordDemographicsAgeDistribution.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageDistribution, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingKeywordDemographicsAgeDistribution {\n");
    sb.append("    ageDistribution: ").append(toIndentedString(ageDistribution)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


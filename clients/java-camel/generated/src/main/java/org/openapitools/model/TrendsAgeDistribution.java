package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.TrendsAgeBucket;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 */

@Schema(name = "TrendsAgeDistribution", description = "This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TrendsAgeDistribution {

  private TrendsAgeBucket ageDistribution;

  public TrendsAgeDistribution ageDistribution(TrendsAgeBucket ageDistribution) {
    this.ageDistribution = ageDistribution;
    return this;
  }

  /**
   * Get ageDistribution
   * @return ageDistribution
   */
  @Valid 
  @Schema(name = "age_distribution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("age_distribution")
  public TrendsAgeBucket getAgeDistribution() {
    return ageDistribution;
  }

  public void setAgeDistribution(TrendsAgeBucket ageDistribution) {
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
    public TrendsAgeDistribution putAdditionalProperty(String key, Double value) {
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
    TrendsAgeDistribution trendsAgeDistribution = (TrendsAgeDistribution) o;
    return Objects.equals(this.ageDistribution, trendsAgeDistribution.ageDistribution) &&
    Objects.equals(this.additionalProperties, trendsAgeDistribution.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageDistribution, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendsAgeDistribution {\n");
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


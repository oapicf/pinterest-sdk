package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.TrendsGender;
import org.springframework.lang.Nullable;
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
 * This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 */

@Schema(name = "TrendsGenderDistribution", description = "This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TrendsGenderDistribution {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable TrendsGender genderDistribution;

  public TrendsGenderDistribution genderDistribution(@Nullable TrendsGender genderDistribution) {
    this.genderDistribution = genderDistribution;
    return this;
  }

  /**
   * Get genderDistribution
   * @return genderDistribution
   */
  @Valid 
  @Schema(name = "gender_distribution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender_distribution")
  public @Nullable TrendsGender getGenderDistribution() {
    return genderDistribution;
  }

  @JsonProperty("gender_distribution")
  public void setGenderDistribution(@Nullable TrendsGender genderDistribution) {
    this.genderDistribution = genderDistribution;
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
    public TrendsGenderDistribution putAdditionalProperty(String key, Double value) {
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
    TrendsGenderDistribution trendsGenderDistribution = (TrendsGenderDistribution) o;
    return Objects.equals(this.genderDistribution, trendsGenderDistribution.genderDistribution) &&
    Objects.equals(this.additionalProperties, trendsGenderDistribution.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genderDistribution, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendsGenderDistribution {\n");
    sb.append("    genderDistribution: ").append(toIndentedString(genderDistribution)).append("\n");
    
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


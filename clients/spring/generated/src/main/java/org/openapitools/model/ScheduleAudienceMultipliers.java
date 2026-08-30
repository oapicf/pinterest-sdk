package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */

@Schema(name = "ScheduleAudienceMultipliers", description = "This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ScheduleAudienceMultipliers {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String AUDIENCE_ID;

  public ScheduleAudienceMultipliers AUDIENCE_ID(@Nullable String AUDIENCE_ID) {
    this.AUDIENCE_ID = AUDIENCE_ID;
    return this;
  }

  /**
   * Get AUDIENCE_ID
   * @return AUDIENCE_ID
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "AUDIENCE_ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AUDIENCE_ID")
  public @Nullable String getAUDIENCEID() {
    return AUDIENCE_ID;
  }

  @JsonProperty("AUDIENCE_ID")
  public void setAUDIENCEID(@Nullable String AUDIENCE_ID) {
    this.AUDIENCE_ID = AUDIENCE_ID;
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
    public ScheduleAudienceMultipliers putAdditionalProperty(String key, Double value) {
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
    ScheduleAudienceMultipliers scheduleAudienceMultipliers = (ScheduleAudienceMultipliers) o;
    return Objects.equals(this.AUDIENCE_ID, scheduleAudienceMultipliers.AUDIENCE_ID) &&
    Objects.equals(this.additionalProperties, scheduleAudienceMultipliers.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AUDIENCE_ID, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleAudienceMultipliers {\n");
    sb.append("    AUDIENCE_ID: ").append(toIndentedString(AUDIENCE_ID)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


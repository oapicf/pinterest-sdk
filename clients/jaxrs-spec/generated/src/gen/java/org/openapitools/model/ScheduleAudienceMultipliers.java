package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 **/
@ApiModel(description = "This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.")
@JsonTypeName("ScheduleAudienceMultipliers")
@JsonFormat(shape=JsonFormat.Shape.OBJECT)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ScheduleAudienceMultipliers extends HashMap<String, Double>  {
  private String AUDIENCE_ID;

  public ScheduleAudienceMultipliers() {
  }

  /**
   **/
  public ScheduleAudienceMultipliers AUDIENCE_ID(String AUDIENCE_ID) {
    this.AUDIENCE_ID = AUDIENCE_ID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("AUDIENCE_ID")
   @Pattern(regexp="^\\d+$")public String getAUDIENCEID() {
    return AUDIENCE_ID;
  }

  @JsonProperty("AUDIENCE_ID")
  public void setAUDIENCEID(String AUDIENCE_ID) {
    this.AUDIENCE_ID = AUDIENCE_ID;
  }

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * Creates the property if it does not already exist, otherwise replaces it.
   * @param key the name of the property
   * @param value the value of the property
   * @return self reference
   */
  @JsonAnySetter
  public ScheduleAudienceMultipliers putAdditionalProperty(String key, Double value) {
    this.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) properties.
   * @return the additional (undeclared) properties
   */
  @JsonAnyGetter
  public Map<String, Double> getAdditionalProperties() {
    return this;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   * @param key the name of the property
   * @return the additional (undeclared) property with the specified name
   */
  public Double getAdditionalProperty(String key) {
    return this.get(key);
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
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AUDIENCE_ID, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleAudienceMultipliers {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    AUDIENCE_ID: ").append(toIndentedString(AUDIENCE_ID)).append("\n");
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

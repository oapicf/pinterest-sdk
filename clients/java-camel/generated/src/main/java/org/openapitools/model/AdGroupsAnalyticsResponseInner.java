package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
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
 * AdGroupsAnalyticsResponseInner
 */

@JsonTypeName("AdGroupsAnalyticsResponse_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdGroupsAnalyticsResponseInner {

  private String AD_GROUP_ID;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date DATE;

  public AdGroupsAnalyticsResponseInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdGroupsAnalyticsResponseInner(String AD_GROUP_ID) {
    this.AD_GROUP_ID = AD_GROUP_ID;
  }

  public AdGroupsAnalyticsResponseInner AD_GROUP_ID(String AD_GROUP_ID) {
    this.AD_GROUP_ID = AD_GROUP_ID;
    return this;
  }

  /**
   * The ID of the ad group that this metrics belongs to.
   * @return AD_GROUP_ID
  */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "AD_GROUP_ID", description = "The ID of the ad group that this metrics belongs to.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AD_GROUP_ID")
  public String getADGROUPID() {
    return AD_GROUP_ID;
  }

  public void setADGROUPID(String AD_GROUP_ID) {
    this.AD_GROUP_ID = AD_GROUP_ID;
  }

  public AdGroupsAnalyticsResponseInner DATE(Date DATE) {
    this.DATE = DATE;
    return this;
  }

  /**
   * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
   * @return DATE
  */
  @Valid 
  @Schema(name = "DATE", description = "Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DATE")
  public Date getDATE() {
    return DATE;
  }

  public void setDATE(Date DATE) {
    this.DATE = DATE;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public AdGroupsAnalyticsResponseInner putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
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
    AdGroupsAnalyticsResponseInner adGroupsAnalyticsResponseInner = (AdGroupsAnalyticsResponseInner) o;
    return Objects.equals(this.AD_GROUP_ID, adGroupsAnalyticsResponseInner.AD_GROUP_ID) &&
        Objects.equals(this.DATE, adGroupsAnalyticsResponseInner.DATE) &&
    Objects.equals(this.additionalProperties, adGroupsAnalyticsResponseInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AD_GROUP_ID, DATE, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupsAnalyticsResponseInner {\n");
    sb.append("    AD_GROUP_ID: ").append(toIndentedString(AD_GROUP_ID)).append("\n");
    sb.append("    DATE: ").append(toIndentedString(DATE)).append("\n");
    
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


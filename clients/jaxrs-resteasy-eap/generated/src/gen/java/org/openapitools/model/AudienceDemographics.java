package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AudienceDemographicValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Audience demographics")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-03-14T23:04:54.712028318Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AudienceDemographics   {
  
  private List<@Valid AudienceDemographicValue> ages;
  private List<@Valid AudienceDemographicValue> genders;
  private List<@Valid AudienceDemographicValue> devices;
  private List<@Valid AudienceDemographicValue> metros;
  private List<@Valid AudienceDemographicValue> countries;

  /**
   * Ages distribution.
   **/
  
  @ApiModelProperty(value = "Ages distribution.")
  @JsonProperty("ages")
  public List<@Valid AudienceDemographicValue> getAges() {
    return ages;
  }
  public void setAges(List<@Valid AudienceDemographicValue> ages) {
    this.ages = ages;
  }

  /**
   * Gender distribution.
   **/
  
  @ApiModelProperty(value = "Gender distribution.")
  @JsonProperty("genders")
  public List<@Valid AudienceDemographicValue> getGenders() {
    return genders;
  }
  public void setGenders(List<@Valid AudienceDemographicValue> genders) {
    this.genders = genders;
  }

  /**
   * Device usage distribution.
   **/
  
  @ApiModelProperty(value = "Device usage distribution.")
  @JsonProperty("devices")
  public List<@Valid AudienceDemographicValue> getDevices() {
    return devices;
  }
  public void setDevices(List<@Valid AudienceDemographicValue> devices) {
    this.devices = devices;
  }

  /**
   * Geographic metro area distribution.
   **/
  
  @ApiModelProperty(value = "Geographic metro area distribution.")
  @JsonProperty("metros")
  public List<@Valid AudienceDemographicValue> getMetros() {
    return metros;
  }
  public void setMetros(List<@Valid AudienceDemographicValue> metros) {
    this.metros = metros;
  }

  /**
   * Country area distribution.
   **/
  
  @ApiModelProperty(value = "Country area distribution.")
  @JsonProperty("countries")
  public List<@Valid AudienceDemographicValue> getCountries() {
    return countries;
  }
  public void setCountries(List<@Valid AudienceDemographicValue> countries) {
    this.countries = countries;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceDemographics audienceDemographics = (AudienceDemographics) o;
    return Objects.equals(this.ages, audienceDemographics.ages) &&
        Objects.equals(this.genders, audienceDemographics.genders) &&
        Objects.equals(this.devices, audienceDemographics.devices) &&
        Objects.equals(this.metros, audienceDemographics.metros) &&
        Objects.equals(this.countries, audienceDemographics.countries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ages, genders, devices, metros, countries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceDemographics {\n");
    
    sb.append("    ages: ").append(toIndentedString(ages)).append("\n");
    sb.append("    genders: ").append(toIndentedString(genders)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    metros: ").append(toIndentedString(metros)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
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


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

@ApiModel(description="Audience demographics")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AudienceDemographics   {
  
  private List<@Valid AudienceDemographicValue> ages = new ArrayList<>();
  private List<@Valid AudienceDemographicValue> countries = new ArrayList<>();
  private List<@Valid AudienceDemographicValue> devices = new ArrayList<>();
  private List<@Valid AudienceDemographicValue> genders = new ArrayList<>();
  private List<@Valid AudienceDemographicValue> metros = new ArrayList<>();

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
        Objects.equals(this.countries, audienceDemographics.countries) &&
        Objects.equals(this.devices, audienceDemographics.devices) &&
        Objects.equals(this.genders, audienceDemographics.genders) &&
        Objects.equals(this.metros, audienceDemographics.metros);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ages, countries, devices, genders, metros);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceDemographics {\n");
    
    sb.append("    ages: ").append(toIndentedString(ages)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    genders: ").append(toIndentedString(genders)).append("\n");
    sb.append("    metros: ").append(toIndentedString(metros)).append("\n");
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


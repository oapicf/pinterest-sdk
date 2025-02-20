/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AudienceDemographicValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Audience demographics
 */
@ApiModel(description = "Audience demographics")
@JsonPropertyOrder({
  AudienceDemographics.JSON_PROPERTY_AGES,
  AudienceDemographics.JSON_PROPERTY_GENDERS,
  AudienceDemographics.JSON_PROPERTY_DEVICES,
  AudienceDemographics.JSON_PROPERTY_METROS,
  AudienceDemographics.JSON_PROPERTY_COUNTRIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-05T02:20:07.425136412Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AudienceDemographics   {
  public static final String JSON_PROPERTY_AGES = "ages";
  @JsonProperty(JSON_PROPERTY_AGES)
  private List<@Valid AudienceDemographicValue> ages = new ArrayList<>();

  public static final String JSON_PROPERTY_GENDERS = "genders";
  @JsonProperty(JSON_PROPERTY_GENDERS)
  private List<@Valid AudienceDemographicValue> genders = new ArrayList<>();

  public static final String JSON_PROPERTY_DEVICES = "devices";
  @JsonProperty(JSON_PROPERTY_DEVICES)
  private List<@Valid AudienceDemographicValue> devices = new ArrayList<>();

  public static final String JSON_PROPERTY_METROS = "metros";
  @JsonProperty(JSON_PROPERTY_METROS)
  private List<@Valid AudienceDemographicValue> metros = new ArrayList<>();

  public static final String JSON_PROPERTY_COUNTRIES = "countries";
  @JsonProperty(JSON_PROPERTY_COUNTRIES)
  private List<@Valid AudienceDemographicValue> countries = new ArrayList<>();

  public AudienceDemographics ages(List<@Valid AudienceDemographicValue> ages) {
    this.ages = ages;
    return this;
  }

  public AudienceDemographics addAgesItem(AudienceDemographicValue agesItem) {
    if (this.ages == null) {
      this.ages = new ArrayList<>();
    }
    this.ages.add(agesItem);
    return this;
  }

  /**
   * Ages distribution.
   * @return ages
   **/
  @JsonProperty(value = "ages")
  @ApiModelProperty(value = "Ages distribution.")
  @Valid 
  public List<@Valid AudienceDemographicValue> getAges() {
    return ages;
  }

  public void setAges(List<@Valid AudienceDemographicValue> ages) {
    this.ages = ages;
  }

  public AudienceDemographics genders(List<@Valid AudienceDemographicValue> genders) {
    this.genders = genders;
    return this;
  }

  public AudienceDemographics addGendersItem(AudienceDemographicValue gendersItem) {
    if (this.genders == null) {
      this.genders = new ArrayList<>();
    }
    this.genders.add(gendersItem);
    return this;
  }

  /**
   * Gender distribution.
   * @return genders
   **/
  @JsonProperty(value = "genders")
  @ApiModelProperty(value = "Gender distribution.")
  @Valid 
  public List<@Valid AudienceDemographicValue> getGenders() {
    return genders;
  }

  public void setGenders(List<@Valid AudienceDemographicValue> genders) {
    this.genders = genders;
  }

  public AudienceDemographics devices(List<@Valid AudienceDemographicValue> devices) {
    this.devices = devices;
    return this;
  }

  public AudienceDemographics addDevicesItem(AudienceDemographicValue devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<>();
    }
    this.devices.add(devicesItem);
    return this;
  }

  /**
   * Device usage distribution.
   * @return devices
   **/
  @JsonProperty(value = "devices")
  @ApiModelProperty(value = "Device usage distribution.")
  @Valid 
  public List<@Valid AudienceDemographicValue> getDevices() {
    return devices;
  }

  public void setDevices(List<@Valid AudienceDemographicValue> devices) {
    this.devices = devices;
  }

  public AudienceDemographics metros(List<@Valid AudienceDemographicValue> metros) {
    this.metros = metros;
    return this;
  }

  public AudienceDemographics addMetrosItem(AudienceDemographicValue metrosItem) {
    if (this.metros == null) {
      this.metros = new ArrayList<>();
    }
    this.metros.add(metrosItem);
    return this;
  }

  /**
   * Geographic metro area distribution.
   * @return metros
   **/
  @JsonProperty(value = "metros")
  @ApiModelProperty(value = "Geographic metro area distribution.")
  @Valid 
  public List<@Valid AudienceDemographicValue> getMetros() {
    return metros;
  }

  public void setMetros(List<@Valid AudienceDemographicValue> metros) {
    this.metros = metros;
  }

  public AudienceDemographics countries(List<@Valid AudienceDemographicValue> countries) {
    this.countries = countries;
    return this;
  }

  public AudienceDemographics addCountriesItem(AudienceDemographicValue countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<>();
    }
    this.countries.add(countriesItem);
    return this;
  }

  /**
   * Country area distribution.
   * @return countries
   **/
  @JsonProperty(value = "countries")
  @ApiModelProperty(value = "Country area distribution.")
  @Valid 
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


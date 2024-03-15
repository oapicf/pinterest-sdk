package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AudienceDemographicValue;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Audience demographics
 **/
@ApiModel(description="Audience demographics")

public class AudienceDemographics  {
  
  @ApiModelProperty(value = "Ages distribution.")
 /**
   * Ages distribution.
  **/
  private List<AudienceDemographicValue> ages;

  @ApiModelProperty(value = "Gender distribution.")
 /**
   * Gender distribution.
  **/
  private List<AudienceDemographicValue> genders;

  @ApiModelProperty(value = "Device usage distribution.")
 /**
   * Device usage distribution.
  **/
  private List<AudienceDemographicValue> devices;

  @ApiModelProperty(value = "Geographic metro area distribution.")
 /**
   * Geographic metro area distribution.
  **/
  private List<AudienceDemographicValue> metros;

  @ApiModelProperty(value = "Country area distribution.")
 /**
   * Country area distribution.
  **/
  private List<AudienceDemographicValue> countries;
 /**
   * Ages distribution.
   * @return ages
  **/
  @JsonProperty("ages")
  public List<AudienceDemographicValue> getAges() {
    return ages;
  }

  public void setAges(List<AudienceDemographicValue> ages) {
    this.ages = ages;
  }

  public AudienceDemographics ages(List<AudienceDemographicValue> ages) {
    this.ages = ages;
    return this;
  }

  public AudienceDemographics addAgesItem(AudienceDemographicValue agesItem) {
    this.ages.add(agesItem);
    return this;
  }

 /**
   * Gender distribution.
   * @return genders
  **/
  @JsonProperty("genders")
  public List<AudienceDemographicValue> getGenders() {
    return genders;
  }

  public void setGenders(List<AudienceDemographicValue> genders) {
    this.genders = genders;
  }

  public AudienceDemographics genders(List<AudienceDemographicValue> genders) {
    this.genders = genders;
    return this;
  }

  public AudienceDemographics addGendersItem(AudienceDemographicValue gendersItem) {
    this.genders.add(gendersItem);
    return this;
  }

 /**
   * Device usage distribution.
   * @return devices
  **/
  @JsonProperty("devices")
  public List<AudienceDemographicValue> getDevices() {
    return devices;
  }

  public void setDevices(List<AudienceDemographicValue> devices) {
    this.devices = devices;
  }

  public AudienceDemographics devices(List<AudienceDemographicValue> devices) {
    this.devices = devices;
    return this;
  }

  public AudienceDemographics addDevicesItem(AudienceDemographicValue devicesItem) {
    this.devices.add(devicesItem);
    return this;
  }

 /**
   * Geographic metro area distribution.
   * @return metros
  **/
  @JsonProperty("metros")
  public List<AudienceDemographicValue> getMetros() {
    return metros;
  }

  public void setMetros(List<AudienceDemographicValue> metros) {
    this.metros = metros;
  }

  public AudienceDemographics metros(List<AudienceDemographicValue> metros) {
    this.metros = metros;
    return this;
  }

  public AudienceDemographics addMetrosItem(AudienceDemographicValue metrosItem) {
    this.metros.add(metrosItem);
    return this;
  }

 /**
   * Country area distribution.
   * @return countries
  **/
  @JsonProperty("countries")
  public List<AudienceDemographicValue> getCountries() {
    return countries;
  }

  public void setCountries(List<AudienceDemographicValue> countries) {
    this.countries = countries;
  }

  public AudienceDemographics countries(List<AudienceDemographicValue> countries) {
    this.countries = countries;
    return this;
  }

  public AudienceDemographics addCountriesItem(AudienceDemographicValue countriesItem) {
    this.countries.add(countriesItem);
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


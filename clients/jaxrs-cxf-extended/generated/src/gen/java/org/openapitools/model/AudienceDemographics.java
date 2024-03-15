package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AudienceDemographicValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Audience demographics
 */
@ApiModel(description="Audience demographics")

public class AudienceDemographics  {
  
 /**
  * Ages distribution.
  */
  @ApiModelProperty(value = "Ages distribution.")
  @Valid
  private List<@Valid AudienceDemographicValue> ages;

 /**
  * Gender distribution.
  */
  @ApiModelProperty(value = "Gender distribution.")
  @Valid
  private List<@Valid AudienceDemographicValue> genders;

 /**
  * Device usage distribution.
  */
  @ApiModelProperty(value = "Device usage distribution.")
  @Valid
  private List<@Valid AudienceDemographicValue> devices;

 /**
  * Geographic metro area distribution.
  */
  @ApiModelProperty(value = "Geographic metro area distribution.")
  @Valid
  private List<@Valid AudienceDemographicValue> metros;

 /**
  * Country area distribution.
  */
  @ApiModelProperty(value = "Country area distribution.")
  @Valid
  private List<@Valid AudienceDemographicValue> countries;
 /**
  * Ages distribution.
  * @return ages
  */
  @JsonProperty("ages")
  public List<@Valid AudienceDemographicValue> getAges() {
    return ages;
  }

  /**
   * Sets the <code>ages</code> property.
   */
 public void setAges(List<@Valid AudienceDemographicValue> ages) {
    this.ages = ages;
  }

  /**
   * Sets the <code>ages</code> property.
   */
  public AudienceDemographics ages(List<@Valid AudienceDemographicValue> ages) {
    this.ages = ages;
    return this;
  }

  /**
   * Adds a new item to the <code>ages</code> list.
   */
  public AudienceDemographics addAgesItem(AudienceDemographicValue agesItem) {
    this.ages.add(agesItem);
    return this;
  }

 /**
  * Gender distribution.
  * @return genders
  */
  @JsonProperty("genders")
  public List<@Valid AudienceDemographicValue> getGenders() {
    return genders;
  }

  /**
   * Sets the <code>genders</code> property.
   */
 public void setGenders(List<@Valid AudienceDemographicValue> genders) {
    this.genders = genders;
  }

  /**
   * Sets the <code>genders</code> property.
   */
  public AudienceDemographics genders(List<@Valid AudienceDemographicValue> genders) {
    this.genders = genders;
    return this;
  }

  /**
   * Adds a new item to the <code>genders</code> list.
   */
  public AudienceDemographics addGendersItem(AudienceDemographicValue gendersItem) {
    this.genders.add(gendersItem);
    return this;
  }

 /**
  * Device usage distribution.
  * @return devices
  */
  @JsonProperty("devices")
  public List<@Valid AudienceDemographicValue> getDevices() {
    return devices;
  }

  /**
   * Sets the <code>devices</code> property.
   */
 public void setDevices(List<@Valid AudienceDemographicValue> devices) {
    this.devices = devices;
  }

  /**
   * Sets the <code>devices</code> property.
   */
  public AudienceDemographics devices(List<@Valid AudienceDemographicValue> devices) {
    this.devices = devices;
    return this;
  }

  /**
   * Adds a new item to the <code>devices</code> list.
   */
  public AudienceDemographics addDevicesItem(AudienceDemographicValue devicesItem) {
    this.devices.add(devicesItem);
    return this;
  }

 /**
  * Geographic metro area distribution.
  * @return metros
  */
  @JsonProperty("metros")
  public List<@Valid AudienceDemographicValue> getMetros() {
    return metros;
  }

  /**
   * Sets the <code>metros</code> property.
   */
 public void setMetros(List<@Valid AudienceDemographicValue> metros) {
    this.metros = metros;
  }

  /**
   * Sets the <code>metros</code> property.
   */
  public AudienceDemographics metros(List<@Valid AudienceDemographicValue> metros) {
    this.metros = metros;
    return this;
  }

  /**
   * Adds a new item to the <code>metros</code> list.
   */
  public AudienceDemographics addMetrosItem(AudienceDemographicValue metrosItem) {
    this.metros.add(metrosItem);
    return this;
  }

 /**
  * Country area distribution.
  * @return countries
  */
  @JsonProperty("countries")
  public List<@Valid AudienceDemographicValue> getCountries() {
    return countries;
  }

  /**
   * Sets the <code>countries</code> property.
   */
 public void setCountries(List<@Valid AudienceDemographicValue> countries) {
    this.countries = countries;
  }

  /**
   * Sets the <code>countries</code> property.
   */
  public AudienceDemographics countries(List<@Valid AudienceDemographicValue> countries) {
    this.countries = countries;
    return this;
  }

  /**
   * Adds a new item to the <code>countries</code> list.
   */
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


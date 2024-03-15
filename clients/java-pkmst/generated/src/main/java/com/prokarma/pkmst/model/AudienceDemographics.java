package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AudienceDemographicValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Audience demographics
 */
@ApiModel(description = "Audience demographics")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AudienceDemographics   {
  @JsonProperty("ages")
  
  private List<AudienceDemographicValue> ages = null;

  @JsonProperty("genders")
  
  private List<AudienceDemographicValue> genders = null;

  @JsonProperty("devices")
  
  private List<AudienceDemographicValue> devices = null;

  @JsonProperty("metros")
  
  private List<AudienceDemographicValue> metros = null;

  @JsonProperty("countries")
  
  private List<AudienceDemographicValue> countries = null;

  public AudienceDemographics ages(List<AudienceDemographicValue> ages) {
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
  @ApiModelProperty(value = "Ages distribution.")
  public List<AudienceDemographicValue> getAges() {
    return ages;
  }

  public void setAges(List<AudienceDemographicValue> ages) {
    this.ages = ages;
  }

  public AudienceDemographics genders(List<AudienceDemographicValue> genders) {
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
  @ApiModelProperty(value = "Gender distribution.")
  public List<AudienceDemographicValue> getGenders() {
    return genders;
  }

  public void setGenders(List<AudienceDemographicValue> genders) {
    this.genders = genders;
  }

  public AudienceDemographics devices(List<AudienceDemographicValue> devices) {
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
  @ApiModelProperty(value = "Device usage distribution.")
  public List<AudienceDemographicValue> getDevices() {
    return devices;
  }

  public void setDevices(List<AudienceDemographicValue> devices) {
    this.devices = devices;
  }

  public AudienceDemographics metros(List<AudienceDemographicValue> metros) {
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
  @ApiModelProperty(value = "Geographic metro area distribution.")
  public List<AudienceDemographicValue> getMetros() {
    return metros;
  }

  public void setMetros(List<AudienceDemographicValue> metros) {
    this.metros = metros;
  }

  public AudienceDemographics countries(List<AudienceDemographicValue> countries) {
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
  @ApiModelProperty(value = "Country area distribution.")
  public List<AudienceDemographicValue> getCountries() {
    return countries;
  }

  public void setCountries(List<AudienceDemographicValue> countries) {
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


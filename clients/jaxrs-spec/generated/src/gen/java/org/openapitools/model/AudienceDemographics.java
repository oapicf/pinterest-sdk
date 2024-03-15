package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AudienceDemographicValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Audience demographics
 **/
@ApiModel(description = "Audience demographics")
@JsonTypeName("AudienceDemographics")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AudienceDemographics   {
  private @Valid List<@Valid AudienceDemographicValue> ages;
  private @Valid List<@Valid AudienceDemographicValue> genders;
  private @Valid List<@Valid AudienceDemographicValue> devices;
  private @Valid List<@Valid AudienceDemographicValue> metros;
  private @Valid List<@Valid AudienceDemographicValue> countries;

  /**
   * Ages distribution.
   **/
  public AudienceDemographics ages(List<@Valid AudienceDemographicValue> ages) {
    this.ages = ages;
    return this;
  }

  
  @ApiModelProperty(value = "Ages distribution.")
  @JsonProperty("ages")
  public List<AudienceDemographicValue> getAges() {
    return ages;
  }

  @JsonProperty("ages")
  public void setAges(List<@Valid AudienceDemographicValue> ages) {
    this.ages = ages;
  }

  public AudienceDemographics addAgesItem(AudienceDemographicValue agesItem) {
    if (this.ages == null) {
      this.ages = new ArrayList<>();
    }

    this.ages.add(agesItem);
    return this;
  }

  public AudienceDemographics removeAgesItem(AudienceDemographicValue agesItem) {
    if (agesItem != null && this.ages != null) {
      this.ages.remove(agesItem);
    }

    return this;
  }
  /**
   * Gender distribution.
   **/
  public AudienceDemographics genders(List<@Valid AudienceDemographicValue> genders) {
    this.genders = genders;
    return this;
  }

  
  @ApiModelProperty(value = "Gender distribution.")
  @JsonProperty("genders")
  public List<AudienceDemographicValue> getGenders() {
    return genders;
  }

  @JsonProperty("genders")
  public void setGenders(List<@Valid AudienceDemographicValue> genders) {
    this.genders = genders;
  }

  public AudienceDemographics addGendersItem(AudienceDemographicValue gendersItem) {
    if (this.genders == null) {
      this.genders = new ArrayList<>();
    }

    this.genders.add(gendersItem);
    return this;
  }

  public AudienceDemographics removeGendersItem(AudienceDemographicValue gendersItem) {
    if (gendersItem != null && this.genders != null) {
      this.genders.remove(gendersItem);
    }

    return this;
  }
  /**
   * Device usage distribution.
   **/
  public AudienceDemographics devices(List<@Valid AudienceDemographicValue> devices) {
    this.devices = devices;
    return this;
  }

  
  @ApiModelProperty(value = "Device usage distribution.")
  @JsonProperty("devices")
  public List<AudienceDemographicValue> getDevices() {
    return devices;
  }

  @JsonProperty("devices")
  public void setDevices(List<@Valid AudienceDemographicValue> devices) {
    this.devices = devices;
  }

  public AudienceDemographics addDevicesItem(AudienceDemographicValue devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<>();
    }

    this.devices.add(devicesItem);
    return this;
  }

  public AudienceDemographics removeDevicesItem(AudienceDemographicValue devicesItem) {
    if (devicesItem != null && this.devices != null) {
      this.devices.remove(devicesItem);
    }

    return this;
  }
  /**
   * Geographic metro area distribution.
   **/
  public AudienceDemographics metros(List<@Valid AudienceDemographicValue> metros) {
    this.metros = metros;
    return this;
  }

  
  @ApiModelProperty(value = "Geographic metro area distribution.")
  @JsonProperty("metros")
  public List<AudienceDemographicValue> getMetros() {
    return metros;
  }

  @JsonProperty("metros")
  public void setMetros(List<@Valid AudienceDemographicValue> metros) {
    this.metros = metros;
  }

  public AudienceDemographics addMetrosItem(AudienceDemographicValue metrosItem) {
    if (this.metros == null) {
      this.metros = new ArrayList<>();
    }

    this.metros.add(metrosItem);
    return this;
  }

  public AudienceDemographics removeMetrosItem(AudienceDemographicValue metrosItem) {
    if (metrosItem != null && this.metros != null) {
      this.metros.remove(metrosItem);
    }

    return this;
  }
  /**
   * Country area distribution.
   **/
  public AudienceDemographics countries(List<@Valid AudienceDemographicValue> countries) {
    this.countries = countries;
    return this;
  }

  
  @ApiModelProperty(value = "Country area distribution.")
  @JsonProperty("countries")
  public List<AudienceDemographicValue> getCountries() {
    return countries;
  }

  @JsonProperty("countries")
  public void setCountries(List<@Valid AudienceDemographicValue> countries) {
    this.countries = countries;
  }

  public AudienceDemographics addCountriesItem(AudienceDemographicValue countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<>();
    }

    this.countries.add(countriesItem);
    return this;
  }

  public AudienceDemographics removeCountriesItem(AudienceDemographicValue countriesItem) {
    if (countriesItem != null && this.countries != null) {
      this.countries.remove(countriesItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}


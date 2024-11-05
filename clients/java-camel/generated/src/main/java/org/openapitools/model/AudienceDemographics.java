package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AudienceDemographicValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Audience demographics
 */

@Schema(name = "AudienceDemographics", description = "Audience demographics")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AudienceDemographics {

  @Valid
  private List<@Valid AudienceDemographicValue> ages = new ArrayList<>();

  @Valid
  private List<@Valid AudienceDemographicValue> genders = new ArrayList<>();

  @Valid
  private List<@Valid AudienceDemographicValue> devices = new ArrayList<>();

  @Valid
  private List<@Valid AudienceDemographicValue> metros = new ArrayList<>();

  @Valid
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
   */
  @Valid 
  @Schema(name = "ages", description = "Ages distribution.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ages")
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
   */
  @Valid 
  @Schema(name = "genders", description = "Gender distribution.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("genders")
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
   */
  @Valid 
  @Schema(name = "devices", description = "Device usage distribution.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("devices")
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
   */
  @Valid 
  @Schema(name = "metros", description = "Geographic metro area distribution.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metros")
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
   */
  @Valid 
  @Schema(name = "countries", description = "Country area distribution.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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


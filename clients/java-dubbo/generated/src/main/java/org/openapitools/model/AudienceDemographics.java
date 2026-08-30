package org.openapitools.model;

import org.openapitools.model.AudienceDemographicValue;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Audience demographics
 */
public class AudienceDemographics implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Ages distribution.
   */
  @JsonProperty("ages")
  private List<AudienceDemographicValue> ages = new ArrayList<>();

  /**
   * Country area distribution.
   */
  @JsonProperty("countries")
  private List<AudienceDemographicValue> countries = new ArrayList<>();

  /**
   * Device usage distribution.
   */
  @JsonProperty("devices")
  private List<AudienceDemographicValue> devices = new ArrayList<>();

  /**
   * Gender distribution.
   */
  @JsonProperty("genders")
  private List<AudienceDemographicValue> genders = new ArrayList<>();

  /**
   * Geographic metro area distribution.
   */
  @JsonProperty("metros")
  private List<AudienceDemographicValue> metros = new ArrayList<>();

  /**
   * Ages distribution.
   * @return ages
   */
  public List<AudienceDemographicValue> getAges() {
    return ages;
  }

  public void setAges(List<AudienceDemographicValue> ages) {
    this.ages = ages;
  }

  /**
   * Country area distribution.
   * @return countries
   */
  public List<AudienceDemographicValue> getCountries() {
    return countries;
  }

  public void setCountries(List<AudienceDemographicValue> countries) {
    this.countries = countries;
  }

  /**
   * Device usage distribution.
   * @return devices
   */
  public List<AudienceDemographicValue> getDevices() {
    return devices;
  }

  public void setDevices(List<AudienceDemographicValue> devices) {
    this.devices = devices;
  }

  /**
   * Gender distribution.
   * @return genders
   */
  public List<AudienceDemographicValue> getGenders() {
    return genders;
  }

  public void setGenders(List<AudienceDemographicValue> genders) {
    this.genders = genders;
  }

  /**
   * Geographic metro area distribution.
   * @return metros
   */
  public List<AudienceDemographicValue> getMetros() {
    return metros;
  }

  public void setMetros(List<AudienceDemographicValue> metros) {
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

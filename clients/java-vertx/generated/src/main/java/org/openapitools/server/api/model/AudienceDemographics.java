package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.AudienceDemographicValue;

/**
 * Audience demographics
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AudienceDemographics   {
  
  private List<AudienceDemographicValue> ages;
  private List<AudienceDemographicValue> genders;
  private List<AudienceDemographicValue> devices;
  private List<AudienceDemographicValue> metros;
  private List<AudienceDemographicValue> countries;

  public AudienceDemographics () {

  }

  public AudienceDemographics (List<AudienceDemographicValue> ages, List<AudienceDemographicValue> genders, List<AudienceDemographicValue> devices, List<AudienceDemographicValue> metros, List<AudienceDemographicValue> countries) {
    this.ages = ages;
    this.genders = genders;
    this.devices = devices;
    this.metros = metros;
    this.countries = countries;
  }

    
  @JsonProperty("ages")
  public List<AudienceDemographicValue> getAges() {
    return ages;
  }
  public void setAges(List<AudienceDemographicValue> ages) {
    this.ages = ages;
  }

    
  @JsonProperty("genders")
  public List<AudienceDemographicValue> getGenders() {
    return genders;
  }
  public void setGenders(List<AudienceDemographicValue> genders) {
    this.genders = genders;
  }

    
  @JsonProperty("devices")
  public List<AudienceDemographicValue> getDevices() {
    return devices;
  }
  public void setDevices(List<AudienceDemographicValue> devices) {
    this.devices = devices;
  }

    
  @JsonProperty("metros")
  public List<AudienceDemographicValue> getMetros() {
    return metros;
  }
  public void setMetros(List<AudienceDemographicValue> metros) {
    this.metros = metros;
  }

    
  @JsonProperty("countries")
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
    return Objects.equals(ages, audienceDemographics.ages) &&
        Objects.equals(genders, audienceDemographics.genders) &&
        Objects.equals(devices, audienceDemographics.devices) &&
        Objects.equals(metros, audienceDemographics.metros) &&
        Objects.equals(countries, audienceDemographics.countries);
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

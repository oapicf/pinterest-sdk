package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsHotelAddress  {
  
  @ApiModelProperty(value = "Primary street address of hotel.")
 /**
   * Primary street address of hotel.
  **/
  private String addr1;

  @ApiModelProperty(value = "City where the hotel is located.")
 /**
   * City where the hotel is located.
  **/
  private String city;

  @ApiModelProperty(value = "State, county, province, where the hotel is located.")
 /**
   * State, county, province, where the hotel is located.
  **/
  private String region;

  @ApiModelProperty(value = "Country where the hotel is located.")
 /**
   * Country where the hotel is located.
  **/
  private String country;

  @ApiModelProperty(value = "Required for countries with a postal code system. Postal or zip code of the hotel.")
 /**
   * Required for countries with a postal code system. Postal or zip code of the hotel.
  **/
  private String postalCode;
 /**
   * Primary street address of hotel.
   * @return addr1
  **/
  @JsonProperty("addr1")
  public String getAddr1() {
    return addr1;
  }

  public void setAddr1(String addr1) {
    this.addr1 = addr1;
  }

  public CatalogsHotelAddress addr1(String addr1) {
    this.addr1 = addr1;
    return this;
  }

 /**
   * City where the hotel is located.
   * @return city
  **/
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public CatalogsHotelAddress city(String city) {
    this.city = city;
    return this;
  }

 /**
   * State, county, province, where the hotel is located.
   * @return region
  **/
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public CatalogsHotelAddress region(String region) {
    this.region = region;
    return this;
  }

 /**
   * Country where the hotel is located.
   * @return country
  **/
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public CatalogsHotelAddress country(String country) {
    this.country = country;
    return this;
  }

 /**
   * Required for countries with a postal code system. Postal or zip code of the hotel.
   * @return postalCode
  **/
  @JsonProperty("postal_code")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public CatalogsHotelAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
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
    CatalogsHotelAddress catalogsHotelAddress = (CatalogsHotelAddress) o;
    return Objects.equals(this.addr1, catalogsHotelAddress.addr1) &&
        Objects.equals(this.city, catalogsHotelAddress.city) &&
        Objects.equals(this.region, catalogsHotelAddress.region) &&
        Objects.equals(this.country, catalogsHotelAddress.country) &&
        Objects.equals(this.postalCode, catalogsHotelAddress.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addr1, city, region, country, postalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelAddress {\n");
    
    sb.append("    addr1: ").append(toIndentedString(addr1)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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


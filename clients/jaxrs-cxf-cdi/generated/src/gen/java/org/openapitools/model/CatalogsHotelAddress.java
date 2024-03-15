package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class CatalogsHotelAddress   {
  
  private String addr1;

  private String city;

  private String region;

  private String country;

  private String postalCode;

  /**
   * Primary street address of hotel.
   **/
  public CatalogsHotelAddress addr1(String addr1) {
    this.addr1 = addr1;
    return this;
  }

  
  @ApiModelProperty(value = "Primary street address of hotel.")
  @JsonProperty("addr1")
  public String getAddr1() {
    return addr1;
  }
  public void setAddr1(String addr1) {
    this.addr1 = addr1;
  }


  /**
   * City where the hotel is located.
   **/
  public CatalogsHotelAddress city(String city) {
    this.city = city;
    return this;
  }

  
  @ApiModelProperty(value = "City where the hotel is located.")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }


  /**
   * State, county, province, where the hotel is located.
   **/
  public CatalogsHotelAddress region(String region) {
    this.region = region;
    return this;
  }

  
  @ApiModelProperty(value = "State, county, province, where the hotel is located.")
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }
  public void setRegion(String region) {
    this.region = region;
  }


  /**
   * Country where the hotel is located.
   **/
  public CatalogsHotelAddress country(String country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(value = "Country where the hotel is located.")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }


  /**
   * Required for countries with a postal code system. Postal or zip code of the hotel.
   **/
  public CatalogsHotelAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  
  @ApiModelProperty(value = "Required for countries with a postal code system. Postal or zip code of the hotel.")
  @JsonProperty("postal_code")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


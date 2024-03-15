package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CatalogsHotelAddress
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsHotelAddress   {
  @JsonProperty("addr1")
  private String addr1;

  @JsonProperty("city")
  private String city;

  @JsonProperty("region")
  private String region;

  @JsonProperty("country")
  private String country;

  @JsonProperty("postal_code")
  private String postalCode;

  public CatalogsHotelAddress addr1(String addr1) {
    this.addr1 = addr1;
    return this;
  }

   /**
   * Primary street address of hotel.
   * @return addr1
  **/
  @ApiModelProperty(value = "Primary street address of hotel.")
  public String getAddr1() {
    return addr1;
  }

  public void setAddr1(String addr1) {
    this.addr1 = addr1;
  }

  public CatalogsHotelAddress city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City where the hotel is located.
   * @return city
  **/
  @ApiModelProperty(value = "City where the hotel is located.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public CatalogsHotelAddress region(String region) {
    this.region = region;
    return this;
  }

   /**
   * State, county, province, where the hotel is located.
   * @return region
  **/
  @ApiModelProperty(value = "State, county, province, where the hotel is located.")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public CatalogsHotelAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country where the hotel is located.
   * @return country
  **/
  @ApiModelProperty(value = "Country where the hotel is located.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public CatalogsHotelAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Required for countries with a postal code system. Postal or zip code of the hotel.
   * @return postalCode
  **/
  @ApiModelProperty(value = "Required for countries with a postal code system. Postal or zip code of the hotel.")
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


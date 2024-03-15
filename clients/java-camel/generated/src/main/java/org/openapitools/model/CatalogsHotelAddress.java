package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatalogsHotelAddress
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsHotelAddress {

  private String addr1;

  private String city;

  private String region;

  private String country;

  private String postalCode;

  public CatalogsHotelAddress addr1(String addr1) {
    this.addr1 = addr1;
    return this;
  }

  /**
   * Primary street address of hotel.
   * @return addr1
  */
  
  @Schema(name = "addr1", description = "Primary street address of hotel.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addr1")
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
  */
  
  @Schema(name = "city", description = "City where the hotel is located.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
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
  */
  
  @Schema(name = "region", description = "State, county, province, where the hotel is located.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("region")
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
  */
  
  @Schema(name = "country", description = "Country where the hotel is located.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country")
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
  */
  
  @Schema(name = "postal_code", description = "Required for countries with a postal code system. Postal or zip code of the hotel.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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


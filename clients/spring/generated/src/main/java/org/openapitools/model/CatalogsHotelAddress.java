package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CatalogsHotelAddress
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsHotelAddress {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String addr1;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String city;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String country;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String postalCode;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String region;

  public CatalogsHotelAddress addr1(@Nullable String addr1) {
    this.addr1 = addr1;
    return this;
  }

  /**
   * Primary street address of hotel.
   * @return addr1
   */
  
  @Schema(name = "addr1", description = "Primary street address of hotel.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addr1")
  public @Nullable String getAddr1() {
    return addr1;
  }

  @JsonProperty("addr1")
  public void setAddr1(@Nullable String addr1) {
    this.addr1 = addr1;
  }

  public CatalogsHotelAddress city(@Nullable String city) {
    this.city = city;
    return this;
  }

  /**
   * City where the hotel is located.
   * @return city
   */
  
  @Schema(name = "city", description = "City where the hotel is located.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public @Nullable String getCity() {
    return city;
  }

  @JsonProperty("city")
  public void setCity(@Nullable String city) {
    this.city = city;
  }

  public CatalogsHotelAddress country(@Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * Country where the hotel is located.
   * @return country
   */
  
  @Schema(name = "country", description = "Country where the hotel is located.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country")
  public @Nullable String getCountry() {
    return country;
  }

  @JsonProperty("country")
  public void setCountry(@Nullable String country) {
    this.country = country;
  }

  public CatalogsHotelAddress postalCode(@Nullable String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Required for countries with a postal code system. Postal or zip code of the hotel.
   * @return postalCode
   */
  
  @Schema(name = "postal_code", description = "Required for countries with a postal code system. Postal or zip code of the hotel.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postal_code")
  public @Nullable String getPostalCode() {
    return postalCode;
  }

  @JsonProperty("postal_code")
  public void setPostalCode(@Nullable String postalCode) {
    this.postalCode = postalCode;
  }

  public CatalogsHotelAddress region(@Nullable String region) {
    this.region = region;
    return this;
  }

  /**
   * State, county, province, where the hotel is located.
   * @return region
   */
  
  @Schema(name = "region", description = "State, county, province, where the hotel is located.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("region")
  public @Nullable String getRegion() {
    return region;
  }

  @JsonProperty("region")
  public void setRegion(@Nullable String region) {
    this.region = region;
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
        Objects.equals(this.country, catalogsHotelAddress.country) &&
        Objects.equals(this.postalCode, catalogsHotelAddress.postalCode) &&
        Objects.equals(this.region, catalogsHotelAddress.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addr1, city, country, postalCode, region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelAddress {\n");
    sb.append("    addr1: ").append(toIndentedString(addr1)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


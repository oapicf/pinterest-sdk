package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.Country;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * LocalStoreBatchUpdate
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LocalStoreBatchUpdate   {
  @JsonProperty("address_primary")
  private String addressPrimary;

  @JsonProperty("address_secondary")
  private String addressSecondary;

  @JsonProperty("city")
  private String city;

  @JsonProperty("country")
  private Country country;

  @JsonProperty("id")
  private String id;

  @JsonProperty("latitude")
  private Float latitude;

  @JsonProperty("longitude")
  private Float longitude;

  @JsonProperty("name")
  private String name;

  @JsonProperty("postal_code")
  private String postalCode;

  @JsonProperty("region")
  private String region;

  @JsonProperty("store_code")
  private String storeCode;

  public LocalStoreBatchUpdate addressPrimary(String addressPrimary) {
    this.addressPrimary = addressPrimary;
    return this;
  }

  /**
   * Primary address line of the store.
   * @return addressPrimary
   */
  @ApiModelProperty(example = "123 Johnson St", value = "Primary address line of the store.")
  public String getAddressPrimary() {
    return addressPrimary;
  }

  public void setAddressPrimary(String addressPrimary) {
    this.addressPrimary = addressPrimary;
  }

  public LocalStoreBatchUpdate addressSecondary(String addressSecondary) {
    this.addressSecondary = addressSecondary;
    return this;
  }

  /**
   * Secondary address line of the store.
   * @return addressSecondary
   */
  @ApiModelProperty(example = "Suite 100", value = "Secondary address line of the store.")
  public String getAddressSecondary() {
    return addressSecondary;
  }

  public void setAddressSecondary(String addressSecondary) {
    this.addressSecondary = addressSecondary;
  }

  public LocalStoreBatchUpdate city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City where the store is located.
   * @return city
   */
  @ApiModelProperty(example = "Sunnyvale", value = "City where the store is located.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public LocalStoreBatchUpdate country(Country country) {
    this.country = country;
    return this;
  }

  /**
   * Country code where the store is located.
   * @return country
   */
  @ApiModelProperty(value = "Country code where the store is located.")
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public LocalStoreBatchUpdate id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the local store.
   * @return id
   */
  @ApiModelProperty(example = "1234567890", required = true, value = "The ID of the local store.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LocalStoreBatchUpdate latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Geographic latitude coordinate of the store.
   * @return latitude
   */
  @ApiModelProperty(example = "-30.21", value = "Geographic latitude coordinate of the store.")
  public Float getLatitude() {
    return latitude;
  }

  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  public LocalStoreBatchUpdate longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Geographic longitude coordinate of the store.
   * @return longitude
   */
  @ApiModelProperty(example = "50.45", value = "Geographic longitude coordinate of the store.")
  public Float getLongitude() {
    return longitude;
  }

  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  public LocalStoreBatchUpdate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the local store.
   * @return name
   */
  @ApiModelProperty(example = "Sunnyvale Store", value = "The name of the local store.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalStoreBatchUpdate postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Postal or ZIP code of the store.
   * @return postalCode
   */
  @ApiModelProperty(example = "94043", value = "Postal or ZIP code of the store.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public LocalStoreBatchUpdate region(String region) {
    this.region = region;
    return this;
  }

  /**
   * State or region code where the store is located.
   * @return region
   */
  @ApiModelProperty(example = "CA", value = "State or region code where the store is located.")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public LocalStoreBatchUpdate storeCode(String storeCode) {
    this.storeCode = storeCode;
    return this;
  }

  /**
   * Merchant provided code for the local store. Unique within the merchant's catalog.
   * @return storeCode
   */
  @ApiModelProperty(example = "store_1", value = "Merchant provided code for the local store. Unique within the merchant's catalog.")
  public String getStoreCode() {
    return storeCode;
  }

  public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalStoreBatchUpdate localStoreBatchUpdate = (LocalStoreBatchUpdate) o;
    return Objects.equals(this.addressPrimary, localStoreBatchUpdate.addressPrimary) &&
        Objects.equals(this.addressSecondary, localStoreBatchUpdate.addressSecondary) &&
        Objects.equals(this.city, localStoreBatchUpdate.city) &&
        Objects.equals(this.country, localStoreBatchUpdate.country) &&
        Objects.equals(this.id, localStoreBatchUpdate.id) &&
        Objects.equals(this.latitude, localStoreBatchUpdate.latitude) &&
        Objects.equals(this.longitude, localStoreBatchUpdate.longitude) &&
        Objects.equals(this.name, localStoreBatchUpdate.name) &&
        Objects.equals(this.postalCode, localStoreBatchUpdate.postalCode) &&
        Objects.equals(this.region, localStoreBatchUpdate.region) &&
        Objects.equals(this.storeCode, localStoreBatchUpdate.storeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressPrimary, addressSecondary, city, country, id, latitude, longitude, name, postalCode, region, storeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalStoreBatchUpdate {\n");
    
    sb.append("    addressPrimary: ").append(toIndentedString(addressPrimary)).append("\n");
    sb.append("    addressSecondary: ").append(toIndentedString(addressSecondary)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    storeCode: ").append(toIndentedString(storeCode)).append("\n");
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


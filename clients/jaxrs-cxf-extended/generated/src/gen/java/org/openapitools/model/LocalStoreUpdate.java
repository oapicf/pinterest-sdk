package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Country;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LocalStoreUpdate  {
  
 /**
  * Primary address line of the store.
  */
  @ApiModelProperty(example = "123 Johnson St", value = "Primary address line of the store.")
  private String addressPrimary;

 /**
  * Secondary address line of the store.
  */
  @ApiModelProperty(example = "Suite 100", value = "Secondary address line of the store.")
  private String addressSecondary;

 /**
  * City where the store is located.
  */
  @ApiModelProperty(example = "Sunnyvale", value = "City where the store is located.")
  private String city;

 /**
  * Country code where the store is located.
  */
  @ApiModelProperty(value = "Country code where the store is located.")
  @Valid
  private Country country;

 /**
  * The ID of the local store.
  */
  @ApiModelProperty(example = "1234567890", required = true, value = "The ID of the local store.")
  private String id;

 /**
  * Geographic latitude coordinate of the store.
  */
  @ApiModelProperty(example = "-30.21", value = "Geographic latitude coordinate of the store.")
  private Float latitude;

 /**
  * Geographic longitude coordinate of the store.
  */
  @ApiModelProperty(example = "50.45", value = "Geographic longitude coordinate of the store.")
  private Float longitude;

 /**
  * The name of the local store.
  */
  @ApiModelProperty(example = "Sunnyvale Store", value = "The name of the local store.")
  private String name;

 /**
  * Postal or ZIP code of the store.
  */
  @ApiModelProperty(example = "94043", value = "Postal or ZIP code of the store.")
  private String postalCode;

 /**
  * State or region code where the store is located.
  */
  @ApiModelProperty(example = "CA", value = "State or region code where the store is located.")
  private String region;

 /**
  * Merchant provided code for the local store. Unique within the merchant's catalog.
  */
  @ApiModelProperty(example = "store_1", value = "Merchant provided code for the local store. Unique within the merchant's catalog.")
  private String storeCode;
 /**
  * Primary address line of the store.
  * @return addressPrimary
  */
  @JsonProperty("address_primary")
  public String getAddressPrimary() {
    return addressPrimary;
  }

  /**
   * Sets the <code>addressPrimary</code> property.
   */
 public void setAddressPrimary(String addressPrimary) {
    this.addressPrimary = addressPrimary;
  }

  /**
   * Sets the <code>addressPrimary</code> property.
   */
  public LocalStoreUpdate addressPrimary(String addressPrimary) {
    this.addressPrimary = addressPrimary;
    return this;
  }

 /**
  * Secondary address line of the store.
  * @return addressSecondary
  */
  @JsonProperty("address_secondary")
  public String getAddressSecondary() {
    return addressSecondary;
  }

  /**
   * Sets the <code>addressSecondary</code> property.
   */
 public void setAddressSecondary(String addressSecondary) {
    this.addressSecondary = addressSecondary;
  }

  /**
   * Sets the <code>addressSecondary</code> property.
   */
  public LocalStoreUpdate addressSecondary(String addressSecondary) {
    this.addressSecondary = addressSecondary;
    return this;
  }

 /**
  * City where the store is located.
  * @return city
  */
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  /**
   * Sets the <code>city</code> property.
   */
 public void setCity(String city) {
    this.city = city;
  }

  /**
   * Sets the <code>city</code> property.
   */
  public LocalStoreUpdate city(String city) {
    this.city = city;
    return this;
  }

 /**
  * Country code where the store is located.
  * @return country
  */
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }

  /**
   * Sets the <code>country</code> property.
   */
 public void setCountry(Country country) {
    this.country = country;
  }

  /**
   * Sets the <code>country</code> property.
   */
  public LocalStoreUpdate country(Country country) {
    this.country = country;
    return this;
  }

 /**
  * The ID of the local store.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public LocalStoreUpdate id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Geographic latitude coordinate of the store.
  * @return latitude
  */
  @JsonProperty("latitude")
  public Float getLatitude() {
    return latitude;
  }

  /**
   * Sets the <code>latitude</code> property.
   */
 public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  /**
   * Sets the <code>latitude</code> property.
   */
  public LocalStoreUpdate latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
  * Geographic longitude coordinate of the store.
  * @return longitude
  */
  @JsonProperty("longitude")
  public Float getLongitude() {
    return longitude;
  }

  /**
   * Sets the <code>longitude</code> property.
   */
 public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  /**
   * Sets the <code>longitude</code> property.
   */
  public LocalStoreUpdate longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
  * The name of the local store.
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public LocalStoreUpdate name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Postal or ZIP code of the store.
  * @return postalCode
  */
  @JsonProperty("postal_code")
  public String getPostalCode() {
    return postalCode;
  }

  /**
   * Sets the <code>postalCode</code> property.
   */
 public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  /**
   * Sets the <code>postalCode</code> property.
   */
  public LocalStoreUpdate postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

 /**
  * State or region code where the store is located.
  * @return region
  */
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  /**
   * Sets the <code>region</code> property.
   */
 public void setRegion(String region) {
    this.region = region;
  }

  /**
   * Sets the <code>region</code> property.
   */
  public LocalStoreUpdate region(String region) {
    this.region = region;
    return this;
  }

 /**
  * Merchant provided code for the local store. Unique within the merchant&#39;s catalog.
  * @return storeCode
  */
  @JsonProperty("store_code")
  public String getStoreCode() {
    return storeCode;
  }

  /**
   * Sets the <code>storeCode</code> property.
   */
 public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }

  /**
   * Sets the <code>storeCode</code> property.
   */
  public LocalStoreUpdate storeCode(String storeCode) {
    this.storeCode = storeCode;
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
    LocalStoreUpdate localStoreUpdate = (LocalStoreUpdate) o;
    return Objects.equals(this.addressPrimary, localStoreUpdate.addressPrimary) &&
        Objects.equals(this.addressSecondary, localStoreUpdate.addressSecondary) &&
        Objects.equals(this.city, localStoreUpdate.city) &&
        Objects.equals(this.country, localStoreUpdate.country) &&
        Objects.equals(this.id, localStoreUpdate.id) &&
        Objects.equals(this.latitude, localStoreUpdate.latitude) &&
        Objects.equals(this.longitude, localStoreUpdate.longitude) &&
        Objects.equals(this.name, localStoreUpdate.name) &&
        Objects.equals(this.postalCode, localStoreUpdate.postalCode) &&
        Objects.equals(this.region, localStoreUpdate.region) &&
        Objects.equals(this.storeCode, localStoreUpdate.storeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressPrimary, addressSecondary, city, country, id, latitude, longitude, name, postalCode, region, storeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalStoreUpdate {\n");
    
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


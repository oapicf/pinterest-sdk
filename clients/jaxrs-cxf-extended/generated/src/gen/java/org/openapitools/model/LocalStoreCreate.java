package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Country;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Resource create operation model.
 */
@ApiModel(description="Resource create operation model.")

public class LocalStoreCreate  {
  
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
  @ApiModelProperty(required = true, value = "Country code where the store is located.")
  @Valid
  private Country country;

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
  @ApiModelProperty(example = "Sunnyvale Store", required = true, value = "The name of the local store.")
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
  @ApiModelProperty(example = "store_1", required = true, value = "Merchant provided code for the local store. Unique within the merchant's catalog.")
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
  public LocalStoreCreate addressPrimary(String addressPrimary) {
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
  public LocalStoreCreate addressSecondary(String addressSecondary) {
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
  public LocalStoreCreate city(String city) {
    this.city = city;
    return this;
  }

 /**
  * Country code where the store is located.
  * @return country
  */
  @JsonProperty("country")
  @NotNull
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
  public LocalStoreCreate country(Country country) {
    this.country = country;
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
  public LocalStoreCreate latitude(Float latitude) {
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
  public LocalStoreCreate longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
  * The name of the local store.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
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
  public LocalStoreCreate name(String name) {
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
  public LocalStoreCreate postalCode(String postalCode) {
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
  public LocalStoreCreate region(String region) {
    this.region = region;
    return this;
  }

 /**
  * Merchant provided code for the local store. Unique within the merchant&#39;s catalog.
  * @return storeCode
  */
  @JsonProperty("store_code")
  @NotNull
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
  public LocalStoreCreate storeCode(String storeCode) {
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
    LocalStoreCreate localStoreCreate = (LocalStoreCreate) o;
    return Objects.equals(this.addressPrimary, localStoreCreate.addressPrimary) &&
        Objects.equals(this.addressSecondary, localStoreCreate.addressSecondary) &&
        Objects.equals(this.city, localStoreCreate.city) &&
        Objects.equals(this.country, localStoreCreate.country) &&
        Objects.equals(this.latitude, localStoreCreate.latitude) &&
        Objects.equals(this.longitude, localStoreCreate.longitude) &&
        Objects.equals(this.name, localStoreCreate.name) &&
        Objects.equals(this.postalCode, localStoreCreate.postalCode) &&
        Objects.equals(this.region, localStoreCreate.region) &&
        Objects.equals(this.storeCode, localStoreCreate.storeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressPrimary, addressSecondary, city, country, latitude, longitude, name, postalCode, region, storeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalStoreCreate {\n");
    
    sb.append("    addressPrimary: ").append(toIndentedString(addressPrimary)).append("\n");
    sb.append("    addressSecondary: ").append(toIndentedString(addressSecondary)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


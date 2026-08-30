package org.openapitools.model;

import org.openapitools.model.Country;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Resource create operation model.
 */
public class LocalStoreCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Primary address line of the store.
   */
  @JsonProperty("address_primary")
  private String addressPrimary;

  /**
   * Secondary address line of the store.
   */
  @JsonProperty("address_secondary")
  private String addressSecondary;

  /**
   * City where the store is located.
   */
  @JsonProperty("city")
  private String city;

  /**
   * Country code where the store is located.
   */
  @JsonProperty("country")
  private Country country;

  /**
   * Geographic latitude coordinate of the store.
   */
  @JsonProperty("latitude")
  private Float latitude;

  /**
   * Geographic longitude coordinate of the store.
   */
  @JsonProperty("longitude")
  private Float longitude;

  /**
   * The name of the local store.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Postal or ZIP code of the store.
   */
  @JsonProperty("postal_code")
  private String postalCode;

  /**
   * State or region code where the store is located.
   */
  @JsonProperty("region")
  private String region;

  /**
   * Merchant provided code for the local store. Unique within the merchant&#39;s catalog.
   */
  @JsonProperty("store_code")
  private String storeCode;

  /**
   * Primary address line of the store.
   * @return addressPrimary
   */
  public String getAddressPrimary() {
    return addressPrimary;
  }

  public void setAddressPrimary(String addressPrimary) {
    this.addressPrimary = addressPrimary;
  }

  /**
   * Secondary address line of the store.
   * @return addressSecondary
   */
  public String getAddressSecondary() {
    return addressSecondary;
  }

  public void setAddressSecondary(String addressSecondary) {
    this.addressSecondary = addressSecondary;
  }

  /**
   * City where the store is located.
   * @return city
   */
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  /**
   * Country code where the store is located.
   * @return country
   */
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   * Geographic latitude coordinate of the store.
   * @return latitude
   */
  public Float getLatitude() {
    return latitude;
  }

  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  /**
   * Geographic longitude coordinate of the store.
   * @return longitude
   */
  public Float getLongitude() {
    return longitude;
  }

  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  /**
   * The name of the local store.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Postal or ZIP code of the store.
   * @return postalCode
   */
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  /**
   * State or region code where the store is located.
   * @return region
   */
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * Merchant provided code for the local store. Unique within the merchant&#39;s catalog.
   * @return storeCode
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

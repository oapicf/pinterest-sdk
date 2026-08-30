package apimodels;

import apimodels.Country;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Resource create operation model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LocalStoreCreate   {
  @JsonProperty("address_primary")
  
  private String addressPrimary;

  @JsonProperty("address_secondary")
  
  private String addressSecondary;

  @JsonProperty("city")
  
  private String city;

  @JsonProperty("country")
  @NotNull
@Valid

  private Country country;

  @JsonProperty("latitude")
  
  private Float latitude;

  @JsonProperty("longitude")
  
  private Float longitude;

  @JsonProperty("name")
  @NotNull

  private String name;

  @JsonProperty("postal_code")
  
  private String postalCode;

  @JsonProperty("region")
  
  private String region;

  @JsonProperty("store_code")
  @NotNull

  private String storeCode;

  public LocalStoreCreate addressPrimary(String addressPrimary) {
    this.addressPrimary = addressPrimary;
    return this;
  }

   /**
   * Primary address line of the store.
   * @return addressPrimary
  **/
  public String getAddressPrimary() {
    return addressPrimary;
  }

  public void setAddressPrimary(String addressPrimary) {
    this.addressPrimary = addressPrimary;
  }

  public LocalStoreCreate addressSecondary(String addressSecondary) {
    this.addressSecondary = addressSecondary;
    return this;
  }

   /**
   * Secondary address line of the store.
   * @return addressSecondary
  **/
  public String getAddressSecondary() {
    return addressSecondary;
  }

  public void setAddressSecondary(String addressSecondary) {
    this.addressSecondary = addressSecondary;
  }

  public LocalStoreCreate city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City where the store is located.
   * @return city
  **/
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public LocalStoreCreate country(Country country) {
    this.country = country;
    return this;
  }

   /**
   * Country code where the store is located.
   * @return country
  **/
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public LocalStoreCreate latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Geographic latitude coordinate of the store.
   * @return latitude
  **/
  public Float getLatitude() {
    return latitude;
  }

  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  public LocalStoreCreate longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Geographic longitude coordinate of the store.
   * @return longitude
  **/
  public Float getLongitude() {
    return longitude;
  }

  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  public LocalStoreCreate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the local store.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalStoreCreate postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal or ZIP code of the store.
   * @return postalCode
  **/
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public LocalStoreCreate region(String region) {
    this.region = region;
    return this;
  }

   /**
   * State or region code where the store is located.
   * @return region
  **/
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public LocalStoreCreate storeCode(String storeCode) {
    this.storeCode = storeCode;
    return this;
  }

   /**
   * Merchant provided code for the local store. Unique within the merchant's catalog.
   * @return storeCode
  **/
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
    return Objects.equals(addressPrimary, localStoreCreate.addressPrimary) &&
        Objects.equals(addressSecondary, localStoreCreate.addressSecondary) &&
        Objects.equals(city, localStoreCreate.city) &&
        Objects.equals(country, localStoreCreate.country) &&
        Objects.equals(latitude, localStoreCreate.latitude) &&
        Objects.equals(longitude, localStoreCreate.longitude) &&
        Objects.equals(name, localStoreCreate.name) &&
        Objects.equals(postalCode, localStoreCreate.postalCode) &&
        Objects.equals(region, localStoreCreate.region) &&
        Objects.equals(storeCode, localStoreCreate.storeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressPrimary, addressSecondary, city, country, latitude, longitude, name, postalCode, region, storeCode);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


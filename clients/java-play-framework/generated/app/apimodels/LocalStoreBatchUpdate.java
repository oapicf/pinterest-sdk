package apimodels;

import apimodels.Country;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * LocalStoreBatchUpdate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LocalStoreBatchUpdate   {
  @JsonProperty("address_primary")
  
  private String addressPrimary;

  @JsonProperty("address_secondary")
  
  private String addressSecondary;

  @JsonProperty("city")
  
  private String city;

  @JsonProperty("country")
  @Valid

  private Country country;

  @JsonProperty("id")
  @NotNull
@Pattern(regexp="^\\d+$")

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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
    LocalStoreBatchUpdate localStoreBatchUpdate = (LocalStoreBatchUpdate) o;
    return Objects.equals(addressPrimary, localStoreBatchUpdate.addressPrimary) &&
        Objects.equals(addressSecondary, localStoreBatchUpdate.addressSecondary) &&
        Objects.equals(city, localStoreBatchUpdate.city) &&
        Objects.equals(country, localStoreBatchUpdate.country) &&
        Objects.equals(id, localStoreBatchUpdate.id) &&
        Objects.equals(latitude, localStoreBatchUpdate.latitude) &&
        Objects.equals(longitude, localStoreBatchUpdate.longitude) &&
        Objects.equals(name, localStoreBatchUpdate.name) &&
        Objects.equals(postalCode, localStoreBatchUpdate.postalCode) &&
        Objects.equals(region, localStoreBatchUpdate.region) &&
        Objects.equals(storeCode, localStoreBatchUpdate.storeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressPrimary, addressSecondary, city, country, id, latitude, longitude, name, postalCode, region, storeCode);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


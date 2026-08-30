package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.Country;



/**
 * Local store entity
 **/

@ApiModel(description = "Local store entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LocalStore   {
  @JsonProperty("address_primary")
  private String addressPrimary;

  @JsonProperty("address_secondary")
  private String addressSecondary;

  @JsonProperty("city")
  private String city;

  @JsonProperty("country")
  private Country country;

  @JsonProperty("created_at")
  private Date createdAt;

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

  @JsonProperty("updated_at")
  private Date updatedAt;

  /**
   * Primary address line of the store.
   **/
  public LocalStore addressPrimary(String addressPrimary) {
    this.addressPrimary = addressPrimary;
    return this;
  }

  
  @ApiModelProperty(example = "123 Johnson St", value = "Primary address line of the store.")
  @JsonProperty("address_primary")
  public String getAddressPrimary() {
    return addressPrimary;
  }
  public void setAddressPrimary(String addressPrimary) {
    this.addressPrimary = addressPrimary;
  }

  /**
   * Secondary address line of the store.
   **/
  public LocalStore addressSecondary(String addressSecondary) {
    this.addressSecondary = addressSecondary;
    return this;
  }

  
  @ApiModelProperty(example = "Suite 100", value = "Secondary address line of the store.")
  @JsonProperty("address_secondary")
  public String getAddressSecondary() {
    return addressSecondary;
  }
  public void setAddressSecondary(String addressSecondary) {
    this.addressSecondary = addressSecondary;
  }

  /**
   * City where the store is located.
   **/
  public LocalStore city(String city) {
    this.city = city;
    return this;
  }

  
  @ApiModelProperty(example = "Sunnyvale", value = "City where the store is located.")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * Country code where the store is located.
   **/
  public LocalStore country(Country country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Country code where the store is located.")
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   * Creation timestamp
   **/
  public LocalStore createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(example = "2022-03-14T15:15:22Z", required = true, value = "Creation timestamp")
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The ID of the local store.
   **/
  public LocalStore id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "1234567890", required = true, value = "The ID of the local store.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Geographic latitude coordinate of the store.
   **/
  public LocalStore latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

  
  @ApiModelProperty(example = "-30.21", value = "Geographic latitude coordinate of the store.")
  @JsonProperty("latitude")
  public Float getLatitude() {
    return latitude;
  }
  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  /**
   * Geographic longitude coordinate of the store.
   **/
  public LocalStore longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

  
  @ApiModelProperty(example = "50.45", value = "Geographic longitude coordinate of the store.")
  @JsonProperty("longitude")
  public Float getLongitude() {
    return longitude;
  }
  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  /**
   * The name of the local store.
   **/
  public LocalStore name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Sunnyvale Store", required = true, value = "The name of the local store.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Postal or ZIP code of the store.
   **/
  public LocalStore postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  
  @ApiModelProperty(example = "94043", value = "Postal or ZIP code of the store.")
  @JsonProperty("postal_code")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  /**
   * State or region code where the store is located.
   **/
  public LocalStore region(String region) {
    this.region = region;
    return this;
  }

  
  @ApiModelProperty(example = "CA", value = "State or region code where the store is located.")
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }
  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * Merchant provided code for the local store. Unique within the merchant's catalog.
   **/
  public LocalStore storeCode(String storeCode) {
    this.storeCode = storeCode;
    return this;
  }

  
  @ApiModelProperty(example = "store_1", required = true, value = "Merchant provided code for the local store. Unique within the merchant's catalog.")
  @JsonProperty("store_code")
  public String getStoreCode() {
    return storeCode;
  }
  public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }

  /**
   * Last update timestamp
   **/
  public LocalStore updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(example = "2022-03-14T15:16:34Z", required = true, value = "Last update timestamp")
  @JsonProperty("updated_at")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalStore localStore = (LocalStore) o;
    return Objects.equals(addressPrimary, localStore.addressPrimary) &&
        Objects.equals(addressSecondary, localStore.addressSecondary) &&
        Objects.equals(city, localStore.city) &&
        Objects.equals(country, localStore.country) &&
        Objects.equals(createdAt, localStore.createdAt) &&
        Objects.equals(id, localStore.id) &&
        Objects.equals(latitude, localStore.latitude) &&
        Objects.equals(longitude, localStore.longitude) &&
        Objects.equals(name, localStore.name) &&
        Objects.equals(postalCode, localStore.postalCode) &&
        Objects.equals(region, localStore.region) &&
        Objects.equals(storeCode, localStore.storeCode) &&
        Objects.equals(updatedAt, localStore.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressPrimary, addressSecondary, city, country, createdAt, id, latitude, longitude, name, postalCode, region, storeCode, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalStore {\n");
    
    sb.append("    addressPrimary: ").append(toIndentedString(addressPrimary)).append("\n");
    sb.append("    addressSecondary: ").append(toIndentedString(addressSecondary)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    storeCode: ").append(toIndentedString(storeCode)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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


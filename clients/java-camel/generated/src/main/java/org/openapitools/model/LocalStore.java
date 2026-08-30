package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Date;
import org.openapitools.model.Country;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Local store entity
 */

@Schema(name = "LocalStore", description = "Local store entity")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LocalStore implements CatalogsLocalStoresCreate200ResponseInnerData {

  private String addressPrimary;

  private String addressSecondary;

  private String city;

  private Country country;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date createdAt;

  private String id;

  private Float latitude;

  private Float longitude;

  private String name;

  private String postalCode;

  private String region;

  private String storeCode;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date updatedAt;

  public LocalStore() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LocalStore(Country country, Date createdAt, String id, String name, String storeCode, Date updatedAt) {
    this.country = country;
    this.createdAt = createdAt;
    this.id = id;
    this.name = name;
    this.storeCode = storeCode;
    this.updatedAt = updatedAt;
  }

  public LocalStore addressPrimary(String addressPrimary) {
    this.addressPrimary = addressPrimary;
    return this;
  }

  /**
   * Primary address line of the store.
   * @return addressPrimary
   */
  
  @Schema(name = "address_primary", example = "123 Johnson St", description = "Primary address line of the store.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address_primary")
  public String getAddressPrimary() {
    return addressPrimary;
  }

  public void setAddressPrimary(String addressPrimary) {
    this.addressPrimary = addressPrimary;
  }

  public LocalStore addressSecondary(String addressSecondary) {
    this.addressSecondary = addressSecondary;
    return this;
  }

  /**
   * Secondary address line of the store.
   * @return addressSecondary
   */
  
  @Schema(name = "address_secondary", example = "Suite 100", description = "Secondary address line of the store.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address_secondary")
  public String getAddressSecondary() {
    return addressSecondary;
  }

  public void setAddressSecondary(String addressSecondary) {
    this.addressSecondary = addressSecondary;
  }

  public LocalStore city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City where the store is located.
   * @return city
   */
  
  @Schema(name = "city", example = "Sunnyvale", description = "City where the store is located.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public LocalStore country(Country country) {
    this.country = country;
    return this;
  }

  /**
   * Country code where the store is located.
   * @return country
   */
  @NotNull @Valid 
  @Schema(name = "country", description = "Country code where the store is located.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public LocalStore createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation timestamp
   * @return createdAt
   */
  @Valid 
  @Schema(name = "created_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2022-03-14T15:15:22Z", description = "Creation timestamp", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public LocalStore id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the local store.
   * @return id
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "1234567890", description = "The ID of the local store.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LocalStore latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Geographic latitude coordinate of the store.
   * @return latitude
   */
  
  @Schema(name = "latitude", example = "-30.21", description = "Geographic latitude coordinate of the store.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public Float getLatitude() {
    return latitude;
  }

  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  public LocalStore longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Geographic longitude coordinate of the store.
   * @return longitude
   */
  
  @Schema(name = "longitude", example = "50.45", description = "Geographic longitude coordinate of the store.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public Float getLongitude() {
    return longitude;
  }

  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  public LocalStore name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the local store.
   * @return name
   */
  @NotNull 
  @Schema(name = "name", example = "Sunnyvale Store", description = "The name of the local store.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalStore postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Postal or ZIP code of the store.
   * @return postalCode
   */
  
  @Schema(name = "postal_code", example = "94043", description = "Postal or ZIP code of the store.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postal_code")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public LocalStore region(String region) {
    this.region = region;
    return this;
  }

  /**
   * State or region code where the store is located.
   * @return region
   */
  
  @Schema(name = "region", example = "CA", description = "State or region code where the store is located.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public LocalStore storeCode(String storeCode) {
    this.storeCode = storeCode;
    return this;
  }

  /**
   * Merchant provided code for the local store. Unique within the merchant's catalog.
   * @return storeCode
   */
  @NotNull 
  @Schema(name = "store_code", example = "store_1", description = "Merchant provided code for the local store. Unique within the merchant's catalog.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("store_code")
  public String getStoreCode() {
    return storeCode;
  }

  public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }

  public LocalStore updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Last update timestamp
   * @return updatedAt
   */
  @Valid 
  @Schema(name = "updated_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2022-03-14T15:16:34Z", description = "Last update timestamp", requiredMode = Schema.RequiredMode.REQUIRED)
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
    return Objects.equals(this.addressPrimary, localStore.addressPrimary) &&
        Objects.equals(this.addressSecondary, localStore.addressSecondary) &&
        Objects.equals(this.city, localStore.city) &&
        Objects.equals(this.country, localStore.country) &&
        Objects.equals(this.createdAt, localStore.createdAt) &&
        Objects.equals(this.id, localStore.id) &&
        Objects.equals(this.latitude, localStore.latitude) &&
        Objects.equals(this.longitude, localStore.longitude) &&
        Objects.equals(this.name, localStore.name) &&
        Objects.equals(this.postalCode, localStore.postalCode) &&
        Objects.equals(this.region, localStore.region) &&
        Objects.equals(this.storeCode, localStore.storeCode) &&
        Objects.equals(this.updatedAt, localStore.updatedAt);
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


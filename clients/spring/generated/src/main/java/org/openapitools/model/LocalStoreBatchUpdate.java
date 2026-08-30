package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Country;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LocalStoreBatchUpdate
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LocalStoreBatchUpdate {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String addressPrimary;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String addressSecondary;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String city;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Country country;

  private String id;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float latitude;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float longitude;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String postalCode;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String region;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String storeCode;

  public LocalStoreBatchUpdate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LocalStoreBatchUpdate(String id) {
    this.id = id;
  }

  public LocalStoreBatchUpdate addressPrimary(@Nullable String addressPrimary) {
    this.addressPrimary = addressPrimary;
    return this;
  }

  /**
   * Primary address line of the store.
   * @return addressPrimary
   */
  
  @Schema(name = "address_primary", example = "123 Johnson St", description = "Primary address line of the store.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address_primary")
  public @Nullable String getAddressPrimary() {
    return addressPrimary;
  }

  @JsonProperty("address_primary")
  public void setAddressPrimary(@Nullable String addressPrimary) {
    this.addressPrimary = addressPrimary;
  }

  public LocalStoreBatchUpdate addressSecondary(@Nullable String addressSecondary) {
    this.addressSecondary = addressSecondary;
    return this;
  }

  /**
   * Secondary address line of the store.
   * @return addressSecondary
   */
  
  @Schema(name = "address_secondary", example = "Suite 100", description = "Secondary address line of the store.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address_secondary")
  public @Nullable String getAddressSecondary() {
    return addressSecondary;
  }

  @JsonProperty("address_secondary")
  public void setAddressSecondary(@Nullable String addressSecondary) {
    this.addressSecondary = addressSecondary;
  }

  public LocalStoreBatchUpdate city(@Nullable String city) {
    this.city = city;
    return this;
  }

  /**
   * City where the store is located.
   * @return city
   */
  
  @Schema(name = "city", example = "Sunnyvale", description = "City where the store is located.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public @Nullable String getCity() {
    return city;
  }

  @JsonProperty("city")
  public void setCity(@Nullable String city) {
    this.city = city;
  }

  public LocalStoreBatchUpdate country(@Nullable Country country) {
    this.country = country;
    return this;
  }

  /**
   * Country code where the store is located.
   * @return country
   */
  @Valid 
  @Schema(name = "country", description = "Country code where the store is located.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country")
  public @Nullable Country getCountry() {
    return country;
  }

  @JsonProperty("country")
  public void setCountry(@Nullable Country country) {
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
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "1234567890", description = "The ID of the local store.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  public LocalStoreBatchUpdate latitude(@Nullable Float latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Geographic latitude coordinate of the store.
   * @return latitude
   */
  
  @Schema(name = "latitude", example = "-30.21", description = "Geographic latitude coordinate of the store.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public @Nullable Float getLatitude() {
    return latitude;
  }

  @JsonProperty("latitude")
  public void setLatitude(@Nullable Float latitude) {
    this.latitude = latitude;
  }

  public LocalStoreBatchUpdate longitude(@Nullable Float longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Geographic longitude coordinate of the store.
   * @return longitude
   */
  
  @Schema(name = "longitude", example = "50.45", description = "Geographic longitude coordinate of the store.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public @Nullable Float getLongitude() {
    return longitude;
  }

  @JsonProperty("longitude")
  public void setLongitude(@Nullable Float longitude) {
    this.longitude = longitude;
  }

  public LocalStoreBatchUpdate name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the local store.
   * @return name
   */
  
  @Schema(name = "name", example = "Sunnyvale Store", description = "The name of the local store.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable String name) {
    this.name = name;
  }

  public LocalStoreBatchUpdate postalCode(@Nullable String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Postal or ZIP code of the store.
   * @return postalCode
   */
  
  @Schema(name = "postal_code", example = "94043", description = "Postal or ZIP code of the store.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postal_code")
  public @Nullable String getPostalCode() {
    return postalCode;
  }

  @JsonProperty("postal_code")
  public void setPostalCode(@Nullable String postalCode) {
    this.postalCode = postalCode;
  }

  public LocalStoreBatchUpdate region(@Nullable String region) {
    this.region = region;
    return this;
  }

  /**
   * State or region code where the store is located.
   * @return region
   */
  
  @Schema(name = "region", example = "CA", description = "State or region code where the store is located.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("region")
  public @Nullable String getRegion() {
    return region;
  }

  @JsonProperty("region")
  public void setRegion(@Nullable String region) {
    this.region = region;
  }

  public LocalStoreBatchUpdate storeCode(@Nullable String storeCode) {
    this.storeCode = storeCode;
    return this;
  }

  /**
   * Merchant provided code for the local store. Unique within the merchant's catalog.
   * @return storeCode
   */
  
  @Schema(name = "store_code", example = "store_1", description = "Merchant provided code for the local store. Unique within the merchant's catalog.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("store_code")
  public @Nullable String getStoreCode() {
    return storeCode;
  }

  @JsonProperty("store_code")
  public void setStoreCode(@Nullable String storeCode) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


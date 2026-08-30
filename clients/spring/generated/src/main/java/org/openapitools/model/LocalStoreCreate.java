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
 * Resource create operation model.
 */

@Schema(name = "LocalStoreCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LocalStoreCreate {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String addressPrimary;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String addressSecondary;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String city;

  private Country country;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float latitude;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float longitude;

  private String name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String postalCode;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String region;

  private String storeCode;

  public LocalStoreCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LocalStoreCreate(Country country, String name, String storeCode) {
    this.country = country;
    this.name = name;
    this.storeCode = storeCode;
  }

  public LocalStoreCreate addressPrimary(@Nullable String addressPrimary) {
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

  public LocalStoreCreate addressSecondary(@Nullable String addressSecondary) {
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

  public LocalStoreCreate city(@Nullable String city) {
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

  public LocalStoreCreate country(Country country) {
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

  @JsonProperty("country")
  public void setCountry(Country country) {
    this.country = country;
  }

  public LocalStoreCreate latitude(@Nullable Float latitude) {
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

  public LocalStoreCreate longitude(@Nullable Float longitude) {
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

  public LocalStoreCreate name(String name) {
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

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  public LocalStoreCreate postalCode(@Nullable String postalCode) {
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

  public LocalStoreCreate region(@Nullable String region) {
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

  public LocalStoreCreate storeCode(String storeCode) {
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

  @JsonProperty("store_code")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


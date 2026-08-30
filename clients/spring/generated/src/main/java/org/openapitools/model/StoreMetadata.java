package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Store metadata for a specific store location
 */

@Schema(name = "StoreMetadata", description = "Store metadata for a specific store location")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class StoreMetadata {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String geohash;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Double latitude;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Double longitude;

  private String storeCode;

  private String storeId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String storeName;

  public StoreMetadata() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StoreMetadata(String storeCode, String storeId) {
    this.storeCode = storeCode;
    this.storeId = storeId;
  }

  public StoreMetadata geohash(@Nullable String geohash) {
    this.geohash = geohash;
    return this;
  }

  /**
   * Geohash of the store location
   * @return geohash
   */
  
  @Schema(name = "geohash", example = "9q", description = "Geohash of the store location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("geohash")
  public @Nullable String getGeohash() {
    return geohash;
  }

  @JsonProperty("geohash")
  public void setGeohash(@Nullable String geohash) {
    this.geohash = geohash;
  }

  public StoreMetadata latitude(@Nullable Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Geographic latitude coordinate of the store
   * @return latitude
   */
  
  @Schema(name = "latitude", example = "37.37695098", description = "Geographic latitude coordinate of the store", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public @Nullable Double getLatitude() {
    return latitude;
  }

  @JsonProperty("latitude")
  public void setLatitude(@Nullable Double latitude) {
    this.latitude = latitude;
  }

  public StoreMetadata longitude(@Nullable Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Geographic longitude coordinate of the store
   * @return longitude
   */
  
  @Schema(name = "longitude", example = "-122.032913", description = "Geographic longitude coordinate of the store", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public @Nullable Double getLongitude() {
    return longitude;
  }

  @JsonProperty("longitude")
  public void setLongitude(@Nullable Double longitude) {
    this.longitude = longitude;
  }

  public StoreMetadata storeCode(String storeCode) {
    this.storeCode = storeCode;
    return this;
  }

  /**
   * Merchant provided store code
   * @return storeCode
   */
  @NotNull 
  @Schema(name = "store_code", example = "store_1", description = "Merchant provided store code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("store_code")
  public String getStoreCode() {
    return storeCode;
  }

  @JsonProperty("store_code")
  public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }

  public StoreMetadata storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

  /**
   * Internal store code
   * @return storeId
   */
  @NotNull 
  @Schema(name = "store_id", example = "9070947806573", description = "Internal store code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("store_id")
  public String getStoreId() {
    return storeId;
  }

  @JsonProperty("store_id")
  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public StoreMetadata storeName(@Nullable String storeName) {
    this.storeName = storeName;
    return this;
  }

  /**
   * Store name
   * @return storeName
   */
  
  @Schema(name = "store_name", example = "Store 1 Sunnyvale", description = "Store name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("store_name")
  public @Nullable String getStoreName() {
    return storeName;
  }

  @JsonProperty("store_name")
  public void setStoreName(@Nullable String storeName) {
    this.storeName = storeName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreMetadata storeMetadata = (StoreMetadata) o;
    return Objects.equals(this.geohash, storeMetadata.geohash) &&
        Objects.equals(this.latitude, storeMetadata.latitude) &&
        Objects.equals(this.longitude, storeMetadata.longitude) &&
        Objects.equals(this.storeCode, storeMetadata.storeCode) &&
        Objects.equals(this.storeId, storeMetadata.storeId) &&
        Objects.equals(this.storeName, storeMetadata.storeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geohash, latitude, longitude, storeCode, storeId, storeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreMetadata {\n");
    sb.append("    geohash: ").append(toIndentedString(geohash)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    storeCode: ").append(toIndentedString(storeCode)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
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


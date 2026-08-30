package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class StoreMetadata {

  private String geohash;

  private Double latitude;

  private Double longitude;

  private String storeCode;

  private String storeId;

  private String storeName;

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

  public StoreMetadata geohash(String geohash) {
    this.geohash = geohash;
    return this;
  }

  /**
   * Geohash of the store location
   * @return geohash
   */
  
  @Schema(name = "geohash", example = "9q", description = "Geohash of the store location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("geohash")
  public String getGeohash() {
    return geohash;
  }

  public void setGeohash(String geohash) {
    this.geohash = geohash;
  }

  public StoreMetadata latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Geographic latitude coordinate of the store
   * @return latitude
   */
  
  @Schema(name = "latitude", example = "37.37695098", description = "Geographic latitude coordinate of the store", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public StoreMetadata longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Geographic longitude coordinate of the store
   * @return longitude
   */
  
  @Schema(name = "longitude", example = "-122.032913", description = "Geographic longitude coordinate of the store", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
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

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public StoreMetadata storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

  /**
   * Store name
   * @return storeName
   */
  
  @Schema(name = "store_name", example = "Store 1 Sunnyvale", description = "Store name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("store_name")
  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


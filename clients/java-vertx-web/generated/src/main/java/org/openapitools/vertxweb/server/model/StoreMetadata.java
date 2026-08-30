package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Store metadata for a specific store location
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StoreMetadata   {
  
  private String geohash;
  private Double latitude;
  private Double longitude;
  private String storeCode;
  private String storeId;
  private String storeName;

  public StoreMetadata () {

  }

  public StoreMetadata (String geohash, Double latitude, Double longitude, String storeCode, String storeId, String storeName) {
    this.geohash = geohash;
    this.latitude = latitude;
    this.longitude = longitude;
    this.storeCode = storeCode;
    this.storeId = storeId;
    this.storeName = storeName;
  }

    
  @JsonProperty("geohash")
  public String getGeohash() {
    return geohash;
  }
  public void setGeohash(String geohash) {
    this.geohash = geohash;
  }

    
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

    
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

    
  @JsonProperty("store_code")
  public String getStoreCode() {
    return storeCode;
  }
  public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }

    
  @JsonProperty("store_id")
  public String getStoreId() {
    return storeId;
  }
  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

    
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
    return Objects.equals(geohash, storeMetadata.geohash) &&
        Objects.equals(latitude, storeMetadata.latitude) &&
        Objects.equals(longitude, storeMetadata.longitude) &&
        Objects.equals(storeCode, storeMetadata.storeCode) &&
        Objects.equals(storeId, storeMetadata.storeId) &&
        Objects.equals(storeName, storeMetadata.storeName);
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

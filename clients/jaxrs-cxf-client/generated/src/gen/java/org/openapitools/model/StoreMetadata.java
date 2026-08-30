package org.openapitools.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Store metadata for a specific store location
 */
@ApiModel(description="Store metadata for a specific store location")

public class StoreMetadata  {
  
 /**
  * Geohash of the store location
  */
  @ApiModelProperty(example = "9q", value = "Geohash of the store location")

  private String geohash;

 /**
  * Geographic latitude coordinate of the store
  */
  @ApiModelProperty(example = "37.37695098", value = "Geographic latitude coordinate of the store")

  private Double latitude;

 /**
  * Geographic longitude coordinate of the store
  */
  @ApiModelProperty(example = "-122.032913", value = "Geographic longitude coordinate of the store")

  private Double longitude;

 /**
  * Merchant provided store code
  */
  @ApiModelProperty(example = "store_1", required = true, value = "Merchant provided store code")

  private String storeCode;

 /**
  * Internal store code
  */
  @ApiModelProperty(example = "9070947806573", required = true, value = "Internal store code")

  private String storeId;

 /**
  * Store name
  */
  @ApiModelProperty(example = "Store 1 Sunnyvale", value = "Store name")

  private String storeName;
 /**
   * Geohash of the store location
   * @return geohash
  **/
  @JsonProperty("geohash")
  public String getGeohash() {
    return geohash;
  }

  public void setGeohash(String geohash) {
    this.geohash = geohash;
  }

  public StoreMetadata geohash(String geohash) {
    this.geohash = geohash;
    return this;
  }

 /**
   * Geographic latitude coordinate of the store
   * @return latitude
  **/
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public StoreMetadata latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Geographic longitude coordinate of the store
   * @return longitude
  **/
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public StoreMetadata longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * Merchant provided store code
   * @return storeCode
  **/
  @JsonProperty("store_code")
  public String getStoreCode() {
    return storeCode;
  }

  public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }

  public StoreMetadata storeCode(String storeCode) {
    this.storeCode = storeCode;
    return this;
  }

 /**
   * Internal store code
   * @return storeId
  **/
  @JsonProperty("store_id")
  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public StoreMetadata storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

 /**
   * Store name
   * @return storeName
  **/
  @JsonProperty("store_name")
  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public StoreMetadata storeName(String storeName) {
    this.storeName = storeName;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


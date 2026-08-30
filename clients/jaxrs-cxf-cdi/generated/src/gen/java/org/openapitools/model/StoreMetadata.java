package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Store metadata for a specific store location
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Store metadata for a specific store location")
public class StoreMetadata   {
  
  private String geohash;

  private Double latitude;

  private Double longitude;

  private String storeCode;

  private String storeId;

  private String storeName;

  /**
   * Geohash of the store location
   **/
  public StoreMetadata geohash(String geohash) {
    this.geohash = geohash;
    return this;
  }

  
  @ApiModelProperty(example = "9q", value = "Geohash of the store location")
  @JsonProperty("geohash")
  public String getGeohash() {
    return geohash;
  }
  public void setGeohash(String geohash) {
    this.geohash = geohash;
  }


  /**
   * Geographic latitude coordinate of the store
   **/
  public StoreMetadata latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  
  @ApiModelProperty(example = "37.37695098", value = "Geographic latitude coordinate of the store")
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }


  /**
   * Geographic longitude coordinate of the store
   **/
  public StoreMetadata longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  
  @ApiModelProperty(example = "-122.032913", value = "Geographic longitude coordinate of the store")
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  /**
   * Merchant provided store code
   **/
  public StoreMetadata storeCode(String storeCode) {
    this.storeCode = storeCode;
    return this;
  }

  
  @ApiModelProperty(example = "store_1", required = true, value = "Merchant provided store code")
  @JsonProperty("store_code")
  @NotNull
  public String getStoreCode() {
    return storeCode;
  }
  public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }


  /**
   * Internal store code
   **/
  public StoreMetadata storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

  
  @ApiModelProperty(example = "9070947806573", required = true, value = "Internal store code")
  @JsonProperty("store_id")
  @NotNull
  public String getStoreId() {
    return storeId;
  }
  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  /**
   * Store name
   **/
  public StoreMetadata storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

  
  @ApiModelProperty(example = "Store 1 Sunnyvale", value = "Store name")
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


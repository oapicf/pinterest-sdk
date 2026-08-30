package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Store metadata for a specific store location
 */
public class StoreMetadata   {

    private String geohash;
    private Double latitude;
    private Double longitude;
    private String storeCode;
    private String storeId;
    private String storeName;

    /**
     * Default constructor.
     */
    public StoreMetadata() {
    // JSON-B / Jackson
    }

    /**
     * Create StoreMetadata.
     *
     * @param geohash Geohash of the store location
     * @param latitude Geographic latitude coordinate of the store
     * @param longitude Geographic longitude coordinate of the store
     * @param storeCode Merchant provided store code
     * @param storeId Internal store code
     * @param storeName Store name
     */
    public StoreMetadata(
        String geohash, 
        Double latitude, 
        Double longitude, 
        String storeCode, 
        String storeId, 
        String storeName
    ) {
        this.geohash = geohash;
        this.latitude = latitude;
        this.longitude = longitude;
        this.storeCode = storeCode;
        this.storeId = storeId;
        this.storeName = storeName;
    }



    /**
     * Geohash of the store location
     * @return geohash
     */
    public String getGeohash() {
        return geohash;
    }

    public void setGeohash(String geohash) {
        this.geohash = geohash;
    }

    /**
     * Geographic latitude coordinate of the store
     * @return latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * Geographic longitude coordinate of the store
     * @return longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * Merchant provided store code
     * @return storeCode
     */
    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    /**
     * Internal store code
     * @return storeId
     */
    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    /**
     * Store name
     * @return storeName
     */
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    /**
      * Create a string representation of this pojo.
    **/
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


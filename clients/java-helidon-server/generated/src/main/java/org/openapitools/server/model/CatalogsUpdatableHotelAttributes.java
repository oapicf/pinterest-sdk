package org.openapitools.server.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CatalogsHotelAddress;
import org.openapitools.server.model.CatalogsHotelGuestRatings;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsUpdatableHotelAttributes   {

    private CatalogsHotelAddress address;
    private String basePrice;
    private String brand;
    private String category;
    private String customLabel0;
    private String customLabel1;
    private String customLabel2;
    private String customLabel3;
    private String customLabel4;
    private String description;
    private CatalogsHotelGuestRatings guestRatings;
    private BigDecimal latitude;
    private String link;
    private BigDecimal longitude;
    private String name;
    private List<String> neighborhood;
    private String salePrice;

    /**
     * Default constructor.
     */
    public CatalogsUpdatableHotelAttributes() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsUpdatableHotelAttributes.
     *
     * @param address Hotel address
     * @param basePrice Base price of the hotel room per night followed by the ISO currency code
     * @param brand The brand to which this hotel belongs to.
     * @param category The type of property. The category can be any type of internal description desired.
     * @param customLabel0 Custom grouping of hotels
     * @param customLabel1 Custom grouping of hotels
     * @param customLabel2 Custom grouping of hotels
     * @param customLabel3 Custom grouping of hotels
     * @param customLabel4 Custom grouping of hotels
     * @param description Brief description of the hotel.
     * @param guestRatings If specified, you must provide all properties
     * @param latitude Latitude of the hotel.
     * @param link Link to the product page
     * @param longitude Longitude of the hotel.
     * @param name The hotel&#39;s name.
     * @param neighborhood A list of neighborhoods where the hotel is located
     * @param salePrice Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
     */
    public CatalogsUpdatableHotelAttributes(
        CatalogsHotelAddress address, 
        String basePrice, 
        String brand, 
        String category, 
        String customLabel0, 
        String customLabel1, 
        String customLabel2, 
        String customLabel3, 
        String customLabel4, 
        String description, 
        CatalogsHotelGuestRatings guestRatings, 
        BigDecimal latitude, 
        String link, 
        BigDecimal longitude, 
        String name, 
        List<String> neighborhood, 
        String salePrice
    ) {
        this.address = address;
        this.basePrice = basePrice;
        this.brand = brand;
        this.category = category;
        this.customLabel0 = customLabel0;
        this.customLabel1 = customLabel1;
        this.customLabel2 = customLabel2;
        this.customLabel3 = customLabel3;
        this.customLabel4 = customLabel4;
        this.description = description;
        this.guestRatings = guestRatings;
        this.latitude = latitude;
        this.link = link;
        this.longitude = longitude;
        this.name = name;
        this.neighborhood = neighborhood;
        this.salePrice = salePrice;
    }



    /**
     * Hotel address
     * @return address
     */
    public CatalogsHotelAddress getAddress() {
        return address;
    }

    public void setAddress(CatalogsHotelAddress address) {
        this.address = address;
    }

    /**
     * Base price of the hotel room per night followed by the ISO currency code
     * @return basePrice
     */
    public String getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(String basePrice) {
        this.basePrice = basePrice;
    }

    /**
     * The brand to which this hotel belongs to.
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * The type of property. The category can be any type of internal description desired.
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Custom grouping of hotels
     * @return customLabel0
     */
    public String getCustomLabel0() {
        return customLabel0;
    }

    public void setCustomLabel0(String customLabel0) {
        this.customLabel0 = customLabel0;
    }

    /**
     * Custom grouping of hotels
     * @return customLabel1
     */
    public String getCustomLabel1() {
        return customLabel1;
    }

    public void setCustomLabel1(String customLabel1) {
        this.customLabel1 = customLabel1;
    }

    /**
     * Custom grouping of hotels
     * @return customLabel2
     */
    public String getCustomLabel2() {
        return customLabel2;
    }

    public void setCustomLabel2(String customLabel2) {
        this.customLabel2 = customLabel2;
    }

    /**
     * Custom grouping of hotels
     * @return customLabel3
     */
    public String getCustomLabel3() {
        return customLabel3;
    }

    public void setCustomLabel3(String customLabel3) {
        this.customLabel3 = customLabel3;
    }

    /**
     * Custom grouping of hotels
     * @return customLabel4
     */
    public String getCustomLabel4() {
        return customLabel4;
    }

    public void setCustomLabel4(String customLabel4) {
        this.customLabel4 = customLabel4;
    }

    /**
     * Brief description of the hotel.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * If specified, you must provide all properties
     * @return guestRatings
     */
    public CatalogsHotelGuestRatings getGuestRatings() {
        return guestRatings;
    }

    public void setGuestRatings(CatalogsHotelGuestRatings guestRatings) {
        this.guestRatings = guestRatings;
    }

    /**
     * Latitude of the hotel.
     * @return latitude
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * Link to the product page
     * @return link
     */
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    /**
     * Longitude of the hotel.
     * @return longitude
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * The hotel's name.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * A list of neighborhoods where the hotel is located
     * @return neighborhood
     */
    public List<String> getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(List<String> neighborhood) {
        this.neighborhood = neighborhood;
    }

    /**
     * Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
     * @return salePrice
     */
    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsUpdatableHotelAttributes {\n");
        
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    basePrice: ").append(toIndentedString(basePrice)).append("\n");
        sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    customLabel0: ").append(toIndentedString(customLabel0)).append("\n");
        sb.append("    customLabel1: ").append(toIndentedString(customLabel1)).append("\n");
        sb.append("    customLabel2: ").append(toIndentedString(customLabel2)).append("\n");
        sb.append("    customLabel3: ").append(toIndentedString(customLabel3)).append("\n");
        sb.append("    customLabel4: ").append(toIndentedString(customLabel4)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    guestRatings: ").append(toIndentedString(guestRatings)).append("\n");
        sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    neighborhood: ").append(toIndentedString(neighborhood)).append("\n");
        sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
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


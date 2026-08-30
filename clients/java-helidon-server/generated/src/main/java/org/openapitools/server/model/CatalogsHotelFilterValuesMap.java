package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A map of filter attributes to their available values.
 */
public class CatalogsHotelFilterValuesMap   {

    private List<String> brand = new ArrayList<>();
    private List<String> customLabel0 = new ArrayList<>();
    private List<String> customLabel1 = new ArrayList<>();
    private List<String> customLabel2 = new ArrayList<>();
    private List<String> customLabel3 = new ArrayList<>();
    private List<String> customLabel4 = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CatalogsHotelFilterValuesMap() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsHotelFilterValuesMap.
     *
     * @param brand brand
     * @param customLabel0 customLabel0
     * @param customLabel1 customLabel1
     * @param customLabel2 customLabel2
     * @param customLabel3 customLabel3
     * @param customLabel4 customLabel4
     */
    public CatalogsHotelFilterValuesMap(
        List<String> brand, 
        List<String> customLabel0, 
        List<String> customLabel1, 
        List<String> customLabel2, 
        List<String> customLabel3, 
        List<String> customLabel4
    ) {
        this.brand = brand;
        this.customLabel0 = customLabel0;
        this.customLabel1 = customLabel1;
        this.customLabel2 = customLabel2;
        this.customLabel3 = customLabel3;
        this.customLabel4 = customLabel4;
    }



    /**
     * Get brand
     * @return brand
     */
    public List<String> getBrand() {
        return brand;
    }

    public void setBrand(List<String> brand) {
        this.brand = brand;
    }

    /**
     * Get customLabel0
     * @return customLabel0
     */
    public List<String> getCustomLabel0() {
        return customLabel0;
    }

    public void setCustomLabel0(List<String> customLabel0) {
        this.customLabel0 = customLabel0;
    }

    /**
     * Get customLabel1
     * @return customLabel1
     */
    public List<String> getCustomLabel1() {
        return customLabel1;
    }

    public void setCustomLabel1(List<String> customLabel1) {
        this.customLabel1 = customLabel1;
    }

    /**
     * Get customLabel2
     * @return customLabel2
     */
    public List<String> getCustomLabel2() {
        return customLabel2;
    }

    public void setCustomLabel2(List<String> customLabel2) {
        this.customLabel2 = customLabel2;
    }

    /**
     * Get customLabel3
     * @return customLabel3
     */
    public List<String> getCustomLabel3() {
        return customLabel3;
    }

    public void setCustomLabel3(List<String> customLabel3) {
        this.customLabel3 = customLabel3;
    }

    /**
     * Get customLabel4
     * @return customLabel4
     */
    public List<String> getCustomLabel4() {
        return customLabel4;
    }

    public void setCustomLabel4(List<String> customLabel4) {
        this.customLabel4 = customLabel4;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsHotelFilterValuesMap {\n");
        
        sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
        sb.append("    customLabel0: ").append(toIndentedString(customLabel0)).append("\n");
        sb.append("    customLabel1: ").append(toIndentedString(customLabel1)).append("\n");
        sb.append("    customLabel2: ").append(toIndentedString(customLabel2)).append("\n");
        sb.append("    customLabel3: ").append(toIndentedString(customLabel3)).append("\n");
        sb.append("    customLabel4: ").append(toIndentedString(customLabel4)).append("\n");
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


package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class TargetingSpecShoppingRetargeting   {

    private Integer exclusionWindow;
    private Integer lookbackWindow;
    private List<Integer> tagTypes = new ArrayList<>();

    /**
     * Default constructor.
     */
    public TargetingSpecShoppingRetargeting() {
    // JSON-B / Jackson
    }

    /**
     * Create TargetingSpecShoppingRetargeting.
     *
     * @param exclusionWindow Number of days ago to stop lookback timeframe for dynamic retargeting
     * @param lookbackWindow Number of days ago to start lookback timeframe for dynamic retargeting
     * @param tagTypes Event types to target for dynamic retargeting
     */
    public TargetingSpecShoppingRetargeting(
        Integer exclusionWindow, 
        Integer lookbackWindow, 
        List<Integer> tagTypes
    ) {
        this.exclusionWindow = exclusionWindow;
        this.lookbackWindow = lookbackWindow;
        this.tagTypes = tagTypes;
    }



    /**
     * Number of days ago to stop lookback timeframe for dynamic retargeting
     * @return exclusionWindow
     */
    public Integer getExclusionWindow() {
        return exclusionWindow;
    }

    public void setExclusionWindow(Integer exclusionWindow) {
        this.exclusionWindow = exclusionWindow;
    }

    /**
     * Number of days ago to start lookback timeframe for dynamic retargeting
     * @return lookbackWindow
     */
    public Integer getLookbackWindow() {
        return lookbackWindow;
    }

    public void setLookbackWindow(Integer lookbackWindow) {
        this.lookbackWindow = lookbackWindow;
    }

    /**
     * Event types to target for dynamic retargeting
     * @return tagTypes
     */
    public List<Integer> getTagTypes() {
        return tagTypes;
    }

    public void setTagTypes(List<Integer> tagTypes) {
        this.tagTypes = tagTypes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetingSpecShoppingRetargeting {\n");
        
        sb.append("    exclusionWindow: ").append(toIndentedString(exclusionWindow)).append("\n");
        sb.append("    lookbackWindow: ").append(toIndentedString(lookbackWindow)).append("\n");
        sb.append("    tagTypes: ").append(toIndentedString(tagTypes)).append("\n");
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


package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AttributionWindows   {

    private Integer clickWindowDays;
    private Integer engagementWindowDays;
    private Integer viewWindowDays;

    /**
     * Default constructor.
     */
    public AttributionWindows() {
    // JSON-B / Jackson
    }

    /**
     * Create AttributionWindows.
     *
     * @param clickWindowDays clickWindowDays
     * @param engagementWindowDays engagementWindowDays
     * @param viewWindowDays viewWindowDays
     */
    public AttributionWindows(
        Integer clickWindowDays, 
        Integer engagementWindowDays, 
        Integer viewWindowDays
    ) {
        this.clickWindowDays = clickWindowDays;
        this.engagementWindowDays = engagementWindowDays;
        this.viewWindowDays = viewWindowDays;
    }



    /**
     * Get clickWindowDays
     * @return clickWindowDays
     */
    public Integer getClickWindowDays() {
        return clickWindowDays;
    }

    public void setClickWindowDays(Integer clickWindowDays) {
        this.clickWindowDays = clickWindowDays;
    }

    /**
     * Get engagementWindowDays
     * @return engagementWindowDays
     */
    public Integer getEngagementWindowDays() {
        return engagementWindowDays;
    }

    public void setEngagementWindowDays(Integer engagementWindowDays) {
        this.engagementWindowDays = engagementWindowDays;
    }

    /**
     * Get viewWindowDays
     * @return viewWindowDays
     */
    public Integer getViewWindowDays() {
        return viewWindowDays;
    }

    public void setViewWindowDays(Integer viewWindowDays) {
        this.viewWindowDays = viewWindowDays;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttributionWindows {\n");
        
        sb.append("    clickWindowDays: ").append(toIndentedString(clickWindowDays)).append("\n");
        sb.append("    engagementWindowDays: ").append(toIndentedString(engagementWindowDays)).append("\n");
        sb.append("    viewWindowDays: ").append(toIndentedString(viewWindowDays)).append("\n");
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


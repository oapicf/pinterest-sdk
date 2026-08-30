package org.openapitools.server.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.server.model.TrendingPin;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Individual trending topic within an interest category
 */
public class TrendingTopic   {

    private String description;
    private String id;
    private Integer percentGrowthMom;
    private List<@Valid TrendingPin> pins = new ArrayList<>();
    private List<String> relatedInterests = new ArrayList<>();
    private List<String> relatedSearches = new ArrayList<>();
    private Map<String, BigDecimal> timeSeries = new HashMap<>();
    private String title;

    /**
     * Default constructor.
     */
    public TrendingTopic() {
    // JSON-B / Jackson
    }

    /**
     * Create TrendingTopic.
     *
     * @param description Description of the trending topic
     * @param id Unique identifier for the trending topic
     * @param percentGrowthMom Month-over-month growth percentage
     * @param pins Array of pin images related to this trend (up to 6)
     * @param relatedInterests List of related interest categories
     * @param relatedSearches List of related search terms
     * @param timeSeries Time series data showing trend values over time, with dates as keys and values as numeric
     * @param title Title of the trending topic
     */
    public TrendingTopic(
        String description, 
        String id, 
        Integer percentGrowthMom, 
        List<@Valid TrendingPin> pins, 
        List<String> relatedInterests, 
        List<String> relatedSearches, 
        Map<String, BigDecimal> timeSeries, 
        String title
    ) {
        this.description = description;
        this.id = id;
        this.percentGrowthMom = percentGrowthMom;
        this.pins = pins;
        this.relatedInterests = relatedInterests;
        this.relatedSearches = relatedSearches;
        this.timeSeries = timeSeries;
        this.title = title;
    }



    /**
     * Description of the trending topic
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Unique identifier for the trending topic
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Month-over-month growth percentage
     * @return percentGrowthMom
     */
    public Integer getPercentGrowthMom() {
        return percentGrowthMom;
    }

    public void setPercentGrowthMom(Integer percentGrowthMom) {
        this.percentGrowthMom = percentGrowthMom;
    }

    /**
     * Array of pin images related to this trend (up to 6)
     * @return pins
     */
    public List<@Valid TrendingPin> getPins() {
        return pins;
    }

    public void setPins(List<@Valid TrendingPin> pins) {
        this.pins = pins;
    }

    /**
     * List of related interest categories
     * @return relatedInterests
     */
    public List<String> getRelatedInterests() {
        return relatedInterests;
    }

    public void setRelatedInterests(List<String> relatedInterests) {
        this.relatedInterests = relatedInterests;
    }

    /**
     * List of related search terms
     * @return relatedSearches
     */
    public List<String> getRelatedSearches() {
        return relatedSearches;
    }

    public void setRelatedSearches(List<String> relatedSearches) {
        this.relatedSearches = relatedSearches;
    }

    /**
     * Time series data showing trend values over time, with dates as keys and values as numeric
     * @return timeSeries
     */
    public Map<String, BigDecimal> getTimeSeries() {
        return timeSeries;
    }

    public void setTimeSeries(Map<String, BigDecimal> timeSeries) {
        this.timeSeries = timeSeries;
    }

    /**
     * Title of the trending topic
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrendingTopic {\n");
        
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    percentGrowthMom: ").append(toIndentedString(percentGrowthMom)).append("\n");
        sb.append("    pins: ").append(toIndentedString(pins)).append("\n");
        sb.append("    relatedInterests: ").append(toIndentedString(relatedInterests)).append("\n");
        sb.append("    relatedSearches: ").append(toIndentedString(relatedSearches)).append("\n");
        sb.append("    timeSeries: ").append(toIndentedString(timeSeries)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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


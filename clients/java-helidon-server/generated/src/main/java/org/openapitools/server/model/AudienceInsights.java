package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.AudienceCategory;
import org.openapitools.server.model.AudienceDemographics;
import org.openapitools.server.model.AudienceInsightType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Audience interests and demographics.
 */
public class AudienceInsights   {

    private List<@Valid AudienceCategory> categories = new ArrayList<>();
    private String date;
    private AudienceDemographics demographics;
    private Integer size;
    private Boolean sizeIsUpperBound;
    private AudienceInsightType type;

    /**
     * Default constructor.
     */
    public AudienceInsights() {
    // JSON-B / Jackson
    }

    /**
     * Create AudienceInsights.
     *
     * @param categories Category interest distribution
     * @param date Generation date
     * @param demographics demographics
     * @param size Population count.
     * @param sizeIsUpperBound Indicates whether the audience size has been rounded up to the next highest upper boundary.
     * @param type type
     */
    public AudienceInsights(
        List<@Valid AudienceCategory> categories, 
        String date, 
        AudienceDemographics demographics, 
        Integer size, 
        Boolean sizeIsUpperBound, 
        AudienceInsightType type
    ) {
        this.categories = categories;
        this.date = date;
        this.demographics = demographics;
        this.size = size;
        this.sizeIsUpperBound = sizeIsUpperBound;
        this.type = type;
    }



    /**
     * Category interest distribution
     * @return categories
     */
    public List<@Valid AudienceCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<@Valid AudienceCategory> categories) {
        this.categories = categories;
    }

    /**
     * Generation date
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Get demographics
     * @return demographics
     */
    public AudienceDemographics getDemographics() {
        return demographics;
    }

    public void setDemographics(AudienceDemographics demographics) {
        this.demographics = demographics;
    }

    /**
     * Population count.
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * Indicates whether the audience size has been rounded up to the next highest upper boundary.
     * @return sizeIsUpperBound
     */
    public Boolean getSizeIsUpperBound() {
        return sizeIsUpperBound;
    }

    public void setSizeIsUpperBound(Boolean sizeIsUpperBound) {
        this.sizeIsUpperBound = sizeIsUpperBound;
    }

    /**
     * Get type
     * @return type
     */
    public AudienceInsightType getType() {
        return type;
    }

    public void setType(AudienceInsightType type) {
        this.type = type;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudienceInsights {\n");
        
        sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    demographics: ").append(toIndentedString(demographics)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    sizeIsUpperBound: ").append(toIndentedString(sizeIsUpperBound)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class DynamicTitlesGetStatus   {

    private Integer generatedCount;
    private Boolean isReady;
    private Integer reviewedCount;

    /**
     * Default constructor.
     */
    public DynamicTitlesGetStatus() {
    // JSON-B / Jackson
    }

    /**
     * Create DynamicTitlesGetStatus.
     *
     * @param generatedCount The count of generated titles.
     * @param isReady Whether dynamic titles have been generated and are ready to be reviewed for the ad group.
     * @param reviewedCount The count of advertiser reviewed titles.
     */
    public DynamicTitlesGetStatus(
        Integer generatedCount, 
        Boolean isReady, 
        Integer reviewedCount
    ) {
        this.generatedCount = generatedCount;
        this.isReady = isReady;
        this.reviewedCount = reviewedCount;
    }



    /**
     * The count of generated titles.
     * @return generatedCount
     */
    public Integer getGeneratedCount() {
        return generatedCount;
    }

    public void setGeneratedCount(Integer generatedCount) {
        this.generatedCount = generatedCount;
    }

    /**
     * Whether dynamic titles have been generated and are ready to be reviewed for the ad group.
     * @return isReady
     */
    public Boolean getIsReady() {
        return isReady;
    }

    public void setIsReady(Boolean isReady) {
        this.isReady = isReady;
    }

    /**
     * The count of advertiser reviewed titles.
     * @return reviewedCount
     */
    public Integer getReviewedCount() {
        return reviewedCount;
    }

    public void setReviewedCount(Integer reviewedCount) {
        this.reviewedCount = reviewedCount;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DynamicTitlesGetStatus {\n");
        
        sb.append("    generatedCount: ").append(toIndentedString(generatedCount)).append("\n");
        sb.append("    isReady: ").append(toIndentedString(isReady)).append("\n");
        sb.append("    reviewedCount: ").append(toIndentedString(reviewedCount)).append("\n");
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


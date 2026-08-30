package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.
 */
public class CampaignPlanningPointEstimate   {

    private Integer budget;
    private Double doubleY;
    private Integer maxY;
    private Integer minY;
    private Integer y;

    /**
     * Default constructor.
     */
    public CampaignPlanningPointEstimate() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignPlanningPointEstimate.
     *
     * @param budget The budget value of the point.
     * @param doubleY Y value as a decimal.
     * @param maxY The maximum Y value of the point.
     * @param minY The minimum Y value of the point.
     * @param y The expected Y value of the point.
     */
    public CampaignPlanningPointEstimate(
        Integer budget, 
        Double doubleY, 
        Integer maxY, 
        Integer minY, 
        Integer y
    ) {
        this.budget = budget;
        this.doubleY = doubleY;
        this.maxY = maxY;
        this.minY = minY;
        this.y = y;
    }



    /**
     * The budget value of the point.
     * @return budget
     */
    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    /**
     * Y value as a decimal.
     * @return doubleY
     */
    public Double getDoubleY() {
        return doubleY;
    }

    public void setDoubleY(Double doubleY) {
        this.doubleY = doubleY;
    }

    /**
     * The maximum Y value of the point.
     * @return maxY
     */
    public Integer getMaxY() {
        return maxY;
    }

    public void setMaxY(Integer maxY) {
        this.maxY = maxY;
    }

    /**
     * The minimum Y value of the point.
     * @return minY
     */
    public Integer getMinY() {
        return minY;
    }

    public void setMinY(Integer minY) {
        this.minY = minY;
    }

    /**
     * The expected Y value of the point.
     * @return y
     */
    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignPlanningPointEstimate {\n");
        
        sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
        sb.append("    doubleY: ").append(toIndentedString(doubleY)).append("\n");
        sb.append("    maxY: ").append(toIndentedString(maxY)).append("\n");
        sb.append("    minY: ").append(toIndentedString(minY)).append("\n");
        sb.append("    y: ").append(toIndentedString(y)).append("\n");
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


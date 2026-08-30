package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Range audience size for an ad group.
 */
public class CampaignPlanningAdGroupAudienceSize   {

    private Integer countLower;
    private Integer countUpper;

    /**
     * Default constructor.
     */
    public CampaignPlanningAdGroupAudienceSize() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignPlanningAdGroupAudienceSize.
     *
     * @param countLower Lower bound of the audience size estimate.
     * @param countUpper Upper bound of the audience size estimate.
     */
    public CampaignPlanningAdGroupAudienceSize(
        Integer countLower, 
        Integer countUpper
    ) {
        this.countLower = countLower;
        this.countUpper = countUpper;
    }



    /**
     * Lower bound of the audience size estimate.
     * minimum: 0
     * @return countLower
     */
    public Integer getCountLower() {
        return countLower;
    }

    public void setCountLower(Integer countLower) {
        this.countLower = countLower;
    }

    /**
     * Upper bound of the audience size estimate.
     * minimum: 0
     * @return countUpper
     */
    public Integer getCountUpper() {
        return countUpper;
    }

    public void setCountUpper(Integer countUpper) {
        this.countUpper = countUpper;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignPlanningAdGroupAudienceSize {\n");
        
        sb.append("    countLower: ").append(toIndentedString(countLower)).append("\n");
        sb.append("    countUpper: ").append(toIndentedString(countUpper)).append("\n");
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


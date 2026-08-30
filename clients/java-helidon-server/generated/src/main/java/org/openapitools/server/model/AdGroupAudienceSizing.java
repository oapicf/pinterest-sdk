package org.openapitools.server.model;

import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AdGroupAudienceSizing   {

    private BigDecimal audienceSizeLowerBound;
    private BigDecimal audienceSizeUpperBound;

    /**
     * Default constructor.
     */
    public AdGroupAudienceSizing() {
    // JSON-B / Jackson
    }

    /**
     * Create AdGroupAudienceSizing.
     *
     * @param audienceSizeLowerBound The lower confidence bound of the estimated potential audience size. \&quot;Potential audience size\&quot; estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
     * @param audienceSizeUpperBound The upper confidence bound of the estimated potential audience size. \&quot;Potential audience size\&quot; estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
     */
    public AdGroupAudienceSizing(
        BigDecimal audienceSizeLowerBound, 
        BigDecimal audienceSizeUpperBound
    ) {
        this.audienceSizeLowerBound = audienceSizeLowerBound;
        this.audienceSizeUpperBound = audienceSizeUpperBound;
    }



    /**
     * The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
     * @return audienceSizeLowerBound
     */
    public BigDecimal getAudienceSizeLowerBound() {
        return audienceSizeLowerBound;
    }

    public void setAudienceSizeLowerBound(BigDecimal audienceSizeLowerBound) {
        this.audienceSizeLowerBound = audienceSizeLowerBound;
    }

    /**
     * The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
     * @return audienceSizeUpperBound
     */
    public BigDecimal getAudienceSizeUpperBound() {
        return audienceSizeUpperBound;
    }

    public void setAudienceSizeUpperBound(BigDecimal audienceSizeUpperBound) {
        this.audienceSizeUpperBound = audienceSizeUpperBound;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdGroupAudienceSizing {\n");
        
        sb.append("    audienceSizeLowerBound: ").append(toIndentedString(audienceSizeLowerBound)).append("\n");
        sb.append("    audienceSizeUpperBound: ").append(toIndentedString(audienceSizeUpperBound)).append("\n");
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


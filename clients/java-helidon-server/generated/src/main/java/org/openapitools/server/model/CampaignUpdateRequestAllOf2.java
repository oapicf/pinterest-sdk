package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CampaignBidOptionsUpdate;
import org.openapitools.server.model.IntendedPromotionType;
import org.openapitools.server.model.ObjectiveType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CampaignUpdateRequestAllOf2   {

    private CampaignBidOptionsUpdate bidOptions;
    private IntendedPromotionType intendedPromotionType;
    private Boolean isLtvOptimized;
    private Boolean isPerformancePlus;
    private Boolean isTopOfSearch;
    private ObjectiveType objectiveType;

    /**
     * Default constructor.
     */
    public CampaignUpdateRequestAllOf2() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignUpdateRequestAllOf2.
     *
     * @param bidOptions bidOptions
     * @param intendedPromotionType intendedPromotionType
     * @param isLtvOptimized Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
     * @param isPerformancePlus Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;. This field is immutable, except only for campaigns in draft status which may update this field.
     * @param isTopOfSearch Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.
     * @param objectiveType objectiveType
     */
    public CampaignUpdateRequestAllOf2(
        CampaignBidOptionsUpdate bidOptions, 
        IntendedPromotionType intendedPromotionType, 
        Boolean isLtvOptimized, 
        Boolean isPerformancePlus, 
        Boolean isTopOfSearch, 
        ObjectiveType objectiveType
    ) {
        this.bidOptions = bidOptions;
        this.intendedPromotionType = intendedPromotionType;
        this.isLtvOptimized = isLtvOptimized;
        this.isPerformancePlus = isPerformancePlus;
        this.isTopOfSearch = isTopOfSearch;
        this.objectiveType = objectiveType;
    }



    /**
     * Get bidOptions
     * @return bidOptions
     */
    public CampaignBidOptionsUpdate getBidOptions() {
        return bidOptions;
    }

    public void setBidOptions(CampaignBidOptionsUpdate bidOptions) {
        this.bidOptions = bidOptions;
    }

    /**
     * Get intendedPromotionType
     * @return intendedPromotionType
     */
    public IntendedPromotionType getIntendedPromotionType() {
        return intendedPromotionType;
    }

    public void setIntendedPromotionType(IntendedPromotionType intendedPromotionType) {
        this.intendedPromotionType = intendedPromotionType;
    }

    /**
     * Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
     * @return isLtvOptimized
     */
    public Boolean getIsLtvOptimized() {
        return isLtvOptimized;
    }

    public void setIsLtvOptimized(Boolean isLtvOptimized) {
        this.isLtvOptimized = isLtvOptimized;
    }

    /**
     * Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field.
     * @return isPerformancePlus
     */
    public Boolean getIsPerformancePlus() {
        return isPerformancePlus;
    }

    public void setIsPerformancePlus(Boolean isPerformancePlus) {
        this.isPerformancePlus = isPerformancePlus;
    }

    /**
     * Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.
     * @return isTopOfSearch
     */
    public Boolean getIsTopOfSearch() {
        return isTopOfSearch;
    }

    public void setIsTopOfSearch(Boolean isTopOfSearch) {
        this.isTopOfSearch = isTopOfSearch;
    }

    /**
     * Get objectiveType
     * @return objectiveType
     */
    public ObjectiveType getObjectiveType() {
        return objectiveType;
    }

    public void setObjectiveType(ObjectiveType objectiveType) {
        this.objectiveType = objectiveType;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignUpdateRequestAllOf2 {\n");
        
        sb.append("    bidOptions: ").append(toIndentedString(bidOptions)).append("\n");
        sb.append("    intendedPromotionType: ").append(toIndentedString(intendedPromotionType)).append("\n");
        sb.append("    isLtvOptimized: ").append(toIndentedString(isLtvOptimized)).append("\n");
        sb.append("    isPerformancePlus: ").append(toIndentedString(isPerformancePlus)).append("\n");
        sb.append("    isTopOfSearch: ").append(toIndentedString(isTopOfSearch)).append("\n");
        sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
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


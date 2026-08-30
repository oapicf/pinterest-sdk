package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CampaignBidOptionsCreate;
import org.openapitools.server.model.EntityStatus;
import org.openapitools.server.model.IntendedPromotionType;
import org.openapitools.server.model.ObjectiveType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CampaignCreateRequestAllOf1   {

    private CampaignBidOptionsCreate bidOptions;
    private IntendedPromotionType intendedPromotionType;
    private Boolean isAutomatedCampaign;
    private Boolean isCampaignBudgetOptimization;
    private Boolean isFlexibleDailyBudgets;
    private Boolean isLtvOptimized;
    private Boolean isPerformancePlus = false;
    private Boolean isTopOfSearch = false;
    private ObjectiveType objectiveType;
    private EntityStatus status;

    /**
     * Default constructor.
     */
    public CampaignCreateRequestAllOf1() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignCreateRequestAllOf1.
     *
     * @param bidOptions bidOptions
     * @param intendedPromotionType intendedPromotionType
     * @param isAutomatedCampaign Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES
     * @param isCampaignBudgetOptimization Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
     * @param isFlexibleDailyBudgets Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
     * @param isLtvOptimized Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
     * @param isPerformancePlus Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;.
     * @param isTopOfSearch &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt;  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: &#x60;CONSIDERATION&#x60; &#x60;WEB_CONVERSION&#x60; &#x60;CATALOG_SALES&#x60;  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your &#x60;true&#x60; or &#x60;false&#x60; selection of this campaign if you &lt;a href&#x3D;\&quot;https://developer.pinterest.com/docs/api/v5/campaigns-update\&quot; target&#x3D;\&quot;blank\&quot;&gt;update it&lt;/a&gt;.
     * @param objectiveType objectiveType
     * @param status status
     */
    public CampaignCreateRequestAllOf1(
        CampaignBidOptionsCreate bidOptions, 
        IntendedPromotionType intendedPromotionType, 
        Boolean isAutomatedCampaign, 
        Boolean isCampaignBudgetOptimization, 
        Boolean isFlexibleDailyBudgets, 
        Boolean isLtvOptimized, 
        Boolean isPerformancePlus, 
        Boolean isTopOfSearch, 
        ObjectiveType objectiveType, 
        EntityStatus status
    ) {
        this.bidOptions = bidOptions;
        this.intendedPromotionType = intendedPromotionType;
        this.isAutomatedCampaign = isAutomatedCampaign;
        this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
        this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
        this.isLtvOptimized = isLtvOptimized;
        this.isPerformancePlus = isPerformancePlus;
        this.isTopOfSearch = isTopOfSearch;
        this.objectiveType = objectiveType;
        this.status = status;
    }



    /**
     * Get bidOptions
     * @return bidOptions
     */
    public CampaignBidOptionsCreate getBidOptions() {
        return bidOptions;
    }

    public void setBidOptions(CampaignBidOptionsCreate bidOptions) {
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
     * Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES
     * @return isAutomatedCampaign
     */
    public Boolean getIsAutomatedCampaign() {
        return isAutomatedCampaign;
    }

    public void setIsAutomatedCampaign(Boolean isAutomatedCampaign) {
        this.isAutomatedCampaign = isAutomatedCampaign;
    }

    /**
     * Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
     * @return isCampaignBudgetOptimization
     */
    public Boolean getIsCampaignBudgetOptimization() {
        return isCampaignBudgetOptimization;
    }

    public void setIsCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
        this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
    }

    /**
     * Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
     * @return isFlexibleDailyBudgets
     */
    public Boolean getIsFlexibleDailyBudgets() {
        return isFlexibleDailyBudgets;
    }

    public void setIsFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
        this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
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
     * Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>.
     * @return isPerformancePlus
     */
    public Boolean getIsPerformancePlus() {
        return isPerformancePlus;
    }

    public void setIsPerformancePlus(Boolean isPerformancePlus) {
        this.isPerformancePlus = isPerformancePlus;
    }

    /**
     * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a>  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: `CONSIDERATION` `WEB_CONVERSION` `CATALOG_SALES`  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your `true` or `false` selection of this campaign if you <a href=\"https://developer.pinterest.com/docs/api/v5/campaigns-update\" target=\"blank\">update it</a>.
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
     * Get status
     * @return status
     */
    public EntityStatus getStatus() {
        return status;
    }

    public void setStatus(EntityStatus status) {
        this.status = status;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignCreateRequestAllOf1 {\n");
        
        sb.append("    bidOptions: ").append(toIndentedString(bidOptions)).append("\n");
        sb.append("    intendedPromotionType: ").append(toIndentedString(intendedPromotionType)).append("\n");
        sb.append("    isAutomatedCampaign: ").append(toIndentedString(isAutomatedCampaign)).append("\n");
        sb.append("    isCampaignBudgetOptimization: ").append(toIndentedString(isCampaignBudgetOptimization)).append("\n");
        sb.append("    isFlexibleDailyBudgets: ").append(toIndentedString(isFlexibleDailyBudgets)).append("\n");
        sb.append("    isLtvOptimized: ").append(toIndentedString(isLtvOptimized)).append("\n");
        sb.append("    isPerformancePlus: ").append(toIndentedString(isPerformancePlus)).append("\n");
        sb.append("    isTopOfSearch: ").append(toIndentedString(isTopOfSearch)).append("\n");
        sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


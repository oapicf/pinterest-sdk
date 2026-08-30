package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.AdGroupAudienceSizingCreativeTypes;
import org.openapitools.server.model.AdGroupDeliveryEstimatesKeywordsItems;
import org.openapitools.server.model.OptimizationGoalMetadata;
import org.openapitools.server.model.OptimizationType;
import org.openapitools.server.model.PlacementGroupType;
import org.openapitools.server.model.TargetingSpecOptimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ad group configuration for delivery estimates.
 */
public class AdGroupDeliveryEstimates   {

    private Boolean autoTargetingEnabled;
    private List<AdGroupAudienceSizingCreativeTypes> creativeTypes = new ArrayList<>();
    private List<@Valid AdGroupDeliveryEstimatesKeywordsItems> keywords;
    private Integer monthlyFrequencyCap;
    private OptimizationGoalMetadata optimizationGoalMetadata;
    private OptimizationType optimizationType;
    private PlacementGroupType placementGroup = PlacementGroupType.ALL;
    private List<@Pattern(regexp = "^\\d+$")String> productGroupIds = new ArrayList<>();
    private TargetingSpecOptimal targetingSpec;

    /**
     * Default constructor.
     */
    public AdGroupDeliveryEstimates() {
    // JSON-B / Jackson
    }

    /**
     * Create AdGroupDeliveryEstimates.
     *
     * @param autoTargetingEnabled autoTargetingEnabled
     * @param creativeTypes Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
     * @param keywords Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
     * @param monthlyFrequencyCap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups.
     * @param optimizationGoalMetadata optimizationGoalMetadata
     * @param optimizationType Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise.
     * @param placementGroup placementGroup
     * @param productGroupIds [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns.
     * @param targetingSpec targetingSpec
     */
    public AdGroupDeliveryEstimates(
        Boolean autoTargetingEnabled, 
        List<AdGroupAudienceSizingCreativeTypes> creativeTypes, 
        List<@Valid AdGroupDeliveryEstimatesKeywordsItems> keywords, 
        Integer monthlyFrequencyCap, 
        OptimizationGoalMetadata optimizationGoalMetadata, 
        OptimizationType optimizationType, 
        PlacementGroupType placementGroup, 
        List<@Pattern(regexp = "^\\d+$")String> productGroupIds, 
        TargetingSpecOptimal targetingSpec
    ) {
        this.autoTargetingEnabled = autoTargetingEnabled;
        this.creativeTypes = creativeTypes;
        this.keywords = keywords;
        this.monthlyFrequencyCap = monthlyFrequencyCap;
        this.optimizationGoalMetadata = optimizationGoalMetadata;
        this.optimizationType = optimizationType;
        this.placementGroup = placementGroup;
        this.productGroupIds = productGroupIds;
        this.targetingSpec = targetingSpec;
    }



    /**
     * Get autoTargetingEnabled
     * @return autoTargetingEnabled
     */
    public Boolean getAutoTargetingEnabled() {
        return autoTargetingEnabled;
    }

    public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
        this.autoTargetingEnabled = autoTargetingEnabled;
    }

    /**
     * Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
     * @return creativeTypes
     */
    public List<AdGroupAudienceSizingCreativeTypes> getCreativeTypes() {
        return creativeTypes;
    }

    public void setCreativeTypes(List<AdGroupAudienceSizingCreativeTypes> creativeTypes) {
        this.creativeTypes = creativeTypes;
    }

    /**
     * Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
     * @return keywords
     */
    public List<@Valid AdGroupDeliveryEstimatesKeywordsItems> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<@Valid AdGroupDeliveryEstimatesKeywordsItems> keywords) {
        this.keywords = keywords;
    }

    /**
     * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups.
     * minimum: 0
     * @return monthlyFrequencyCap
     */
    public Integer getMonthlyFrequencyCap() {
        return monthlyFrequencyCap;
    }

    public void setMonthlyFrequencyCap(Integer monthlyFrequencyCap) {
        this.monthlyFrequencyCap = monthlyFrequencyCap;
    }

    /**
     * Get optimizationGoalMetadata
     * @return optimizationGoalMetadata
     */
    public OptimizationGoalMetadata getOptimizationGoalMetadata() {
        return optimizationGoalMetadata;
    }

    public void setOptimizationGoalMetadata(OptimizationGoalMetadata optimizationGoalMetadata) {
        this.optimizationGoalMetadata = optimizationGoalMetadata;
    }

    /**
     * Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise.
     * @return optimizationType
     */
    public OptimizationType getOptimizationType() {
        return optimizationType;
    }

    public void setOptimizationType(OptimizationType optimizationType) {
        this.optimizationType = optimizationType;
    }

    /**
     * Get placementGroup
     * @return placementGroup
     */
    public PlacementGroupType getPlacementGroup() {
        return placementGroup;
    }

    public void setPlacementGroup(PlacementGroupType placementGroup) {
        this.placementGroup = placementGroup;
    }

    /**
     * [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns.
     * @return productGroupIds
     */
    public List<@Pattern(regexp = "^\\d+$")String> getProductGroupIds() {
        return productGroupIds;
    }

    public void setProductGroupIds(List<@Pattern(regexp = "^\\d+$")String> productGroupIds) {
        this.productGroupIds = productGroupIds;
    }

    /**
     * Get targetingSpec
     * @return targetingSpec
     */
    public TargetingSpecOptimal getTargetingSpec() {
        return targetingSpec;
    }

    public void setTargetingSpec(TargetingSpecOptimal targetingSpec) {
        this.targetingSpec = targetingSpec;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdGroupDeliveryEstimates {\n");
        
        sb.append("    autoTargetingEnabled: ").append(toIndentedString(autoTargetingEnabled)).append("\n");
        sb.append("    creativeTypes: ").append(toIndentedString(creativeTypes)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
        sb.append("    monthlyFrequencyCap: ").append(toIndentedString(monthlyFrequencyCap)).append("\n");
        sb.append("    optimizationGoalMetadata: ").append(toIndentedString(optimizationGoalMetadata)).append("\n");
        sb.append("    optimizationType: ").append(toIndentedString(optimizationType)).append("\n");
        sb.append("    placementGroup: ").append(toIndentedString(placementGroup)).append("\n");
        sb.append("    productGroupIds: ").append(toIndentedString(productGroupIds)).append("\n");
        sb.append("    targetingSpec: ").append(toIndentedString(targetingSpec)).append("\n");
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


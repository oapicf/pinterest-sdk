package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdGroupAudienceSizingCreativeTypes;
import org.openapitools.model.AdGroupDeliveryEstimatesKeywordsItems;
import org.openapitools.model.OptimizationGoalMetadata;
import org.openapitools.model.OptimizationType;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TargetingSpecOptimal;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Ad group configuration for delivery estimates.
 */
@ApiModel(description="Ad group configuration for delivery estimates.")

public class AdGroupDeliveryEstimates  {
  
  @ApiModelProperty(value = "")

  private Boolean autoTargetingEnabled;

 /**
  * Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
  */
  @ApiModelProperty(value = "Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.")

  private List<AdGroupAudienceSizingCreativeTypes> creativeTypes = new ArrayList<>();

 /**
  * Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
  */
  @ApiModelProperty(value = "Array of keyword objects. If the keywords field is missing, all keywords will be targeted.")

  private List<AdGroupDeliveryEstimatesKeywordsItems> keywords;

 /**
  * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups.
  */
  @ApiModelProperty(value = "Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups.")

  private Integer monthlyFrequencyCap;

  @ApiModelProperty(value = "")

  private OptimizationGoalMetadata optimizationGoalMetadata;

 /**
  * Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise.
  */
  @ApiModelProperty(value = "Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise.")

  private OptimizationType optimizationType;

  @ApiModelProperty(value = "")

  private PlacementGroupType placementGroup = PlacementGroupType.ALL;

 /**
  * [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns.
  */
  @ApiModelProperty(value = "[Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns.")

  private List<String> productGroupIds = new ArrayList<>();

  @ApiModelProperty(value = "")

  private TargetingSpecOptimal targetingSpec;
 /**
   * Get autoTargetingEnabled
   * @return autoTargetingEnabled
  **/
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  public AdGroupDeliveryEstimates autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

 /**
   * Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
   * @return creativeTypes
  **/
  @JsonProperty("creative_types")
  public List<AdGroupAudienceSizingCreativeTypes> getCreativeTypes() {
    return creativeTypes;
  }

  public void setCreativeTypes(List<AdGroupAudienceSizingCreativeTypes> creativeTypes) {
    this.creativeTypes = creativeTypes;
  }

  public AdGroupDeliveryEstimates creativeTypes(List<AdGroupAudienceSizingCreativeTypes> creativeTypes) {
    this.creativeTypes = creativeTypes;
    return this;
  }

  public AdGroupDeliveryEstimates addCreativeTypesItem(AdGroupAudienceSizingCreativeTypes creativeTypesItem) {
    this.creativeTypes.add(creativeTypesItem);
    return this;
  }

 /**
   * Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
   * @return keywords
  **/
  @JsonProperty("keywords")
  public List<AdGroupDeliveryEstimatesKeywordsItems> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<AdGroupDeliveryEstimatesKeywordsItems> keywords) {
    this.keywords = keywords;
  }

  public AdGroupDeliveryEstimates keywords(List<AdGroupDeliveryEstimatesKeywordsItems> keywords) {
    this.keywords = keywords;
    return this;
  }

  public AdGroupDeliveryEstimates addKeywordsItem(AdGroupDeliveryEstimatesKeywordsItems keywordsItem) {
    this.keywords.add(keywordsItem);
    return this;
  }

 /**
   * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups.
   * minimum: 0
   * @return monthlyFrequencyCap
  **/
  @JsonProperty("monthly_frequency_cap")
  public Integer getMonthlyFrequencyCap() {
    return monthlyFrequencyCap;
  }

  public void setMonthlyFrequencyCap(Integer monthlyFrequencyCap) {
    this.monthlyFrequencyCap = monthlyFrequencyCap;
  }

  public AdGroupDeliveryEstimates monthlyFrequencyCap(Integer monthlyFrequencyCap) {
    this.monthlyFrequencyCap = monthlyFrequencyCap;
    return this;
  }

 /**
   * Get optimizationGoalMetadata
   * @return optimizationGoalMetadata
  **/
  @JsonProperty("optimization_goal_metadata")
  public OptimizationGoalMetadata getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }

  public void setOptimizationGoalMetadata(OptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }

  public AdGroupDeliveryEstimates optimizationGoalMetadata(OptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
    return this;
  }

 /**
   * Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise.
   * @return optimizationType
  **/
  @JsonProperty("optimization_type")
  public OptimizationType getOptimizationType() {
    return optimizationType;
  }

  public void setOptimizationType(OptimizationType optimizationType) {
    this.optimizationType = optimizationType;
  }

  public AdGroupDeliveryEstimates optimizationType(OptimizationType optimizationType) {
    this.optimizationType = optimizationType;
    return this;
  }

 /**
   * Get placementGroup
   * @return placementGroup
  **/
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  public AdGroupDeliveryEstimates placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

 /**
   * [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns.
   * @return productGroupIds
  **/
  @JsonProperty("product_group_ids")
  public List<String> getProductGroupIds() {
    return productGroupIds;
  }

  public void setProductGroupIds(List<String> productGroupIds) {
    this.productGroupIds = productGroupIds;
  }

  public AdGroupDeliveryEstimates productGroupIds(List<String> productGroupIds) {
    this.productGroupIds = productGroupIds;
    return this;
  }

  public AdGroupDeliveryEstimates addProductGroupIdsItem(String productGroupIdsItem) {
    this.productGroupIds.add(productGroupIdsItem);
    return this;
  }

 /**
   * Get targetingSpec
   * @return targetingSpec
  **/
  @JsonProperty("targeting_spec")
  public TargetingSpecOptimal getTargetingSpec() {
    return targetingSpec;
  }

  public void setTargetingSpec(TargetingSpecOptimal targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

  public AdGroupDeliveryEstimates targetingSpec(TargetingSpecOptimal targetingSpec) {
    this.targetingSpec = targetingSpec;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupDeliveryEstimates adGroupDeliveryEstimates = (AdGroupDeliveryEstimates) o;
    return Objects.equals(this.autoTargetingEnabled, adGroupDeliveryEstimates.autoTargetingEnabled) &&
        Objects.equals(this.creativeTypes, adGroupDeliveryEstimates.creativeTypes) &&
        Objects.equals(this.keywords, adGroupDeliveryEstimates.keywords) &&
        Objects.equals(this.monthlyFrequencyCap, adGroupDeliveryEstimates.monthlyFrequencyCap) &&
        Objects.equals(this.optimizationGoalMetadata, adGroupDeliveryEstimates.optimizationGoalMetadata) &&
        Objects.equals(this.optimizationType, adGroupDeliveryEstimates.optimizationType) &&
        Objects.equals(this.placementGroup, adGroupDeliveryEstimates.placementGroup) &&
        Objects.equals(this.productGroupIds, adGroupDeliveryEstimates.productGroupIds) &&
        Objects.equals(this.targetingSpec, adGroupDeliveryEstimates.targetingSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoTargetingEnabled, creativeTypes, keywords, monthlyFrequencyCap, optimizationGoalMetadata, optimizationType, placementGroup, productGroupIds, targetingSpec);
  }

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


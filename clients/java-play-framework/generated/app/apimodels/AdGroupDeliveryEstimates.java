package apimodels;

import apimodels.AdGroupAudienceSizingCreativeTypes;
import apimodels.AdGroupDeliveryEstimatesKeywordsItems;
import apimodels.OptimizationGoalMetadata;
import apimodels.OptimizationType;
import apimodels.PlacementGroupType;
import apimodels.TargetingSpecOptimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Ad group configuration for delivery estimates.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdGroupDeliveryEstimates   {
  @JsonProperty("auto_targeting_enabled")
  
  private Boolean autoTargetingEnabled;

  @JsonProperty("creative_types")
  @Valid

  private List<AdGroupAudienceSizingCreativeTypes> creativeTypes = null;

  @JsonProperty("keywords")
  @Valid

  private List<@Valid AdGroupDeliveryEstimatesKeywordsItems> keywords = null;

  @JsonProperty("monthly_frequency_cap")
  @Min(0)

  private Integer monthlyFrequencyCap;

  @JsonProperty("optimization_goal_metadata")
  @Valid

  private OptimizationGoalMetadata optimizationGoalMetadata;

  @JsonProperty("optimization_type")
  @Valid

  private OptimizationType optimizationType;

  @JsonProperty("placement_group")
  @Valid

  private PlacementGroupType placementGroup = PlacementGroupType.ALL;

  @JsonProperty("product_group_ids")
  
  private List<@Pattern(regexp = "^\\d+$")String> productGroupIds = null;

  @JsonProperty("targeting_spec")
  @Valid

  private TargetingSpecOptimal targetingSpec;

  public AdGroupDeliveryEstimates autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

   /**
   * Get autoTargetingEnabled
   * @return autoTargetingEnabled
  **/
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  public AdGroupDeliveryEstimates creativeTypes(List<AdGroupAudienceSizingCreativeTypes> creativeTypes) {
    this.creativeTypes = creativeTypes;
    return this;
  }

  public AdGroupDeliveryEstimates addCreativeTypesItem(AdGroupAudienceSizingCreativeTypes creativeTypesItem) {
    if (this.creativeTypes == null) {
      this.creativeTypes = new ArrayList<>();
    }
    this.creativeTypes.add(creativeTypesItem);
    return this;
  }

   /**
   * Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
   * @return creativeTypes
  **/
  public List<AdGroupAudienceSizingCreativeTypes> getCreativeTypes() {
    return creativeTypes;
  }

  public void setCreativeTypes(List<AdGroupAudienceSizingCreativeTypes> creativeTypes) {
    this.creativeTypes = creativeTypes;
  }

  public AdGroupDeliveryEstimates keywords(List<@Valid AdGroupDeliveryEstimatesKeywordsItems> keywords) {
    this.keywords = keywords;
    return this;
  }

  public AdGroupDeliveryEstimates addKeywordsItem(AdGroupDeliveryEstimatesKeywordsItems keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
   * @return keywords
  **/
  public List<@Valid AdGroupDeliveryEstimatesKeywordsItems> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<@Valid AdGroupDeliveryEstimatesKeywordsItems> keywords) {
    this.keywords = keywords;
  }

  public AdGroupDeliveryEstimates monthlyFrequencyCap(Integer monthlyFrequencyCap) {
    this.monthlyFrequencyCap = monthlyFrequencyCap;
    return this;
  }

   /**
   * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups.
   * minimum: 0
   * @return monthlyFrequencyCap
  **/
  public Integer getMonthlyFrequencyCap() {
    return monthlyFrequencyCap;
  }

  public void setMonthlyFrequencyCap(Integer monthlyFrequencyCap) {
    this.monthlyFrequencyCap = monthlyFrequencyCap;
  }

  public AdGroupDeliveryEstimates optimizationGoalMetadata(OptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
    return this;
  }

   /**
   * Get optimizationGoalMetadata
   * @return optimizationGoalMetadata
  **/
  public OptimizationGoalMetadata getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }

  public void setOptimizationGoalMetadata(OptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }

  public AdGroupDeliveryEstimates optimizationType(OptimizationType optimizationType) {
    this.optimizationType = optimizationType;
    return this;
  }

   /**
   * Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise.
   * @return optimizationType
  **/
  public OptimizationType getOptimizationType() {
    return optimizationType;
  }

  public void setOptimizationType(OptimizationType optimizationType) {
    this.optimizationType = optimizationType;
  }

  public AdGroupDeliveryEstimates placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

   /**
   * Get placementGroup
   * @return placementGroup
  **/
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  public AdGroupDeliveryEstimates productGroupIds(List<@Pattern(regexp = "^\\d+$")String> productGroupIds) {
    this.productGroupIds = productGroupIds;
    return this;
  }

  public AdGroupDeliveryEstimates addProductGroupIdsItem(String productGroupIdsItem) {
    if (this.productGroupIds == null) {
      this.productGroupIds = new ArrayList<>();
    }
    this.productGroupIds.add(productGroupIdsItem);
    return this;
  }

   /**
   * [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns.
   * @return productGroupIds
  **/
  public List<@Pattern(regexp = "^\\d+$")String> getProductGroupIds() {
    return productGroupIds;
  }

  public void setProductGroupIds(List<@Pattern(regexp = "^\\d+$")String> productGroupIds) {
    this.productGroupIds = productGroupIds;
  }

  public AdGroupDeliveryEstimates targetingSpec(TargetingSpecOptimal targetingSpec) {
    this.targetingSpec = targetingSpec;
    return this;
  }

   /**
   * Get targetingSpec
   * @return targetingSpec
  **/
  public TargetingSpecOptimal getTargetingSpec() {
    return targetingSpec;
  }

  public void setTargetingSpec(TargetingSpecOptimal targetingSpec) {
    this.targetingSpec = targetingSpec;
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
    return Objects.equals(autoTargetingEnabled, adGroupDeliveryEstimates.autoTargetingEnabled) &&
        Objects.equals(creativeTypes, adGroupDeliveryEstimates.creativeTypes) &&
        Objects.equals(keywords, adGroupDeliveryEstimates.keywords) &&
        Objects.equals(monthlyFrequencyCap, adGroupDeliveryEstimates.monthlyFrequencyCap) &&
        Objects.equals(optimizationGoalMetadata, adGroupDeliveryEstimates.optimizationGoalMetadata) &&
        Objects.equals(optimizationType, adGroupDeliveryEstimates.optimizationType) &&
        Objects.equals(placementGroup, adGroupDeliveryEstimates.placementGroup) &&
        Objects.equals(productGroupIds, adGroupDeliveryEstimates.productGroupIds) &&
        Objects.equals(targetingSpec, adGroupDeliveryEstimates.targetingSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoTargetingEnabled, creativeTypes, keywords, monthlyFrequencyCap, optimizationGoalMetadata, optimizationType, placementGroup, productGroupIds, targetingSpec);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


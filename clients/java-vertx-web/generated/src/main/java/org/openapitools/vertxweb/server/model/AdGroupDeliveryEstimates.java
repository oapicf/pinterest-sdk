package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AdGroupAudienceSizingCreativeTypes;
import org.openapitools.vertxweb.server.model.AdGroupDeliveryEstimatesKeywordsItems;
import org.openapitools.vertxweb.server.model.OptimizationGoalMetadata;
import org.openapitools.vertxweb.server.model.OptimizationType;
import org.openapitools.vertxweb.server.model.PlacementGroupType;
import org.openapitools.vertxweb.server.model.TargetingSpecOptimal;

/**
 * Ad group configuration for delivery estimates.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdGroupDeliveryEstimates   {
  
  private Boolean autoTargetingEnabled;
  private List<AdGroupAudienceSizingCreativeTypes> creativeTypes = new ArrayList<>();
  private List<AdGroupDeliveryEstimatesKeywordsItems> keywords;
  private Integer monthlyFrequencyCap;
  private OptimizationGoalMetadata optimizationGoalMetadata;
  private OptimizationType optimizationType;
  private PlacementGroupType placementGroup = PlacementGroupType.ALL;
  private List<String> productGroupIds = new ArrayList<>();
  private TargetingSpecOptimal targetingSpec;

  public AdGroupDeliveryEstimates () {

  }

  public AdGroupDeliveryEstimates (Boolean autoTargetingEnabled, List<AdGroupAudienceSizingCreativeTypes> creativeTypes, List<AdGroupDeliveryEstimatesKeywordsItems> keywords, Integer monthlyFrequencyCap, OptimizationGoalMetadata optimizationGoalMetadata, OptimizationType optimizationType, PlacementGroupType placementGroup, List<String> productGroupIds, TargetingSpecOptimal targetingSpec) {
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

    
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }
  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

    
  @JsonProperty("creative_types")
  public List<AdGroupAudienceSizingCreativeTypes> getCreativeTypes() {
    return creativeTypes;
  }
  public void setCreativeTypes(List<AdGroupAudienceSizingCreativeTypes> creativeTypes) {
    this.creativeTypes = creativeTypes;
  }

    
  @JsonProperty("keywords")
  public List<AdGroupDeliveryEstimatesKeywordsItems> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<AdGroupDeliveryEstimatesKeywordsItems> keywords) {
    this.keywords = keywords;
  }

    
  @JsonProperty("monthly_frequency_cap")
  public Integer getMonthlyFrequencyCap() {
    return monthlyFrequencyCap;
  }
  public void setMonthlyFrequencyCap(Integer monthlyFrequencyCap) {
    this.monthlyFrequencyCap = monthlyFrequencyCap;
  }

    
  @JsonProperty("optimization_goal_metadata")
  public OptimizationGoalMetadata getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }
  public void setOptimizationGoalMetadata(OptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }

    
  @JsonProperty("optimization_type")
  public OptimizationType getOptimizationType() {
    return optimizationType;
  }
  public void setOptimizationType(OptimizationType optimizationType) {
    this.optimizationType = optimizationType;
  }

    
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }
  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

    
  @JsonProperty("product_group_ids")
  public List<String> getProductGroupIds() {
    return productGroupIds;
  }
  public void setProductGroupIds(List<String> productGroupIds) {
    this.productGroupIds = productGroupIds;
  }

    
  @JsonProperty("targeting_spec")
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

package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Ad group configuration for delivery estimates.
 **/
@ApiModel(description = "Ad group configuration for delivery estimates.")
@JsonTypeName("AdGroupDeliveryEstimates")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdGroupDeliveryEstimates   {
  private Boolean autoTargetingEnabled;
  private @Valid List<AdGroupAudienceSizingCreativeTypes> creativeTypes = new ArrayList<>();
  private @Valid List<@Valid AdGroupDeliveryEstimatesKeywordsItems> keywords;
  private Integer monthlyFrequencyCap;
  private OptimizationGoalMetadata optimizationGoalMetadata;
  private OptimizationType optimizationType;
  private PlacementGroupType placementGroup = PlacementGroupType.ALL;
  private @Valid List<@Pattern(regexp = "^\\d+$")String> productGroupIds = new ArrayList<>();
  private TargetingSpecOptimal targetingSpec;

  public AdGroupDeliveryEstimates() {
  }

  /**
   **/
  public AdGroupDeliveryEstimates autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  @JsonProperty("auto_targeting_enabled")
  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  /**
   * Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
   **/
  public AdGroupDeliveryEstimates creativeTypes(List<AdGroupAudienceSizingCreativeTypes> creativeTypes) {
    this.creativeTypes = creativeTypes;
    return this;
  }

  
  @ApiModelProperty(value = "Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.")
  @JsonProperty("creative_types")
  public List<AdGroupAudienceSizingCreativeTypes> getCreativeTypes() {
    return creativeTypes;
  }

  @JsonProperty("creative_types")
  public void setCreativeTypes(List<AdGroupAudienceSizingCreativeTypes> creativeTypes) {
    this.creativeTypes = creativeTypes;
  }

  public AdGroupDeliveryEstimates addCreativeTypesItem(AdGroupAudienceSizingCreativeTypes creativeTypesItem) {
    if (this.creativeTypes == null) {
      this.creativeTypes = new ArrayList<>();
    }

    this.creativeTypes.add(creativeTypesItem);
    return this;
  }

  public AdGroupDeliveryEstimates removeCreativeTypesItem(AdGroupAudienceSizingCreativeTypes creativeTypesItem) {
    if (creativeTypesItem != null && this.creativeTypes != null) {
      this.creativeTypes.remove(creativeTypesItem);
    }

    return this;
  }
  /**
   * Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
   **/
  public AdGroupDeliveryEstimates keywords(List<@Valid AdGroupDeliveryEstimatesKeywordsItems> keywords) {
    this.keywords = keywords;
    return this;
  }

  
  @ApiModelProperty(value = "Array of keyword objects. If the keywords field is missing, all keywords will be targeted.")
  @JsonProperty("keywords")
  @Valid public List<@Valid AdGroupDeliveryEstimatesKeywordsItems> getKeywords() {
    return keywords;
  }

  @JsonProperty("keywords")
  public void setKeywords(List<@Valid AdGroupDeliveryEstimatesKeywordsItems> keywords) {
    this.keywords = keywords;
  }

  public AdGroupDeliveryEstimates addKeywordsItem(AdGroupDeliveryEstimatesKeywordsItems keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }

    this.keywords.add(keywordsItem);
    return this;
  }

  public AdGroupDeliveryEstimates removeKeywordsItem(AdGroupDeliveryEstimatesKeywordsItems keywordsItem) {
    if (keywordsItem != null && this.keywords != null) {
      this.keywords.remove(keywordsItem);
    }

    return this;
  }
  /**
   * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups.
   * minimum: 0
   **/
  public AdGroupDeliveryEstimates monthlyFrequencyCap(Integer monthlyFrequencyCap) {
    this.monthlyFrequencyCap = monthlyFrequencyCap;
    return this;
  }

  
  @ApiModelProperty(value = "Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups.")
  @JsonProperty("monthly_frequency_cap")
   @Min(0)public Integer getMonthlyFrequencyCap() {
    return monthlyFrequencyCap;
  }

  @JsonProperty("monthly_frequency_cap")
  public void setMonthlyFrequencyCap(Integer monthlyFrequencyCap) {
    this.monthlyFrequencyCap = monthlyFrequencyCap;
  }

  /**
   **/
  public AdGroupDeliveryEstimates optimizationGoalMetadata(OptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("optimization_goal_metadata")
  @Valid public OptimizationGoalMetadata getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }

  @JsonProperty("optimization_goal_metadata")
  public void setOptimizationGoalMetadata(OptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }

  /**
   * Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise.
   **/
  public AdGroupDeliveryEstimates optimizationType(OptimizationType optimizationType) {
    this.optimizationType = optimizationType;
    return this;
  }

  
  @ApiModelProperty(value = "Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise.")
  @JsonProperty("optimization_type")
  public OptimizationType getOptimizationType() {
    return optimizationType;
  }

  @JsonProperty("optimization_type")
  public void setOptimizationType(OptimizationType optimizationType) {
    this.optimizationType = optimizationType;
  }

  /**
   **/
  public AdGroupDeliveryEstimates placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  @JsonProperty("placement_group")
  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  /**
   * [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns.
   **/
  public AdGroupDeliveryEstimates productGroupIds(List<@Pattern(regexp = "^\\d+$")String> productGroupIds) {
    this.productGroupIds = productGroupIds;
    return this;
  }

  
  @ApiModelProperty(value = "[Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns.")
  @JsonProperty("product_group_ids")
  public List< @Pattern(regexp="^\\d+$")String> getProductGroupIds() {
    return productGroupIds;
  }

  @JsonProperty("product_group_ids")
  public void setProductGroupIds(List<@Pattern(regexp = "^\\d+$")String> productGroupIds) {
    this.productGroupIds = productGroupIds;
  }

  public AdGroupDeliveryEstimates addProductGroupIdsItem(String productGroupIdsItem) {
    if (this.productGroupIds == null) {
      this.productGroupIds = new ArrayList<>();
    }

    this.productGroupIds.add(productGroupIdsItem);
    return this;
  }

  public AdGroupDeliveryEstimates removeProductGroupIdsItem(String productGroupIdsItem) {
    if (productGroupIdsItem != null && this.productGroupIds != null) {
      this.productGroupIds.remove(productGroupIdsItem);
    }

    return this;
  }
  /**
   **/
  public AdGroupDeliveryEstimates targetingSpec(TargetingSpecOptimal targetingSpec) {
    this.targetingSpec = targetingSpec;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("targeting_spec")
  @Valid public TargetingSpecOptimal getTargetingSpec() {
    return targetingSpec;
  }

  @JsonProperty("targeting_spec")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}

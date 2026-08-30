package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Ad group configuration for delivery estimates.
 */

@Schema(name = "AdGroupDeliveryEstimates", description = "Ad group configuration for delivery estimates.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdGroupDeliveryEstimates {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean autoTargetingEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<AdGroupAudienceSizingCreativeTypes> creativeTypes = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<List<@Valid AdGroupDeliveryEstimatesKeywordsItems>> keywords = JsonNullable.<List<@Valid AdGroupDeliveryEstimatesKeywordsItems>>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer monthlyFrequencyCap;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OptimizationGoalMetadata optimizationGoalMetadata;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OptimizationType optimizationType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private PlacementGroupType placementGroup = PlacementGroupType.ALL;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Pattern(regexp = "^\\d+$")String> productGroupIds = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable TargetingSpecOptimal targetingSpec;

  public AdGroupDeliveryEstimates autoTargetingEnabled(@Nullable Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

  /**
   * Get autoTargetingEnabled
   * @return autoTargetingEnabled
   */
  
  @Schema(name = "auto_targeting_enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auto_targeting_enabled")
  public @Nullable Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  @JsonProperty("auto_targeting_enabled")
  public void setAutoTargetingEnabled(@Nullable Boolean autoTargetingEnabled) {
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
   */
  @Valid 
  @Schema(name = "creative_types", description = "Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creative_types")
  public List<AdGroupAudienceSizingCreativeTypes> getCreativeTypes() {
    return creativeTypes;
  }

  @JsonProperty("creative_types")
  public void setCreativeTypes(List<AdGroupAudienceSizingCreativeTypes> creativeTypes) {
    this.creativeTypes = creativeTypes;
  }

  public AdGroupDeliveryEstimates keywords(List<@Valid AdGroupDeliveryEstimatesKeywordsItems> keywords) {
    this.keywords = JsonNullable.of(keywords);
    return this;
  }

  public AdGroupDeliveryEstimates addKeywordsItem(AdGroupDeliveryEstimatesKeywordsItems keywordsItem) {
    if (this.keywords == null || !this.keywords.isPresent()) {
      this.keywords = JsonNullable.of(new ArrayList<>());
    }
    this.keywords.get().add(keywordsItem);
    return this;
  }

  /**
   * Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
   * @return keywords
   */
  @Valid 
  @Schema(name = "keywords", description = "Array of keyword objects. If the keywords field is missing, all keywords will be targeted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("keywords")
  public JsonNullable<List<@Valid AdGroupDeliveryEstimatesKeywordsItems>> getKeywords() {
    return keywords;
  }

  public void setKeywords(JsonNullable<List<@Valid AdGroupDeliveryEstimatesKeywordsItems>> keywords) {
    this.keywords = keywords;
  }

  public AdGroupDeliveryEstimates monthlyFrequencyCap(@Nullable Integer monthlyFrequencyCap) {
    this.monthlyFrequencyCap = monthlyFrequencyCap;
    return this;
  }

  /**
   * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups.
   * minimum: 0
   * @return monthlyFrequencyCap
   */
  @Min(value = 0) 
  @Schema(name = "monthly_frequency_cap", description = "Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("monthly_frequency_cap")
  public @Nullable Integer getMonthlyFrequencyCap() {
    return monthlyFrequencyCap;
  }

  @JsonProperty("monthly_frequency_cap")
  public void setMonthlyFrequencyCap(@Nullable Integer monthlyFrequencyCap) {
    this.monthlyFrequencyCap = monthlyFrequencyCap;
  }

  public AdGroupDeliveryEstimates optimizationGoalMetadata(@Nullable OptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
    return this;
  }

  /**
   * Get optimizationGoalMetadata
   * @return optimizationGoalMetadata
   */
  @Valid 
  @Schema(name = "optimization_goal_metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optimization_goal_metadata")
  public @Nullable OptimizationGoalMetadata getOptimizationGoalMetadata() {
    return optimizationGoalMetadata;
  }

  @JsonProperty("optimization_goal_metadata")
  public void setOptimizationGoalMetadata(@Nullable OptimizationGoalMetadata optimizationGoalMetadata) {
    this.optimizationGoalMetadata = optimizationGoalMetadata;
  }

  public AdGroupDeliveryEstimates optimizationType(@Nullable OptimizationType optimizationType) {
    this.optimizationType = optimizationType;
    return this;
  }

  /**
   * Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise.
   * @return optimizationType
   */
  @Valid 
  @Schema(name = "optimization_type", description = "Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optimization_type")
  public @Nullable OptimizationType getOptimizationType() {
    return optimizationType;
  }

  @JsonProperty("optimization_type")
  public void setOptimizationType(@Nullable OptimizationType optimizationType) {
    this.optimizationType = optimizationType;
  }

  public AdGroupDeliveryEstimates placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

  /**
   * Get placementGroup
   * @return placementGroup
   */
  @Valid 
  @Schema(name = "placement_group", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  @JsonProperty("placement_group")
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
   */
  
  @Schema(name = "product_group_ids", description = "[Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_group_ids")
  public List<@Pattern(regexp = "^\\d+$")String> getProductGroupIds() {
    return productGroupIds;
  }

  @JsonProperty("product_group_ids")
  public void setProductGroupIds(List<@Pattern(regexp = "^\\d+$")String> productGroupIds) {
    this.productGroupIds = productGroupIds;
  }

  public AdGroupDeliveryEstimates targetingSpec(@Nullable TargetingSpecOptimal targetingSpec) {
    this.targetingSpec = targetingSpec;
    return this;
  }

  /**
   * Get targetingSpec
   * @return targetingSpec
   */
  @Valid 
  @Schema(name = "targeting_spec", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targeting_spec")
  public @Nullable TargetingSpecOptimal getTargetingSpec() {
    return targetingSpec;
  }

  @JsonProperty("targeting_spec")
  public void setTargetingSpec(@Nullable TargetingSpecOptimal targetingSpec) {
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
        equalsNullable(this.keywords, adGroupDeliveryEstimates.keywords) &&
        Objects.equals(this.monthlyFrequencyCap, adGroupDeliveryEstimates.monthlyFrequencyCap) &&
        Objects.equals(this.optimizationGoalMetadata, adGroupDeliveryEstimates.optimizationGoalMetadata) &&
        Objects.equals(this.optimizationType, adGroupDeliveryEstimates.optimizationType) &&
        Objects.equals(this.placementGroup, adGroupDeliveryEstimates.placementGroup) &&
        Objects.equals(this.productGroupIds, adGroupDeliveryEstimates.productGroupIds) &&
        Objects.equals(this.targetingSpec, adGroupDeliveryEstimates.targetingSpec);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoTargetingEnabled, creativeTypes, hashCodeNullable(keywords), monthlyFrequencyCap, optimizationGoalMetadata, optimizationType, placementGroup, productGroupIds, targetingSpec);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


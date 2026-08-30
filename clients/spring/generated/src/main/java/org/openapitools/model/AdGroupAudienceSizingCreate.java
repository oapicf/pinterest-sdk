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
import org.openapitools.model.AdGroupAudienceSizingKeyword;
import org.openapitools.model.AdgroupPlacementGroupType;
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
 * Resource create operation model.
 */

@Schema(name = "AdGroupAudienceSizingCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdGroupAudienceSizingCreate {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Boolean autoTargetingEnabled = true;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<List<AdGroupAudienceSizingCreativeTypes>> creativeTypes = JsonNullable.<List<AdGroupAudienceSizingCreativeTypes>>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<List<@Valid AdGroupAudienceSizingKeyword>> keywords = JsonNullable.<List<@Valid AdGroupAudienceSizingKeyword>>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable AdgroupPlacementGroupType placementGroup;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<List<@Pattern(regexp = "^\\d+$")String>> productGroupIds = JsonNullable.<List<@Pattern(regexp = "^\\d+$")String>>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable TargetingSpecOptimal targetingSpec;

  public AdGroupAudienceSizingCreate autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

  /**
   * Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).
   * @return autoTargetingEnabled
   */
  
  @Schema(name = "auto_targeting_enabled", description = "Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  @JsonProperty("auto_targeting_enabled")
  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  public AdGroupAudienceSizingCreate creativeTypes(List<AdGroupAudienceSizingCreativeTypes> creativeTypes) {
    this.creativeTypes = JsonNullable.of(creativeTypes);
    return this;
  }

  public AdGroupAudienceSizingCreate addCreativeTypesItem(AdGroupAudienceSizingCreativeTypes creativeTypesItem) {
    if (this.creativeTypes == null || !this.creativeTypes.isPresent()) {
      this.creativeTypes = JsonNullable.of(new ArrayList<>());
    }
    this.creativeTypes.get().add(creativeTypesItem);
    return this;
  }

  /**
   * Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
   * @return creativeTypes
   */
  @Valid 
  @Schema(name = "creative_types", description = "Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creative_types")
  public JsonNullable<List<AdGroupAudienceSizingCreativeTypes>> getCreativeTypes() {
    return creativeTypes;
  }

  public void setCreativeTypes(JsonNullable<List<AdGroupAudienceSizingCreativeTypes>> creativeTypes) {
    this.creativeTypes = creativeTypes;
  }

  public AdGroupAudienceSizingCreate keywords(List<@Valid AdGroupAudienceSizingKeyword> keywords) {
    this.keywords = JsonNullable.of(keywords);
    return this;
  }

  public AdGroupAudienceSizingCreate addKeywordsItem(AdGroupAudienceSizingKeyword keywordsItem) {
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
  public JsonNullable<List<@Valid AdGroupAudienceSizingKeyword>> getKeywords() {
    return keywords;
  }

  public void setKeywords(JsonNullable<List<@Valid AdGroupAudienceSizingKeyword>> keywords) {
    this.keywords = keywords;
  }

  public AdGroupAudienceSizingCreate placementGroup(@Nullable AdgroupPlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

  /**
   * [Placement group](/docs/redoc/#section/Placement-group).
   * @return placementGroup
   */
  @Valid 
  @Schema(name = "placement_group", description = "[Placement group](/docs/redoc/#section/Placement-group).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placement_group")
  public @Nullable AdgroupPlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  @JsonProperty("placement_group")
  public void setPlacementGroup(@Nullable AdgroupPlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  public AdGroupAudienceSizingCreate productGroupIds(List<@Pattern(regexp = "^\\d+$")String> productGroupIds) {
    this.productGroupIds = JsonNullable.of(productGroupIds);
    return this;
  }

  public AdGroupAudienceSizingCreate addProductGroupIdsItem(String productGroupIdsItem) {
    if (this.productGroupIds == null || !this.productGroupIds.isPresent()) {
      this.productGroupIds = JsonNullable.of(new ArrayList<>());
    }
    this.productGroupIds.get().add(productGroupIdsItem);
    return this;
  }

  /**
   * Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
   * @return productGroupIds
   */
  
  @Schema(name = "product_group_ids", description = "Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_group_ids")
  public JsonNullable<List<@Pattern(regexp = "^\\d+$")String>> getProductGroupIds() {
    return productGroupIds;
  }

  public void setProductGroupIds(JsonNullable<List<@Pattern(regexp = "^\\d+$")String>> productGroupIds) {
    this.productGroupIds = productGroupIds;
  }

  public AdGroupAudienceSizingCreate targetingSpec(@Nullable TargetingSpecOptimal targetingSpec) {
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
    AdGroupAudienceSizingCreate adGroupAudienceSizingCreate = (AdGroupAudienceSizingCreate) o;
    return Objects.equals(this.autoTargetingEnabled, adGroupAudienceSizingCreate.autoTargetingEnabled) &&
        equalsNullable(this.creativeTypes, adGroupAudienceSizingCreate.creativeTypes) &&
        equalsNullable(this.keywords, adGroupAudienceSizingCreate.keywords) &&
        Objects.equals(this.placementGroup, adGroupAudienceSizingCreate.placementGroup) &&
        equalsNullable(this.productGroupIds, adGroupAudienceSizingCreate.productGroupIds) &&
        Objects.equals(this.targetingSpec, adGroupAudienceSizingCreate.targetingSpec);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoTargetingEnabled, hashCodeNullable(creativeTypes), hashCodeNullable(keywords), placementGroup, hashCodeNullable(productGroupIds), targetingSpec);
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
    sb.append("class AdGroupAudienceSizingCreate {\n");
    sb.append("    autoTargetingEnabled: ").append(toIndentedString(autoTargetingEnabled)).append("\n");
    sb.append("    creativeTypes: ").append(toIndentedString(creativeTypes)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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


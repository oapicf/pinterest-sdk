package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdGroupAudienceSizingCreativeTypes;
import org.openapitools.model.AdGroupAudienceSizingKeyword;
import org.openapitools.model.AdgroupPlacementGroupType;
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
 * Resource create operation model.
 **/
@ApiModel(description = "Resource create operation model.")
@JsonTypeName("AdGroupAudienceSizingCreate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdGroupAudienceSizingCreate   {
  private Boolean autoTargetingEnabled = true;
  private @Valid List<AdGroupAudienceSizingCreativeTypes> creativeTypes;
  private @Valid List<@Valid AdGroupAudienceSizingKeyword> keywords;
  private AdgroupPlacementGroupType placementGroup;
  private @Valid List<@Pattern(regexp = "^\\d+$")String> productGroupIds;
  private TargetingSpecOptimal targetingSpec;

  public AdGroupAudienceSizingCreate() {
  }

  /**
   * Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).
   **/
  public AdGroupAudienceSizingCreate autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).")
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
  public AdGroupAudienceSizingCreate creativeTypes(List<AdGroupAudienceSizingCreativeTypes> creativeTypes) {
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

  public AdGroupAudienceSizingCreate addCreativeTypesItem(AdGroupAudienceSizingCreativeTypes creativeTypesItem) {
    if (this.creativeTypes == null) {
      this.creativeTypes = new ArrayList<>();
    }

    this.creativeTypes.add(creativeTypesItem);
    return this;
  }

  public AdGroupAudienceSizingCreate removeCreativeTypesItem(AdGroupAudienceSizingCreativeTypes creativeTypesItem) {
    if (creativeTypesItem != null && this.creativeTypes != null) {
      this.creativeTypes.remove(creativeTypesItem);
    }

    return this;
  }
  /**
   * Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
   **/
  public AdGroupAudienceSizingCreate keywords(List<@Valid AdGroupAudienceSizingKeyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  
  @ApiModelProperty(value = "Array of keyword objects. If the keywords field is missing, all keywords will be targeted.")
  @JsonProperty("keywords")
  @Valid public List<@Valid AdGroupAudienceSizingKeyword> getKeywords() {
    return keywords;
  }

  @JsonProperty("keywords")
  public void setKeywords(List<@Valid AdGroupAudienceSizingKeyword> keywords) {
    this.keywords = keywords;
  }

  public AdGroupAudienceSizingCreate addKeywordsItem(AdGroupAudienceSizingKeyword keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }

    this.keywords.add(keywordsItem);
    return this;
  }

  public AdGroupAudienceSizingCreate removeKeywordsItem(AdGroupAudienceSizingKeyword keywordsItem) {
    if (keywordsItem != null && this.keywords != null) {
      this.keywords.remove(keywordsItem);
    }

    return this;
  }
  /**
   * [Placement group](/docs/redoc/#section/Placement-group).
   **/
  public AdGroupAudienceSizingCreate placementGroup(AdgroupPlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

  
  @ApiModelProperty(value = "[Placement group](/docs/redoc/#section/Placement-group).")
  @JsonProperty("placement_group")
  public AdgroupPlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  @JsonProperty("placement_group")
  public void setPlacementGroup(AdgroupPlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  /**
   * Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
   **/
  public AdGroupAudienceSizingCreate productGroupIds(List<@Pattern(regexp = "^\\d+$")String> productGroupIds) {
    this.productGroupIds = productGroupIds;
    return this;
  }

  
  @ApiModelProperty(value = "Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.")
  @JsonProperty("product_group_ids")
  public List< @Pattern(regexp="^\\d+$")String> getProductGroupIds() {
    return productGroupIds;
  }

  @JsonProperty("product_group_ids")
  public void setProductGroupIds(List<@Pattern(regexp = "^\\d+$")String> productGroupIds) {
    this.productGroupIds = productGroupIds;
  }

  public AdGroupAudienceSizingCreate addProductGroupIdsItem(String productGroupIdsItem) {
    if (this.productGroupIds == null) {
      this.productGroupIds = new ArrayList<>();
    }

    this.productGroupIds.add(productGroupIdsItem);
    return this;
  }

  public AdGroupAudienceSizingCreate removeProductGroupIdsItem(String productGroupIdsItem) {
    if (productGroupIdsItem != null && this.productGroupIds != null) {
      this.productGroupIds.remove(productGroupIdsItem);
    }

    return this;
  }
  /**
   **/
  public AdGroupAudienceSizingCreate targetingSpec(TargetingSpecOptimal targetingSpec) {
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
    AdGroupAudienceSizingCreate adGroupAudienceSizingCreate = (AdGroupAudienceSizingCreate) o;
    return Objects.equals(this.autoTargetingEnabled, adGroupAudienceSizingCreate.autoTargetingEnabled) &&
        Objects.equals(this.creativeTypes, adGroupAudienceSizingCreate.creativeTypes) &&
        Objects.equals(this.keywords, adGroupAudienceSizingCreate.keywords) &&
        Objects.equals(this.placementGroup, adGroupAudienceSizingCreate.placementGroup) &&
        Objects.equals(this.productGroupIds, adGroupAudienceSizingCreate.productGroupIds) &&
        Objects.equals(this.targetingSpec, adGroupAudienceSizingCreate.targetingSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoTargetingEnabled, creativeTypes, keywords, placementGroup, productGroupIds, targetingSpec);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}

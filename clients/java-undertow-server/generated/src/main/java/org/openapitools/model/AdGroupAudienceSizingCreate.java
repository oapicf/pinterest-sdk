/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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



/**
 * Resource create operation model.
 */

@ApiModel(description = "Resource create operation model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdGroupAudienceSizingCreate   {
  
  private Boolean autoTargetingEnabled = true;
  private List<AdGroupAudienceSizingCreativeTypes> creativeTypes;
  private List<AdGroupAudienceSizingKeyword> keywords;
  private AdgroupPlacementGroupType placementGroup;
  private List<String> productGroupIds;
  private TargetingSpecOptimal targetingSpec;

  /**
   * Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).
   */
  public AdGroupAudienceSizingCreate autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).")
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }
  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  /**
   * Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
   */
  public AdGroupAudienceSizingCreate creativeTypes(List<AdGroupAudienceSizingCreativeTypes> creativeTypes) {
    this.creativeTypes = creativeTypes;
    return this;
  }

  
  @ApiModelProperty(value = "Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.")
  @JsonProperty("creative_types")
  public List<AdGroupAudienceSizingCreativeTypes> getCreativeTypes() {
    return creativeTypes;
  }
  public void setCreativeTypes(List<AdGroupAudienceSizingCreativeTypes> creativeTypes) {
    this.creativeTypes = creativeTypes;
  }

  /**
   * Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
   */
  public AdGroupAudienceSizingCreate keywords(List<AdGroupAudienceSizingKeyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  
  @ApiModelProperty(value = "Array of keyword objects. If the keywords field is missing, all keywords will be targeted.")
  @JsonProperty("keywords")
  public List<AdGroupAudienceSizingKeyword> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<AdGroupAudienceSizingKeyword> keywords) {
    this.keywords = keywords;
  }

  /**
   * [Placement group](/docs/redoc/#section/Placement-group).
   */
  public AdGroupAudienceSizingCreate placementGroup(AdgroupPlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

  
  @ApiModelProperty(value = "[Placement group](/docs/redoc/#section/Placement-group).")
  @JsonProperty("placement_group")
  public AdgroupPlacementGroupType getPlacementGroup() {
    return placementGroup;
  }
  public void setPlacementGroup(AdgroupPlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  /**
   * Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
   */
  public AdGroupAudienceSizingCreate productGroupIds(List<String> productGroupIds) {
    this.productGroupIds = productGroupIds;
    return this;
  }

  
  @ApiModelProperty(value = "Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.")
  @JsonProperty("product_group_ids")
  public List<String> getProductGroupIds() {
    return productGroupIds;
  }
  public void setProductGroupIds(List<String> productGroupIds) {
    this.productGroupIds = productGroupIds;
  }

  /**
   */
  public AdGroupAudienceSizingCreate targetingSpec(TargetingSpecOptimal targetingSpec) {
    this.targetingSpec = targetingSpec;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    AdGroupAudienceSizingCreate adGroupAudienceSizingCreate = (AdGroupAudienceSizingCreate) o;
    return Objects.equals(autoTargetingEnabled, adGroupAudienceSizingCreate.autoTargetingEnabled) &&
        Objects.equals(creativeTypes, adGroupAudienceSizingCreate.creativeTypes) &&
        Objects.equals(keywords, adGroupAudienceSizingCreate.keywords) &&
        Objects.equals(placementGroup, adGroupAudienceSizingCreate.placementGroup) &&
        Objects.equals(productGroupIds, adGroupAudienceSizingCreate.productGroupIds) &&
        Objects.equals(targetingSpec, adGroupAudienceSizingCreate.targetingSpec);
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


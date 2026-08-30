package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdGroupAudienceSizingCreativeTypes;
import org.openapitools.model.AdGroupAudienceSizingKeyword;
import org.openapitools.model.AdgroupPlacementGroupType;
import org.openapitools.model.TargetingSpecOptimal;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Resource create operation model.
 */
public class AdGroupAudienceSizingCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).
   */
  @JsonProperty("auto_targeting_enabled")
  private Boolean autoTargetingEnabled = true;

  /**
   * Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
   */
  @JsonProperty("creative_types")
  private List<AdGroupAudienceSizingCreativeTypes> creativeTypes;

  /**
   * Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
   */
  @JsonProperty("keywords")
  private List<AdGroupAudienceSizingKeyword> keywords;

  /**
   * [Placement group](/docs/redoc/#section/Placement-group).
   */
  @JsonProperty("placement_group")
  private AdgroupPlacementGroupType placementGroup;

  /**
   * Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
   */
  @JsonProperty("product_group_ids")
  private List<String> productGroupIds;

  @JsonProperty("targeting_spec")
  private TargetingSpecOptimal targetingSpec;

  /**
   * Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).
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
  public List<AdGroupAudienceSizingKeyword> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<AdGroupAudienceSizingKeyword> keywords) {
    this.keywords = keywords;
  }

  /**
   * [Placement group](/docs/redoc/#section/Placement-group).
   * @return placementGroup
   */
  public AdgroupPlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  public void setPlacementGroup(AdgroupPlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  /**
   * Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
   * @return productGroupIds
   */
  public List<String> getProductGroupIds() {
    return productGroupIds;
  }

  public void setProductGroupIds(List<String> productGroupIds) {
    this.productGroupIds = productGroupIds;
  }

  /**
   * 
   * @return targetingSpec
   */
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

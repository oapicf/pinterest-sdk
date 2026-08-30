package apimodels;

import apimodels.AdGroupAudienceSizingCreativeTypes;
import apimodels.AdGroupAudienceSizingKeyword;
import apimodels.AdgroupPlacementGroupType;
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
 * Resource create operation model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdGroupAudienceSizingCreate   {
  @JsonProperty("auto_targeting_enabled")
  
  private Boolean autoTargetingEnabled = true;

  @JsonProperty("creative_types")
  @Valid

  private List<AdGroupAudienceSizingCreativeTypes> creativeTypes = null;

  @JsonProperty("keywords")
  @Valid

  private List<@Valid AdGroupAudienceSizingKeyword> keywords = null;

  @JsonProperty("placement_group")
  @Valid

  private AdgroupPlacementGroupType placementGroup;

  @JsonProperty("product_group_ids")
  
  private List<@Pattern(regexp = "^\\d+$")String> productGroupIds = null;

  @JsonProperty("targeting_spec")
  @Valid

  private TargetingSpecOptimal targetingSpec;

  public AdGroupAudienceSizingCreate autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

   /**
   * Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).
   * @return autoTargetingEnabled
  **/
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  public AdGroupAudienceSizingCreate creativeTypes(List<AdGroupAudienceSizingCreativeTypes> creativeTypes) {
    this.creativeTypes = creativeTypes;
    return this;
  }

  public AdGroupAudienceSizingCreate addCreativeTypesItem(AdGroupAudienceSizingCreativeTypes creativeTypesItem) {
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

  public AdGroupAudienceSizingCreate keywords(List<@Valid AdGroupAudienceSizingKeyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  public AdGroupAudienceSizingCreate addKeywordsItem(AdGroupAudienceSizingKeyword keywordsItem) {
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
  public List<@Valid AdGroupAudienceSizingKeyword> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<@Valid AdGroupAudienceSizingKeyword> keywords) {
    this.keywords = keywords;
  }

  public AdGroupAudienceSizingCreate placementGroup(AdgroupPlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

   /**
   * [Placement group](/docs/redoc/#section/Placement-group).
   * @return placementGroup
  **/
  public AdgroupPlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  public void setPlacementGroup(AdgroupPlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  public AdGroupAudienceSizingCreate productGroupIds(List<@Pattern(regexp = "^\\d+$")String> productGroupIds) {
    this.productGroupIds = productGroupIds;
    return this;
  }

  public AdGroupAudienceSizingCreate addProductGroupIdsItem(String productGroupIdsItem) {
    if (this.productGroupIds == null) {
      this.productGroupIds = new ArrayList<>();
    }
    this.productGroupIds.add(productGroupIdsItem);
    return this;
  }

   /**
   * Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
   * @return productGroupIds
  **/
  public List<@Pattern(regexp = "^\\d+$")String> getProductGroupIds() {
    return productGroupIds;
  }

  public void setProductGroupIds(List<@Pattern(regexp = "^\\d+$")String> productGroupIds) {
    this.productGroupIds = productGroupIds;
  }

  public AdGroupAudienceSizingCreate targetingSpec(TargetingSpecOptimal targetingSpec) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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


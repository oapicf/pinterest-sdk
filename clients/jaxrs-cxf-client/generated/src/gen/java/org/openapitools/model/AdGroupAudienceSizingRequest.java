package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdGroupAudienceSizingRequestKeywordsInner;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TargetingSpec;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdGroupAudienceSizingRequest  {
  
  @ApiModelProperty(example = "true", value = "Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.")
 /**
   * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  **/
  private Boolean autoTargetingEnabled = true;

  @ApiModelProperty(value = "<a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.")
 /**
   * <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
  **/
  private PlacementGroupType placementGroup = "ALL";

public enum CreativeTypesEnum {

REGULAR(String.valueOf("REGULAR")), VIDEO(String.valueOf("VIDEO")), SHOPPING(String.valueOf("SHOPPING")), CAROUSEL(String.valueOf("CAROUSEL")), MAX_VIDEO(String.valueOf("MAX_VIDEO")), SHOP_THE_PIN(String.valueOf("SHOP_THE_PIN")), COLLECTION(String.valueOf("COLLECTION")), IDEA(String.valueOf("IDEA"));


    private String value;

    CreativeTypesEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CreativeTypesEnum fromValue(String value) {
        for (CreativeTypesEnum b : CreativeTypesEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.")
 /**
   * Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
  **/
  private List<CreativeTypesEnum> creativeTypes;

  @ApiModelProperty(value = "")
  private TargetingSpec targetingSpec;

  @ApiModelProperty(value = "Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.")
 /**
   * Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
  **/
  private List<String> productGroupIds;

  @ApiModelProperty(value = "Array of keyword objects. If the keywords field is missing, all keywords will be targeted.")
 /**
   * Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
  **/
  private List<AdGroupAudienceSizingRequestKeywordsInner> keywords;
 /**
   * Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.
   * @return autoTargetingEnabled
  **/
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  public AdGroupAudienceSizingRequest autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

 /**
   * &lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.
   * @return placementGroup
  **/
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  public AdGroupAudienceSizingRequest placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

 /**
   * Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
   * @return creativeTypes
  **/
  @JsonProperty("creative_types")
  public List<CreativeTypesEnum> getCreativeTypes() {
    return creativeTypes;
  }

  public void setCreativeTypes(List<CreativeTypesEnum> creativeTypes) {
    this.creativeTypes = creativeTypes;
  }

  public AdGroupAudienceSizingRequest creativeTypes(List<CreativeTypesEnum> creativeTypes) {
    this.creativeTypes = creativeTypes;
    return this;
  }

  public AdGroupAudienceSizingRequest addCreativeTypesItem(CreativeTypesEnum creativeTypesItem) {
    this.creativeTypes.add(creativeTypesItem);
    return this;
  }

 /**
   * Get targetingSpec
   * @return targetingSpec
  **/
  @JsonProperty("targeting_spec")
  public TargetingSpec getTargetingSpec() {
    return targetingSpec;
  }

  public void setTargetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

  public AdGroupAudienceSizingRequest targetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
    return this;
  }

 /**
   * Targeted product group IDs. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This can only be combined with shopping/catalog sales campaigns. For more information, &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/shopping-ads#section-14571\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt;. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
   * @return productGroupIds
  **/
  @JsonProperty("product_group_ids")
  public List<String> getProductGroupIds() {
    return productGroupIds;
  }

  public void setProductGroupIds(List<String> productGroupIds) {
    this.productGroupIds = productGroupIds;
  }

  public AdGroupAudienceSizingRequest productGroupIds(List<String> productGroupIds) {
    this.productGroupIds = productGroupIds;
    return this;
  }

  public AdGroupAudienceSizingRequest addProductGroupIdsItem(String productGroupIdsItem) {
    this.productGroupIds.add(productGroupIdsItem);
    return this;
  }

 /**
   * Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
   * @return keywords
  **/
  @JsonProperty("keywords")
  public List<AdGroupAudienceSizingRequestKeywordsInner> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<AdGroupAudienceSizingRequestKeywordsInner> keywords) {
    this.keywords = keywords;
  }

  public AdGroupAudienceSizingRequest keywords(List<AdGroupAudienceSizingRequestKeywordsInner> keywords) {
    this.keywords = keywords;
    return this;
  }

  public AdGroupAudienceSizingRequest addKeywordsItem(AdGroupAudienceSizingRequestKeywordsInner keywordsItem) {
    this.keywords.add(keywordsItem);
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
    AdGroupAudienceSizingRequest adGroupAudienceSizingRequest = (AdGroupAudienceSizingRequest) o;
    return Objects.equals(this.autoTargetingEnabled, adGroupAudienceSizingRequest.autoTargetingEnabled) &&
        Objects.equals(this.placementGroup, adGroupAudienceSizingRequest.placementGroup) &&
        Objects.equals(this.creativeTypes, adGroupAudienceSizingRequest.creativeTypes) &&
        Objects.equals(this.targetingSpec, adGroupAudienceSizingRequest.targetingSpec) &&
        Objects.equals(this.productGroupIds, adGroupAudienceSizingRequest.productGroupIds) &&
        Objects.equals(this.keywords, adGroupAudienceSizingRequest.keywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoTargetingEnabled, placementGroup, creativeTypes, targetingSpec, productGroupIds, keywords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAudienceSizingRequest {\n");
    
    sb.append("    autoTargetingEnabled: ").append(toIndentedString(autoTargetingEnabled)).append("\n");
    sb.append("    placementGroup: ").append(toIndentedString(placementGroup)).append("\n");
    sb.append("    creativeTypes: ").append(toIndentedString(creativeTypes)).append("\n");
    sb.append("    targetingSpec: ").append(toIndentedString(targetingSpec)).append("\n");
    sb.append("    productGroupIds: ").append(toIndentedString(productGroupIds)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


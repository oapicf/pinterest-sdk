package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdGroupAudienceSizingRequestKeywordsInner;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TargetingSpec;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdGroupAudienceSizingRequest  {
  
 /**
  * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  */
  @ApiModelProperty(example = "true", value = "Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.")
  private Boolean autoTargetingEnabled = true;

 /**
  * <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
  */
  @ApiModelProperty(value = "<a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.")
  @Valid
  private PlacementGroupType placementGroup = "ALL";

public enum CreativeTypesEnum {

    @JsonProperty("REGULAR") REGULAR(String.valueOf("REGULAR")),
    @JsonProperty("VIDEO") VIDEO(String.valueOf("VIDEO")),
    @JsonProperty("SHOPPING") SHOPPING(String.valueOf("SHOPPING")),
    @JsonProperty("CAROUSEL") CAROUSEL(String.valueOf("CAROUSEL")),
    @JsonProperty("MAX_VIDEO") MAX_VIDEO(String.valueOf("MAX_VIDEO")),
    @JsonProperty("SHOP_THE_PIN") SHOP_THE_PIN(String.valueOf("SHOP_THE_PIN")),
    @JsonProperty("COLLECTION") COLLECTION(String.valueOf("COLLECTION")),
    @JsonProperty("IDEA") IDEA(String.valueOf("IDEA"));

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

 /**
  * Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
  */
  @ApiModelProperty(value = "Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.")
  private List<CreativeTypesEnum> creativeTypes;

  @ApiModelProperty(value = "")
  @Valid
  private TargetingSpec targetingSpec;

 /**
  * Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
  */
  @ApiModelProperty(value = "Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.")
  private List<@Pattern(regexp = "^\\d+$")String> productGroupIds;

 /**
  * Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
  */
  @ApiModelProperty(value = "Array of keyword objects. If the keywords field is missing, all keywords will be targeted.")
  @Valid
  private List<@Valid AdGroupAudienceSizingRequestKeywordsInner> keywords;
 /**
  * Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.
  * @return autoTargetingEnabled
  */
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  /**
   * Sets the <code>autoTargetingEnabled</code> property.
   */
 public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  /**
   * Sets the <code>autoTargetingEnabled</code> property.
   */
  public AdGroupAudienceSizingRequest autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

 /**
  * &lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.
  * @return placementGroup
  */
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  /**
   * Sets the <code>placementGroup</code> property.
   */
 public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  /**
   * Sets the <code>placementGroup</code> property.
   */
  public AdGroupAudienceSizingRequest placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

 /**
  * Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
  * @return creativeTypes
  */
  @JsonProperty("creative_types")
  public List<CreativeTypesEnum> getCreativeTypes() {
    return creativeTypes;
  }

  /**
   * Sets the <code>creativeTypes</code> property.
   */
 public void setCreativeTypes(List<CreativeTypesEnum> creativeTypes) {
    this.creativeTypes = creativeTypes;
  }

  /**
   * Sets the <code>creativeTypes</code> property.
   */
  public AdGroupAudienceSizingRequest creativeTypes(List<CreativeTypesEnum> creativeTypes) {
    this.creativeTypes = creativeTypes;
    return this;
  }

  /**
   * Adds a new item to the <code>creativeTypes</code> list.
   */
  public AdGroupAudienceSizingRequest addCreativeTypesItem(CreativeTypesEnum creativeTypesItem) {
    this.creativeTypes.add(creativeTypesItem);
    return this;
  }

 /**
  * Get targetingSpec
  * @return targetingSpec
  */
  @JsonProperty("targeting_spec")
  public TargetingSpec getTargetingSpec() {
    return targetingSpec;
  }

  /**
   * Sets the <code>targetingSpec</code> property.
   */
 public void setTargetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

  /**
   * Sets the <code>targetingSpec</code> property.
   */
  public AdGroupAudienceSizingRequest targetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
    return this;
  }

 /**
  * Targeted product group IDs. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This can only be combined with shopping/catalog sales campaigns. For more information, &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/shopping-ads#section-14571\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt;. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
  * @return productGroupIds
  */
  @JsonProperty("product_group_ids")
  public List<@Pattern(regexp = "^\\d+$")String> getProductGroupIds() {
    return productGroupIds;
  }

  /**
   * Sets the <code>productGroupIds</code> property.
   */
 public void setProductGroupIds(List<@Pattern(regexp = "^\\d+$")String> productGroupIds) {
    this.productGroupIds = productGroupIds;
  }

  /**
   * Sets the <code>productGroupIds</code> property.
   */
  public AdGroupAudienceSizingRequest productGroupIds(List<@Pattern(regexp = "^\\d+$")String> productGroupIds) {
    this.productGroupIds = productGroupIds;
    return this;
  }

  /**
   * Adds a new item to the <code>productGroupIds</code> list.
   */
  public AdGroupAudienceSizingRequest addProductGroupIdsItem(String productGroupIdsItem) {
    this.productGroupIds.add(productGroupIdsItem);
    return this;
  }

 /**
  * Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
  * @return keywords
  */
  @JsonProperty("keywords")
  public List<@Valid AdGroupAudienceSizingRequestKeywordsInner> getKeywords() {
    return keywords;
  }

  /**
   * Sets the <code>keywords</code> property.
   */
 public void setKeywords(List<@Valid AdGroupAudienceSizingRequestKeywordsInner> keywords) {
    this.keywords = keywords;
  }

  /**
   * Sets the <code>keywords</code> property.
   */
  public AdGroupAudienceSizingRequest keywords(List<@Valid AdGroupAudienceSizingRequestKeywordsInner> keywords) {
    this.keywords = keywords;
    return this;
  }

  /**
   * Adds a new item to the <code>keywords</code> list.
   */
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


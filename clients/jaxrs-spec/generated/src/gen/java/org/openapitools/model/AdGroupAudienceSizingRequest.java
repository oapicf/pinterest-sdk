package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdGroupAudienceSizingRequestKeywordsInner;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TargetingSpec;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AdGroupAudienceSizingRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdGroupAudienceSizingRequest   {
  private @Valid Boolean autoTargetingEnabled = true;
  private @Valid PlacementGroupType placementGroup = "ALL";
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static CreativeTypesEnum fromString(String s) {
        for (CreativeTypesEnum b : CreativeTypesEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static CreativeTypesEnum fromValue(String value) {
        for (CreativeTypesEnum b : CreativeTypesEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid List<CreativeTypesEnum> creativeTypes;
  private @Valid TargetingSpec targetingSpec;
  private @Valid List<@Pattern(regexp = "^\\d+$")String> productGroupIds;
  private @Valid List<@Valid AdGroupAudienceSizingRequestKeywordsInner> keywords;

  /**
   * Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.
   **/
  public AdGroupAudienceSizingRequest autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.")
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  @JsonProperty("auto_targeting_enabled")
  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  /**
   * &lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.
   **/
  public AdGroupAudienceSizingRequest placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

  
  @ApiModelProperty(value = "<a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.")
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  @JsonProperty("placement_group")
  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  /**
   * Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
   **/
  public AdGroupAudienceSizingRequest creativeTypes(List<CreativeTypesEnum> creativeTypes) {
    this.creativeTypes = creativeTypes;
    return this;
  }

  
  @ApiModelProperty(value = "Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.")
  @JsonProperty("creative_types")
  public List<CreativeTypesEnum> getCreativeTypes() {
    return creativeTypes;
  }

  @JsonProperty("creative_types")
  public void setCreativeTypes(List<CreativeTypesEnum> creativeTypes) {
    this.creativeTypes = creativeTypes;
  }

  public AdGroupAudienceSizingRequest addCreativeTypesItem(CreativeTypesEnum creativeTypesItem) {
    if (this.creativeTypes == null) {
      this.creativeTypes = new ArrayList<>();
    }

    this.creativeTypes.add(creativeTypesItem);
    return this;
  }

  public AdGroupAudienceSizingRequest removeCreativeTypesItem(CreativeTypesEnum creativeTypesItem) {
    if (creativeTypesItem != null && this.creativeTypes != null) {
      this.creativeTypes.remove(creativeTypesItem);
    }

    return this;
  }
  /**
   **/
  public AdGroupAudienceSizingRequest targetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("targeting_spec")
  public TargetingSpec getTargetingSpec() {
    return targetingSpec;
  }

  @JsonProperty("targeting_spec")
  public void setTargetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

  /**
   * Targeted product group IDs. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This can only be combined with shopping/catalog sales campaigns. For more information, &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/shopping-ads#section-14571\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt;. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
   **/
  public AdGroupAudienceSizingRequest productGroupIds(List<@Pattern(regexp = "^\\d+$")String> productGroupIds) {
    this.productGroupIds = productGroupIds;
    return this;
  }

  
  @ApiModelProperty(value = "Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.")
  @JsonProperty("product_group_ids")
  public List< @Pattern(regexp="^\\d+$")String> getProductGroupIds() {
    return productGroupIds;
  }

  @JsonProperty("product_group_ids")
  public void setProductGroupIds(List<@Pattern(regexp = "^\\d+$")String> productGroupIds) {
    this.productGroupIds = productGroupIds;
  }

  public AdGroupAudienceSizingRequest addProductGroupIdsItem(String productGroupIdsItem) {
    if (this.productGroupIds == null) {
      this.productGroupIds = new ArrayList<>();
    }

    this.productGroupIds.add(productGroupIdsItem);
    return this;
  }

  public AdGroupAudienceSizingRequest removeProductGroupIdsItem(String productGroupIdsItem) {
    if (productGroupIdsItem != null && this.productGroupIds != null) {
      this.productGroupIds.remove(productGroupIdsItem);
    }

    return this;
  }
  /**
   * Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
   **/
  public AdGroupAudienceSizingRequest keywords(List<@Valid AdGroupAudienceSizingRequestKeywordsInner> keywords) {
    this.keywords = keywords;
    return this;
  }

  
  @ApiModelProperty(value = "Array of keyword objects. If the keywords field is missing, all keywords will be targeted.")
  @JsonProperty("keywords")
  public List<AdGroupAudienceSizingRequestKeywordsInner> getKeywords() {
    return keywords;
  }

  @JsonProperty("keywords")
  public void setKeywords(List<@Valid AdGroupAudienceSizingRequestKeywordsInner> keywords) {
    this.keywords = keywords;
  }

  public AdGroupAudienceSizingRequest addKeywordsItem(AdGroupAudienceSizingRequestKeywordsInner keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }

    this.keywords.add(keywordsItem);
    return this;
  }

  public AdGroupAudienceSizingRequest removeKeywordsItem(AdGroupAudienceSizingRequestKeywordsInner keywordsItem) {
    if (keywordsItem != null && this.keywords != null) {
      this.keywords.remove(keywordsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}


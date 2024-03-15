package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
import javax.validation.Valid;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdGroupAudienceSizingRequest   {
  
  private Boolean autoTargetingEnabled = true;
  private PlacementGroupType placementGroup = "ALL";

  /**
   * Gets or Sets creativeTypes
   */
  public enum CreativeTypesEnum {
    REGULAR("REGULAR"),

        VIDEO("VIDEO"),

        SHOPPING("SHOPPING"),

        CAROUSEL("CAROUSEL"),

        MAX_VIDEO("MAX_VIDEO"),

        SHOP_THE_PIN("SHOP_THE_PIN"),

        COLLECTION("COLLECTION"),

        IDEA("IDEA");
    private String value;

    CreativeTypesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private List<CreativeTypesEnum> creativeTypes;
  private TargetingSpec targetingSpec;
  private List<@Pattern(regexp = "^\\d+$")String> productGroupIds;
  private List<@Valid AdGroupAudienceSizingRequestKeywordsInner> keywords;

  /**
   * Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.
   **/
  
  @ApiModelProperty(example = "true", value = "Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.")
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }
  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  /**
   * &lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.
   **/
  
  @ApiModelProperty(value = "<a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.")
  @JsonProperty("placement_group")
  @Valid
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }
  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  /**
   * Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
   **/
  
  @ApiModelProperty(value = "Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.")
  @JsonProperty("creative_types")
  public List<CreativeTypesEnum> getCreativeTypes() {
    return creativeTypes;
  }
  public void setCreativeTypes(List<CreativeTypesEnum> creativeTypes) {
    this.creativeTypes = creativeTypes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("targeting_spec")
  @Valid
  public TargetingSpec getTargetingSpec() {
    return targetingSpec;
  }
  public void setTargetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

  /**
   * Targeted product group IDs. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This can only be combined with shopping/catalog sales campaigns. For more information, &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/shopping-ads#section-14571\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt;. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
   **/
  
  @ApiModelProperty(value = "Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.")
  @JsonProperty("product_group_ids")
  public List<@Pattern(regexp = "^\\d+$")String> getProductGroupIds() {
    return productGroupIds;
  }
  public void setProductGroupIds(List<@Pattern(regexp = "^\\d+$")String> productGroupIds) {
    this.productGroupIds = productGroupIds;
  }

  /**
   * Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
   **/
  
  @ApiModelProperty(value = "Array of keyword objects. If the keywords field is missing, all keywords will be targeted.")
  @JsonProperty("keywords")
  @Valid
  public List<@Valid AdGroupAudienceSizingRequestKeywordsInner> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<@Valid AdGroupAudienceSizingRequestKeywordsInner> keywords) {
    this.keywords = keywords;
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


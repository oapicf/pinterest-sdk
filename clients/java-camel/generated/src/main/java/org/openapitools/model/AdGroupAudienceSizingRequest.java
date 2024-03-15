package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdGroupAudienceSizingRequestKeywordsInner;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TargetingSpec;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AdGroupAudienceSizingRequest
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdGroupAudienceSizingRequest {

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
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

  @Valid
  private JsonNullable<List<CreativeTypesEnum>> creativeTypes = JsonNullable.<List<CreativeTypesEnum>>undefined();

  private TargetingSpec targetingSpec;

  @Valid
  private JsonNullable<List<@Pattern(regexp = "^\\d+$")String>> productGroupIds = JsonNullable.<List<@Pattern(regexp = "^\\d+$")String>>undefined();

  @Valid
  private JsonNullable<List<@Valid AdGroupAudienceSizingRequestKeywordsInner>> keywords = JsonNullable.<List<@Valid AdGroupAudienceSizingRequestKeywordsInner>>undefined();

  public AdGroupAudienceSizingRequest autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

  /**
   * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
   * @return autoTargetingEnabled
  */
  
  @Schema(name = "auto_targeting_enabled", example = "true", description = "Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  public AdGroupAudienceSizingRequest placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

  /**
   * <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
   * @return placementGroup
  */
  @Valid 
  @Schema(name = "placement_group", description = "<a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  public AdGroupAudienceSizingRequest creativeTypes(List<CreativeTypesEnum> creativeTypes) {
    this.creativeTypes = JsonNullable.of(creativeTypes);
    return this;
  }

  public AdGroupAudienceSizingRequest addCreativeTypesItem(CreativeTypesEnum creativeTypesItem) {
    if (this.creativeTypes == null || !this.creativeTypes.isPresent()) {
      this.creativeTypes = JsonNullable.of(new ArrayList<>());
    }
    this.creativeTypes.get().add(creativeTypesItem);
    return this;
  }

  /**
   * Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
   * @return creativeTypes
  */
  
  @Schema(name = "creative_types", description = "Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creative_types")
  public JsonNullable<List<CreativeTypesEnum>> getCreativeTypes() {
    return creativeTypes;
  }

  public void setCreativeTypes(JsonNullable<List<CreativeTypesEnum>> creativeTypes) {
    this.creativeTypes = creativeTypes;
  }

  public AdGroupAudienceSizingRequest targetingSpec(TargetingSpec targetingSpec) {
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
  public TargetingSpec getTargetingSpec() {
    return targetingSpec;
  }

  public void setTargetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

  public AdGroupAudienceSizingRequest productGroupIds(List<@Pattern(regexp = "^\\d+$")String> productGroupIds) {
    this.productGroupIds = JsonNullable.of(productGroupIds);
    return this;
  }

  public AdGroupAudienceSizingRequest addProductGroupIdsItem(String productGroupIdsItem) {
    if (this.productGroupIds == null || !this.productGroupIds.isPresent()) {
      this.productGroupIds = JsonNullable.of(new ArrayList<>());
    }
    this.productGroupIds.get().add(productGroupIdsItem);
    return this;
  }

  /**
   * Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
   * @return productGroupIds
  */
  
  @Schema(name = "product_group_ids", description = "Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_group_ids")
  public JsonNullable<List<@Pattern(regexp = "^\\d+$")String>> getProductGroupIds() {
    return productGroupIds;
  }

  public void setProductGroupIds(JsonNullable<List<@Pattern(regexp = "^\\d+$")String>> productGroupIds) {
    this.productGroupIds = productGroupIds;
  }

  public AdGroupAudienceSizingRequest keywords(List<@Valid AdGroupAudienceSizingRequestKeywordsInner> keywords) {
    this.keywords = JsonNullable.of(keywords);
    return this;
  }

  public AdGroupAudienceSizingRequest addKeywordsItem(AdGroupAudienceSizingRequestKeywordsInner keywordsItem) {
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
  public JsonNullable<List<@Valid AdGroupAudienceSizingRequestKeywordsInner>> getKeywords() {
    return keywords;
  }

  public void setKeywords(JsonNullable<List<@Valid AdGroupAudienceSizingRequestKeywordsInner>> keywords) {
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
        equalsNullable(this.creativeTypes, adGroupAudienceSizingRequest.creativeTypes) &&
        Objects.equals(this.targetingSpec, adGroupAudienceSizingRequest.targetingSpec) &&
        equalsNullable(this.productGroupIds, adGroupAudienceSizingRequest.productGroupIds) &&
        equalsNullable(this.keywords, adGroupAudienceSizingRequest.keywords);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoTargetingEnabled, placementGroup, hashCodeNullable(creativeTypes), targetingSpec, hashCodeNullable(productGroupIds), hashCodeNullable(keywords));
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


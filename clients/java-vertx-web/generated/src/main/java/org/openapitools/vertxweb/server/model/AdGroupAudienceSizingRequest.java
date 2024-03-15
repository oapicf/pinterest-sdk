package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AdGroupAudienceSizingRequestKeywordsInner;
import org.openapitools.vertxweb.server.model.PlacementGroupType;
import org.openapitools.vertxweb.server.model.TargetingSpec;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdGroupAudienceSizingRequest   {
  
  private Boolean autoTargetingEnabled = true;
  private PlacementGroupType placementGroup = "ALL";


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
      return value;
    }
  }

  private List<CreativeTypesEnum> creativeTypes;
  private TargetingSpec targetingSpec;
  private List<String> productGroupIds;
  private List<AdGroupAudienceSizingRequestKeywordsInner> keywords;

  public AdGroupAudienceSizingRequest () {

  }

  public AdGroupAudienceSizingRequest (Boolean autoTargetingEnabled, PlacementGroupType placementGroup, List<CreativeTypesEnum> creativeTypes, TargetingSpec targetingSpec, List<String> productGroupIds, List<AdGroupAudienceSizingRequestKeywordsInner> keywords) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    this.placementGroup = placementGroup;
    this.creativeTypes = creativeTypes;
    this.targetingSpec = targetingSpec;
    this.productGroupIds = productGroupIds;
    this.keywords = keywords;
  }

    
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }
  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

    
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }
  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

    
  @JsonProperty("creative_types")
  public List<CreativeTypesEnum> getCreativeTypes() {
    return creativeTypes;
  }
  public void setCreativeTypes(List<CreativeTypesEnum> creativeTypes) {
    this.creativeTypes = creativeTypes;
  }

    
  @JsonProperty("targeting_spec")
  public TargetingSpec getTargetingSpec() {
    return targetingSpec;
  }
  public void setTargetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

    
  @JsonProperty("product_group_ids")
  public List<String> getProductGroupIds() {
    return productGroupIds;
  }
  public void setProductGroupIds(List<String> productGroupIds) {
    this.productGroupIds = productGroupIds;
  }

    
  @JsonProperty("keywords")
  public List<AdGroupAudienceSizingRequestKeywordsInner> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<AdGroupAudienceSizingRequestKeywordsInner> keywords) {
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
    return Objects.equals(autoTargetingEnabled, adGroupAudienceSizingRequest.autoTargetingEnabled) &&
        Objects.equals(placementGroup, adGroupAudienceSizingRequest.placementGroup) &&
        Objects.equals(creativeTypes, adGroupAudienceSizingRequest.creativeTypes) &&
        Objects.equals(targetingSpec, adGroupAudienceSizingRequest.targetingSpec) &&
        Objects.equals(productGroupIds, adGroupAudienceSizingRequest.productGroupIds) &&
        Objects.equals(keywords, adGroupAudienceSizingRequest.keywords);
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

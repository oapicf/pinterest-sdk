package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AdGroupAudienceSizingCreativeTypes;
import org.openapitools.vertxweb.server.model.AdGroupAudienceSizingKeyword;
import org.openapitools.vertxweb.server.model.AdgroupPlacementGroupType;
import org.openapitools.vertxweb.server.model.TargetingSpecOptimal;

/**
 * Resource create operation model.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdGroupAudienceSizingCreate   {
  
  private Boolean autoTargetingEnabled = true;
  private List<AdGroupAudienceSizingCreativeTypes> creativeTypes;
  private List<AdGroupAudienceSizingKeyword> keywords;
  private AdgroupPlacementGroupType placementGroup;
  private List<String> productGroupIds;
  private TargetingSpecOptimal targetingSpec;

  public AdGroupAudienceSizingCreate () {

  }

  public AdGroupAudienceSizingCreate (Boolean autoTargetingEnabled, List<AdGroupAudienceSizingCreativeTypes> creativeTypes, List<AdGroupAudienceSizingKeyword> keywords, AdgroupPlacementGroupType placementGroup, List<String> productGroupIds, TargetingSpecOptimal targetingSpec) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    this.creativeTypes = creativeTypes;
    this.keywords = keywords;
    this.placementGroup = placementGroup;
    this.productGroupIds = productGroupIds;
    this.targetingSpec = targetingSpec;
  }

    
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }
  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

    
  @JsonProperty("creative_types")
  public List<AdGroupAudienceSizingCreativeTypes> getCreativeTypes() {
    return creativeTypes;
  }
  public void setCreativeTypes(List<AdGroupAudienceSizingCreativeTypes> creativeTypes) {
    this.creativeTypes = creativeTypes;
  }

    
  @JsonProperty("keywords")
  public List<AdGroupAudienceSizingKeyword> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<AdGroupAudienceSizingKeyword> keywords) {
    this.keywords = keywords;
  }

    
  @JsonProperty("placement_group")
  public AdgroupPlacementGroupType getPlacementGroup() {
    return placementGroup;
  }
  public void setPlacementGroup(AdgroupPlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

    
  @JsonProperty("product_group_ids")
  public List<String> getProductGroupIds() {
    return productGroupIds;
  }
  public void setProductGroupIds(List<String> productGroupIds) {
    this.productGroupIds = productGroupIds;
  }

    
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

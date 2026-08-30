package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.AdGroupAudienceSizingCreativeTypes;
import org.openapitools.server.model.AdGroupAudienceSizingKeyword;
import org.openapitools.server.model.AdgroupPlacementGroupType;
import org.openapitools.server.model.TargetingSpecOptimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class AdGroupAudienceSizingCreate   {

    private Boolean autoTargetingEnabled = true;
    private List<AdGroupAudienceSizingCreativeTypes> creativeTypes;
    private List<@Valid AdGroupAudienceSizingKeyword> keywords;
    private AdgroupPlacementGroupType placementGroup;
    private List<@Pattern(regexp = "^\\d+$")String> productGroupIds;
    private TargetingSpecOptimal targetingSpec;

    /**
     * Default constructor.
     */
    public AdGroupAudienceSizingCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create AdGroupAudienceSizingCreate.
     *
     * @param autoTargetingEnabled Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).
     * @param creativeTypes Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
     * @param keywords Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
     * @param placementGroup [Placement group](/docs/redoc/#section/Placement-group).
     * @param productGroupIds Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
     * @param targetingSpec targetingSpec
     */
    public AdGroupAudienceSizingCreate(
        Boolean autoTargetingEnabled, 
        List<AdGroupAudienceSizingCreativeTypes> creativeTypes, 
        List<@Valid AdGroupAudienceSizingKeyword> keywords, 
        AdgroupPlacementGroupType placementGroup, 
        List<@Pattern(regexp = "^\\d+$")String> productGroupIds, 
        TargetingSpecOptimal targetingSpec
    ) {
        this.autoTargetingEnabled = autoTargetingEnabled;
        this.creativeTypes = creativeTypes;
        this.keywords = keywords;
        this.placementGroup = placementGroup;
        this.productGroupIds = productGroupIds;
        this.targetingSpec = targetingSpec;
    }



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
    public List<@Valid AdGroupAudienceSizingKeyword> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<@Valid AdGroupAudienceSizingKeyword> keywords) {
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
    public List<@Pattern(regexp = "^\\d+$")String> getProductGroupIds() {
        return productGroupIds;
    }

    public void setProductGroupIds(List<@Pattern(regexp = "^\\d+$")String> productGroupIds) {
        this.productGroupIds = productGroupIds;
    }

    /**
     * Get targetingSpec
     * @return targetingSpec
     */
    public TargetingSpecOptimal getTargetingSpec() {
        return targetingSpec;
    }

    public void setTargetingSpec(TargetingSpecOptimal targetingSpec) {
        this.targetingSpec = targetingSpec;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}


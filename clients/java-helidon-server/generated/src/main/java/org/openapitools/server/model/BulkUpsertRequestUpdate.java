package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AdGroupUpdateRequest;
import org.openapitools.server.model.AdUpdateRequest;
import org.openapitools.server.model.BulkUpsertRequestUpdateCatalogProductGroupsItems;
import org.openapitools.server.model.CampaignUpdateRequest;
import org.openapitools.server.model.KeywordUpdateGenerated;
import org.openapitools.server.model.LabelBulkUpdateRequest;
import org.openapitools.server.model.ProductGroupPromotionUpdateRequest;
import org.openapitools.server.model.ScheduleUpdateRequest;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Request for creation of entities in bulk.
 */
public class BulkUpsertRequestUpdate   {

    private List<@Valid AdGroupUpdateRequest> adGroups = new ArrayList<>();
    private List<@Valid AdUpdateRequest> ads = new ArrayList<>();
    private List<@Valid CampaignUpdateRequest> campaigns = new ArrayList<>();
    private List<BulkUpsertRequestUpdateCatalogProductGroupsItems> catalogProductGroups = new ArrayList<>();
    private List<@Valid KeywordUpdateGenerated> keywords = new ArrayList<>();
    private List<@Valid LabelBulkUpdateRequest> labels = new ArrayList<>();
    private List<@Valid ProductGroupPromotionUpdateRequest> productGroups = new ArrayList<>();
    private List<@Valid ScheduleUpdateRequest> schedules = new ArrayList<>();

    /**
     * Default constructor.
     */
    public BulkUpsertRequestUpdate() {
    // JSON-B / Jackson
    }

    /**
     * Create BulkUpsertRequestUpdate.
     *
     * @param adGroups adGroups
     * @param ads ads
     * @param campaigns campaigns
     * @param catalogProductGroups catalogProductGroups
     * @param keywords keywords
     * @param labels labels
     * @param productGroups productGroups
     * @param schedules schedules
     */
    public BulkUpsertRequestUpdate(
        List<@Valid AdGroupUpdateRequest> adGroups, 
        List<@Valid AdUpdateRequest> ads, 
        List<@Valid CampaignUpdateRequest> campaigns, 
        List<BulkUpsertRequestUpdateCatalogProductGroupsItems> catalogProductGroups, 
        List<@Valid KeywordUpdateGenerated> keywords, 
        List<@Valid LabelBulkUpdateRequest> labels, 
        List<@Valid ProductGroupPromotionUpdateRequest> productGroups, 
        List<@Valid ScheduleUpdateRequest> schedules
    ) {
        this.adGroups = adGroups;
        this.ads = ads;
        this.campaigns = campaigns;
        this.catalogProductGroups = catalogProductGroups;
        this.keywords = keywords;
        this.labels = labels;
        this.productGroups = productGroups;
        this.schedules = schedules;
    }



    /**
     * Get adGroups
     * @return adGroups
     */
    public List<@Valid AdGroupUpdateRequest> getAdGroups() {
        return adGroups;
    }

    public void setAdGroups(List<@Valid AdGroupUpdateRequest> adGroups) {
        this.adGroups = adGroups;
    }

    /**
     * Get ads
     * @return ads
     */
    public List<@Valid AdUpdateRequest> getAds() {
        return ads;
    }

    public void setAds(List<@Valid AdUpdateRequest> ads) {
        this.ads = ads;
    }

    /**
     * Get campaigns
     * @return campaigns
     */
    public List<@Valid CampaignUpdateRequest> getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(List<@Valid CampaignUpdateRequest> campaigns) {
        this.campaigns = campaigns;
    }

    /**
     * Get catalogProductGroups
     * @return catalogProductGroups
     */
    public List<BulkUpsertRequestUpdateCatalogProductGroupsItems> getCatalogProductGroups() {
        return catalogProductGroups;
    }

    public void setCatalogProductGroups(List<BulkUpsertRequestUpdateCatalogProductGroupsItems> catalogProductGroups) {
        this.catalogProductGroups = catalogProductGroups;
    }

    /**
     * Get keywords
     * @return keywords
     */
    public List<@Valid KeywordUpdateGenerated> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<@Valid KeywordUpdateGenerated> keywords) {
        this.keywords = keywords;
    }

    /**
     * Get labels
     * @return labels
     */
    public List<@Valid LabelBulkUpdateRequest> getLabels() {
        return labels;
    }

    public void setLabels(List<@Valid LabelBulkUpdateRequest> labels) {
        this.labels = labels;
    }

    /**
     * Get productGroups
     * @return productGroups
     */
    public List<@Valid ProductGroupPromotionUpdateRequest> getProductGroups() {
        return productGroups;
    }

    public void setProductGroups(List<@Valid ProductGroupPromotionUpdateRequest> productGroups) {
        this.productGroups = productGroups;
    }

    /**
     * Get schedules
     * @return schedules
     */
    public List<@Valid ScheduleUpdateRequest> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<@Valid ScheduleUpdateRequest> schedules) {
        this.schedules = schedules;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BulkUpsertRequestUpdate {\n");
        
        sb.append("    adGroups: ").append(toIndentedString(adGroups)).append("\n");
        sb.append("    ads: ").append(toIndentedString(ads)).append("\n");
        sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
        sb.append("    catalogProductGroups: ").append(toIndentedString(catalogProductGroups)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    productGroups: ").append(toIndentedString(productGroups)).append("\n");
        sb.append("    schedules: ").append(toIndentedString(schedules)).append("\n");
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


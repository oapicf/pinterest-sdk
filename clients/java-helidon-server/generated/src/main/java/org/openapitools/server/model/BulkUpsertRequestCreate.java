package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AdCreateRequest;
import org.openapitools.server.model.AdGroupCreateRequest;
import org.openapitools.server.model.BulkUpsertRequestCreateCatalogProductGroupsItems;
import org.openapitools.server.model.CampaignCreateRequest;
import org.openapitools.server.model.KeywordsRequest;
import org.openapitools.server.model.LabelBulkCreateRequest;
import org.openapitools.server.model.ProductGroupPromotionCreateRequest;
import org.openapitools.server.model.ScheduleCreateRequest;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Request for creation of entities in bulk.
 */
public class BulkUpsertRequestCreate   {

    private List<@Valid AdGroupCreateRequest> adGroups = new ArrayList<>();
    private List<@Valid AdCreateRequest> ads = new ArrayList<>();
    private List<@Valid CampaignCreateRequest> campaigns = new ArrayList<>();
    private List<BulkUpsertRequestCreateCatalogProductGroupsItems> catalogProductGroups = new ArrayList<>();
    private List<@Valid KeywordsRequest> keywords = new ArrayList<>();
    private List<@Valid LabelBulkCreateRequest> labels = new ArrayList<>();
    private List<@Valid ProductGroupPromotionCreateRequest> productGroups = new ArrayList<>();
    private List<@Valid ScheduleCreateRequest> schedules = new ArrayList<>();

    /**
     * Default constructor.
     */
    public BulkUpsertRequestCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create BulkUpsertRequestCreate.
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
    public BulkUpsertRequestCreate(
        List<@Valid AdGroupCreateRequest> adGroups, 
        List<@Valid AdCreateRequest> ads, 
        List<@Valid CampaignCreateRequest> campaigns, 
        List<BulkUpsertRequestCreateCatalogProductGroupsItems> catalogProductGroups, 
        List<@Valid KeywordsRequest> keywords, 
        List<@Valid LabelBulkCreateRequest> labels, 
        List<@Valid ProductGroupPromotionCreateRequest> productGroups, 
        List<@Valid ScheduleCreateRequest> schedules
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
    public List<@Valid AdGroupCreateRequest> getAdGroups() {
        return adGroups;
    }

    public void setAdGroups(List<@Valid AdGroupCreateRequest> adGroups) {
        this.adGroups = adGroups;
    }

    /**
     * Get ads
     * @return ads
     */
    public List<@Valid AdCreateRequest> getAds() {
        return ads;
    }

    public void setAds(List<@Valid AdCreateRequest> ads) {
        this.ads = ads;
    }

    /**
     * Get campaigns
     * @return campaigns
     */
    public List<@Valid CampaignCreateRequest> getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(List<@Valid CampaignCreateRequest> campaigns) {
        this.campaigns = campaigns;
    }

    /**
     * Get catalogProductGroups
     * @return catalogProductGroups
     */
    public List<BulkUpsertRequestCreateCatalogProductGroupsItems> getCatalogProductGroups() {
        return catalogProductGroups;
    }

    public void setCatalogProductGroups(List<BulkUpsertRequestCreateCatalogProductGroupsItems> catalogProductGroups) {
        this.catalogProductGroups = catalogProductGroups;
    }

    /**
     * Get keywords
     * @return keywords
     */
    public List<@Valid KeywordsRequest> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<@Valid KeywordsRequest> keywords) {
        this.keywords = keywords;
    }

    /**
     * Get labels
     * @return labels
     */
    public List<@Valid LabelBulkCreateRequest> getLabels() {
        return labels;
    }

    public void setLabels(List<@Valid LabelBulkCreateRequest> labels) {
        this.labels = labels;
    }

    /**
     * Get productGroups
     * @return productGroups
     */
    public List<@Valid ProductGroupPromotionCreateRequest> getProductGroups() {
        return productGroups;
    }

    public void setProductGroups(List<@Valid ProductGroupPromotionCreateRequest> productGroups) {
        this.productGroups = productGroups;
    }

    /**
     * Get schedules
     * @return schedules
     */
    public List<@Valid ScheduleCreateRequest> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<@Valid ScheduleCreateRequest> schedules) {
        this.schedules = schedules;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BulkUpsertRequestCreate {\n");
        
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


package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdGroupUpdateRequest;
import org.openapitools.model.AdUpdateRequest;
import org.openapitools.model.BulkUpsertRequestUpdateCatalogProductGroupsItems;
import org.openapitools.model.CampaignUpdateRequest;
import org.openapitools.model.KeywordUpdateGenerated;
import org.openapitools.model.LabelBulkUpdateRequest;
import org.openapitools.model.ProductGroupPromotionUpdateRequest;
import org.openapitools.model.ScheduleUpdateRequest;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Request for creation of entities in bulk.
 */
@ApiModel(description="Request for creation of entities in bulk.")

public class BulkUpsertRequestUpdate  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid AdGroupUpdateRequest> adGroups = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid AdUpdateRequest> ads = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid CampaignUpdateRequest> campaigns = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private List<BulkUpsertRequestUpdateCatalogProductGroupsItems> catalogProductGroups = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid KeywordUpdateGenerated> keywords = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid LabelBulkUpdateRequest> labels = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid ProductGroupPromotionUpdateRequest> productGroups = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid ScheduleUpdateRequest> schedules = new ArrayList<>();
 /**
  * Get adGroups
  * @return adGroups
  */
  @JsonProperty("ad_groups")
  public List<@Valid AdGroupUpdateRequest> getAdGroups() {
    return adGroups;
  }

  /**
   * Sets the <code>adGroups</code> property.
   */
 public void setAdGroups(List<@Valid AdGroupUpdateRequest> adGroups) {
    this.adGroups = adGroups;
  }

  /**
   * Sets the <code>adGroups</code> property.
   */
  public BulkUpsertRequestUpdate adGroups(List<@Valid AdGroupUpdateRequest> adGroups) {
    this.adGroups = adGroups;
    return this;
  }

  /**
   * Adds a new item to the <code>adGroups</code> list.
   */
  public BulkUpsertRequestUpdate addAdGroupsItem(AdGroupUpdateRequest adGroupsItem) {
    this.adGroups.add(adGroupsItem);
    return this;
  }

 /**
  * Get ads
  * @return ads
  */
  @JsonProperty("ads")
  public List<@Valid AdUpdateRequest> getAds() {
    return ads;
  }

  /**
   * Sets the <code>ads</code> property.
   */
 public void setAds(List<@Valid AdUpdateRequest> ads) {
    this.ads = ads;
  }

  /**
   * Sets the <code>ads</code> property.
   */
  public BulkUpsertRequestUpdate ads(List<@Valid AdUpdateRequest> ads) {
    this.ads = ads;
    return this;
  }

  /**
   * Adds a new item to the <code>ads</code> list.
   */
  public BulkUpsertRequestUpdate addAdsItem(AdUpdateRequest adsItem) {
    this.ads.add(adsItem);
    return this;
  }

 /**
  * Get campaigns
  * @return campaigns
  */
  @JsonProperty("campaigns")
  public List<@Valid CampaignUpdateRequest> getCampaigns() {
    return campaigns;
  }

  /**
   * Sets the <code>campaigns</code> property.
   */
 public void setCampaigns(List<@Valid CampaignUpdateRequest> campaigns) {
    this.campaigns = campaigns;
  }

  /**
   * Sets the <code>campaigns</code> property.
   */
  public BulkUpsertRequestUpdate campaigns(List<@Valid CampaignUpdateRequest> campaigns) {
    this.campaigns = campaigns;
    return this;
  }

  /**
   * Adds a new item to the <code>campaigns</code> list.
   */
  public BulkUpsertRequestUpdate addCampaignsItem(CampaignUpdateRequest campaignsItem) {
    this.campaigns.add(campaignsItem);
    return this;
  }

 /**
  * Get catalogProductGroups
  * @return catalogProductGroups
  */
  @JsonProperty("catalog_product_groups")
  public List<BulkUpsertRequestUpdateCatalogProductGroupsItems> getCatalogProductGroups() {
    return catalogProductGroups;
  }

  /**
   * Sets the <code>catalogProductGroups</code> property.
   */
 public void setCatalogProductGroups(List<BulkUpsertRequestUpdateCatalogProductGroupsItems> catalogProductGroups) {
    this.catalogProductGroups = catalogProductGroups;
  }

  /**
   * Sets the <code>catalogProductGroups</code> property.
   */
  public BulkUpsertRequestUpdate catalogProductGroups(List<BulkUpsertRequestUpdateCatalogProductGroupsItems> catalogProductGroups) {
    this.catalogProductGroups = catalogProductGroups;
    return this;
  }

  /**
   * Adds a new item to the <code>catalogProductGroups</code> list.
   */
  public BulkUpsertRequestUpdate addCatalogProductGroupsItem(BulkUpsertRequestUpdateCatalogProductGroupsItems catalogProductGroupsItem) {
    this.catalogProductGroups.add(catalogProductGroupsItem);
    return this;
  }

 /**
  * Get keywords
  * @return keywords
  */
  @JsonProperty("keywords")
  public List<@Valid KeywordUpdateGenerated> getKeywords() {
    return keywords;
  }

  /**
   * Sets the <code>keywords</code> property.
   */
 public void setKeywords(List<@Valid KeywordUpdateGenerated> keywords) {
    this.keywords = keywords;
  }

  /**
   * Sets the <code>keywords</code> property.
   */
  public BulkUpsertRequestUpdate keywords(List<@Valid KeywordUpdateGenerated> keywords) {
    this.keywords = keywords;
    return this;
  }

  /**
   * Adds a new item to the <code>keywords</code> list.
   */
  public BulkUpsertRequestUpdate addKeywordsItem(KeywordUpdateGenerated keywordsItem) {
    this.keywords.add(keywordsItem);
    return this;
  }

 /**
  * Get labels
  * @return labels
  */
  @JsonProperty("labels")
  public List<@Valid LabelBulkUpdateRequest> getLabels() {
    return labels;
  }

  /**
   * Sets the <code>labels</code> property.
   */
 public void setLabels(List<@Valid LabelBulkUpdateRequest> labels) {
    this.labels = labels;
  }

  /**
   * Sets the <code>labels</code> property.
   */
  public BulkUpsertRequestUpdate labels(List<@Valid LabelBulkUpdateRequest> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Adds a new item to the <code>labels</code> list.
   */
  public BulkUpsertRequestUpdate addLabelsItem(LabelBulkUpdateRequest labelsItem) {
    this.labels.add(labelsItem);
    return this;
  }

 /**
  * Get productGroups
  * @return productGroups
  */
  @JsonProperty("product_groups")
  public List<@Valid ProductGroupPromotionUpdateRequest> getProductGroups() {
    return productGroups;
  }

  /**
   * Sets the <code>productGroups</code> property.
   */
 public void setProductGroups(List<@Valid ProductGroupPromotionUpdateRequest> productGroups) {
    this.productGroups = productGroups;
  }

  /**
   * Sets the <code>productGroups</code> property.
   */
  public BulkUpsertRequestUpdate productGroups(List<@Valid ProductGroupPromotionUpdateRequest> productGroups) {
    this.productGroups = productGroups;
    return this;
  }

  /**
   * Adds a new item to the <code>productGroups</code> list.
   */
  public BulkUpsertRequestUpdate addProductGroupsItem(ProductGroupPromotionUpdateRequest productGroupsItem) {
    this.productGroups.add(productGroupsItem);
    return this;
  }

 /**
  * Get schedules
  * @return schedules
  */
  @JsonProperty("schedules")
  public List<@Valid ScheduleUpdateRequest> getSchedules() {
    return schedules;
  }

  /**
   * Sets the <code>schedules</code> property.
   */
 public void setSchedules(List<@Valid ScheduleUpdateRequest> schedules) {
    this.schedules = schedules;
  }

  /**
   * Sets the <code>schedules</code> property.
   */
  public BulkUpsertRequestUpdate schedules(List<@Valid ScheduleUpdateRequest> schedules) {
    this.schedules = schedules;
    return this;
  }

  /**
   * Adds a new item to the <code>schedules</code> list.
   */
  public BulkUpsertRequestUpdate addSchedulesItem(ScheduleUpdateRequest schedulesItem) {
    this.schedules.add(schedulesItem);
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
    BulkUpsertRequestUpdate bulkUpsertRequestUpdate = (BulkUpsertRequestUpdate) o;
    return Objects.equals(this.adGroups, bulkUpsertRequestUpdate.adGroups) &&
        Objects.equals(this.ads, bulkUpsertRequestUpdate.ads) &&
        Objects.equals(this.campaigns, bulkUpsertRequestUpdate.campaigns) &&
        Objects.equals(this.catalogProductGroups, bulkUpsertRequestUpdate.catalogProductGroups) &&
        Objects.equals(this.keywords, bulkUpsertRequestUpdate.keywords) &&
        Objects.equals(this.labels, bulkUpsertRequestUpdate.labels) &&
        Objects.equals(this.productGroups, bulkUpsertRequestUpdate.productGroups) &&
        Objects.equals(this.schedules, bulkUpsertRequestUpdate.schedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroups, ads, campaigns, catalogProductGroups, keywords, labels, productGroups, schedules);
  }

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


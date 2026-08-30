package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AdGroupUpdateRequest;
import com.prokarma.pkmst.model.AdUpdateRequest;
import com.prokarma.pkmst.model.BulkUpsertRequestUpdateCatalogProductGroupsItems;
import com.prokarma.pkmst.model.CampaignUpdateRequest;
import com.prokarma.pkmst.model.KeywordUpdateGenerated;
import com.prokarma.pkmst.model.LabelBulkUpdateRequest;
import com.prokarma.pkmst.model.ProductGroupPromotionUpdateRequest;
import com.prokarma.pkmst.model.ScheduleUpdateRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Request for creation of entities in bulk.
 */
@ApiModel(description = "Request for creation of entities in bulk.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BulkUpsertRequestUpdate   {
  @JsonProperty("ad_groups")
  
  private List<AdGroupUpdateRequest> adGroups = null;

  @JsonProperty("ads")
  
  private List<AdUpdateRequest> ads = null;

  @JsonProperty("campaigns")
  
  private List<CampaignUpdateRequest> campaigns = null;

  @JsonProperty("catalog_product_groups")
  
  private List<BulkUpsertRequestUpdateCatalogProductGroupsItems> catalogProductGroups = null;

  @JsonProperty("keywords")
  
  private List<KeywordUpdateGenerated> keywords = null;

  @JsonProperty("labels")
  
  private List<LabelBulkUpdateRequest> labels = null;

  @JsonProperty("product_groups")
  
  private List<ProductGroupPromotionUpdateRequest> productGroups = null;

  @JsonProperty("schedules")
  
  private List<ScheduleUpdateRequest> schedules = null;

  public BulkUpsertRequestUpdate adGroups(List<AdGroupUpdateRequest> adGroups) {
    this.adGroups = adGroups;
    return this;
  }

  public BulkUpsertRequestUpdate addAdGroupsItem(AdGroupUpdateRequest adGroupsItem) {
    if (this.adGroups == null) {
      this.adGroups = new ArrayList<>();
    }
    this.adGroups.add(adGroupsItem);
    return this;
  }

  /**
   * Get adGroups
   * @return adGroups
   */
  @ApiModelProperty(value = "")
  public List<AdGroupUpdateRequest> getAdGroups() {
    return adGroups;
  }

  public void setAdGroups(List<AdGroupUpdateRequest> adGroups) {
    this.adGroups = adGroups;
  }

  public BulkUpsertRequestUpdate ads(List<AdUpdateRequest> ads) {
    this.ads = ads;
    return this;
  }

  public BulkUpsertRequestUpdate addAdsItem(AdUpdateRequest adsItem) {
    if (this.ads == null) {
      this.ads = new ArrayList<>();
    }
    this.ads.add(adsItem);
    return this;
  }

  /**
   * Get ads
   * @return ads
   */
  @ApiModelProperty(value = "")
  public List<AdUpdateRequest> getAds() {
    return ads;
  }

  public void setAds(List<AdUpdateRequest> ads) {
    this.ads = ads;
  }

  public BulkUpsertRequestUpdate campaigns(List<CampaignUpdateRequest> campaigns) {
    this.campaigns = campaigns;
    return this;
  }

  public BulkUpsertRequestUpdate addCampaignsItem(CampaignUpdateRequest campaignsItem) {
    if (this.campaigns == null) {
      this.campaigns = new ArrayList<>();
    }
    this.campaigns.add(campaignsItem);
    return this;
  }

  /**
   * Get campaigns
   * @return campaigns
   */
  @ApiModelProperty(value = "")
  public List<CampaignUpdateRequest> getCampaigns() {
    return campaigns;
  }

  public void setCampaigns(List<CampaignUpdateRequest> campaigns) {
    this.campaigns = campaigns;
  }

  public BulkUpsertRequestUpdate catalogProductGroups(List<BulkUpsertRequestUpdateCatalogProductGroupsItems> catalogProductGroups) {
    this.catalogProductGroups = catalogProductGroups;
    return this;
  }

  public BulkUpsertRequestUpdate addCatalogProductGroupsItem(BulkUpsertRequestUpdateCatalogProductGroupsItems catalogProductGroupsItem) {
    if (this.catalogProductGroups == null) {
      this.catalogProductGroups = new ArrayList<>();
    }
    this.catalogProductGroups.add(catalogProductGroupsItem);
    return this;
  }

  /**
   * Get catalogProductGroups
   * @return catalogProductGroups
   */
  @ApiModelProperty(value = "")
  public List<BulkUpsertRequestUpdateCatalogProductGroupsItems> getCatalogProductGroups() {
    return catalogProductGroups;
  }

  public void setCatalogProductGroups(List<BulkUpsertRequestUpdateCatalogProductGroupsItems> catalogProductGroups) {
    this.catalogProductGroups = catalogProductGroups;
  }

  public BulkUpsertRequestUpdate keywords(List<KeywordUpdateGenerated> keywords) {
    this.keywords = keywords;
    return this;
  }

  public BulkUpsertRequestUpdate addKeywordsItem(KeywordUpdateGenerated keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

  /**
   * Get keywords
   * @return keywords
   */
  @ApiModelProperty(value = "")
  public List<KeywordUpdateGenerated> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<KeywordUpdateGenerated> keywords) {
    this.keywords = keywords;
  }

  public BulkUpsertRequestUpdate labels(List<LabelBulkUpdateRequest> labels) {
    this.labels = labels;
    return this;
  }

  public BulkUpsertRequestUpdate addLabelsItem(LabelBulkUpdateRequest labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
   */
  @ApiModelProperty(value = "")
  public List<LabelBulkUpdateRequest> getLabels() {
    return labels;
  }

  public void setLabels(List<LabelBulkUpdateRequest> labels) {
    this.labels = labels;
  }

  public BulkUpsertRequestUpdate productGroups(List<ProductGroupPromotionUpdateRequest> productGroups) {
    this.productGroups = productGroups;
    return this;
  }

  public BulkUpsertRequestUpdate addProductGroupsItem(ProductGroupPromotionUpdateRequest productGroupsItem) {
    if (this.productGroups == null) {
      this.productGroups = new ArrayList<>();
    }
    this.productGroups.add(productGroupsItem);
    return this;
  }

  /**
   * Get productGroups
   * @return productGroups
   */
  @ApiModelProperty(value = "")
  public List<ProductGroupPromotionUpdateRequest> getProductGroups() {
    return productGroups;
  }

  public void setProductGroups(List<ProductGroupPromotionUpdateRequest> productGroups) {
    this.productGroups = productGroups;
  }

  public BulkUpsertRequestUpdate schedules(List<ScheduleUpdateRequest> schedules) {
    this.schedules = schedules;
    return this;
  }

  public BulkUpsertRequestUpdate addSchedulesItem(ScheduleUpdateRequest schedulesItem) {
    if (this.schedules == null) {
      this.schedules = new ArrayList<>();
    }
    this.schedules.add(schedulesItem);
    return this;
  }

  /**
   * Get schedules
   * @return schedules
   */
  @ApiModelProperty(value = "")
  public List<ScheduleUpdateRequest> getSchedules() {
    return schedules;
  }

  public void setSchedules(List<ScheduleUpdateRequest> schedules) {
    this.schedules = schedules;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


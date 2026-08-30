package apimodels;

import apimodels.AdGroupUpdateRequest;
import apimodels.AdUpdateRequest;
import apimodels.BulkUpsertRequestUpdateCatalogProductGroupsItems;
import apimodels.CampaignUpdateRequest;
import apimodels.KeywordUpdateGenerated;
import apimodels.LabelBulkUpdateRequest;
import apimodels.ProductGroupPromotionUpdateRequest;
import apimodels.ScheduleUpdateRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Request for creation of entities in bulk.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BulkUpsertRequestUpdate   {
  @JsonProperty("ad_groups")
  @Valid

  private List<@Valid AdGroupUpdateRequest> adGroups = null;

  @JsonProperty("ads")
  @Valid

  private List<@Valid AdUpdateRequest> ads = null;

  @JsonProperty("campaigns")
  @Valid

  private List<@Valid CampaignUpdateRequest> campaigns = null;

  @JsonProperty("catalog_product_groups")
  @Valid

  private List<BulkUpsertRequestUpdateCatalogProductGroupsItems> catalogProductGroups = null;

  @JsonProperty("keywords")
  @Valid

  private List<@Valid KeywordUpdateGenerated> keywords = null;

  @JsonProperty("labels")
  @Valid

  private List<@Valid LabelBulkUpdateRequest> labels = null;

  @JsonProperty("product_groups")
  @Valid

  private List<@Valid ProductGroupPromotionUpdateRequest> productGroups = null;

  @JsonProperty("schedules")
  @Valid

  private List<@Valid ScheduleUpdateRequest> schedules = null;

  public BulkUpsertRequestUpdate adGroups(List<@Valid AdGroupUpdateRequest> adGroups) {
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
  **/
  public List<@Valid AdGroupUpdateRequest> getAdGroups() {
    return adGroups;
  }

  public void setAdGroups(List<@Valid AdGroupUpdateRequest> adGroups) {
    this.adGroups = adGroups;
  }

  public BulkUpsertRequestUpdate ads(List<@Valid AdUpdateRequest> ads) {
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
  **/
  public List<@Valid AdUpdateRequest> getAds() {
    return ads;
  }

  public void setAds(List<@Valid AdUpdateRequest> ads) {
    this.ads = ads;
  }

  public BulkUpsertRequestUpdate campaigns(List<@Valid CampaignUpdateRequest> campaigns) {
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
  **/
  public List<@Valid CampaignUpdateRequest> getCampaigns() {
    return campaigns;
  }

  public void setCampaigns(List<@Valid CampaignUpdateRequest> campaigns) {
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
  **/
  public List<BulkUpsertRequestUpdateCatalogProductGroupsItems> getCatalogProductGroups() {
    return catalogProductGroups;
  }

  public void setCatalogProductGroups(List<BulkUpsertRequestUpdateCatalogProductGroupsItems> catalogProductGroups) {
    this.catalogProductGroups = catalogProductGroups;
  }

  public BulkUpsertRequestUpdate keywords(List<@Valid KeywordUpdateGenerated> keywords) {
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
  **/
  public List<@Valid KeywordUpdateGenerated> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<@Valid KeywordUpdateGenerated> keywords) {
    this.keywords = keywords;
  }

  public BulkUpsertRequestUpdate labels(List<@Valid LabelBulkUpdateRequest> labels) {
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
  **/
  public List<@Valid LabelBulkUpdateRequest> getLabels() {
    return labels;
  }

  public void setLabels(List<@Valid LabelBulkUpdateRequest> labels) {
    this.labels = labels;
  }

  public BulkUpsertRequestUpdate productGroups(List<@Valid ProductGroupPromotionUpdateRequest> productGroups) {
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
  **/
  public List<@Valid ProductGroupPromotionUpdateRequest> getProductGroups() {
    return productGroups;
  }

  public void setProductGroups(List<@Valid ProductGroupPromotionUpdateRequest> productGroups) {
    this.productGroups = productGroups;
  }

  public BulkUpsertRequestUpdate schedules(List<@Valid ScheduleUpdateRequest> schedules) {
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
  **/
  public List<@Valid ScheduleUpdateRequest> getSchedules() {
    return schedules;
  }

  public void setSchedules(List<@Valid ScheduleUpdateRequest> schedules) {
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
    return Objects.equals(adGroups, bulkUpsertRequestUpdate.adGroups) &&
        Objects.equals(ads, bulkUpsertRequestUpdate.ads) &&
        Objects.equals(campaigns, bulkUpsertRequestUpdate.campaigns) &&
        Objects.equals(catalogProductGroups, bulkUpsertRequestUpdate.catalogProductGroups) &&
        Objects.equals(keywords, bulkUpsertRequestUpdate.keywords) &&
        Objects.equals(labels, bulkUpsertRequestUpdate.labels) &&
        Objects.equals(productGroups, bulkUpsertRequestUpdate.productGroups) &&
        Objects.equals(schedules, bulkUpsertRequestUpdate.schedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroups, ads, campaigns, catalogProductGroups, keywords, labels, productGroups, schedules);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


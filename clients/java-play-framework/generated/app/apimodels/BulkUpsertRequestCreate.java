package apimodels;

import apimodels.AdCreateRequest;
import apimodels.AdGroupCreateRequest;
import apimodels.BulkUpsertRequestCreateCatalogProductGroupsItems;
import apimodels.CampaignCreateRequest;
import apimodels.KeywordsRequest;
import apimodels.LabelBulkCreateRequest;
import apimodels.ProductGroupPromotionCreateRequest;
import apimodels.ScheduleCreateRequest;
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
public class BulkUpsertRequestCreate   {
  @JsonProperty("ad_groups")
  @Valid

  private List<@Valid AdGroupCreateRequest> adGroups = null;

  @JsonProperty("ads")
  @Valid

  private List<@Valid AdCreateRequest> ads = null;

  @JsonProperty("campaigns")
  @Valid

  private List<@Valid CampaignCreateRequest> campaigns = null;

  @JsonProperty("catalog_product_groups")
  @Valid

  private List<BulkUpsertRequestCreateCatalogProductGroupsItems> catalogProductGroups = null;

  @JsonProperty("keywords")
  @Valid

  private List<@Valid KeywordsRequest> keywords = null;

  @JsonProperty("labels")
  @Valid

  private List<@Valid LabelBulkCreateRequest> labels = null;

  @JsonProperty("product_groups")
  @Valid

  private List<@Valid ProductGroupPromotionCreateRequest> productGroups = null;

  @JsonProperty("schedules")
  @Valid

  private List<@Valid ScheduleCreateRequest> schedules = null;

  public BulkUpsertRequestCreate adGroups(List<@Valid AdGroupCreateRequest> adGroups) {
    this.adGroups = adGroups;
    return this;
  }

  public BulkUpsertRequestCreate addAdGroupsItem(AdGroupCreateRequest adGroupsItem) {
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
  public List<@Valid AdGroupCreateRequest> getAdGroups() {
    return adGroups;
  }

  public void setAdGroups(List<@Valid AdGroupCreateRequest> adGroups) {
    this.adGroups = adGroups;
  }

  public BulkUpsertRequestCreate ads(List<@Valid AdCreateRequest> ads) {
    this.ads = ads;
    return this;
  }

  public BulkUpsertRequestCreate addAdsItem(AdCreateRequest adsItem) {
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
  public List<@Valid AdCreateRequest> getAds() {
    return ads;
  }

  public void setAds(List<@Valid AdCreateRequest> ads) {
    this.ads = ads;
  }

  public BulkUpsertRequestCreate campaigns(List<@Valid CampaignCreateRequest> campaigns) {
    this.campaigns = campaigns;
    return this;
  }

  public BulkUpsertRequestCreate addCampaignsItem(CampaignCreateRequest campaignsItem) {
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
  public List<@Valid CampaignCreateRequest> getCampaigns() {
    return campaigns;
  }

  public void setCampaigns(List<@Valid CampaignCreateRequest> campaigns) {
    this.campaigns = campaigns;
  }

  public BulkUpsertRequestCreate catalogProductGroups(List<BulkUpsertRequestCreateCatalogProductGroupsItems> catalogProductGroups) {
    this.catalogProductGroups = catalogProductGroups;
    return this;
  }

  public BulkUpsertRequestCreate addCatalogProductGroupsItem(BulkUpsertRequestCreateCatalogProductGroupsItems catalogProductGroupsItem) {
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
  public List<BulkUpsertRequestCreateCatalogProductGroupsItems> getCatalogProductGroups() {
    return catalogProductGroups;
  }

  public void setCatalogProductGroups(List<BulkUpsertRequestCreateCatalogProductGroupsItems> catalogProductGroups) {
    this.catalogProductGroups = catalogProductGroups;
  }

  public BulkUpsertRequestCreate keywords(List<@Valid KeywordsRequest> keywords) {
    this.keywords = keywords;
    return this;
  }

  public BulkUpsertRequestCreate addKeywordsItem(KeywordsRequest keywordsItem) {
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
  public List<@Valid KeywordsRequest> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<@Valid KeywordsRequest> keywords) {
    this.keywords = keywords;
  }

  public BulkUpsertRequestCreate labels(List<@Valid LabelBulkCreateRequest> labels) {
    this.labels = labels;
    return this;
  }

  public BulkUpsertRequestCreate addLabelsItem(LabelBulkCreateRequest labelsItem) {
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
  public List<@Valid LabelBulkCreateRequest> getLabels() {
    return labels;
  }

  public void setLabels(List<@Valid LabelBulkCreateRequest> labels) {
    this.labels = labels;
  }

  public BulkUpsertRequestCreate productGroups(List<@Valid ProductGroupPromotionCreateRequest> productGroups) {
    this.productGroups = productGroups;
    return this;
  }

  public BulkUpsertRequestCreate addProductGroupsItem(ProductGroupPromotionCreateRequest productGroupsItem) {
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
  public List<@Valid ProductGroupPromotionCreateRequest> getProductGroups() {
    return productGroups;
  }

  public void setProductGroups(List<@Valid ProductGroupPromotionCreateRequest> productGroups) {
    this.productGroups = productGroups;
  }

  public BulkUpsertRequestCreate schedules(List<@Valid ScheduleCreateRequest> schedules) {
    this.schedules = schedules;
    return this;
  }

  public BulkUpsertRequestCreate addSchedulesItem(ScheduleCreateRequest schedulesItem) {
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
  public List<@Valid ScheduleCreateRequest> getSchedules() {
    return schedules;
  }

  public void setSchedules(List<@Valid ScheduleCreateRequest> schedules) {
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
    BulkUpsertRequestCreate bulkUpsertRequestCreate = (BulkUpsertRequestCreate) o;
    return Objects.equals(adGroups, bulkUpsertRequestCreate.adGroups) &&
        Objects.equals(ads, bulkUpsertRequestCreate.ads) &&
        Objects.equals(campaigns, bulkUpsertRequestCreate.campaigns) &&
        Objects.equals(catalogProductGroups, bulkUpsertRequestCreate.catalogProductGroups) &&
        Objects.equals(keywords, bulkUpsertRequestCreate.keywords) &&
        Objects.equals(labels, bulkUpsertRequestCreate.labels) &&
        Objects.equals(productGroups, bulkUpsertRequestCreate.productGroups) &&
        Objects.equals(schedules, bulkUpsertRequestCreate.schedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroups, ads, campaigns, catalogProductGroups, keywords, labels, productGroups, schedules);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


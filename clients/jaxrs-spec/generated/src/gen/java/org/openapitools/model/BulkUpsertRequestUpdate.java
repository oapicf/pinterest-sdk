package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Request for creation of entities in bulk.
 **/
@ApiModel(description = "Request for creation of entities in bulk.")
@JsonTypeName("BulkUpsertRequestUpdate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BulkUpsertRequestUpdate   {
  private @Valid List<@Valid AdGroupUpdateRequest> adGroups = new ArrayList<>();
  private @Valid List<@Valid AdUpdateRequest> ads = new ArrayList<>();
  private @Valid List<@Valid CampaignUpdateRequest> campaigns = new ArrayList<>();
  private @Valid List<BulkUpsertRequestUpdateCatalogProductGroupsItems> catalogProductGroups = new ArrayList<>();
  private @Valid List<@Valid KeywordUpdateGenerated> keywords = new ArrayList<>();
  private @Valid List<@Valid LabelBulkUpdateRequest> labels = new ArrayList<>();
  private @Valid List<@Valid ProductGroupPromotionUpdateRequest> productGroups = new ArrayList<>();
  private @Valid List<@Valid ScheduleUpdateRequest> schedules = new ArrayList<>();

  public BulkUpsertRequestUpdate() {
  }

  /**
   **/
  public BulkUpsertRequestUpdate adGroups(List<@Valid AdGroupUpdateRequest> adGroups) {
    this.adGroups = adGroups;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ad_groups")
  @Valid public List<@Valid AdGroupUpdateRequest> getAdGroups() {
    return adGroups;
  }

  @JsonProperty("ad_groups")
  public void setAdGroups(List<@Valid AdGroupUpdateRequest> adGroups) {
    this.adGroups = adGroups;
  }

  public BulkUpsertRequestUpdate addAdGroupsItem(AdGroupUpdateRequest adGroupsItem) {
    if (this.adGroups == null) {
      this.adGroups = new ArrayList<>();
    }

    this.adGroups.add(adGroupsItem);
    return this;
  }

  public BulkUpsertRequestUpdate removeAdGroupsItem(AdGroupUpdateRequest adGroupsItem) {
    if (adGroupsItem != null && this.adGroups != null) {
      this.adGroups.remove(adGroupsItem);
    }

    return this;
  }
  /**
   **/
  public BulkUpsertRequestUpdate ads(List<@Valid AdUpdateRequest> ads) {
    this.ads = ads;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ads")
  @Valid public List<@Valid AdUpdateRequest> getAds() {
    return ads;
  }

  @JsonProperty("ads")
  public void setAds(List<@Valid AdUpdateRequest> ads) {
    this.ads = ads;
  }

  public BulkUpsertRequestUpdate addAdsItem(AdUpdateRequest adsItem) {
    if (this.ads == null) {
      this.ads = new ArrayList<>();
    }

    this.ads.add(adsItem);
    return this;
  }

  public BulkUpsertRequestUpdate removeAdsItem(AdUpdateRequest adsItem) {
    if (adsItem != null && this.ads != null) {
      this.ads.remove(adsItem);
    }

    return this;
  }
  /**
   **/
  public BulkUpsertRequestUpdate campaigns(List<@Valid CampaignUpdateRequest> campaigns) {
    this.campaigns = campaigns;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("campaigns")
  @Valid public List<@Valid CampaignUpdateRequest> getCampaigns() {
    return campaigns;
  }

  @JsonProperty("campaigns")
  public void setCampaigns(List<@Valid CampaignUpdateRequest> campaigns) {
    this.campaigns = campaigns;
  }

  public BulkUpsertRequestUpdate addCampaignsItem(CampaignUpdateRequest campaignsItem) {
    if (this.campaigns == null) {
      this.campaigns = new ArrayList<>();
    }

    this.campaigns.add(campaignsItem);
    return this;
  }

  public BulkUpsertRequestUpdate removeCampaignsItem(CampaignUpdateRequest campaignsItem) {
    if (campaignsItem != null && this.campaigns != null) {
      this.campaigns.remove(campaignsItem);
    }

    return this;
  }
  /**
   **/
  public BulkUpsertRequestUpdate catalogProductGroups(List<BulkUpsertRequestUpdateCatalogProductGroupsItems> catalogProductGroups) {
    this.catalogProductGroups = catalogProductGroups;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("catalog_product_groups")
  @Valid public List<@Valid BulkUpsertRequestUpdateCatalogProductGroupsItems> getCatalogProductGroups() {
    return catalogProductGroups;
  }

  @JsonProperty("catalog_product_groups")
  public void setCatalogProductGroups(List<BulkUpsertRequestUpdateCatalogProductGroupsItems> catalogProductGroups) {
    this.catalogProductGroups = catalogProductGroups;
  }

  public BulkUpsertRequestUpdate addCatalogProductGroupsItem(BulkUpsertRequestUpdateCatalogProductGroupsItems catalogProductGroupsItem) {
    if (this.catalogProductGroups == null) {
      this.catalogProductGroups = new ArrayList<>();
    }

    this.catalogProductGroups.add(catalogProductGroupsItem);
    return this;
  }

  public BulkUpsertRequestUpdate removeCatalogProductGroupsItem(BulkUpsertRequestUpdateCatalogProductGroupsItems catalogProductGroupsItem) {
    if (catalogProductGroupsItem != null && this.catalogProductGroups != null) {
      this.catalogProductGroups.remove(catalogProductGroupsItem);
    }

    return this;
  }
  /**
   **/
  public BulkUpsertRequestUpdate keywords(List<@Valid KeywordUpdateGenerated> keywords) {
    this.keywords = keywords;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("keywords")
  @Valid public List<@Valid KeywordUpdateGenerated> getKeywords() {
    return keywords;
  }

  @JsonProperty("keywords")
  public void setKeywords(List<@Valid KeywordUpdateGenerated> keywords) {
    this.keywords = keywords;
  }

  public BulkUpsertRequestUpdate addKeywordsItem(KeywordUpdateGenerated keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }

    this.keywords.add(keywordsItem);
    return this;
  }

  public BulkUpsertRequestUpdate removeKeywordsItem(KeywordUpdateGenerated keywordsItem) {
    if (keywordsItem != null && this.keywords != null) {
      this.keywords.remove(keywordsItem);
    }

    return this;
  }
  /**
   **/
  public BulkUpsertRequestUpdate labels(List<@Valid LabelBulkUpdateRequest> labels) {
    this.labels = labels;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("labels")
  @Valid public List<@Valid LabelBulkUpdateRequest> getLabels() {
    return labels;
  }

  @JsonProperty("labels")
  public void setLabels(List<@Valid LabelBulkUpdateRequest> labels) {
    this.labels = labels;
  }

  public BulkUpsertRequestUpdate addLabelsItem(LabelBulkUpdateRequest labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }

    this.labels.add(labelsItem);
    return this;
  }

  public BulkUpsertRequestUpdate removeLabelsItem(LabelBulkUpdateRequest labelsItem) {
    if (labelsItem != null && this.labels != null) {
      this.labels.remove(labelsItem);
    }

    return this;
  }
  /**
   **/
  public BulkUpsertRequestUpdate productGroups(List<@Valid ProductGroupPromotionUpdateRequest> productGroups) {
    this.productGroups = productGroups;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("product_groups")
  @Valid public List<@Valid ProductGroupPromotionUpdateRequest> getProductGroups() {
    return productGroups;
  }

  @JsonProperty("product_groups")
  public void setProductGroups(List<@Valid ProductGroupPromotionUpdateRequest> productGroups) {
    this.productGroups = productGroups;
  }

  public BulkUpsertRequestUpdate addProductGroupsItem(ProductGroupPromotionUpdateRequest productGroupsItem) {
    if (this.productGroups == null) {
      this.productGroups = new ArrayList<>();
    }

    this.productGroups.add(productGroupsItem);
    return this;
  }

  public BulkUpsertRequestUpdate removeProductGroupsItem(ProductGroupPromotionUpdateRequest productGroupsItem) {
    if (productGroupsItem != null && this.productGroups != null) {
      this.productGroups.remove(productGroupsItem);
    }

    return this;
  }
  /**
   **/
  public BulkUpsertRequestUpdate schedules(List<@Valid ScheduleUpdateRequest> schedules) {
    this.schedules = schedules;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("schedules")
  @Valid public List<@Valid ScheduleUpdateRequest> getSchedules() {
    return schedules;
  }

  @JsonProperty("schedules")
  public void setSchedules(List<@Valid ScheduleUpdateRequest> schedules) {
    this.schedules = schedules;
  }

  public BulkUpsertRequestUpdate addSchedulesItem(ScheduleUpdateRequest schedulesItem) {
    if (this.schedules == null) {
      this.schedules = new ArrayList<>();
    }

    this.schedules.add(schedulesItem);
    return this;
  }

  public BulkUpsertRequestUpdate removeSchedulesItem(ScheduleUpdateRequest schedulesItem) {
    if (schedulesItem != null && this.schedules != null) {
      this.schedules.remove(schedulesItem);
    }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}

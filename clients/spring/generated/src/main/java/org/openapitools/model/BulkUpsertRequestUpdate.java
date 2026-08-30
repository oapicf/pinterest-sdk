package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Request for creation of entities in bulk.
 */

@Schema(name = "BulkUpsertRequestUpdate", description = "Request for creation of entities in bulk.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BulkUpsertRequestUpdate {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid AdGroupUpdateRequest> adGroups = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid AdUpdateRequest> ads = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid CampaignUpdateRequest> campaigns = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<BulkUpsertRequestUpdateCatalogProductGroupsItems> catalogProductGroups = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid KeywordUpdateGenerated> keywords = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid LabelBulkUpdateRequest> labels = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid ProductGroupPromotionUpdateRequest> productGroups = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid ScheduleUpdateRequest> schedules = new ArrayList<>();

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
   */
  @Valid 
  @Schema(name = "ad_groups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_groups")
  public List<@Valid AdGroupUpdateRequest> getAdGroups() {
    return adGroups;
  }

  @JsonProperty("ad_groups")
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
   */
  @Valid 
  @Schema(name = "ads", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ads")
  public List<@Valid AdUpdateRequest> getAds() {
    return ads;
  }

  @JsonProperty("ads")
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
   */
  @Valid 
  @Schema(name = "campaigns", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("campaigns")
  public List<@Valid CampaignUpdateRequest> getCampaigns() {
    return campaigns;
  }

  @JsonProperty("campaigns")
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
   */
  @Valid 
  @Schema(name = "catalog_product_groups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catalog_product_groups")
  public List<BulkUpsertRequestUpdateCatalogProductGroupsItems> getCatalogProductGroups() {
    return catalogProductGroups;
  }

  @JsonProperty("catalog_product_groups")
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
   */
  @Valid 
  @Schema(name = "keywords", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("keywords")
  public List<@Valid KeywordUpdateGenerated> getKeywords() {
    return keywords;
  }

  @JsonProperty("keywords")
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
   */
  @Valid 
  @Schema(name = "labels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("labels")
  public List<@Valid LabelBulkUpdateRequest> getLabels() {
    return labels;
  }

  @JsonProperty("labels")
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
   */
  @Valid 
  @Schema(name = "product_groups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_groups")
  public List<@Valid ProductGroupPromotionUpdateRequest> getProductGroups() {
    return productGroups;
  }

  @JsonProperty("product_groups")
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
   */
  @Valid 
  @Schema(name = "schedules", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schedules")
  public List<@Valid ScheduleUpdateRequest> getSchedules() {
    return schedules;
  }

  @JsonProperty("schedules")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


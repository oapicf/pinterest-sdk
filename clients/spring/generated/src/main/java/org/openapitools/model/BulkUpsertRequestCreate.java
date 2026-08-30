package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdCreateRequest;
import org.openapitools.model.AdGroupCreateRequest;
import org.openapitools.model.BulkUpsertRequestCreateCatalogProductGroupsItems;
import org.openapitools.model.CampaignCreateRequest;
import org.openapitools.model.KeywordsRequest;
import org.openapitools.model.LabelBulkCreateRequest;
import org.openapitools.model.ProductGroupPromotionCreateRequest;
import org.openapitools.model.ScheduleCreateRequest;
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

@Schema(name = "BulkUpsertRequestCreate", description = "Request for creation of entities in bulk.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BulkUpsertRequestCreate {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid AdGroupCreateRequest> adGroups = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid AdCreateRequest> ads = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid CampaignCreateRequest> campaigns = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<BulkUpsertRequestCreateCatalogProductGroupsItems> catalogProductGroups = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid KeywordsRequest> keywords = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid LabelBulkCreateRequest> labels = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid ProductGroupPromotionCreateRequest> productGroups = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid ScheduleCreateRequest> schedules = new ArrayList<>();

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
   */
  @Valid 
  @Schema(name = "ad_groups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_groups")
  public List<@Valid AdGroupCreateRequest> getAdGroups() {
    return adGroups;
  }

  @JsonProperty("ad_groups")
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
   */
  @Valid 
  @Schema(name = "ads", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ads")
  public List<@Valid AdCreateRequest> getAds() {
    return ads;
  }

  @JsonProperty("ads")
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
   */
  @Valid 
  @Schema(name = "campaigns", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("campaigns")
  public List<@Valid CampaignCreateRequest> getCampaigns() {
    return campaigns;
  }

  @JsonProperty("campaigns")
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
   */
  @Valid 
  @Schema(name = "catalog_product_groups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catalog_product_groups")
  public List<BulkUpsertRequestCreateCatalogProductGroupsItems> getCatalogProductGroups() {
    return catalogProductGroups;
  }

  @JsonProperty("catalog_product_groups")
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
   */
  @Valid 
  @Schema(name = "keywords", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("keywords")
  public List<@Valid KeywordsRequest> getKeywords() {
    return keywords;
  }

  @JsonProperty("keywords")
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
   */
  @Valid 
  @Schema(name = "labels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("labels")
  public List<@Valid LabelBulkCreateRequest> getLabels() {
    return labels;
  }

  @JsonProperty("labels")
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
   */
  @Valid 
  @Schema(name = "product_groups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_groups")
  public List<@Valid ProductGroupPromotionCreateRequest> getProductGroups() {
    return productGroups;
  }

  @JsonProperty("product_groups")
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
   */
  @Valid 
  @Schema(name = "schedules", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schedules")
  public List<@Valid ScheduleCreateRequest> getSchedules() {
    return schedules;
  }

  @JsonProperty("schedules")
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
    return Objects.equals(this.adGroups, bulkUpsertRequestCreate.adGroups) &&
        Objects.equals(this.ads, bulkUpsertRequestCreate.ads) &&
        Objects.equals(this.campaigns, bulkUpsertRequestCreate.campaigns) &&
        Objects.equals(this.catalogProductGroups, bulkUpsertRequestCreate.catalogProductGroups) &&
        Objects.equals(this.keywords, bulkUpsertRequestCreate.keywords) &&
        Objects.equals(this.labels, bulkUpsertRequestCreate.labels) &&
        Objects.equals(this.productGroups, bulkUpsertRequestCreate.productGroups) &&
        Objects.equals(this.schedules, bulkUpsertRequestCreate.schedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroups, ads, campaigns, catalogProductGroups, keywords, labels, productGroups, schedules);
  }

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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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



/**
 * Request for creation of entities in bulk.
 */

@ApiModel(description = "Request for creation of entities in bulk.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BulkUpsertRequestCreate   {
  
  private List<AdGroupCreateRequest> adGroups = new ArrayList<>();
  private List<AdCreateRequest> ads = new ArrayList<>();
  private List<CampaignCreateRequest> campaigns = new ArrayList<>();
  private List<BulkUpsertRequestCreateCatalogProductGroupsItems> catalogProductGroups = new ArrayList<>();
  private List<KeywordsRequest> keywords = new ArrayList<>();
  private List<LabelBulkCreateRequest> labels = new ArrayList<>();
  private List<ProductGroupPromotionCreateRequest> productGroups = new ArrayList<>();
  private List<ScheduleCreateRequest> schedules = new ArrayList<>();

  /**
   */
  public BulkUpsertRequestCreate adGroups(List<AdGroupCreateRequest> adGroups) {
    this.adGroups = adGroups;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ad_groups")
  public List<AdGroupCreateRequest> getAdGroups() {
    return adGroups;
  }
  public void setAdGroups(List<AdGroupCreateRequest> adGroups) {
    this.adGroups = adGroups;
  }

  /**
   */
  public BulkUpsertRequestCreate ads(List<AdCreateRequest> ads) {
    this.ads = ads;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ads")
  public List<AdCreateRequest> getAds() {
    return ads;
  }
  public void setAds(List<AdCreateRequest> ads) {
    this.ads = ads;
  }

  /**
   */
  public BulkUpsertRequestCreate campaigns(List<CampaignCreateRequest> campaigns) {
    this.campaigns = campaigns;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("campaigns")
  public List<CampaignCreateRequest> getCampaigns() {
    return campaigns;
  }
  public void setCampaigns(List<CampaignCreateRequest> campaigns) {
    this.campaigns = campaigns;
  }

  /**
   */
  public BulkUpsertRequestCreate catalogProductGroups(List<BulkUpsertRequestCreateCatalogProductGroupsItems> catalogProductGroups) {
    this.catalogProductGroups = catalogProductGroups;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("catalog_product_groups")
  public List<BulkUpsertRequestCreateCatalogProductGroupsItems> getCatalogProductGroups() {
    return catalogProductGroups;
  }
  public void setCatalogProductGroups(List<BulkUpsertRequestCreateCatalogProductGroupsItems> catalogProductGroups) {
    this.catalogProductGroups = catalogProductGroups;
  }

  /**
   */
  public BulkUpsertRequestCreate keywords(List<KeywordsRequest> keywords) {
    this.keywords = keywords;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("keywords")
  public List<KeywordsRequest> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<KeywordsRequest> keywords) {
    this.keywords = keywords;
  }

  /**
   */
  public BulkUpsertRequestCreate labels(List<LabelBulkCreateRequest> labels) {
    this.labels = labels;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("labels")
  public List<LabelBulkCreateRequest> getLabels() {
    return labels;
  }
  public void setLabels(List<LabelBulkCreateRequest> labels) {
    this.labels = labels;
  }

  /**
   */
  public BulkUpsertRequestCreate productGroups(List<ProductGroupPromotionCreateRequest> productGroups) {
    this.productGroups = productGroups;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("product_groups")
  public List<ProductGroupPromotionCreateRequest> getProductGroups() {
    return productGroups;
  }
  public void setProductGroups(List<ProductGroupPromotionCreateRequest> productGroups) {
    this.productGroups = productGroups;
  }

  /**
   */
  public BulkUpsertRequestCreate schedules(List<ScheduleCreateRequest> schedules) {
    this.schedules = schedules;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("schedules")
  public List<ScheduleCreateRequest> getSchedules() {
    return schedules;
  }
  public void setSchedules(List<ScheduleCreateRequest> schedules) {
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


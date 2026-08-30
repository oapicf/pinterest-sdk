package org.openapitools.model;

import org.openapitools.model.AdCreateRequest;
import org.openapitools.model.AdGroupCreateRequest;
import org.openapitools.model.BulkUpsertRequestCreateCatalogProductGroupsItems;
import org.openapitools.model.CampaignCreateRequest;
import org.openapitools.model.KeywordsRequest;
import org.openapitools.model.LabelBulkCreateRequest;
import org.openapitools.model.ProductGroupPromotionCreateRequest;
import org.openapitools.model.ScheduleCreateRequest;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Request for creation of entities in bulk.
 */
public class BulkUpsertRequestCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("ad_groups")
  private List<AdGroupCreateRequest> adGroups = new ArrayList<>();

  @JsonProperty("ads")
  private List<AdCreateRequest> ads = new ArrayList<>();

  @JsonProperty("campaigns")
  private List<CampaignCreateRequest> campaigns = new ArrayList<>();

  @JsonProperty("catalog_product_groups")
  private List<BulkUpsertRequestCreateCatalogProductGroupsItems> catalogProductGroups = new ArrayList<>();

  @JsonProperty("keywords")
  private List<KeywordsRequest> keywords = new ArrayList<>();

  @JsonProperty("labels")
  private List<LabelBulkCreateRequest> labels = new ArrayList<>();

  @JsonProperty("product_groups")
  private List<ProductGroupPromotionCreateRequest> productGroups = new ArrayList<>();

  @JsonProperty("schedules")
  private List<ScheduleCreateRequest> schedules = new ArrayList<>();

  /**
   * 
   * @return adGroups
   */
  public List<AdGroupCreateRequest> getAdGroups() {
    return adGroups;
  }

  public void setAdGroups(List<AdGroupCreateRequest> adGroups) {
    this.adGroups = adGroups;
  }

  /**
   * 
   * @return ads
   */
  public List<AdCreateRequest> getAds() {
    return ads;
  }

  public void setAds(List<AdCreateRequest> ads) {
    this.ads = ads;
  }

  /**
   * 
   * @return campaigns
   */
  public List<CampaignCreateRequest> getCampaigns() {
    return campaigns;
  }

  public void setCampaigns(List<CampaignCreateRequest> campaigns) {
    this.campaigns = campaigns;
  }

  /**
   * 
   * @return catalogProductGroups
   */
  public List<BulkUpsertRequestCreateCatalogProductGroupsItems> getCatalogProductGroups() {
    return catalogProductGroups;
  }

  public void setCatalogProductGroups(List<BulkUpsertRequestCreateCatalogProductGroupsItems> catalogProductGroups) {
    this.catalogProductGroups = catalogProductGroups;
  }

  /**
   * 
   * @return keywords
   */
  public List<KeywordsRequest> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<KeywordsRequest> keywords) {
    this.keywords = keywords;
  }

  /**
   * 
   * @return labels
   */
  public List<LabelBulkCreateRequest> getLabels() {
    return labels;
  }

  public void setLabels(List<LabelBulkCreateRequest> labels) {
    this.labels = labels;
  }

  /**
   * 
   * @return productGroups
   */
  public List<ProductGroupPromotionCreateRequest> getProductGroups() {
    return productGroups;
  }

  public void setProductGroups(List<ProductGroupPromotionCreateRequest> productGroups) {
    this.productGroups = productGroups;
  }

  /**
   * 
   * @return schedules
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

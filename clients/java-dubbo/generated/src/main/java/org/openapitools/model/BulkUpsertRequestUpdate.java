package org.openapitools.model;

import org.openapitools.model.AdGroupUpdateRequest;
import org.openapitools.model.AdUpdateRequest;
import org.openapitools.model.BulkUpsertRequestUpdateCatalogProductGroupsItems;
import org.openapitools.model.CampaignUpdateRequest;
import org.openapitools.model.KeywordUpdateGenerated;
import org.openapitools.model.LabelBulkUpdateRequest;
import org.openapitools.model.ProductGroupPromotionUpdateRequest;
import org.openapitools.model.ScheduleUpdateRequest;
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
public class BulkUpsertRequestUpdate implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("ad_groups")
  private List<AdGroupUpdateRequest> adGroups = new ArrayList<>();

  @JsonProperty("ads")
  private List<AdUpdateRequest> ads = new ArrayList<>();

  @JsonProperty("campaigns")
  private List<CampaignUpdateRequest> campaigns = new ArrayList<>();

  @JsonProperty("catalog_product_groups")
  private List<BulkUpsertRequestUpdateCatalogProductGroupsItems> catalogProductGroups = new ArrayList<>();

  @JsonProperty("keywords")
  private List<KeywordUpdateGenerated> keywords = new ArrayList<>();

  @JsonProperty("labels")
  private List<LabelBulkUpdateRequest> labels = new ArrayList<>();

  @JsonProperty("product_groups")
  private List<ProductGroupPromotionUpdateRequest> productGroups = new ArrayList<>();

  @JsonProperty("schedules")
  private List<ScheduleUpdateRequest> schedules = new ArrayList<>();

  /**
   * 
   * @return adGroups
   */
  public List<AdGroupUpdateRequest> getAdGroups() {
    return adGroups;
  }

  public void setAdGroups(List<AdGroupUpdateRequest> adGroups) {
    this.adGroups = adGroups;
  }

  /**
   * 
   * @return ads
   */
  public List<AdUpdateRequest> getAds() {
    return ads;
  }

  public void setAds(List<AdUpdateRequest> ads) {
    this.ads = ads;
  }

  /**
   * 
   * @return campaigns
   */
  public List<CampaignUpdateRequest> getCampaigns() {
    return campaigns;
  }

  public void setCampaigns(List<CampaignUpdateRequest> campaigns) {
    this.campaigns = campaigns;
  }

  /**
   * 
   * @return catalogProductGroups
   */
  public List<BulkUpsertRequestUpdateCatalogProductGroupsItems> getCatalogProductGroups() {
    return catalogProductGroups;
  }

  public void setCatalogProductGroups(List<BulkUpsertRequestUpdateCatalogProductGroupsItems> catalogProductGroups) {
    this.catalogProductGroups = catalogProductGroups;
  }

  /**
   * 
   * @return keywords
   */
  public List<KeywordUpdateGenerated> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<KeywordUpdateGenerated> keywords) {
    this.keywords = keywords;
  }

  /**
   * 
   * @return labels
   */
  public List<LabelBulkUpdateRequest> getLabels() {
    return labels;
  }

  public void setLabels(List<LabelBulkUpdateRequest> labels) {
    this.labels = labels;
  }

  /**
   * 
   * @return productGroups
   */
  public List<ProductGroupPromotionUpdateRequest> getProductGroups() {
    return productGroups;
  }

  public void setProductGroups(List<ProductGroupPromotionUpdateRequest> productGroups) {
    this.productGroups = productGroups;
  }

  /**
   * 
   * @return schedules
   */
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

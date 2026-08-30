package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

@ApiModel(description="Request for creation of entities in bulk.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BulkUpsertRequestUpdate   {
  
  private List<@Valid AdGroupUpdateRequest> adGroups = new ArrayList<>();
  private List<@Valid AdUpdateRequest> ads = new ArrayList<>();
  private List<@Valid CampaignUpdateRequest> campaigns = new ArrayList<>();
  private List<BulkUpsertRequestUpdateCatalogProductGroupsItems> catalogProductGroups = new ArrayList<>();
  private List<@Valid KeywordUpdateGenerated> keywords = new ArrayList<>();
  private List<@Valid LabelBulkUpdateRequest> labels = new ArrayList<>();
  private List<@Valid ProductGroupPromotionUpdateRequest> productGroups = new ArrayList<>();
  private List<@Valid ScheduleUpdateRequest> schedules = new ArrayList<>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ad_groups")
  public List<@Valid AdGroupUpdateRequest> getAdGroups() {
    return adGroups;
  }
  public void setAdGroups(List<@Valid AdGroupUpdateRequest> adGroups) {
    this.adGroups = adGroups;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ads")
  public List<@Valid AdUpdateRequest> getAds() {
    return ads;
  }
  public void setAds(List<@Valid AdUpdateRequest> ads) {
    this.ads = ads;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("campaigns")
  public List<@Valid CampaignUpdateRequest> getCampaigns() {
    return campaigns;
  }
  public void setCampaigns(List<@Valid CampaignUpdateRequest> campaigns) {
    this.campaigns = campaigns;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("catalog_product_groups")
  public List<BulkUpsertRequestUpdateCatalogProductGroupsItems> getCatalogProductGroups() {
    return catalogProductGroups;
  }
  public void setCatalogProductGroups(List<BulkUpsertRequestUpdateCatalogProductGroupsItems> catalogProductGroups) {
    this.catalogProductGroups = catalogProductGroups;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("keywords")
  public List<@Valid KeywordUpdateGenerated> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<@Valid KeywordUpdateGenerated> keywords) {
    this.keywords = keywords;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("labels")
  public List<@Valid LabelBulkUpdateRequest> getLabels() {
    return labels;
  }
  public void setLabels(List<@Valid LabelBulkUpdateRequest> labels) {
    this.labels = labels;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("product_groups")
  public List<@Valid ProductGroupPromotionUpdateRequest> getProductGroups() {
    return productGroups;
  }
  public void setProductGroups(List<@Valid ProductGroupPromotionUpdateRequest> productGroups) {
    this.productGroups = productGroups;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("schedules")
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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdGroupUpdateRequest;
import org.openapitools.model.AdUpdateRequest;
import org.openapitools.model.CampaignUpdateRequest;
import org.openapitools.model.CatalogsProductGroupsUpdateRequest;
import org.openapitools.model.KeywordUpdate;
import org.openapitools.model.LabelBulkUpdateRequest;
import org.openapitools.model.ProductGroupPromotionUpdateRequest;



/**
 * Request for creation of entities in bulk.
 **/

@ApiModel(description = "Request for creation of entities in bulk.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-31T04:51:24.974216359Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BulkUpsertRequestUpdate   {
  @JsonProperty("ad_groups")
  private List<AdGroupUpdateRequest> adGroups = null;

  @JsonProperty("ads")
  private List<AdUpdateRequest> ads = null;

  @JsonProperty("campaigns")
  private List<CampaignUpdateRequest> campaigns = null;

  @JsonProperty("catalog_product_groups")
  private List<CatalogsProductGroupsUpdateRequest> catalogProductGroups = null;

  @JsonProperty("keywords")
  private List<KeywordUpdate> keywords = null;

  @JsonProperty("labels")
  private List<LabelBulkUpdateRequest> labels = null;

  @JsonProperty("product_groups")
  private List<ProductGroupPromotionUpdateRequest> productGroups = null;

  /**
   **/
  public BulkUpsertRequestUpdate adGroups(List<AdGroupUpdateRequest> adGroups) {
    this.adGroups = adGroups;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ad_groups")
  public List<AdGroupUpdateRequest> getAdGroups() {
    return adGroups;
  }
  public void setAdGroups(List<AdGroupUpdateRequest> adGroups) {
    this.adGroups = adGroups;
  }

  /**
   **/
  public BulkUpsertRequestUpdate ads(List<AdUpdateRequest> ads) {
    this.ads = ads;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ads")
  public List<AdUpdateRequest> getAds() {
    return ads;
  }
  public void setAds(List<AdUpdateRequest> ads) {
    this.ads = ads;
  }

  /**
   **/
  public BulkUpsertRequestUpdate campaigns(List<CampaignUpdateRequest> campaigns) {
    this.campaigns = campaigns;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("campaigns")
  public List<CampaignUpdateRequest> getCampaigns() {
    return campaigns;
  }
  public void setCampaigns(List<CampaignUpdateRequest> campaigns) {
    this.campaigns = campaigns;
  }

  /**
   **/
  public BulkUpsertRequestUpdate catalogProductGroups(List<CatalogsProductGroupsUpdateRequest> catalogProductGroups) {
    this.catalogProductGroups = catalogProductGroups;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("catalog_product_groups")
  public List<CatalogsProductGroupsUpdateRequest> getCatalogProductGroups() {
    return catalogProductGroups;
  }
  public void setCatalogProductGroups(List<CatalogsProductGroupsUpdateRequest> catalogProductGroups) {
    this.catalogProductGroups = catalogProductGroups;
  }

  /**
   **/
  public BulkUpsertRequestUpdate keywords(List<KeywordUpdate> keywords) {
    this.keywords = keywords;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("keywords")
  public List<KeywordUpdate> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<KeywordUpdate> keywords) {
    this.keywords = keywords;
  }

  /**
   **/
  public BulkUpsertRequestUpdate labels(List<LabelBulkUpdateRequest> labels) {
    this.labels = labels;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("labels")
  public List<LabelBulkUpdateRequest> getLabels() {
    return labels;
  }
  public void setLabels(List<LabelBulkUpdateRequest> labels) {
    this.labels = labels;
  }

  /**
   **/
  public BulkUpsertRequestUpdate productGroups(List<ProductGroupPromotionUpdateRequest> productGroups) {
    this.productGroups = productGroups;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("product_groups")
  public List<ProductGroupPromotionUpdateRequest> getProductGroups() {
    return productGroups;
  }
  public void setProductGroups(List<ProductGroupPromotionUpdateRequest> productGroups) {
    this.productGroups = productGroups;
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
        Objects.equals(productGroups, bulkUpsertRequestUpdate.productGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroups, ads, campaigns, catalogProductGroups, keywords, labels, productGroups);
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
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


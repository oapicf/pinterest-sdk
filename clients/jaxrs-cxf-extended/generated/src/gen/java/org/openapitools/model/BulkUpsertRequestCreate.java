package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdCreateRequest;
import org.openapitools.model.AdGroupCreateRequest;
import org.openapitools.model.CampaignCreateRequest;
import org.openapitools.model.KeywordsRequest;
import org.openapitools.model.LabelCreateRequest;
import org.openapitools.model.MultipleProductGroupsInner;
import org.openapitools.model.ProductGroupPromotionCreateRequest;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Request for creation of entities in bulk.
 */
@ApiModel(description="Request for creation of entities in bulk.")

public class BulkUpsertRequestCreate  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid AdGroupCreateRequest> adGroups = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid AdCreateRequest> ads = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid CampaignCreateRequest> campaigns = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private List<MultipleProductGroupsInner> catalogProductGroups = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid KeywordsRequest> keywords = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid LabelCreateRequest> labels = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid ProductGroupPromotionCreateRequest> productGroups = new ArrayList<>();
 /**
  * Get adGroups
  * @return adGroups
  */
  @JsonProperty("ad_groups")
  public List<@Valid AdGroupCreateRequest> getAdGroups() {
    return adGroups;
  }

  /**
   * Sets the <code>adGroups</code> property.
   */
 public void setAdGroups(List<@Valid AdGroupCreateRequest> adGroups) {
    this.adGroups = adGroups;
  }

  /**
   * Sets the <code>adGroups</code> property.
   */
  public BulkUpsertRequestCreate adGroups(List<@Valid AdGroupCreateRequest> adGroups) {
    this.adGroups = adGroups;
    return this;
  }

  /**
   * Adds a new item to the <code>adGroups</code> list.
   */
  public BulkUpsertRequestCreate addAdGroupsItem(AdGroupCreateRequest adGroupsItem) {
    this.adGroups.add(adGroupsItem);
    return this;
  }

 /**
  * Get ads
  * @return ads
  */
  @JsonProperty("ads")
  public List<@Valid AdCreateRequest> getAds() {
    return ads;
  }

  /**
   * Sets the <code>ads</code> property.
   */
 public void setAds(List<@Valid AdCreateRequest> ads) {
    this.ads = ads;
  }

  /**
   * Sets the <code>ads</code> property.
   */
  public BulkUpsertRequestCreate ads(List<@Valid AdCreateRequest> ads) {
    this.ads = ads;
    return this;
  }

  /**
   * Adds a new item to the <code>ads</code> list.
   */
  public BulkUpsertRequestCreate addAdsItem(AdCreateRequest adsItem) {
    this.ads.add(adsItem);
    return this;
  }

 /**
  * Get campaigns
  * @return campaigns
  */
  @JsonProperty("campaigns")
  public List<@Valid CampaignCreateRequest> getCampaigns() {
    return campaigns;
  }

  /**
   * Sets the <code>campaigns</code> property.
   */
 public void setCampaigns(List<@Valid CampaignCreateRequest> campaigns) {
    this.campaigns = campaigns;
  }

  /**
   * Sets the <code>campaigns</code> property.
   */
  public BulkUpsertRequestCreate campaigns(List<@Valid CampaignCreateRequest> campaigns) {
    this.campaigns = campaigns;
    return this;
  }

  /**
   * Adds a new item to the <code>campaigns</code> list.
   */
  public BulkUpsertRequestCreate addCampaignsItem(CampaignCreateRequest campaignsItem) {
    this.campaigns.add(campaignsItem);
    return this;
  }

 /**
  * Get catalogProductGroups
  * @return catalogProductGroups
  */
  @JsonProperty("catalog_product_groups")
  public List<MultipleProductGroupsInner> getCatalogProductGroups() {
    return catalogProductGroups;
  }

  /**
   * Sets the <code>catalogProductGroups</code> property.
   */
 public void setCatalogProductGroups(List<MultipleProductGroupsInner> catalogProductGroups) {
    this.catalogProductGroups = catalogProductGroups;
  }

  /**
   * Sets the <code>catalogProductGroups</code> property.
   */
  public BulkUpsertRequestCreate catalogProductGroups(List<MultipleProductGroupsInner> catalogProductGroups) {
    this.catalogProductGroups = catalogProductGroups;
    return this;
  }

  /**
   * Adds a new item to the <code>catalogProductGroups</code> list.
   */
  public BulkUpsertRequestCreate addCatalogProductGroupsItem(MultipleProductGroupsInner catalogProductGroupsItem) {
    this.catalogProductGroups.add(catalogProductGroupsItem);
    return this;
  }

 /**
  * Get keywords
  * @return keywords
  */
  @JsonProperty("keywords")
  public List<@Valid KeywordsRequest> getKeywords() {
    return keywords;
  }

  /**
   * Sets the <code>keywords</code> property.
   */
 public void setKeywords(List<@Valid KeywordsRequest> keywords) {
    this.keywords = keywords;
  }

  /**
   * Sets the <code>keywords</code> property.
   */
  public BulkUpsertRequestCreate keywords(List<@Valid KeywordsRequest> keywords) {
    this.keywords = keywords;
    return this;
  }

  /**
   * Adds a new item to the <code>keywords</code> list.
   */
  public BulkUpsertRequestCreate addKeywordsItem(KeywordsRequest keywordsItem) {
    this.keywords.add(keywordsItem);
    return this;
  }

 /**
  * Get labels
  * @return labels
  */
  @JsonProperty("labels")
  public List<@Valid LabelCreateRequest> getLabels() {
    return labels;
  }

  /**
   * Sets the <code>labels</code> property.
   */
 public void setLabels(List<@Valid LabelCreateRequest> labels) {
    this.labels = labels;
  }

  /**
   * Sets the <code>labels</code> property.
   */
  public BulkUpsertRequestCreate labels(List<@Valid LabelCreateRequest> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Adds a new item to the <code>labels</code> list.
   */
  public BulkUpsertRequestCreate addLabelsItem(LabelCreateRequest labelsItem) {
    this.labels.add(labelsItem);
    return this;
  }

 /**
  * Get productGroups
  * @return productGroups
  */
  @JsonProperty("product_groups")
  public List<@Valid ProductGroupPromotionCreateRequest> getProductGroups() {
    return productGroups;
  }

  /**
   * Sets the <code>productGroups</code> property.
   */
 public void setProductGroups(List<@Valid ProductGroupPromotionCreateRequest> productGroups) {
    this.productGroups = productGroups;
  }

  /**
   * Sets the <code>productGroups</code> property.
   */
  public BulkUpsertRequestCreate productGroups(List<@Valid ProductGroupPromotionCreateRequest> productGroups) {
    this.productGroups = productGroups;
    return this;
  }

  /**
   * Adds a new item to the <code>productGroups</code> list.
   */
  public BulkUpsertRequestCreate addProductGroupsItem(ProductGroupPromotionCreateRequest productGroupsItem) {
    this.productGroups.add(productGroupsItem);
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
    BulkUpsertRequestCreate bulkUpsertRequestCreate = (BulkUpsertRequestCreate) o;
    return Objects.equals(this.adGroups, bulkUpsertRequestCreate.adGroups) &&
        Objects.equals(this.ads, bulkUpsertRequestCreate.ads) &&
        Objects.equals(this.campaigns, bulkUpsertRequestCreate.campaigns) &&
        Objects.equals(this.catalogProductGroups, bulkUpsertRequestCreate.catalogProductGroups) &&
        Objects.equals(this.keywords, bulkUpsertRequestCreate.keywords) &&
        Objects.equals(this.labels, bulkUpsertRequestCreate.labels) &&
        Objects.equals(this.productGroups, bulkUpsertRequestCreate.productGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroups, ads, campaigns, catalogProductGroups, keywords, labels, productGroups);
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
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AdCreateRequest;
import com.prokarma.pkmst.model.AdGroupCreateRequest;
import com.prokarma.pkmst.model.CampaignCreateRequest;
import com.prokarma.pkmst.model.KeywordsRequest;
import com.prokarma.pkmst.model.LabelCreateRequest;
import com.prokarma.pkmst.model.MultipleProductGroupsInner;
import com.prokarma.pkmst.model.ProductGroupPromotionCreateRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Request for creation of entities in bulk.
 */
@ApiModel(description = "Request for creation of entities in bulk.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-31T04:52:46.215362801Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BulkUpsertRequestCreate   {
  @JsonProperty("ad_groups")
  
  private List<AdGroupCreateRequest> adGroups = null;

  @JsonProperty("ads")
  
  private List<AdCreateRequest> ads = null;

  @JsonProperty("campaigns")
  
  private List<CampaignCreateRequest> campaigns = null;

  @JsonProperty("catalog_product_groups")
  
  private List<MultipleProductGroupsInner> catalogProductGroups = null;

  @JsonProperty("keywords")
  
  private List<KeywordsRequest> keywords = null;

  @JsonProperty("labels")
  
  private List<LabelCreateRequest> labels = null;

  @JsonProperty("product_groups")
  
  private List<ProductGroupPromotionCreateRequest> productGroups = null;

  public BulkUpsertRequestCreate adGroups(List<AdGroupCreateRequest> adGroups) {
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
  @ApiModelProperty(value = "")
  public List<AdGroupCreateRequest> getAdGroups() {
    return adGroups;
  }

  public void setAdGroups(List<AdGroupCreateRequest> adGroups) {
    this.adGroups = adGroups;
  }

  public BulkUpsertRequestCreate ads(List<AdCreateRequest> ads) {
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
  @ApiModelProperty(value = "")
  public List<AdCreateRequest> getAds() {
    return ads;
  }

  public void setAds(List<AdCreateRequest> ads) {
    this.ads = ads;
  }

  public BulkUpsertRequestCreate campaigns(List<CampaignCreateRequest> campaigns) {
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
  @ApiModelProperty(value = "")
  public List<CampaignCreateRequest> getCampaigns() {
    return campaigns;
  }

  public void setCampaigns(List<CampaignCreateRequest> campaigns) {
    this.campaigns = campaigns;
  }

  public BulkUpsertRequestCreate catalogProductGroups(List<MultipleProductGroupsInner> catalogProductGroups) {
    this.catalogProductGroups = catalogProductGroups;
    return this;
  }

  public BulkUpsertRequestCreate addCatalogProductGroupsItem(MultipleProductGroupsInner catalogProductGroupsItem) {
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
  @ApiModelProperty(value = "")
  public List<MultipleProductGroupsInner> getCatalogProductGroups() {
    return catalogProductGroups;
  }

  public void setCatalogProductGroups(List<MultipleProductGroupsInner> catalogProductGroups) {
    this.catalogProductGroups = catalogProductGroups;
  }

  public BulkUpsertRequestCreate keywords(List<KeywordsRequest> keywords) {
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
  @ApiModelProperty(value = "")
  public List<KeywordsRequest> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<KeywordsRequest> keywords) {
    this.keywords = keywords;
  }

  public BulkUpsertRequestCreate labels(List<LabelCreateRequest> labels) {
    this.labels = labels;
    return this;
  }

  public BulkUpsertRequestCreate addLabelsItem(LabelCreateRequest labelsItem) {
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
  @ApiModelProperty(value = "")
  public List<LabelCreateRequest> getLabels() {
    return labels;
  }

  public void setLabels(List<LabelCreateRequest> labels) {
    this.labels = labels;
  }

  public BulkUpsertRequestCreate productGroups(List<ProductGroupPromotionCreateRequest> productGroups) {
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
  @ApiModelProperty(value = "")
  public List<ProductGroupPromotionCreateRequest> getProductGroups() {
    return productGroups;
  }

  public void setProductGroups(List<ProductGroupPromotionCreateRequest> productGroups) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


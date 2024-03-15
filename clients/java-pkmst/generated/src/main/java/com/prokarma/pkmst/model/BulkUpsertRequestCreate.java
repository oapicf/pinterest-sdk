package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AdCreateRequest;
import com.prokarma.pkmst.model.AdGroupCreateRequest;
import com.prokarma.pkmst.model.CampaignCreateRequest;
import com.prokarma.pkmst.model.KeywordsRequest;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BulkUpsertRequestCreate   {
  @JsonProperty("campaigns")
  
  private List<CampaignCreateRequest> campaigns = null;

  @JsonProperty("ad_groups")
  
  private List<AdGroupCreateRequest> adGroups = null;

  @JsonProperty("ads")
  
  private List<AdCreateRequest> ads = null;

  @JsonProperty("product_groups")
  
  private List<ProductGroupPromotionCreateRequest> productGroups = null;

  @JsonProperty("keywords")
  
  private List<KeywordsRequest> keywords = null;

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
  **/
  @ApiModelProperty(value = "")
  public List<CampaignCreateRequest> getCampaigns() {
    return campaigns;
  }

  public void setCampaigns(List<CampaignCreateRequest> campaigns) {
    this.campaigns = campaigns;
  }

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
  **/
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
  **/
  @ApiModelProperty(value = "")
  public List<AdCreateRequest> getAds() {
    return ads;
  }

  public void setAds(List<AdCreateRequest> ads) {
    this.ads = ads;
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
  **/
  @ApiModelProperty(value = "")
  public List<ProductGroupPromotionCreateRequest> getProductGroups() {
    return productGroups;
  }

  public void setProductGroups(List<ProductGroupPromotionCreateRequest> productGroups) {
    this.productGroups = productGroups;
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
  **/
  @ApiModelProperty(value = "")
  public List<KeywordsRequest> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<KeywordsRequest> keywords) {
    this.keywords = keywords;
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
    return Objects.equals(this.campaigns, bulkUpsertRequestCreate.campaigns) &&
        Objects.equals(this.adGroups, bulkUpsertRequestCreate.adGroups) &&
        Objects.equals(this.ads, bulkUpsertRequestCreate.ads) &&
        Objects.equals(this.productGroups, bulkUpsertRequestCreate.productGroups) &&
        Objects.equals(this.keywords, bulkUpsertRequestCreate.keywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaigns, adGroups, ads, productGroups, keywords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkUpsertRequestCreate {\n");
    
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
    sb.append("    adGroups: ").append(toIndentedString(adGroups)).append("\n");
    sb.append("    ads: ").append(toIndentedString(ads)).append("\n");
    sb.append("    productGroups: ").append(toIndentedString(productGroups)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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


package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AdGroupUpdateRequest;
import com.prokarma.pkmst.model.AdUpdateRequest;
import com.prokarma.pkmst.model.CampaignUpdateRequest;
import com.prokarma.pkmst.model.KeywordUpdate;
import com.prokarma.pkmst.model.ProductGroupPromotionUpdateRequest;
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
public class BulkUpsertRequestUpdate   {
  @JsonProperty("campaigns")
  
  private List<CampaignUpdateRequest> campaigns = null;

  @JsonProperty("ad_groups")
  
  private List<AdGroupUpdateRequest> adGroups = null;

  @JsonProperty("ads")
  
  private List<AdUpdateRequest> ads = null;

  @JsonProperty("product_groups")
  
  private List<ProductGroupPromotionUpdateRequest> productGroups = null;

  @JsonProperty("keywords")
  
  private List<KeywordUpdate> keywords = null;

  public BulkUpsertRequestUpdate campaigns(List<CampaignUpdateRequest> campaigns) {
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
  **/
  @ApiModelProperty(value = "")
  public List<CampaignUpdateRequest> getCampaigns() {
    return campaigns;
  }

  public void setCampaigns(List<CampaignUpdateRequest> campaigns) {
    this.campaigns = campaigns;
  }

  public BulkUpsertRequestUpdate adGroups(List<AdGroupUpdateRequest> adGroups) {
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
  **/
  @ApiModelProperty(value = "")
  public List<AdGroupUpdateRequest> getAdGroups() {
    return adGroups;
  }

  public void setAdGroups(List<AdGroupUpdateRequest> adGroups) {
    this.adGroups = adGroups;
  }

  public BulkUpsertRequestUpdate ads(List<AdUpdateRequest> ads) {
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
  **/
  @ApiModelProperty(value = "")
  public List<AdUpdateRequest> getAds() {
    return ads;
  }

  public void setAds(List<AdUpdateRequest> ads) {
    this.ads = ads;
  }

  public BulkUpsertRequestUpdate productGroups(List<ProductGroupPromotionUpdateRequest> productGroups) {
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
  **/
  @ApiModelProperty(value = "")
  public List<ProductGroupPromotionUpdateRequest> getProductGroups() {
    return productGroups;
  }

  public void setProductGroups(List<ProductGroupPromotionUpdateRequest> productGroups) {
    this.productGroups = productGroups;
  }

  public BulkUpsertRequestUpdate keywords(List<KeywordUpdate> keywords) {
    this.keywords = keywords;
    return this;
  }

  public BulkUpsertRequestUpdate addKeywordsItem(KeywordUpdate keywordsItem) {
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
  public List<KeywordUpdate> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<KeywordUpdate> keywords) {
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
    BulkUpsertRequestUpdate bulkUpsertRequestUpdate = (BulkUpsertRequestUpdate) o;
    return Objects.equals(this.campaigns, bulkUpsertRequestUpdate.campaigns) &&
        Objects.equals(this.adGroups, bulkUpsertRequestUpdate.adGroups) &&
        Objects.equals(this.ads, bulkUpsertRequestUpdate.ads) &&
        Objects.equals(this.productGroups, bulkUpsertRequestUpdate.productGroups) &&
        Objects.equals(this.keywords, bulkUpsertRequestUpdate.keywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaigns, adGroups, ads, productGroups, keywords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkUpsertRequestUpdate {\n");
    
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


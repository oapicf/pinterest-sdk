package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdCreateRequest;
import org.openapitools.model.AdGroupCreateRequest;
import org.openapitools.model.CampaignCreateRequest;
import org.openapitools.model.KeywordsRequest;
import org.openapitools.model.ProductGroupPromotionCreateRequest;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Request for creation of entities in bulk.
 **/
@ApiModel(description = "Request for creation of entities in bulk.")
@JsonTypeName("BulkUpsertRequestCreate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BulkUpsertRequestCreate   {
  private @Valid List<@Valid CampaignCreateRequest> campaigns;
  private @Valid List<AdGroupCreateRequest> adGroups;
  private @Valid List<AdCreateRequest> ads;
  private @Valid List<@Valid ProductGroupPromotionCreateRequest> productGroups;
  private @Valid List<@Valid KeywordsRequest> keywords;

  /**
   **/
  public BulkUpsertRequestCreate campaigns(List<@Valid CampaignCreateRequest> campaigns) {
    this.campaigns = campaigns;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("campaigns")
  public List<CampaignCreateRequest> getCampaigns() {
    return campaigns;
  }

  @JsonProperty("campaigns")
  public void setCampaigns(List<@Valid CampaignCreateRequest> campaigns) {
    this.campaigns = campaigns;
  }

  public BulkUpsertRequestCreate addCampaignsItem(CampaignCreateRequest campaignsItem) {
    if (this.campaigns == null) {
      this.campaigns = new ArrayList<>();
    }

    this.campaigns.add(campaignsItem);
    return this;
  }

  public BulkUpsertRequestCreate removeCampaignsItem(CampaignCreateRequest campaignsItem) {
    if (campaignsItem != null && this.campaigns != null) {
      this.campaigns.remove(campaignsItem);
    }

    return this;
  }
  /**
   **/
  public BulkUpsertRequestCreate adGroups(List<AdGroupCreateRequest> adGroups) {
    this.adGroups = adGroups;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ad_groups")
  public List<AdGroupCreateRequest> getAdGroups() {
    return adGroups;
  }

  @JsonProperty("ad_groups")
  public void setAdGroups(List<AdGroupCreateRequest> adGroups) {
    this.adGroups = adGroups;
  }

  public BulkUpsertRequestCreate addAdGroupsItem(AdGroupCreateRequest adGroupsItem) {
    if (this.adGroups == null) {
      this.adGroups = new ArrayList<>();
    }

    this.adGroups.add(adGroupsItem);
    return this;
  }

  public BulkUpsertRequestCreate removeAdGroupsItem(AdGroupCreateRequest adGroupsItem) {
    if (adGroupsItem != null && this.adGroups != null) {
      this.adGroups.remove(adGroupsItem);
    }

    return this;
  }
  /**
   **/
  public BulkUpsertRequestCreate ads(List<AdCreateRequest> ads) {
    this.ads = ads;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ads")
  public List<AdCreateRequest> getAds() {
    return ads;
  }

  @JsonProperty("ads")
  public void setAds(List<AdCreateRequest> ads) {
    this.ads = ads;
  }

  public BulkUpsertRequestCreate addAdsItem(AdCreateRequest adsItem) {
    if (this.ads == null) {
      this.ads = new ArrayList<>();
    }

    this.ads.add(adsItem);
    return this;
  }

  public BulkUpsertRequestCreate removeAdsItem(AdCreateRequest adsItem) {
    if (adsItem != null && this.ads != null) {
      this.ads.remove(adsItem);
    }

    return this;
  }
  /**
   **/
  public BulkUpsertRequestCreate productGroups(List<@Valid ProductGroupPromotionCreateRequest> productGroups) {
    this.productGroups = productGroups;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("product_groups")
  public List<ProductGroupPromotionCreateRequest> getProductGroups() {
    return productGroups;
  }

  @JsonProperty("product_groups")
  public void setProductGroups(List<@Valid ProductGroupPromotionCreateRequest> productGroups) {
    this.productGroups = productGroups;
  }

  public BulkUpsertRequestCreate addProductGroupsItem(ProductGroupPromotionCreateRequest productGroupsItem) {
    if (this.productGroups == null) {
      this.productGroups = new ArrayList<>();
    }

    this.productGroups.add(productGroupsItem);
    return this;
  }

  public BulkUpsertRequestCreate removeProductGroupsItem(ProductGroupPromotionCreateRequest productGroupsItem) {
    if (productGroupsItem != null && this.productGroups != null) {
      this.productGroups.remove(productGroupsItem);
    }

    return this;
  }
  /**
   **/
  public BulkUpsertRequestCreate keywords(List<@Valid KeywordsRequest> keywords) {
    this.keywords = keywords;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("keywords")
  public List<KeywordsRequest> getKeywords() {
    return keywords;
  }

  @JsonProperty("keywords")
  public void setKeywords(List<@Valid KeywordsRequest> keywords) {
    this.keywords = keywords;
  }

  public BulkUpsertRequestCreate addKeywordsItem(KeywordsRequest keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }

    this.keywords.add(keywordsItem);
    return this;
  }

  public BulkUpsertRequestCreate removeKeywordsItem(KeywordsRequest keywordsItem) {
    if (keywordsItem != null && this.keywords != null) {
      this.keywords.remove(keywordsItem);
    }

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


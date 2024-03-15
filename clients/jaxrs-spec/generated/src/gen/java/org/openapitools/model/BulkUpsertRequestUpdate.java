package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdGroupUpdateRequest;
import org.openapitools.model.AdUpdateRequest;
import org.openapitools.model.CampaignUpdateRequest;
import org.openapitools.model.KeywordUpdate;
import org.openapitools.model.ProductGroupPromotionUpdateRequest;
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
@JsonTypeName("BulkUpsertRequestUpdate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BulkUpsertRequestUpdate   {
  private @Valid List<@Valid CampaignUpdateRequest> campaigns;
  private @Valid List<AdGroupUpdateRequest> adGroups;
  private @Valid List<AdUpdateRequest> ads;
  private @Valid List<@Valid ProductGroupPromotionUpdateRequest> productGroups;
  private @Valid List<@Valid KeywordUpdate> keywords;

  /**
   **/
  public BulkUpsertRequestUpdate campaigns(List<@Valid CampaignUpdateRequest> campaigns) {
    this.campaigns = campaigns;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("campaigns")
  public List<CampaignUpdateRequest> getCampaigns() {
    return campaigns;
  }

  @JsonProperty("campaigns")
  public void setCampaigns(List<@Valid CampaignUpdateRequest> campaigns) {
    this.campaigns = campaigns;
  }

  public BulkUpsertRequestUpdate addCampaignsItem(CampaignUpdateRequest campaignsItem) {
    if (this.campaigns == null) {
      this.campaigns = new ArrayList<>();
    }

    this.campaigns.add(campaignsItem);
    return this;
  }

  public BulkUpsertRequestUpdate removeCampaignsItem(CampaignUpdateRequest campaignsItem) {
    if (campaignsItem != null && this.campaigns != null) {
      this.campaigns.remove(campaignsItem);
    }

    return this;
  }
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

  @JsonProperty("ad_groups")
  public void setAdGroups(List<AdGroupUpdateRequest> adGroups) {
    this.adGroups = adGroups;
  }

  public BulkUpsertRequestUpdate addAdGroupsItem(AdGroupUpdateRequest adGroupsItem) {
    if (this.adGroups == null) {
      this.adGroups = new ArrayList<>();
    }

    this.adGroups.add(adGroupsItem);
    return this;
  }

  public BulkUpsertRequestUpdate removeAdGroupsItem(AdGroupUpdateRequest adGroupsItem) {
    if (adGroupsItem != null && this.adGroups != null) {
      this.adGroups.remove(adGroupsItem);
    }

    return this;
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

  @JsonProperty("ads")
  public void setAds(List<AdUpdateRequest> ads) {
    this.ads = ads;
  }

  public BulkUpsertRequestUpdate addAdsItem(AdUpdateRequest adsItem) {
    if (this.ads == null) {
      this.ads = new ArrayList<>();
    }

    this.ads.add(adsItem);
    return this;
  }

  public BulkUpsertRequestUpdate removeAdsItem(AdUpdateRequest adsItem) {
    if (adsItem != null && this.ads != null) {
      this.ads.remove(adsItem);
    }

    return this;
  }
  /**
   **/
  public BulkUpsertRequestUpdate productGroups(List<@Valid ProductGroupPromotionUpdateRequest> productGroups) {
    this.productGroups = productGroups;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("product_groups")
  public List<ProductGroupPromotionUpdateRequest> getProductGroups() {
    return productGroups;
  }

  @JsonProperty("product_groups")
  public void setProductGroups(List<@Valid ProductGroupPromotionUpdateRequest> productGroups) {
    this.productGroups = productGroups;
  }

  public BulkUpsertRequestUpdate addProductGroupsItem(ProductGroupPromotionUpdateRequest productGroupsItem) {
    if (this.productGroups == null) {
      this.productGroups = new ArrayList<>();
    }

    this.productGroups.add(productGroupsItem);
    return this;
  }

  public BulkUpsertRequestUpdate removeProductGroupsItem(ProductGroupPromotionUpdateRequest productGroupsItem) {
    if (productGroupsItem != null && this.productGroups != null) {
      this.productGroups.remove(productGroupsItem);
    }

    return this;
  }
  /**
   **/
  public BulkUpsertRequestUpdate keywords(List<@Valid KeywordUpdate> keywords) {
    this.keywords = keywords;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("keywords")
  public List<KeywordUpdate> getKeywords() {
    return keywords;
  }

  @JsonProperty("keywords")
  public void setKeywords(List<@Valid KeywordUpdate> keywords) {
    this.keywords = keywords;
  }

  public BulkUpsertRequestUpdate addKeywordsItem(KeywordUpdate keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }

    this.keywords.add(keywordsItem);
    return this;
  }

  public BulkUpsertRequestUpdate removeKeywordsItem(KeywordUpdate keywordsItem) {
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


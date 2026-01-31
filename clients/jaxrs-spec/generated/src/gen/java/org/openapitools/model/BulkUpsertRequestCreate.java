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
import org.openapitools.model.LabelCreateRequest;
import org.openapitools.model.MultipleProductGroupsInner;
import org.openapitools.model.ProductGroupPromotionCreateRequest;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Request for creation of entities in bulk.
 **/
@ApiModel(description = "Request for creation of entities in bulk.")
@JsonTypeName("BulkUpsertRequestCreate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BulkUpsertRequestCreate   {
  private @Valid List<@Valid AdGroupCreateRequest> adGroups = new ArrayList<>();
  private @Valid List<@Valid AdCreateRequest> ads = new ArrayList<>();
  private @Valid List<@Valid CampaignCreateRequest> campaigns = new ArrayList<>();
  private @Valid List<MultipleProductGroupsInner> catalogProductGroups = new ArrayList<>();
  private @Valid List<@Valid KeywordsRequest> keywords = new ArrayList<>();
  private @Valid List<@Valid LabelCreateRequest> labels = new ArrayList<>();
  private @Valid List<@Valid ProductGroupPromotionCreateRequest> productGroups = new ArrayList<>();

  public BulkUpsertRequestCreate() {
  }

  /**
   **/
  public BulkUpsertRequestCreate adGroups(List<@Valid AdGroupCreateRequest> adGroups) {
    this.adGroups = adGroups;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ad_groups")
  @Valid public List<@Valid AdGroupCreateRequest> getAdGroups() {
    return adGroups;
  }

  @JsonProperty("ad_groups")
  public void setAdGroups(List<@Valid AdGroupCreateRequest> adGroups) {
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
  public BulkUpsertRequestCreate ads(List<@Valid AdCreateRequest> ads) {
    this.ads = ads;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ads")
  @Valid public List<@Valid AdCreateRequest> getAds() {
    return ads;
  }

  @JsonProperty("ads")
  public void setAds(List<@Valid AdCreateRequest> ads) {
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
  public BulkUpsertRequestCreate campaigns(List<@Valid CampaignCreateRequest> campaigns) {
    this.campaigns = campaigns;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("campaigns")
  @Valid public List<@Valid CampaignCreateRequest> getCampaigns() {
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
  public BulkUpsertRequestCreate catalogProductGroups(List<MultipleProductGroupsInner> catalogProductGroups) {
    this.catalogProductGroups = catalogProductGroups;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("catalog_product_groups")
  @Valid public List<@Valid MultipleProductGroupsInner> getCatalogProductGroups() {
    return catalogProductGroups;
  }

  @JsonProperty("catalog_product_groups")
  public void setCatalogProductGroups(List<MultipleProductGroupsInner> catalogProductGroups) {
    this.catalogProductGroups = catalogProductGroups;
  }

  public BulkUpsertRequestCreate addCatalogProductGroupsItem(MultipleProductGroupsInner catalogProductGroupsItem) {
    if (this.catalogProductGroups == null) {
      this.catalogProductGroups = new ArrayList<>();
    }

    this.catalogProductGroups.add(catalogProductGroupsItem);
    return this;
  }

  public BulkUpsertRequestCreate removeCatalogProductGroupsItem(MultipleProductGroupsInner catalogProductGroupsItem) {
    if (catalogProductGroupsItem != null && this.catalogProductGroups != null) {
      this.catalogProductGroups.remove(catalogProductGroupsItem);
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
  @Valid public List<@Valid KeywordsRequest> getKeywords() {
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
  /**
   **/
  public BulkUpsertRequestCreate labels(List<@Valid LabelCreateRequest> labels) {
    this.labels = labels;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("labels")
  @Valid public List<@Valid LabelCreateRequest> getLabels() {
    return labels;
  }

  @JsonProperty("labels")
  public void setLabels(List<@Valid LabelCreateRequest> labels) {
    this.labels = labels;
  }

  public BulkUpsertRequestCreate addLabelsItem(LabelCreateRequest labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }

    this.labels.add(labelsItem);
    return this;
  }

  public BulkUpsertRequestCreate removeLabelsItem(LabelCreateRequest labelsItem) {
    if (labelsItem != null && this.labels != null) {
      this.labels.remove(labelsItem);
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
  @Valid public List<@Valid ProductGroupPromotionCreateRequest> getProductGroups() {
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


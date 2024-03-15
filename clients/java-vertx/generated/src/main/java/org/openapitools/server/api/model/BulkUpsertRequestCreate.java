package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.AdCreateRequest;
import org.openapitools.server.api.model.AdGroupCreateRequest;
import org.openapitools.server.api.model.CampaignCreateRequest;
import org.openapitools.server.api.model.KeywordsRequest;
import org.openapitools.server.api.model.ProductGroupPromotionCreateRequest;

/**
 * Request for creation of entities in bulk.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BulkUpsertRequestCreate   {
  
  private List<CampaignCreateRequest> campaigns;
  private List<AdGroupCreateRequest> adGroups;
  private List<AdCreateRequest> ads;
  private List<ProductGroupPromotionCreateRequest> productGroups;
  private List<KeywordsRequest> keywords;

  public BulkUpsertRequestCreate () {

  }

  public BulkUpsertRequestCreate (List<CampaignCreateRequest> campaigns, List<AdGroupCreateRequest> adGroups, List<AdCreateRequest> ads, List<ProductGroupPromotionCreateRequest> productGroups, List<KeywordsRequest> keywords) {
    this.campaigns = campaigns;
    this.adGroups = adGroups;
    this.ads = ads;
    this.productGroups = productGroups;
    this.keywords = keywords;
  }

    
  @JsonProperty("campaigns")
  public List<CampaignCreateRequest> getCampaigns() {
    return campaigns;
  }
  public void setCampaigns(List<CampaignCreateRequest> campaigns) {
    this.campaigns = campaigns;
  }

    
  @JsonProperty("ad_groups")
  public List<AdGroupCreateRequest> getAdGroups() {
    return adGroups;
  }
  public void setAdGroups(List<AdGroupCreateRequest> adGroups) {
    this.adGroups = adGroups;
  }

    
  @JsonProperty("ads")
  public List<AdCreateRequest> getAds() {
    return ads;
  }
  public void setAds(List<AdCreateRequest> ads) {
    this.ads = ads;
  }

    
  @JsonProperty("product_groups")
  public List<ProductGroupPromotionCreateRequest> getProductGroups() {
    return productGroups;
  }
  public void setProductGroups(List<ProductGroupPromotionCreateRequest> productGroups) {
    this.productGroups = productGroups;
  }

    
  @JsonProperty("keywords")
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
    return Objects.equals(campaigns, bulkUpsertRequestCreate.campaigns) &&
        Objects.equals(adGroups, bulkUpsertRequestCreate.adGroups) &&
        Objects.equals(ads, bulkUpsertRequestCreate.ads) &&
        Objects.equals(productGroups, bulkUpsertRequestCreate.productGroups) &&
        Objects.equals(keywords, bulkUpsertRequestCreate.keywords);
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

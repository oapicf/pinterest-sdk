package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AdCreateRequest;
import org.openapitools.vertxweb.server.model.AdGroupCreateRequest;
import org.openapitools.vertxweb.server.model.CampaignCreateRequest;
import org.openapitools.vertxweb.server.model.KeywordsRequest;
import org.openapitools.vertxweb.server.model.LabelCreateRequest;
import org.openapitools.vertxweb.server.model.MultipleProductGroupsInner;
import org.openapitools.vertxweb.server.model.ProductGroupPromotionCreateRequest;

/**
 * Request for creation of entities in bulk.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BulkUpsertRequestCreate   {
  
  private List<AdGroupCreateRequest> adGroups = new ArrayList<>();
  private List<AdCreateRequest> ads = new ArrayList<>();
  private List<CampaignCreateRequest> campaigns = new ArrayList<>();
  private List<MultipleProductGroupsInner> catalogProductGroups = new ArrayList<>();
  private List<KeywordsRequest> keywords = new ArrayList<>();
  private List<LabelCreateRequest> labels = new ArrayList<>();
  private List<ProductGroupPromotionCreateRequest> productGroups = new ArrayList<>();

  public BulkUpsertRequestCreate () {

  }

  public BulkUpsertRequestCreate (List<AdGroupCreateRequest> adGroups, List<AdCreateRequest> ads, List<CampaignCreateRequest> campaigns, List<MultipleProductGroupsInner> catalogProductGroups, List<KeywordsRequest> keywords, List<LabelCreateRequest> labels, List<ProductGroupPromotionCreateRequest> productGroups) {
    this.adGroups = adGroups;
    this.ads = ads;
    this.campaigns = campaigns;
    this.catalogProductGroups = catalogProductGroups;
    this.keywords = keywords;
    this.labels = labels;
    this.productGroups = productGroups;
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

    
  @JsonProperty("campaigns")
  public List<CampaignCreateRequest> getCampaigns() {
    return campaigns;
  }
  public void setCampaigns(List<CampaignCreateRequest> campaigns) {
    this.campaigns = campaigns;
  }

    
  @JsonProperty("catalog_product_groups")
  public List<MultipleProductGroupsInner> getCatalogProductGroups() {
    return catalogProductGroups;
  }
  public void setCatalogProductGroups(List<MultipleProductGroupsInner> catalogProductGroups) {
    this.catalogProductGroups = catalogProductGroups;
  }

    
  @JsonProperty("keywords")
  public List<KeywordsRequest> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<KeywordsRequest> keywords) {
    this.keywords = keywords;
  }

    
  @JsonProperty("labels")
  public List<LabelCreateRequest> getLabels() {
    return labels;
  }
  public void setLabels(List<LabelCreateRequest> labels) {
    this.labels = labels;
  }

    
  @JsonProperty("product_groups")
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
    return Objects.equals(adGroups, bulkUpsertRequestCreate.adGroups) &&
        Objects.equals(ads, bulkUpsertRequestCreate.ads) &&
        Objects.equals(campaigns, bulkUpsertRequestCreate.campaigns) &&
        Objects.equals(catalogProductGroups, bulkUpsertRequestCreate.catalogProductGroups) &&
        Objects.equals(keywords, bulkUpsertRequestCreate.keywords) &&
        Objects.equals(labels, bulkUpsertRequestCreate.labels) &&
        Objects.equals(productGroups, bulkUpsertRequestCreate.productGroups);
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

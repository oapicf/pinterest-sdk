package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AdGroupUpdateRequest;
import org.openapitools.vertxweb.server.model.AdUpdateRequest;
import org.openapitools.vertxweb.server.model.CampaignUpdateRequest;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupsUpdateRequest;
import org.openapitools.vertxweb.server.model.KeywordUpdate;
import org.openapitools.vertxweb.server.model.LabelBulkUpdateRequest;
import org.openapitools.vertxweb.server.model.ProductGroupPromotionUpdateRequest;

/**
 * Request for creation of entities in bulk.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BulkUpsertRequestUpdate   {
  
  private List<AdGroupUpdateRequest> adGroups = new ArrayList<>();
  private List<AdUpdateRequest> ads = new ArrayList<>();
  private List<CampaignUpdateRequest> campaigns = new ArrayList<>();
  private List<CatalogsProductGroupsUpdateRequest> catalogProductGroups = new ArrayList<>();
  private List<KeywordUpdate> keywords = new ArrayList<>();
  private List<LabelBulkUpdateRequest> labels = new ArrayList<>();
  private List<ProductGroupPromotionUpdateRequest> productGroups = new ArrayList<>();

  public BulkUpsertRequestUpdate () {

  }

  public BulkUpsertRequestUpdate (List<AdGroupUpdateRequest> adGroups, List<AdUpdateRequest> ads, List<CampaignUpdateRequest> campaigns, List<CatalogsProductGroupsUpdateRequest> catalogProductGroups, List<KeywordUpdate> keywords, List<LabelBulkUpdateRequest> labels, List<ProductGroupPromotionUpdateRequest> productGroups) {
    this.adGroups = adGroups;
    this.ads = ads;
    this.campaigns = campaigns;
    this.catalogProductGroups = catalogProductGroups;
    this.keywords = keywords;
    this.labels = labels;
    this.productGroups = productGroups;
  }

    
  @JsonProperty("ad_groups")
  public List<AdGroupUpdateRequest> getAdGroups() {
    return adGroups;
  }
  public void setAdGroups(List<AdGroupUpdateRequest> adGroups) {
    this.adGroups = adGroups;
  }

    
  @JsonProperty("ads")
  public List<AdUpdateRequest> getAds() {
    return ads;
  }
  public void setAds(List<AdUpdateRequest> ads) {
    this.ads = ads;
  }

    
  @JsonProperty("campaigns")
  public List<CampaignUpdateRequest> getCampaigns() {
    return campaigns;
  }
  public void setCampaigns(List<CampaignUpdateRequest> campaigns) {
    this.campaigns = campaigns;
  }

    
  @JsonProperty("catalog_product_groups")
  public List<CatalogsProductGroupsUpdateRequest> getCatalogProductGroups() {
    return catalogProductGroups;
  }
  public void setCatalogProductGroups(List<CatalogsProductGroupsUpdateRequest> catalogProductGroups) {
    this.catalogProductGroups = catalogProductGroups;
  }

    
  @JsonProperty("keywords")
  public List<KeywordUpdate> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<KeywordUpdate> keywords) {
    this.keywords = keywords;
  }

    
  @JsonProperty("labels")
  public List<LabelBulkUpdateRequest> getLabels() {
    return labels;
  }
  public void setLabels(List<LabelBulkUpdateRequest> labels) {
    this.labels = labels;
  }

    
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

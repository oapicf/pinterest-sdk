/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.AdCreateRequest;
import org.openapitools.client.model.AdGroupCreateRequest;
import org.openapitools.client.model.CampaignCreateRequest;
import org.openapitools.client.model.KeywordsRequest;
import org.openapitools.client.model.ProductGroupPromotionCreateRequest;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for creation of entities in bulk.
 **/
@ApiModel(description = "Request for creation of entities in bulk.")
public class BulkUpsertRequestCreate {
  
  @SerializedName("campaigns")
  private List<CampaignCreateRequest> campaigns = null;
  @SerializedName("ad_groups")
  private List<AdGroupCreateRequest> adGroups = null;
  @SerializedName("ads")
  private List<AdCreateRequest> ads = null;
  @SerializedName("product_groups")
  private List<ProductGroupPromotionCreateRequest> productGroups = null;
  @SerializedName("keywords")
  private List<KeywordsRequest> keywords = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CampaignCreateRequest> getCampaigns() {
    return campaigns;
  }
  public void setCampaigns(List<CampaignCreateRequest> campaigns) {
    this.campaigns = campaigns;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<AdGroupCreateRequest> getAdGroups() {
    return adGroups;
  }
  public void setAdGroups(List<AdGroupCreateRequest> adGroups) {
    this.adGroups = adGroups;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<AdCreateRequest> getAds() {
    return ads;
  }
  public void setAds(List<AdCreateRequest> ads) {
    this.ads = ads;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ProductGroupPromotionCreateRequest> getProductGroups() {
    return productGroups;
  }
  public void setProductGroups(List<ProductGroupPromotionCreateRequest> productGroups) {
    this.productGroups = productGroups;
  }

  /**
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
    return (this.campaigns == null ? bulkUpsertRequestCreate.campaigns == null : this.campaigns.equals(bulkUpsertRequestCreate.campaigns)) &&
        (this.adGroups == null ? bulkUpsertRequestCreate.adGroups == null : this.adGroups.equals(bulkUpsertRequestCreate.adGroups)) &&
        (this.ads == null ? bulkUpsertRequestCreate.ads == null : this.ads.equals(bulkUpsertRequestCreate.ads)) &&
        (this.productGroups == null ? bulkUpsertRequestCreate.productGroups == null : this.productGroups.equals(bulkUpsertRequestCreate.productGroups)) &&
        (this.keywords == null ? bulkUpsertRequestCreate.keywords == null : this.keywords.equals(bulkUpsertRequestCreate.keywords));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.campaigns == null ? 0: this.campaigns.hashCode());
    result = 31 * result + (this.adGroups == null ? 0: this.adGroups.hashCode());
    result = 31 * result + (this.ads == null ? 0: this.ads.hashCode());
    result = 31 * result + (this.productGroups == null ? 0: this.productGroups.hashCode());
    result = 31 * result + (this.keywords == null ? 0: this.keywords.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkUpsertRequestCreate {\n");
    
    sb.append("  campaigns: ").append(campaigns).append("\n");
    sb.append("  adGroups: ").append(adGroups).append("\n");
    sb.append("  ads: ").append(ads).append("\n");
    sb.append("  productGroups: ").append(productGroups).append("\n");
    sb.append("  keywords: ").append(keywords).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

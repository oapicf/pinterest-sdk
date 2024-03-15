package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

@ApiModel(description="Request for creation of entities in bulk.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-03-14T23:04:54.712028318Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BulkUpsertRequestCreate   {
  
  private List<@Valid CampaignCreateRequest> campaigns;
  private List<AdGroupCreateRequest> adGroups;
  private List<AdCreateRequest> ads;
  private List<@Valid ProductGroupPromotionCreateRequest> productGroups;
  private List<@Valid KeywordsRequest> keywords;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("campaigns")
  public List<@Valid CampaignCreateRequest> getCampaigns() {
    return campaigns;
  }
  public void setCampaigns(List<@Valid CampaignCreateRequest> campaigns) {
    this.campaigns = campaigns;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ad_groups")
  public List<AdGroupCreateRequest> getAdGroups() {
    return adGroups;
  }
  public void setAdGroups(List<AdGroupCreateRequest> adGroups) {
    this.adGroups = adGroups;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ads")
  public List<AdCreateRequest> getAds() {
    return ads;
  }
  public void setAds(List<AdCreateRequest> ads) {
    this.ads = ads;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("product_groups")
  public List<@Valid ProductGroupPromotionCreateRequest> getProductGroups() {
    return productGroups;
  }
  public void setProductGroups(List<@Valid ProductGroupPromotionCreateRequest> productGroups) {
    this.productGroups = productGroups;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("keywords")
  public List<@Valid KeywordsRequest> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<@Valid KeywordsRequest> keywords) {
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


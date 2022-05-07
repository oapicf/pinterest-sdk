package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2022-05-07T06:38:14.669946Z[Etc/UTC]")
public class CatalogsFeedValidationErrors   {
  @JsonProperty("fetch_error")
  private Integer fetchError;

  @JsonProperty("fetch_inactive_feed_error")
  private Integer fetchInactiveFeedError;

  @JsonProperty("encoding_error")
  private Integer encodingError;

  @JsonProperty("delimiter_error")
  private Integer delimiterError;

  @JsonProperty("required_columns_missing")
  private Integer requiredColumnsMissing;

  @JsonProperty("image_link_invalid")
  private Integer imageLinkInvalid;

  @JsonProperty("itemid_missing")
  private Integer itemidMissing;

  @JsonProperty("title_missing")
  private Integer titleMissing;

  @JsonProperty("description_missing")
  private Integer descriptionMissing;

  @JsonProperty("product_category_invalid")
  private Integer productCategoryInvalid;

  @JsonProperty("product_link_missing")
  private Integer productLinkMissing;

  @JsonProperty("image_link_missing")
  private Integer imageLinkMissing;

  @JsonProperty("availability_invalid")
  private Integer availabilityInvalid;

  @JsonProperty("product_price_invalid")
  private Integer productPriceInvalid;

  @JsonProperty("link_format_invalid")
  private Integer linkFormatInvalid;

  @JsonProperty("parse_line_error")
  private Integer parseLineError;

  @JsonProperty("adwords_format_invalid")
  private Integer adwordsFormatInvalid;

  @JsonProperty("product_category_missing")
  private Integer productCategoryMissing;

  @JsonProperty("internal_service_error")
  private Integer internalServiceError;

  @JsonProperty("no_verified_domain")
  private Integer noVerifiedDomain;

  @JsonProperty("adult_invalid")
  private Integer adultInvalid;

  @JsonProperty("invalid_domain")
  private Integer invalidDomain;

  @JsonProperty("feed_length_too_long")
  private Integer feedLengthTooLong;

  @JsonProperty("link_length_too_long")
  private Integer linkLengthTooLong;

  @JsonProperty("malformed_xml")
  private Integer malformedXml;

  @JsonProperty("redirect_invalid")
  private Integer redirectInvalid;

  @JsonProperty("price_missing")
  private Integer priceMissing;

  @JsonProperty("feed_too_small")
  private Integer feedTooSmall;

  @JsonProperty("condition_invalid")
  private Integer conditionInvalid;

  @JsonProperty("shopify_no_products")
  private Integer shopifyNoProducts;

  @JsonProperty("max_items_per_item_group_exceeded")
  private Integer maxItemsPerItemGroupExceeded;

  @JsonProperty("item_main_image_download_failure")
  private Integer itemMainImageDownloadFailure;

  @JsonProperty("pinjoin_content_unsafe")
  private Integer pinjoinContentUnsafe;

  @JsonProperty("blocklisted_image_signature")
  private Integer blocklistedImageSignature;

  /**
   **/
  public CatalogsFeedValidationErrors fetchError(Integer fetchError) {
    this.fetchError = fetchError;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fetch_error")
  public Integer getFetchError() {
    return fetchError;
  }
  public void setFetchError(Integer fetchError) {
    this.fetchError = fetchError;
  }

  /**
   **/
  public CatalogsFeedValidationErrors fetchInactiveFeedError(Integer fetchInactiveFeedError) {
    this.fetchInactiveFeedError = fetchInactiveFeedError;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fetch_inactive_feed_error")
  public Integer getFetchInactiveFeedError() {
    return fetchInactiveFeedError;
  }
  public void setFetchInactiveFeedError(Integer fetchInactiveFeedError) {
    this.fetchInactiveFeedError = fetchInactiveFeedError;
  }

  /**
   **/
  public CatalogsFeedValidationErrors encodingError(Integer encodingError) {
    this.encodingError = encodingError;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("encoding_error")
  public Integer getEncodingError() {
    return encodingError;
  }
  public void setEncodingError(Integer encodingError) {
    this.encodingError = encodingError;
  }

  /**
   **/
  public CatalogsFeedValidationErrors delimiterError(Integer delimiterError) {
    this.delimiterError = delimiterError;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("delimiter_error")
  public Integer getDelimiterError() {
    return delimiterError;
  }
  public void setDelimiterError(Integer delimiterError) {
    this.delimiterError = delimiterError;
  }

  /**
   **/
  public CatalogsFeedValidationErrors requiredColumnsMissing(Integer requiredColumnsMissing) {
    this.requiredColumnsMissing = requiredColumnsMissing;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("required_columns_missing")
  public Integer getRequiredColumnsMissing() {
    return requiredColumnsMissing;
  }
  public void setRequiredColumnsMissing(Integer requiredColumnsMissing) {
    this.requiredColumnsMissing = requiredColumnsMissing;
  }

  /**
   **/
  public CatalogsFeedValidationErrors imageLinkInvalid(Integer imageLinkInvalid) {
    this.imageLinkInvalid = imageLinkInvalid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("image_link_invalid")
  public Integer getImageLinkInvalid() {
    return imageLinkInvalid;
  }
  public void setImageLinkInvalid(Integer imageLinkInvalid) {
    this.imageLinkInvalid = imageLinkInvalid;
  }

  /**
   **/
  public CatalogsFeedValidationErrors itemidMissing(Integer itemidMissing) {
    this.itemidMissing = itemidMissing;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("itemid_missing")
  public Integer getItemidMissing() {
    return itemidMissing;
  }
  public void setItemidMissing(Integer itemidMissing) {
    this.itemidMissing = itemidMissing;
  }

  /**
   **/
  public CatalogsFeedValidationErrors titleMissing(Integer titleMissing) {
    this.titleMissing = titleMissing;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("title_missing")
  public Integer getTitleMissing() {
    return titleMissing;
  }
  public void setTitleMissing(Integer titleMissing) {
    this.titleMissing = titleMissing;
  }

  /**
   **/
  public CatalogsFeedValidationErrors descriptionMissing(Integer descriptionMissing) {
    this.descriptionMissing = descriptionMissing;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description_missing")
  public Integer getDescriptionMissing() {
    return descriptionMissing;
  }
  public void setDescriptionMissing(Integer descriptionMissing) {
    this.descriptionMissing = descriptionMissing;
  }

  /**
   **/
  public CatalogsFeedValidationErrors productCategoryInvalid(Integer productCategoryInvalid) {
    this.productCategoryInvalid = productCategoryInvalid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("product_category_invalid")
  public Integer getProductCategoryInvalid() {
    return productCategoryInvalid;
  }
  public void setProductCategoryInvalid(Integer productCategoryInvalid) {
    this.productCategoryInvalid = productCategoryInvalid;
  }

  /**
   **/
  public CatalogsFeedValidationErrors productLinkMissing(Integer productLinkMissing) {
    this.productLinkMissing = productLinkMissing;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("product_link_missing")
  public Integer getProductLinkMissing() {
    return productLinkMissing;
  }
  public void setProductLinkMissing(Integer productLinkMissing) {
    this.productLinkMissing = productLinkMissing;
  }

  /**
   **/
  public CatalogsFeedValidationErrors imageLinkMissing(Integer imageLinkMissing) {
    this.imageLinkMissing = imageLinkMissing;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("image_link_missing")
  public Integer getImageLinkMissing() {
    return imageLinkMissing;
  }
  public void setImageLinkMissing(Integer imageLinkMissing) {
    this.imageLinkMissing = imageLinkMissing;
  }

  /**
   **/
  public CatalogsFeedValidationErrors availabilityInvalid(Integer availabilityInvalid) {
    this.availabilityInvalid = availabilityInvalid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("availability_invalid")
  public Integer getAvailabilityInvalid() {
    return availabilityInvalid;
  }
  public void setAvailabilityInvalid(Integer availabilityInvalid) {
    this.availabilityInvalid = availabilityInvalid;
  }

  /**
   **/
  public CatalogsFeedValidationErrors productPriceInvalid(Integer productPriceInvalid) {
    this.productPriceInvalid = productPriceInvalid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("product_price_invalid")
  public Integer getProductPriceInvalid() {
    return productPriceInvalid;
  }
  public void setProductPriceInvalid(Integer productPriceInvalid) {
    this.productPriceInvalid = productPriceInvalid;
  }

  /**
   **/
  public CatalogsFeedValidationErrors linkFormatInvalid(Integer linkFormatInvalid) {
    this.linkFormatInvalid = linkFormatInvalid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("link_format_invalid")
  public Integer getLinkFormatInvalid() {
    return linkFormatInvalid;
  }
  public void setLinkFormatInvalid(Integer linkFormatInvalid) {
    this.linkFormatInvalid = linkFormatInvalid;
  }

  /**
   **/
  public CatalogsFeedValidationErrors parseLineError(Integer parseLineError) {
    this.parseLineError = parseLineError;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("parse_line_error")
  public Integer getParseLineError() {
    return parseLineError;
  }
  public void setParseLineError(Integer parseLineError) {
    this.parseLineError = parseLineError;
  }

  /**
   **/
  public CatalogsFeedValidationErrors adwordsFormatInvalid(Integer adwordsFormatInvalid) {
    this.adwordsFormatInvalid = adwordsFormatInvalid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("adwords_format_invalid")
  public Integer getAdwordsFormatInvalid() {
    return adwordsFormatInvalid;
  }
  public void setAdwordsFormatInvalid(Integer adwordsFormatInvalid) {
    this.adwordsFormatInvalid = adwordsFormatInvalid;
  }

  /**
   **/
  public CatalogsFeedValidationErrors productCategoryMissing(Integer productCategoryMissing) {
    this.productCategoryMissing = productCategoryMissing;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("product_category_missing")
  public Integer getProductCategoryMissing() {
    return productCategoryMissing;
  }
  public void setProductCategoryMissing(Integer productCategoryMissing) {
    this.productCategoryMissing = productCategoryMissing;
  }

  /**
   **/
  public CatalogsFeedValidationErrors internalServiceError(Integer internalServiceError) {
    this.internalServiceError = internalServiceError;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("internal_service_error")
  public Integer getInternalServiceError() {
    return internalServiceError;
  }
  public void setInternalServiceError(Integer internalServiceError) {
    this.internalServiceError = internalServiceError;
  }

  /**
   **/
  public CatalogsFeedValidationErrors noVerifiedDomain(Integer noVerifiedDomain) {
    this.noVerifiedDomain = noVerifiedDomain;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("no_verified_domain")
  public Integer getNoVerifiedDomain() {
    return noVerifiedDomain;
  }
  public void setNoVerifiedDomain(Integer noVerifiedDomain) {
    this.noVerifiedDomain = noVerifiedDomain;
  }

  /**
   **/
  public CatalogsFeedValidationErrors adultInvalid(Integer adultInvalid) {
    this.adultInvalid = adultInvalid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("adult_invalid")
  public Integer getAdultInvalid() {
    return adultInvalid;
  }
  public void setAdultInvalid(Integer adultInvalid) {
    this.adultInvalid = adultInvalid;
  }

  /**
   **/
  public CatalogsFeedValidationErrors invalidDomain(Integer invalidDomain) {
    this.invalidDomain = invalidDomain;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("invalid_domain")
  public Integer getInvalidDomain() {
    return invalidDomain;
  }
  public void setInvalidDomain(Integer invalidDomain) {
    this.invalidDomain = invalidDomain;
  }

  /**
   **/
  public CatalogsFeedValidationErrors feedLengthTooLong(Integer feedLengthTooLong) {
    this.feedLengthTooLong = feedLengthTooLong;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("feed_length_too_long")
  public Integer getFeedLengthTooLong() {
    return feedLengthTooLong;
  }
  public void setFeedLengthTooLong(Integer feedLengthTooLong) {
    this.feedLengthTooLong = feedLengthTooLong;
  }

  /**
   **/
  public CatalogsFeedValidationErrors linkLengthTooLong(Integer linkLengthTooLong) {
    this.linkLengthTooLong = linkLengthTooLong;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("link_length_too_long")
  public Integer getLinkLengthTooLong() {
    return linkLengthTooLong;
  }
  public void setLinkLengthTooLong(Integer linkLengthTooLong) {
    this.linkLengthTooLong = linkLengthTooLong;
  }

  /**
   **/
  public CatalogsFeedValidationErrors malformedXml(Integer malformedXml) {
    this.malformedXml = malformedXml;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("malformed_xml")
  public Integer getMalformedXml() {
    return malformedXml;
  }
  public void setMalformedXml(Integer malformedXml) {
    this.malformedXml = malformedXml;
  }

  /**
   **/
  public CatalogsFeedValidationErrors redirectInvalid(Integer redirectInvalid) {
    this.redirectInvalid = redirectInvalid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("redirect_invalid")
  public Integer getRedirectInvalid() {
    return redirectInvalid;
  }
  public void setRedirectInvalid(Integer redirectInvalid) {
    this.redirectInvalid = redirectInvalid;
  }

  /**
   **/
  public CatalogsFeedValidationErrors priceMissing(Integer priceMissing) {
    this.priceMissing = priceMissing;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("price_missing")
  public Integer getPriceMissing() {
    return priceMissing;
  }
  public void setPriceMissing(Integer priceMissing) {
    this.priceMissing = priceMissing;
  }

  /**
   **/
  public CatalogsFeedValidationErrors feedTooSmall(Integer feedTooSmall) {
    this.feedTooSmall = feedTooSmall;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("feed_too_small")
  public Integer getFeedTooSmall() {
    return feedTooSmall;
  }
  public void setFeedTooSmall(Integer feedTooSmall) {
    this.feedTooSmall = feedTooSmall;
  }

  /**
   **/
  public CatalogsFeedValidationErrors conditionInvalid(Integer conditionInvalid) {
    this.conditionInvalid = conditionInvalid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("condition_invalid")
  public Integer getConditionInvalid() {
    return conditionInvalid;
  }
  public void setConditionInvalid(Integer conditionInvalid) {
    this.conditionInvalid = conditionInvalid;
  }

  /**
   **/
  public CatalogsFeedValidationErrors shopifyNoProducts(Integer shopifyNoProducts) {
    this.shopifyNoProducts = shopifyNoProducts;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("shopify_no_products")
  public Integer getShopifyNoProducts() {
    return shopifyNoProducts;
  }
  public void setShopifyNoProducts(Integer shopifyNoProducts) {
    this.shopifyNoProducts = shopifyNoProducts;
  }

  /**
   **/
  public CatalogsFeedValidationErrors maxItemsPerItemGroupExceeded(Integer maxItemsPerItemGroupExceeded) {
    this.maxItemsPerItemGroupExceeded = maxItemsPerItemGroupExceeded;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("max_items_per_item_group_exceeded")
  public Integer getMaxItemsPerItemGroupExceeded() {
    return maxItemsPerItemGroupExceeded;
  }
  public void setMaxItemsPerItemGroupExceeded(Integer maxItemsPerItemGroupExceeded) {
    this.maxItemsPerItemGroupExceeded = maxItemsPerItemGroupExceeded;
  }

  /**
   **/
  public CatalogsFeedValidationErrors itemMainImageDownloadFailure(Integer itemMainImageDownloadFailure) {
    this.itemMainImageDownloadFailure = itemMainImageDownloadFailure;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("item_main_image_download_failure")
  public Integer getItemMainImageDownloadFailure() {
    return itemMainImageDownloadFailure;
  }
  public void setItemMainImageDownloadFailure(Integer itemMainImageDownloadFailure) {
    this.itemMainImageDownloadFailure = itemMainImageDownloadFailure;
  }

  /**
   **/
  public CatalogsFeedValidationErrors pinjoinContentUnsafe(Integer pinjoinContentUnsafe) {
    this.pinjoinContentUnsafe = pinjoinContentUnsafe;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pinjoin_content_unsafe")
  public Integer getPinjoinContentUnsafe() {
    return pinjoinContentUnsafe;
  }
  public void setPinjoinContentUnsafe(Integer pinjoinContentUnsafe) {
    this.pinjoinContentUnsafe = pinjoinContentUnsafe;
  }

  /**
   **/
  public CatalogsFeedValidationErrors blocklistedImageSignature(Integer blocklistedImageSignature) {
    this.blocklistedImageSignature = blocklistedImageSignature;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("blocklisted_image_signature")
  public Integer getBlocklistedImageSignature() {
    return blocklistedImageSignature;
  }
  public void setBlocklistedImageSignature(Integer blocklistedImageSignature) {
    this.blocklistedImageSignature = blocklistedImageSignature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsFeedValidationErrors catalogsFeedValidationErrors = (CatalogsFeedValidationErrors) o;
    return Objects.equals(fetchError, catalogsFeedValidationErrors.fetchError) &&
        Objects.equals(fetchInactiveFeedError, catalogsFeedValidationErrors.fetchInactiveFeedError) &&
        Objects.equals(encodingError, catalogsFeedValidationErrors.encodingError) &&
        Objects.equals(delimiterError, catalogsFeedValidationErrors.delimiterError) &&
        Objects.equals(requiredColumnsMissing, catalogsFeedValidationErrors.requiredColumnsMissing) &&
        Objects.equals(imageLinkInvalid, catalogsFeedValidationErrors.imageLinkInvalid) &&
        Objects.equals(itemidMissing, catalogsFeedValidationErrors.itemidMissing) &&
        Objects.equals(titleMissing, catalogsFeedValidationErrors.titleMissing) &&
        Objects.equals(descriptionMissing, catalogsFeedValidationErrors.descriptionMissing) &&
        Objects.equals(productCategoryInvalid, catalogsFeedValidationErrors.productCategoryInvalid) &&
        Objects.equals(productLinkMissing, catalogsFeedValidationErrors.productLinkMissing) &&
        Objects.equals(imageLinkMissing, catalogsFeedValidationErrors.imageLinkMissing) &&
        Objects.equals(availabilityInvalid, catalogsFeedValidationErrors.availabilityInvalid) &&
        Objects.equals(productPriceInvalid, catalogsFeedValidationErrors.productPriceInvalid) &&
        Objects.equals(linkFormatInvalid, catalogsFeedValidationErrors.linkFormatInvalid) &&
        Objects.equals(parseLineError, catalogsFeedValidationErrors.parseLineError) &&
        Objects.equals(adwordsFormatInvalid, catalogsFeedValidationErrors.adwordsFormatInvalid) &&
        Objects.equals(productCategoryMissing, catalogsFeedValidationErrors.productCategoryMissing) &&
        Objects.equals(internalServiceError, catalogsFeedValidationErrors.internalServiceError) &&
        Objects.equals(noVerifiedDomain, catalogsFeedValidationErrors.noVerifiedDomain) &&
        Objects.equals(adultInvalid, catalogsFeedValidationErrors.adultInvalid) &&
        Objects.equals(invalidDomain, catalogsFeedValidationErrors.invalidDomain) &&
        Objects.equals(feedLengthTooLong, catalogsFeedValidationErrors.feedLengthTooLong) &&
        Objects.equals(linkLengthTooLong, catalogsFeedValidationErrors.linkLengthTooLong) &&
        Objects.equals(malformedXml, catalogsFeedValidationErrors.malformedXml) &&
        Objects.equals(redirectInvalid, catalogsFeedValidationErrors.redirectInvalid) &&
        Objects.equals(priceMissing, catalogsFeedValidationErrors.priceMissing) &&
        Objects.equals(feedTooSmall, catalogsFeedValidationErrors.feedTooSmall) &&
        Objects.equals(conditionInvalid, catalogsFeedValidationErrors.conditionInvalid) &&
        Objects.equals(shopifyNoProducts, catalogsFeedValidationErrors.shopifyNoProducts) &&
        Objects.equals(maxItemsPerItemGroupExceeded, catalogsFeedValidationErrors.maxItemsPerItemGroupExceeded) &&
        Objects.equals(itemMainImageDownloadFailure, catalogsFeedValidationErrors.itemMainImageDownloadFailure) &&
        Objects.equals(pinjoinContentUnsafe, catalogsFeedValidationErrors.pinjoinContentUnsafe) &&
        Objects.equals(blocklistedImageSignature, catalogsFeedValidationErrors.blocklistedImageSignature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fetchError, fetchInactiveFeedError, encodingError, delimiterError, requiredColumnsMissing, imageLinkInvalid, itemidMissing, titleMissing, descriptionMissing, productCategoryInvalid, productLinkMissing, imageLinkMissing, availabilityInvalid, productPriceInvalid, linkFormatInvalid, parseLineError, adwordsFormatInvalid, productCategoryMissing, internalServiceError, noVerifiedDomain, adultInvalid, invalidDomain, feedLengthTooLong, linkLengthTooLong, malformedXml, redirectInvalid, priceMissing, feedTooSmall, conditionInvalid, shopifyNoProducts, maxItemsPerItemGroupExceeded, itemMainImageDownloadFailure, pinjoinContentUnsafe, blocklistedImageSignature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedValidationErrors {\n");
    
    sb.append("    fetchError: ").append(toIndentedString(fetchError)).append("\n");
    sb.append("    fetchInactiveFeedError: ").append(toIndentedString(fetchInactiveFeedError)).append("\n");
    sb.append("    encodingError: ").append(toIndentedString(encodingError)).append("\n");
    sb.append("    delimiterError: ").append(toIndentedString(delimiterError)).append("\n");
    sb.append("    requiredColumnsMissing: ").append(toIndentedString(requiredColumnsMissing)).append("\n");
    sb.append("    imageLinkInvalid: ").append(toIndentedString(imageLinkInvalid)).append("\n");
    sb.append("    itemidMissing: ").append(toIndentedString(itemidMissing)).append("\n");
    sb.append("    titleMissing: ").append(toIndentedString(titleMissing)).append("\n");
    sb.append("    descriptionMissing: ").append(toIndentedString(descriptionMissing)).append("\n");
    sb.append("    productCategoryInvalid: ").append(toIndentedString(productCategoryInvalid)).append("\n");
    sb.append("    productLinkMissing: ").append(toIndentedString(productLinkMissing)).append("\n");
    sb.append("    imageLinkMissing: ").append(toIndentedString(imageLinkMissing)).append("\n");
    sb.append("    availabilityInvalid: ").append(toIndentedString(availabilityInvalid)).append("\n");
    sb.append("    productPriceInvalid: ").append(toIndentedString(productPriceInvalid)).append("\n");
    sb.append("    linkFormatInvalid: ").append(toIndentedString(linkFormatInvalid)).append("\n");
    sb.append("    parseLineError: ").append(toIndentedString(parseLineError)).append("\n");
    sb.append("    adwordsFormatInvalid: ").append(toIndentedString(adwordsFormatInvalid)).append("\n");
    sb.append("    productCategoryMissing: ").append(toIndentedString(productCategoryMissing)).append("\n");
    sb.append("    internalServiceError: ").append(toIndentedString(internalServiceError)).append("\n");
    sb.append("    noVerifiedDomain: ").append(toIndentedString(noVerifiedDomain)).append("\n");
    sb.append("    adultInvalid: ").append(toIndentedString(adultInvalid)).append("\n");
    sb.append("    invalidDomain: ").append(toIndentedString(invalidDomain)).append("\n");
    sb.append("    feedLengthTooLong: ").append(toIndentedString(feedLengthTooLong)).append("\n");
    sb.append("    linkLengthTooLong: ").append(toIndentedString(linkLengthTooLong)).append("\n");
    sb.append("    malformedXml: ").append(toIndentedString(malformedXml)).append("\n");
    sb.append("    redirectInvalid: ").append(toIndentedString(redirectInvalid)).append("\n");
    sb.append("    priceMissing: ").append(toIndentedString(priceMissing)).append("\n");
    sb.append("    feedTooSmall: ").append(toIndentedString(feedTooSmall)).append("\n");
    sb.append("    conditionInvalid: ").append(toIndentedString(conditionInvalid)).append("\n");
    sb.append("    shopifyNoProducts: ").append(toIndentedString(shopifyNoProducts)).append("\n");
    sb.append("    maxItemsPerItemGroupExceeded: ").append(toIndentedString(maxItemsPerItemGroupExceeded)).append("\n");
    sb.append("    itemMainImageDownloadFailure: ").append(toIndentedString(itemMainImageDownloadFailure)).append("\n");
    sb.append("    pinjoinContentUnsafe: ").append(toIndentedString(pinjoinContentUnsafe)).append("\n");
    sb.append("    blocklistedImageSignature: ").append(toIndentedString(blocklistedImageSignature)).append("\n");
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


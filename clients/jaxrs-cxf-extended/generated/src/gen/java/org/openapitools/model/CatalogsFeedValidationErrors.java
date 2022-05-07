package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsFeedValidationErrors  {
  
  @ApiModelProperty(value = "")
  private Integer fetchError;

  @ApiModelProperty(value = "")
  private Integer fetchInactiveFeedError;

  @ApiModelProperty(value = "")
  private Integer encodingError;

  @ApiModelProperty(value = "")
  private Integer delimiterError;

  @ApiModelProperty(value = "")
  private Integer requiredColumnsMissing;

  @ApiModelProperty(value = "")
  private Integer imageLinkInvalid;

  @ApiModelProperty(value = "")
  private Integer itemidMissing;

  @ApiModelProperty(value = "")
  private Integer titleMissing;

  @ApiModelProperty(value = "")
  private Integer descriptionMissing;

  @ApiModelProperty(value = "")
  private Integer productCategoryInvalid;

  @ApiModelProperty(value = "")
  private Integer productLinkMissing;

  @ApiModelProperty(value = "")
  private Integer imageLinkMissing;

  @ApiModelProperty(value = "")
  private Integer availabilityInvalid;

  @ApiModelProperty(value = "")
  private Integer productPriceInvalid;

  @ApiModelProperty(value = "")
  private Integer linkFormatInvalid;

  @ApiModelProperty(value = "")
  private Integer parseLineError;

  @ApiModelProperty(value = "")
  private Integer adwordsFormatInvalid;

  @ApiModelProperty(value = "")
  private Integer productCategoryMissing;

  @ApiModelProperty(value = "")
  private Integer internalServiceError;

  @ApiModelProperty(value = "")
  private Integer noVerifiedDomain;

  @ApiModelProperty(value = "")
  private Integer adultInvalid;

  @ApiModelProperty(value = "")
  private Integer invalidDomain;

  @ApiModelProperty(value = "")
  private Integer feedLengthTooLong;

  @ApiModelProperty(value = "")
  private Integer linkLengthTooLong;

  @ApiModelProperty(value = "")
  private Integer malformedXml;

  @ApiModelProperty(value = "")
  private Integer redirectInvalid;

  @ApiModelProperty(value = "")
  private Integer priceMissing;

  @ApiModelProperty(value = "")
  private Integer feedTooSmall;

  @ApiModelProperty(value = "")
  private Integer conditionInvalid;

  @ApiModelProperty(value = "")
  private Integer shopifyNoProducts;

  @ApiModelProperty(value = "")
  private Integer maxItemsPerItemGroupExceeded;

  @ApiModelProperty(value = "")
  private Integer itemMainImageDownloadFailure;

  @ApiModelProperty(value = "")
  private Integer pinjoinContentUnsafe;

  @ApiModelProperty(value = "")
  private Integer blocklistedImageSignature;
 /**
  * Get fetchError
  * @return fetchError
  */
  @JsonProperty("fetch_error")
  public Integer getFetchError() {
    return fetchError;
  }

  /**
   * Sets the <code>fetchError</code> property.
   */
 public void setFetchError(Integer fetchError) {
    this.fetchError = fetchError;
  }

  /**
   * Sets the <code>fetchError</code> property.
   */
  public CatalogsFeedValidationErrors fetchError(Integer fetchError) {
    this.fetchError = fetchError;
    return this;
  }

 /**
  * Get fetchInactiveFeedError
  * @return fetchInactiveFeedError
  */
  @JsonProperty("fetch_inactive_feed_error")
  public Integer getFetchInactiveFeedError() {
    return fetchInactiveFeedError;
  }

  /**
   * Sets the <code>fetchInactiveFeedError</code> property.
   */
 public void setFetchInactiveFeedError(Integer fetchInactiveFeedError) {
    this.fetchInactiveFeedError = fetchInactiveFeedError;
  }

  /**
   * Sets the <code>fetchInactiveFeedError</code> property.
   */
  public CatalogsFeedValidationErrors fetchInactiveFeedError(Integer fetchInactiveFeedError) {
    this.fetchInactiveFeedError = fetchInactiveFeedError;
    return this;
  }

 /**
  * Get encodingError
  * @return encodingError
  */
  @JsonProperty("encoding_error")
  public Integer getEncodingError() {
    return encodingError;
  }

  /**
   * Sets the <code>encodingError</code> property.
   */
 public void setEncodingError(Integer encodingError) {
    this.encodingError = encodingError;
  }

  /**
   * Sets the <code>encodingError</code> property.
   */
  public CatalogsFeedValidationErrors encodingError(Integer encodingError) {
    this.encodingError = encodingError;
    return this;
  }

 /**
  * Get delimiterError
  * @return delimiterError
  */
  @JsonProperty("delimiter_error")
  public Integer getDelimiterError() {
    return delimiterError;
  }

  /**
   * Sets the <code>delimiterError</code> property.
   */
 public void setDelimiterError(Integer delimiterError) {
    this.delimiterError = delimiterError;
  }

  /**
   * Sets the <code>delimiterError</code> property.
   */
  public CatalogsFeedValidationErrors delimiterError(Integer delimiterError) {
    this.delimiterError = delimiterError;
    return this;
  }

 /**
  * Get requiredColumnsMissing
  * @return requiredColumnsMissing
  */
  @JsonProperty("required_columns_missing")
  public Integer getRequiredColumnsMissing() {
    return requiredColumnsMissing;
  }

  /**
   * Sets the <code>requiredColumnsMissing</code> property.
   */
 public void setRequiredColumnsMissing(Integer requiredColumnsMissing) {
    this.requiredColumnsMissing = requiredColumnsMissing;
  }

  /**
   * Sets the <code>requiredColumnsMissing</code> property.
   */
  public CatalogsFeedValidationErrors requiredColumnsMissing(Integer requiredColumnsMissing) {
    this.requiredColumnsMissing = requiredColumnsMissing;
    return this;
  }

 /**
  * Get imageLinkInvalid
  * @return imageLinkInvalid
  */
  @JsonProperty("image_link_invalid")
  public Integer getImageLinkInvalid() {
    return imageLinkInvalid;
  }

  /**
   * Sets the <code>imageLinkInvalid</code> property.
   */
 public void setImageLinkInvalid(Integer imageLinkInvalid) {
    this.imageLinkInvalid = imageLinkInvalid;
  }

  /**
   * Sets the <code>imageLinkInvalid</code> property.
   */
  public CatalogsFeedValidationErrors imageLinkInvalid(Integer imageLinkInvalid) {
    this.imageLinkInvalid = imageLinkInvalid;
    return this;
  }

 /**
  * Get itemidMissing
  * @return itemidMissing
  */
  @JsonProperty("itemid_missing")
  public Integer getItemidMissing() {
    return itemidMissing;
  }

  /**
   * Sets the <code>itemidMissing</code> property.
   */
 public void setItemidMissing(Integer itemidMissing) {
    this.itemidMissing = itemidMissing;
  }

  /**
   * Sets the <code>itemidMissing</code> property.
   */
  public CatalogsFeedValidationErrors itemidMissing(Integer itemidMissing) {
    this.itemidMissing = itemidMissing;
    return this;
  }

 /**
  * Get titleMissing
  * @return titleMissing
  */
  @JsonProperty("title_missing")
  public Integer getTitleMissing() {
    return titleMissing;
  }

  /**
   * Sets the <code>titleMissing</code> property.
   */
 public void setTitleMissing(Integer titleMissing) {
    this.titleMissing = titleMissing;
  }

  /**
   * Sets the <code>titleMissing</code> property.
   */
  public CatalogsFeedValidationErrors titleMissing(Integer titleMissing) {
    this.titleMissing = titleMissing;
    return this;
  }

 /**
  * Get descriptionMissing
  * @return descriptionMissing
  */
  @JsonProperty("description_missing")
  public Integer getDescriptionMissing() {
    return descriptionMissing;
  }

  /**
   * Sets the <code>descriptionMissing</code> property.
   */
 public void setDescriptionMissing(Integer descriptionMissing) {
    this.descriptionMissing = descriptionMissing;
  }

  /**
   * Sets the <code>descriptionMissing</code> property.
   */
  public CatalogsFeedValidationErrors descriptionMissing(Integer descriptionMissing) {
    this.descriptionMissing = descriptionMissing;
    return this;
  }

 /**
  * Get productCategoryInvalid
  * @return productCategoryInvalid
  */
  @JsonProperty("product_category_invalid")
  public Integer getProductCategoryInvalid() {
    return productCategoryInvalid;
  }

  /**
   * Sets the <code>productCategoryInvalid</code> property.
   */
 public void setProductCategoryInvalid(Integer productCategoryInvalid) {
    this.productCategoryInvalid = productCategoryInvalid;
  }

  /**
   * Sets the <code>productCategoryInvalid</code> property.
   */
  public CatalogsFeedValidationErrors productCategoryInvalid(Integer productCategoryInvalid) {
    this.productCategoryInvalid = productCategoryInvalid;
    return this;
  }

 /**
  * Get productLinkMissing
  * @return productLinkMissing
  */
  @JsonProperty("product_link_missing")
  public Integer getProductLinkMissing() {
    return productLinkMissing;
  }

  /**
   * Sets the <code>productLinkMissing</code> property.
   */
 public void setProductLinkMissing(Integer productLinkMissing) {
    this.productLinkMissing = productLinkMissing;
  }

  /**
   * Sets the <code>productLinkMissing</code> property.
   */
  public CatalogsFeedValidationErrors productLinkMissing(Integer productLinkMissing) {
    this.productLinkMissing = productLinkMissing;
    return this;
  }

 /**
  * Get imageLinkMissing
  * @return imageLinkMissing
  */
  @JsonProperty("image_link_missing")
  public Integer getImageLinkMissing() {
    return imageLinkMissing;
  }

  /**
   * Sets the <code>imageLinkMissing</code> property.
   */
 public void setImageLinkMissing(Integer imageLinkMissing) {
    this.imageLinkMissing = imageLinkMissing;
  }

  /**
   * Sets the <code>imageLinkMissing</code> property.
   */
  public CatalogsFeedValidationErrors imageLinkMissing(Integer imageLinkMissing) {
    this.imageLinkMissing = imageLinkMissing;
    return this;
  }

 /**
  * Get availabilityInvalid
  * @return availabilityInvalid
  */
  @JsonProperty("availability_invalid")
  public Integer getAvailabilityInvalid() {
    return availabilityInvalid;
  }

  /**
   * Sets the <code>availabilityInvalid</code> property.
   */
 public void setAvailabilityInvalid(Integer availabilityInvalid) {
    this.availabilityInvalid = availabilityInvalid;
  }

  /**
   * Sets the <code>availabilityInvalid</code> property.
   */
  public CatalogsFeedValidationErrors availabilityInvalid(Integer availabilityInvalid) {
    this.availabilityInvalid = availabilityInvalid;
    return this;
  }

 /**
  * Get productPriceInvalid
  * @return productPriceInvalid
  */
  @JsonProperty("product_price_invalid")
  public Integer getProductPriceInvalid() {
    return productPriceInvalid;
  }

  /**
   * Sets the <code>productPriceInvalid</code> property.
   */
 public void setProductPriceInvalid(Integer productPriceInvalid) {
    this.productPriceInvalid = productPriceInvalid;
  }

  /**
   * Sets the <code>productPriceInvalid</code> property.
   */
  public CatalogsFeedValidationErrors productPriceInvalid(Integer productPriceInvalid) {
    this.productPriceInvalid = productPriceInvalid;
    return this;
  }

 /**
  * Get linkFormatInvalid
  * @return linkFormatInvalid
  */
  @JsonProperty("link_format_invalid")
  public Integer getLinkFormatInvalid() {
    return linkFormatInvalid;
  }

  /**
   * Sets the <code>linkFormatInvalid</code> property.
   */
 public void setLinkFormatInvalid(Integer linkFormatInvalid) {
    this.linkFormatInvalid = linkFormatInvalid;
  }

  /**
   * Sets the <code>linkFormatInvalid</code> property.
   */
  public CatalogsFeedValidationErrors linkFormatInvalid(Integer linkFormatInvalid) {
    this.linkFormatInvalid = linkFormatInvalid;
    return this;
  }

 /**
  * Get parseLineError
  * @return parseLineError
  */
  @JsonProperty("parse_line_error")
  public Integer getParseLineError() {
    return parseLineError;
  }

  /**
   * Sets the <code>parseLineError</code> property.
   */
 public void setParseLineError(Integer parseLineError) {
    this.parseLineError = parseLineError;
  }

  /**
   * Sets the <code>parseLineError</code> property.
   */
  public CatalogsFeedValidationErrors parseLineError(Integer parseLineError) {
    this.parseLineError = parseLineError;
    return this;
  }

 /**
  * Get adwordsFormatInvalid
  * @return adwordsFormatInvalid
  */
  @JsonProperty("adwords_format_invalid")
  public Integer getAdwordsFormatInvalid() {
    return adwordsFormatInvalid;
  }

  /**
   * Sets the <code>adwordsFormatInvalid</code> property.
   */
 public void setAdwordsFormatInvalid(Integer adwordsFormatInvalid) {
    this.adwordsFormatInvalid = adwordsFormatInvalid;
  }

  /**
   * Sets the <code>adwordsFormatInvalid</code> property.
   */
  public CatalogsFeedValidationErrors adwordsFormatInvalid(Integer adwordsFormatInvalid) {
    this.adwordsFormatInvalid = adwordsFormatInvalid;
    return this;
  }

 /**
  * Get productCategoryMissing
  * @return productCategoryMissing
  */
  @JsonProperty("product_category_missing")
  public Integer getProductCategoryMissing() {
    return productCategoryMissing;
  }

  /**
   * Sets the <code>productCategoryMissing</code> property.
   */
 public void setProductCategoryMissing(Integer productCategoryMissing) {
    this.productCategoryMissing = productCategoryMissing;
  }

  /**
   * Sets the <code>productCategoryMissing</code> property.
   */
  public CatalogsFeedValidationErrors productCategoryMissing(Integer productCategoryMissing) {
    this.productCategoryMissing = productCategoryMissing;
    return this;
  }

 /**
  * Get internalServiceError
  * @return internalServiceError
  */
  @JsonProperty("internal_service_error")
  public Integer getInternalServiceError() {
    return internalServiceError;
  }

  /**
   * Sets the <code>internalServiceError</code> property.
   */
 public void setInternalServiceError(Integer internalServiceError) {
    this.internalServiceError = internalServiceError;
  }

  /**
   * Sets the <code>internalServiceError</code> property.
   */
  public CatalogsFeedValidationErrors internalServiceError(Integer internalServiceError) {
    this.internalServiceError = internalServiceError;
    return this;
  }

 /**
  * Get noVerifiedDomain
  * @return noVerifiedDomain
  */
  @JsonProperty("no_verified_domain")
  public Integer getNoVerifiedDomain() {
    return noVerifiedDomain;
  }

  /**
   * Sets the <code>noVerifiedDomain</code> property.
   */
 public void setNoVerifiedDomain(Integer noVerifiedDomain) {
    this.noVerifiedDomain = noVerifiedDomain;
  }

  /**
   * Sets the <code>noVerifiedDomain</code> property.
   */
  public CatalogsFeedValidationErrors noVerifiedDomain(Integer noVerifiedDomain) {
    this.noVerifiedDomain = noVerifiedDomain;
    return this;
  }

 /**
  * Get adultInvalid
  * @return adultInvalid
  */
  @JsonProperty("adult_invalid")
  public Integer getAdultInvalid() {
    return adultInvalid;
  }

  /**
   * Sets the <code>adultInvalid</code> property.
   */
 public void setAdultInvalid(Integer adultInvalid) {
    this.adultInvalid = adultInvalid;
  }

  /**
   * Sets the <code>adultInvalid</code> property.
   */
  public CatalogsFeedValidationErrors adultInvalid(Integer adultInvalid) {
    this.adultInvalid = adultInvalid;
    return this;
  }

 /**
  * Get invalidDomain
  * @return invalidDomain
  */
  @JsonProperty("invalid_domain")
  public Integer getInvalidDomain() {
    return invalidDomain;
  }

  /**
   * Sets the <code>invalidDomain</code> property.
   */
 public void setInvalidDomain(Integer invalidDomain) {
    this.invalidDomain = invalidDomain;
  }

  /**
   * Sets the <code>invalidDomain</code> property.
   */
  public CatalogsFeedValidationErrors invalidDomain(Integer invalidDomain) {
    this.invalidDomain = invalidDomain;
    return this;
  }

 /**
  * Get feedLengthTooLong
  * @return feedLengthTooLong
  */
  @JsonProperty("feed_length_too_long")
  public Integer getFeedLengthTooLong() {
    return feedLengthTooLong;
  }

  /**
   * Sets the <code>feedLengthTooLong</code> property.
   */
 public void setFeedLengthTooLong(Integer feedLengthTooLong) {
    this.feedLengthTooLong = feedLengthTooLong;
  }

  /**
   * Sets the <code>feedLengthTooLong</code> property.
   */
  public CatalogsFeedValidationErrors feedLengthTooLong(Integer feedLengthTooLong) {
    this.feedLengthTooLong = feedLengthTooLong;
    return this;
  }

 /**
  * Get linkLengthTooLong
  * @return linkLengthTooLong
  */
  @JsonProperty("link_length_too_long")
  public Integer getLinkLengthTooLong() {
    return linkLengthTooLong;
  }

  /**
   * Sets the <code>linkLengthTooLong</code> property.
   */
 public void setLinkLengthTooLong(Integer linkLengthTooLong) {
    this.linkLengthTooLong = linkLengthTooLong;
  }

  /**
   * Sets the <code>linkLengthTooLong</code> property.
   */
  public CatalogsFeedValidationErrors linkLengthTooLong(Integer linkLengthTooLong) {
    this.linkLengthTooLong = linkLengthTooLong;
    return this;
  }

 /**
  * Get malformedXml
  * @return malformedXml
  */
  @JsonProperty("malformed_xml")
  public Integer getMalformedXml() {
    return malformedXml;
  }

  /**
   * Sets the <code>malformedXml</code> property.
   */
 public void setMalformedXml(Integer malformedXml) {
    this.malformedXml = malformedXml;
  }

  /**
   * Sets the <code>malformedXml</code> property.
   */
  public CatalogsFeedValidationErrors malformedXml(Integer malformedXml) {
    this.malformedXml = malformedXml;
    return this;
  }

 /**
  * Get redirectInvalid
  * @return redirectInvalid
  */
  @JsonProperty("redirect_invalid")
  public Integer getRedirectInvalid() {
    return redirectInvalid;
  }

  /**
   * Sets the <code>redirectInvalid</code> property.
   */
 public void setRedirectInvalid(Integer redirectInvalid) {
    this.redirectInvalid = redirectInvalid;
  }

  /**
   * Sets the <code>redirectInvalid</code> property.
   */
  public CatalogsFeedValidationErrors redirectInvalid(Integer redirectInvalid) {
    this.redirectInvalid = redirectInvalid;
    return this;
  }

 /**
  * Get priceMissing
  * @return priceMissing
  */
  @JsonProperty("price_missing")
  public Integer getPriceMissing() {
    return priceMissing;
  }

  /**
   * Sets the <code>priceMissing</code> property.
   */
 public void setPriceMissing(Integer priceMissing) {
    this.priceMissing = priceMissing;
  }

  /**
   * Sets the <code>priceMissing</code> property.
   */
  public CatalogsFeedValidationErrors priceMissing(Integer priceMissing) {
    this.priceMissing = priceMissing;
    return this;
  }

 /**
  * Get feedTooSmall
  * @return feedTooSmall
  */
  @JsonProperty("feed_too_small")
  public Integer getFeedTooSmall() {
    return feedTooSmall;
  }

  /**
   * Sets the <code>feedTooSmall</code> property.
   */
 public void setFeedTooSmall(Integer feedTooSmall) {
    this.feedTooSmall = feedTooSmall;
  }

  /**
   * Sets the <code>feedTooSmall</code> property.
   */
  public CatalogsFeedValidationErrors feedTooSmall(Integer feedTooSmall) {
    this.feedTooSmall = feedTooSmall;
    return this;
  }

 /**
  * Get conditionInvalid
  * @return conditionInvalid
  */
  @JsonProperty("condition_invalid")
  public Integer getConditionInvalid() {
    return conditionInvalid;
  }

  /**
   * Sets the <code>conditionInvalid</code> property.
   */
 public void setConditionInvalid(Integer conditionInvalid) {
    this.conditionInvalid = conditionInvalid;
  }

  /**
   * Sets the <code>conditionInvalid</code> property.
   */
  public CatalogsFeedValidationErrors conditionInvalid(Integer conditionInvalid) {
    this.conditionInvalid = conditionInvalid;
    return this;
  }

 /**
  * Get shopifyNoProducts
  * @return shopifyNoProducts
  */
  @JsonProperty("shopify_no_products")
  public Integer getShopifyNoProducts() {
    return shopifyNoProducts;
  }

  /**
   * Sets the <code>shopifyNoProducts</code> property.
   */
 public void setShopifyNoProducts(Integer shopifyNoProducts) {
    this.shopifyNoProducts = shopifyNoProducts;
  }

  /**
   * Sets the <code>shopifyNoProducts</code> property.
   */
  public CatalogsFeedValidationErrors shopifyNoProducts(Integer shopifyNoProducts) {
    this.shopifyNoProducts = shopifyNoProducts;
    return this;
  }

 /**
  * Get maxItemsPerItemGroupExceeded
  * @return maxItemsPerItemGroupExceeded
  */
  @JsonProperty("max_items_per_item_group_exceeded")
  public Integer getMaxItemsPerItemGroupExceeded() {
    return maxItemsPerItemGroupExceeded;
  }

  /**
   * Sets the <code>maxItemsPerItemGroupExceeded</code> property.
   */
 public void setMaxItemsPerItemGroupExceeded(Integer maxItemsPerItemGroupExceeded) {
    this.maxItemsPerItemGroupExceeded = maxItemsPerItemGroupExceeded;
  }

  /**
   * Sets the <code>maxItemsPerItemGroupExceeded</code> property.
   */
  public CatalogsFeedValidationErrors maxItemsPerItemGroupExceeded(Integer maxItemsPerItemGroupExceeded) {
    this.maxItemsPerItemGroupExceeded = maxItemsPerItemGroupExceeded;
    return this;
  }

 /**
  * Get itemMainImageDownloadFailure
  * @return itemMainImageDownloadFailure
  */
  @JsonProperty("item_main_image_download_failure")
  public Integer getItemMainImageDownloadFailure() {
    return itemMainImageDownloadFailure;
  }

  /**
   * Sets the <code>itemMainImageDownloadFailure</code> property.
   */
 public void setItemMainImageDownloadFailure(Integer itemMainImageDownloadFailure) {
    this.itemMainImageDownloadFailure = itemMainImageDownloadFailure;
  }

  /**
   * Sets the <code>itemMainImageDownloadFailure</code> property.
   */
  public CatalogsFeedValidationErrors itemMainImageDownloadFailure(Integer itemMainImageDownloadFailure) {
    this.itemMainImageDownloadFailure = itemMainImageDownloadFailure;
    return this;
  }

 /**
  * Get pinjoinContentUnsafe
  * @return pinjoinContentUnsafe
  */
  @JsonProperty("pinjoin_content_unsafe")
  public Integer getPinjoinContentUnsafe() {
    return pinjoinContentUnsafe;
  }

  /**
   * Sets the <code>pinjoinContentUnsafe</code> property.
   */
 public void setPinjoinContentUnsafe(Integer pinjoinContentUnsafe) {
    this.pinjoinContentUnsafe = pinjoinContentUnsafe;
  }

  /**
   * Sets the <code>pinjoinContentUnsafe</code> property.
   */
  public CatalogsFeedValidationErrors pinjoinContentUnsafe(Integer pinjoinContentUnsafe) {
    this.pinjoinContentUnsafe = pinjoinContentUnsafe;
    return this;
  }

 /**
  * Get blocklistedImageSignature
  * @return blocklistedImageSignature
  */
  @JsonProperty("blocklisted_image_signature")
  public Integer getBlocklistedImageSignature() {
    return blocklistedImageSignature;
  }

  /**
   * Sets the <code>blocklistedImageSignature</code> property.
   */
 public void setBlocklistedImageSignature(Integer blocklistedImageSignature) {
    this.blocklistedImageSignature = blocklistedImageSignature;
  }

  /**
   * Sets the <code>blocklistedImageSignature</code> property.
   */
  public CatalogsFeedValidationErrors blocklistedImageSignature(Integer blocklistedImageSignature) {
    this.blocklistedImageSignature = blocklistedImageSignature;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


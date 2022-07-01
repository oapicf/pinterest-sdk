package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatalogsFeedValidationErrors
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-01T12:06:55.503075Z[Etc/UTC]")
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

  public CatalogsFeedValidationErrors fetchError(Integer fetchError) {
    this.fetchError = fetchError;
    return this;
  }

  /**
   * Get fetchError
   * @return fetchError
  */
  
  @Schema(name = "fetch_error", required = false)
  public Integer getFetchError() {
    return fetchError;
  }

  public void setFetchError(Integer fetchError) {
    this.fetchError = fetchError;
  }

  public CatalogsFeedValidationErrors fetchInactiveFeedError(Integer fetchInactiveFeedError) {
    this.fetchInactiveFeedError = fetchInactiveFeedError;
    return this;
  }

  /**
   * Get fetchInactiveFeedError
   * @return fetchInactiveFeedError
  */
  
  @Schema(name = "fetch_inactive_feed_error", required = false)
  public Integer getFetchInactiveFeedError() {
    return fetchInactiveFeedError;
  }

  public void setFetchInactiveFeedError(Integer fetchInactiveFeedError) {
    this.fetchInactiveFeedError = fetchInactiveFeedError;
  }

  public CatalogsFeedValidationErrors encodingError(Integer encodingError) {
    this.encodingError = encodingError;
    return this;
  }

  /**
   * Get encodingError
   * @return encodingError
  */
  
  @Schema(name = "encoding_error", required = false)
  public Integer getEncodingError() {
    return encodingError;
  }

  public void setEncodingError(Integer encodingError) {
    this.encodingError = encodingError;
  }

  public CatalogsFeedValidationErrors delimiterError(Integer delimiterError) {
    this.delimiterError = delimiterError;
    return this;
  }

  /**
   * Get delimiterError
   * @return delimiterError
  */
  
  @Schema(name = "delimiter_error", required = false)
  public Integer getDelimiterError() {
    return delimiterError;
  }

  public void setDelimiterError(Integer delimiterError) {
    this.delimiterError = delimiterError;
  }

  public CatalogsFeedValidationErrors requiredColumnsMissing(Integer requiredColumnsMissing) {
    this.requiredColumnsMissing = requiredColumnsMissing;
    return this;
  }

  /**
   * Get requiredColumnsMissing
   * @return requiredColumnsMissing
  */
  
  @Schema(name = "required_columns_missing", required = false)
  public Integer getRequiredColumnsMissing() {
    return requiredColumnsMissing;
  }

  public void setRequiredColumnsMissing(Integer requiredColumnsMissing) {
    this.requiredColumnsMissing = requiredColumnsMissing;
  }

  public CatalogsFeedValidationErrors imageLinkInvalid(Integer imageLinkInvalid) {
    this.imageLinkInvalid = imageLinkInvalid;
    return this;
  }

  /**
   * Get imageLinkInvalid
   * @return imageLinkInvalid
  */
  
  @Schema(name = "image_link_invalid", required = false)
  public Integer getImageLinkInvalid() {
    return imageLinkInvalid;
  }

  public void setImageLinkInvalid(Integer imageLinkInvalid) {
    this.imageLinkInvalid = imageLinkInvalid;
  }

  public CatalogsFeedValidationErrors itemidMissing(Integer itemidMissing) {
    this.itemidMissing = itemidMissing;
    return this;
  }

  /**
   * Get itemidMissing
   * @return itemidMissing
  */
  
  @Schema(name = "itemid_missing", required = false)
  public Integer getItemidMissing() {
    return itemidMissing;
  }

  public void setItemidMissing(Integer itemidMissing) {
    this.itemidMissing = itemidMissing;
  }

  public CatalogsFeedValidationErrors titleMissing(Integer titleMissing) {
    this.titleMissing = titleMissing;
    return this;
  }

  /**
   * Get titleMissing
   * @return titleMissing
  */
  
  @Schema(name = "title_missing", required = false)
  public Integer getTitleMissing() {
    return titleMissing;
  }

  public void setTitleMissing(Integer titleMissing) {
    this.titleMissing = titleMissing;
  }

  public CatalogsFeedValidationErrors descriptionMissing(Integer descriptionMissing) {
    this.descriptionMissing = descriptionMissing;
    return this;
  }

  /**
   * Get descriptionMissing
   * @return descriptionMissing
  */
  
  @Schema(name = "description_missing", required = false)
  public Integer getDescriptionMissing() {
    return descriptionMissing;
  }

  public void setDescriptionMissing(Integer descriptionMissing) {
    this.descriptionMissing = descriptionMissing;
  }

  public CatalogsFeedValidationErrors productCategoryInvalid(Integer productCategoryInvalid) {
    this.productCategoryInvalid = productCategoryInvalid;
    return this;
  }

  /**
   * Get productCategoryInvalid
   * @return productCategoryInvalid
  */
  
  @Schema(name = "product_category_invalid", required = false)
  public Integer getProductCategoryInvalid() {
    return productCategoryInvalid;
  }

  public void setProductCategoryInvalid(Integer productCategoryInvalid) {
    this.productCategoryInvalid = productCategoryInvalid;
  }

  public CatalogsFeedValidationErrors productLinkMissing(Integer productLinkMissing) {
    this.productLinkMissing = productLinkMissing;
    return this;
  }

  /**
   * Get productLinkMissing
   * @return productLinkMissing
  */
  
  @Schema(name = "product_link_missing", required = false)
  public Integer getProductLinkMissing() {
    return productLinkMissing;
  }

  public void setProductLinkMissing(Integer productLinkMissing) {
    this.productLinkMissing = productLinkMissing;
  }

  public CatalogsFeedValidationErrors imageLinkMissing(Integer imageLinkMissing) {
    this.imageLinkMissing = imageLinkMissing;
    return this;
  }

  /**
   * Get imageLinkMissing
   * @return imageLinkMissing
  */
  
  @Schema(name = "image_link_missing", required = false)
  public Integer getImageLinkMissing() {
    return imageLinkMissing;
  }

  public void setImageLinkMissing(Integer imageLinkMissing) {
    this.imageLinkMissing = imageLinkMissing;
  }

  public CatalogsFeedValidationErrors availabilityInvalid(Integer availabilityInvalid) {
    this.availabilityInvalid = availabilityInvalid;
    return this;
  }

  /**
   * Get availabilityInvalid
   * @return availabilityInvalid
  */
  
  @Schema(name = "availability_invalid", required = false)
  public Integer getAvailabilityInvalid() {
    return availabilityInvalid;
  }

  public void setAvailabilityInvalid(Integer availabilityInvalid) {
    this.availabilityInvalid = availabilityInvalid;
  }

  public CatalogsFeedValidationErrors productPriceInvalid(Integer productPriceInvalid) {
    this.productPriceInvalid = productPriceInvalid;
    return this;
  }

  /**
   * Get productPriceInvalid
   * @return productPriceInvalid
  */
  
  @Schema(name = "product_price_invalid", required = false)
  public Integer getProductPriceInvalid() {
    return productPriceInvalid;
  }

  public void setProductPriceInvalid(Integer productPriceInvalid) {
    this.productPriceInvalid = productPriceInvalid;
  }

  public CatalogsFeedValidationErrors linkFormatInvalid(Integer linkFormatInvalid) {
    this.linkFormatInvalid = linkFormatInvalid;
    return this;
  }

  /**
   * Get linkFormatInvalid
   * @return linkFormatInvalid
  */
  
  @Schema(name = "link_format_invalid", required = false)
  public Integer getLinkFormatInvalid() {
    return linkFormatInvalid;
  }

  public void setLinkFormatInvalid(Integer linkFormatInvalid) {
    this.linkFormatInvalid = linkFormatInvalid;
  }

  public CatalogsFeedValidationErrors parseLineError(Integer parseLineError) {
    this.parseLineError = parseLineError;
    return this;
  }

  /**
   * Get parseLineError
   * @return parseLineError
  */
  
  @Schema(name = "parse_line_error", required = false)
  public Integer getParseLineError() {
    return parseLineError;
  }

  public void setParseLineError(Integer parseLineError) {
    this.parseLineError = parseLineError;
  }

  public CatalogsFeedValidationErrors adwordsFormatInvalid(Integer adwordsFormatInvalid) {
    this.adwordsFormatInvalid = adwordsFormatInvalid;
    return this;
  }

  /**
   * Get adwordsFormatInvalid
   * @return adwordsFormatInvalid
  */
  
  @Schema(name = "adwords_format_invalid", required = false)
  public Integer getAdwordsFormatInvalid() {
    return adwordsFormatInvalid;
  }

  public void setAdwordsFormatInvalid(Integer adwordsFormatInvalid) {
    this.adwordsFormatInvalid = adwordsFormatInvalid;
  }

  public CatalogsFeedValidationErrors productCategoryMissing(Integer productCategoryMissing) {
    this.productCategoryMissing = productCategoryMissing;
    return this;
  }

  /**
   * Get productCategoryMissing
   * @return productCategoryMissing
  */
  
  @Schema(name = "product_category_missing", required = false)
  public Integer getProductCategoryMissing() {
    return productCategoryMissing;
  }

  public void setProductCategoryMissing(Integer productCategoryMissing) {
    this.productCategoryMissing = productCategoryMissing;
  }

  public CatalogsFeedValidationErrors internalServiceError(Integer internalServiceError) {
    this.internalServiceError = internalServiceError;
    return this;
  }

  /**
   * Get internalServiceError
   * @return internalServiceError
  */
  
  @Schema(name = "internal_service_error", required = false)
  public Integer getInternalServiceError() {
    return internalServiceError;
  }

  public void setInternalServiceError(Integer internalServiceError) {
    this.internalServiceError = internalServiceError;
  }

  public CatalogsFeedValidationErrors noVerifiedDomain(Integer noVerifiedDomain) {
    this.noVerifiedDomain = noVerifiedDomain;
    return this;
  }

  /**
   * Get noVerifiedDomain
   * @return noVerifiedDomain
  */
  
  @Schema(name = "no_verified_domain", required = false)
  public Integer getNoVerifiedDomain() {
    return noVerifiedDomain;
  }

  public void setNoVerifiedDomain(Integer noVerifiedDomain) {
    this.noVerifiedDomain = noVerifiedDomain;
  }

  public CatalogsFeedValidationErrors adultInvalid(Integer adultInvalid) {
    this.adultInvalid = adultInvalid;
    return this;
  }

  /**
   * Get adultInvalid
   * @return adultInvalid
  */
  
  @Schema(name = "adult_invalid", required = false)
  public Integer getAdultInvalid() {
    return adultInvalid;
  }

  public void setAdultInvalid(Integer adultInvalid) {
    this.adultInvalid = adultInvalid;
  }

  public CatalogsFeedValidationErrors invalidDomain(Integer invalidDomain) {
    this.invalidDomain = invalidDomain;
    return this;
  }

  /**
   * Get invalidDomain
   * @return invalidDomain
  */
  
  @Schema(name = "invalid_domain", required = false)
  public Integer getInvalidDomain() {
    return invalidDomain;
  }

  public void setInvalidDomain(Integer invalidDomain) {
    this.invalidDomain = invalidDomain;
  }

  public CatalogsFeedValidationErrors feedLengthTooLong(Integer feedLengthTooLong) {
    this.feedLengthTooLong = feedLengthTooLong;
    return this;
  }

  /**
   * Get feedLengthTooLong
   * @return feedLengthTooLong
  */
  
  @Schema(name = "feed_length_too_long", required = false)
  public Integer getFeedLengthTooLong() {
    return feedLengthTooLong;
  }

  public void setFeedLengthTooLong(Integer feedLengthTooLong) {
    this.feedLengthTooLong = feedLengthTooLong;
  }

  public CatalogsFeedValidationErrors linkLengthTooLong(Integer linkLengthTooLong) {
    this.linkLengthTooLong = linkLengthTooLong;
    return this;
  }

  /**
   * Get linkLengthTooLong
   * @return linkLengthTooLong
  */
  
  @Schema(name = "link_length_too_long", required = false)
  public Integer getLinkLengthTooLong() {
    return linkLengthTooLong;
  }

  public void setLinkLengthTooLong(Integer linkLengthTooLong) {
    this.linkLengthTooLong = linkLengthTooLong;
  }

  public CatalogsFeedValidationErrors malformedXml(Integer malformedXml) {
    this.malformedXml = malformedXml;
    return this;
  }

  /**
   * Get malformedXml
   * @return malformedXml
  */
  
  @Schema(name = "malformed_xml", required = false)
  public Integer getMalformedXml() {
    return malformedXml;
  }

  public void setMalformedXml(Integer malformedXml) {
    this.malformedXml = malformedXml;
  }

  public CatalogsFeedValidationErrors redirectInvalid(Integer redirectInvalid) {
    this.redirectInvalid = redirectInvalid;
    return this;
  }

  /**
   * Get redirectInvalid
   * @return redirectInvalid
  */
  
  @Schema(name = "redirect_invalid", required = false)
  public Integer getRedirectInvalid() {
    return redirectInvalid;
  }

  public void setRedirectInvalid(Integer redirectInvalid) {
    this.redirectInvalid = redirectInvalid;
  }

  public CatalogsFeedValidationErrors priceMissing(Integer priceMissing) {
    this.priceMissing = priceMissing;
    return this;
  }

  /**
   * Get priceMissing
   * @return priceMissing
  */
  
  @Schema(name = "price_missing", required = false)
  public Integer getPriceMissing() {
    return priceMissing;
  }

  public void setPriceMissing(Integer priceMissing) {
    this.priceMissing = priceMissing;
  }

  public CatalogsFeedValidationErrors feedTooSmall(Integer feedTooSmall) {
    this.feedTooSmall = feedTooSmall;
    return this;
  }

  /**
   * Get feedTooSmall
   * @return feedTooSmall
  */
  
  @Schema(name = "feed_too_small", required = false)
  public Integer getFeedTooSmall() {
    return feedTooSmall;
  }

  public void setFeedTooSmall(Integer feedTooSmall) {
    this.feedTooSmall = feedTooSmall;
  }

  public CatalogsFeedValidationErrors conditionInvalid(Integer conditionInvalid) {
    this.conditionInvalid = conditionInvalid;
    return this;
  }

  /**
   * Get conditionInvalid
   * @return conditionInvalid
  */
  
  @Schema(name = "condition_invalid", required = false)
  public Integer getConditionInvalid() {
    return conditionInvalid;
  }

  public void setConditionInvalid(Integer conditionInvalid) {
    this.conditionInvalid = conditionInvalid;
  }

  public CatalogsFeedValidationErrors shopifyNoProducts(Integer shopifyNoProducts) {
    this.shopifyNoProducts = shopifyNoProducts;
    return this;
  }

  /**
   * Get shopifyNoProducts
   * @return shopifyNoProducts
  */
  
  @Schema(name = "shopify_no_products", required = false)
  public Integer getShopifyNoProducts() {
    return shopifyNoProducts;
  }

  public void setShopifyNoProducts(Integer shopifyNoProducts) {
    this.shopifyNoProducts = shopifyNoProducts;
  }

  public CatalogsFeedValidationErrors maxItemsPerItemGroupExceeded(Integer maxItemsPerItemGroupExceeded) {
    this.maxItemsPerItemGroupExceeded = maxItemsPerItemGroupExceeded;
    return this;
  }

  /**
   * Get maxItemsPerItemGroupExceeded
   * @return maxItemsPerItemGroupExceeded
  */
  
  @Schema(name = "max_items_per_item_group_exceeded", required = false)
  public Integer getMaxItemsPerItemGroupExceeded() {
    return maxItemsPerItemGroupExceeded;
  }

  public void setMaxItemsPerItemGroupExceeded(Integer maxItemsPerItemGroupExceeded) {
    this.maxItemsPerItemGroupExceeded = maxItemsPerItemGroupExceeded;
  }

  public CatalogsFeedValidationErrors itemMainImageDownloadFailure(Integer itemMainImageDownloadFailure) {
    this.itemMainImageDownloadFailure = itemMainImageDownloadFailure;
    return this;
  }

  /**
   * Get itemMainImageDownloadFailure
   * @return itemMainImageDownloadFailure
  */
  
  @Schema(name = "item_main_image_download_failure", required = false)
  public Integer getItemMainImageDownloadFailure() {
    return itemMainImageDownloadFailure;
  }

  public void setItemMainImageDownloadFailure(Integer itemMainImageDownloadFailure) {
    this.itemMainImageDownloadFailure = itemMainImageDownloadFailure;
  }

  public CatalogsFeedValidationErrors pinjoinContentUnsafe(Integer pinjoinContentUnsafe) {
    this.pinjoinContentUnsafe = pinjoinContentUnsafe;
    return this;
  }

  /**
   * Get pinjoinContentUnsafe
   * @return pinjoinContentUnsafe
  */
  
  @Schema(name = "pinjoin_content_unsafe", required = false)
  public Integer getPinjoinContentUnsafe() {
    return pinjoinContentUnsafe;
  }

  public void setPinjoinContentUnsafe(Integer pinjoinContentUnsafe) {
    this.pinjoinContentUnsafe = pinjoinContentUnsafe;
  }

  public CatalogsFeedValidationErrors blocklistedImageSignature(Integer blocklistedImageSignature) {
    this.blocklistedImageSignature = blocklistedImageSignature;
    return this;
  }

  /**
   * Get blocklistedImageSignature
   * @return blocklistedImageSignature
  */
  
  @Schema(name = "blocklisted_image_signature", required = false)
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
    return Objects.equals(this.fetchError, catalogsFeedValidationErrors.fetchError) &&
        Objects.equals(this.fetchInactiveFeedError, catalogsFeedValidationErrors.fetchInactiveFeedError) &&
        Objects.equals(this.encodingError, catalogsFeedValidationErrors.encodingError) &&
        Objects.equals(this.delimiterError, catalogsFeedValidationErrors.delimiterError) &&
        Objects.equals(this.requiredColumnsMissing, catalogsFeedValidationErrors.requiredColumnsMissing) &&
        Objects.equals(this.imageLinkInvalid, catalogsFeedValidationErrors.imageLinkInvalid) &&
        Objects.equals(this.itemidMissing, catalogsFeedValidationErrors.itemidMissing) &&
        Objects.equals(this.titleMissing, catalogsFeedValidationErrors.titleMissing) &&
        Objects.equals(this.descriptionMissing, catalogsFeedValidationErrors.descriptionMissing) &&
        Objects.equals(this.productCategoryInvalid, catalogsFeedValidationErrors.productCategoryInvalid) &&
        Objects.equals(this.productLinkMissing, catalogsFeedValidationErrors.productLinkMissing) &&
        Objects.equals(this.imageLinkMissing, catalogsFeedValidationErrors.imageLinkMissing) &&
        Objects.equals(this.availabilityInvalid, catalogsFeedValidationErrors.availabilityInvalid) &&
        Objects.equals(this.productPriceInvalid, catalogsFeedValidationErrors.productPriceInvalid) &&
        Objects.equals(this.linkFormatInvalid, catalogsFeedValidationErrors.linkFormatInvalid) &&
        Objects.equals(this.parseLineError, catalogsFeedValidationErrors.parseLineError) &&
        Objects.equals(this.adwordsFormatInvalid, catalogsFeedValidationErrors.adwordsFormatInvalid) &&
        Objects.equals(this.productCategoryMissing, catalogsFeedValidationErrors.productCategoryMissing) &&
        Objects.equals(this.internalServiceError, catalogsFeedValidationErrors.internalServiceError) &&
        Objects.equals(this.noVerifiedDomain, catalogsFeedValidationErrors.noVerifiedDomain) &&
        Objects.equals(this.adultInvalid, catalogsFeedValidationErrors.adultInvalid) &&
        Objects.equals(this.invalidDomain, catalogsFeedValidationErrors.invalidDomain) &&
        Objects.equals(this.feedLengthTooLong, catalogsFeedValidationErrors.feedLengthTooLong) &&
        Objects.equals(this.linkLengthTooLong, catalogsFeedValidationErrors.linkLengthTooLong) &&
        Objects.equals(this.malformedXml, catalogsFeedValidationErrors.malformedXml) &&
        Objects.equals(this.redirectInvalid, catalogsFeedValidationErrors.redirectInvalid) &&
        Objects.equals(this.priceMissing, catalogsFeedValidationErrors.priceMissing) &&
        Objects.equals(this.feedTooSmall, catalogsFeedValidationErrors.feedTooSmall) &&
        Objects.equals(this.conditionInvalid, catalogsFeedValidationErrors.conditionInvalid) &&
        Objects.equals(this.shopifyNoProducts, catalogsFeedValidationErrors.shopifyNoProducts) &&
        Objects.equals(this.maxItemsPerItemGroupExceeded, catalogsFeedValidationErrors.maxItemsPerItemGroupExceeded) &&
        Objects.equals(this.itemMainImageDownloadFailure, catalogsFeedValidationErrors.itemMainImageDownloadFailure) &&
        Objects.equals(this.pinjoinContentUnsafe, catalogsFeedValidationErrors.pinjoinContentUnsafe) &&
        Objects.equals(this.blocklistedImageSignature, catalogsFeedValidationErrors.blocklistedImageSignature);
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


package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsFeedValidationWarnings  {
  
  @ApiModelProperty(value = "")
  private Integer titleLengthTooLong;

  @ApiModelProperty(value = "")
  private Integer descriptionLengthTooLong;

  @ApiModelProperty(value = "")
  private Integer genderInvalid;

  @ApiModelProperty(value = "")
  private Integer ageGroupInvalid;

  @ApiModelProperty(value = "")
  private Integer sizeTypeInvalid;

  @ApiModelProperty(value = "")
  private Integer linkFormatWarning;

  @ApiModelProperty(value = "")
  private Integer duplicateProducts;

  @ApiModelProperty(value = "")
  private Integer duplicateLinks;

  @ApiModelProperty(value = "")
  private Integer salesPriceInvalid;

  @ApiModelProperty(value = "")
  private Integer productCategoryDepthWarning;

  @ApiModelProperty(value = "")
  private Integer adwordsSameAsLink;

  @ApiModelProperty(value = "")
  private Integer duplicateHeaders;

  @ApiModelProperty(value = "")
  private Integer fetchSameSignature;

  @ApiModelProperty(value = "")
  private Integer adwordsFormatWarning;

  @ApiModelProperty(value = "")
  private Integer additionalImageLinkWarning;

  @ApiModelProperty(value = "")
  private Integer imageLinkWarning;

  @ApiModelProperty(value = "")
  private Integer shippingInvalid;

  @ApiModelProperty(value = "")
  private Integer taxInvalid;

  @ApiModelProperty(value = "")
  private Integer shippingWeightInvalid;

  @ApiModelProperty(value = "")
  private Integer expirationDateInvalid;

  @ApiModelProperty(value = "")
  private Integer availabilityDateInvalid;

  @ApiModelProperty(value = "")
  private Integer saleDateInvalid;

  @ApiModelProperty(value = "")
  private Integer weightUnitInvalid;

  @ApiModelProperty(value = "")
  private Integer isBundleInvalid;

  @ApiModelProperty(value = "")
  private Integer updatedTimeInvalid;

  @ApiModelProperty(value = "")
  private Integer customLabelLengthTooLong;

  @ApiModelProperty(value = "")
  private Integer productTypeLengthTooLong;

  @ApiModelProperty(value = "")
  private Integer tooManyAdditionalImageLinks;

  @ApiModelProperty(value = "")
  private Integer multipackInvalid;

  @ApiModelProperty(value = "")
  private Integer indexedProductCountLargeDelta;

  @ApiModelProperty(value = "")
  private Integer itemAdditionalImageDownloadFailure;

  @ApiModelProperty(value = "")
  private Integer optionalProductCategoryMissing;

  @ApiModelProperty(value = "")
  private Integer optionalProductCategoryInvalid;

  @ApiModelProperty(value = "")
  private Integer optionalConditionMissing;

  @ApiModelProperty(value = "")
  private Integer optionalConditionInvalid;

  @ApiModelProperty(value = "")
  private Integer iosDeepLinkInvalid;

  @ApiModelProperty(value = "")
  private Integer androidDeepLinkInvalid;

  @ApiModelProperty(value = "")
  private Integer availabilityNormalized;

  @ApiModelProperty(value = "")
  private Integer conditionNormalized;

  @ApiModelProperty(value = "")
  private Integer genderNormalized;

  @ApiModelProperty(value = "")
  private Integer sizeTypeNormalized;

  @ApiModelProperty(value = "")
  private Integer ageGroupNormalized;

  @ApiModelProperty(value = "")
  private Integer utmSourceAutoCorrected;

  @ApiModelProperty(value = "")
  private Integer countryDoesNotMapToCurrency;

  @ApiModelProperty(value = "")
  private Integer minAdPriceInvalid;
 /**
  * Get titleLengthTooLong
  * @return titleLengthTooLong
  */
  @JsonProperty("title_length_too_long")
  public Integer getTitleLengthTooLong() {
    return titleLengthTooLong;
  }

  /**
   * Sets the <code>titleLengthTooLong</code> property.
   */
 public void setTitleLengthTooLong(Integer titleLengthTooLong) {
    this.titleLengthTooLong = titleLengthTooLong;
  }

  /**
   * Sets the <code>titleLengthTooLong</code> property.
   */
  public CatalogsFeedValidationWarnings titleLengthTooLong(Integer titleLengthTooLong) {
    this.titleLengthTooLong = titleLengthTooLong;
    return this;
  }

 /**
  * Get descriptionLengthTooLong
  * @return descriptionLengthTooLong
  */
  @JsonProperty("description_length_too_long")
  public Integer getDescriptionLengthTooLong() {
    return descriptionLengthTooLong;
  }

  /**
   * Sets the <code>descriptionLengthTooLong</code> property.
   */
 public void setDescriptionLengthTooLong(Integer descriptionLengthTooLong) {
    this.descriptionLengthTooLong = descriptionLengthTooLong;
  }

  /**
   * Sets the <code>descriptionLengthTooLong</code> property.
   */
  public CatalogsFeedValidationWarnings descriptionLengthTooLong(Integer descriptionLengthTooLong) {
    this.descriptionLengthTooLong = descriptionLengthTooLong;
    return this;
  }

 /**
  * Get genderInvalid
  * @return genderInvalid
  */
  @JsonProperty("gender_invalid")
  public Integer getGenderInvalid() {
    return genderInvalid;
  }

  /**
   * Sets the <code>genderInvalid</code> property.
   */
 public void setGenderInvalid(Integer genderInvalid) {
    this.genderInvalid = genderInvalid;
  }

  /**
   * Sets the <code>genderInvalid</code> property.
   */
  public CatalogsFeedValidationWarnings genderInvalid(Integer genderInvalid) {
    this.genderInvalid = genderInvalid;
    return this;
  }

 /**
  * Get ageGroupInvalid
  * @return ageGroupInvalid
  */
  @JsonProperty("age_group_invalid")
  public Integer getAgeGroupInvalid() {
    return ageGroupInvalid;
  }

  /**
   * Sets the <code>ageGroupInvalid</code> property.
   */
 public void setAgeGroupInvalid(Integer ageGroupInvalid) {
    this.ageGroupInvalid = ageGroupInvalid;
  }

  /**
   * Sets the <code>ageGroupInvalid</code> property.
   */
  public CatalogsFeedValidationWarnings ageGroupInvalid(Integer ageGroupInvalid) {
    this.ageGroupInvalid = ageGroupInvalid;
    return this;
  }

 /**
  * Get sizeTypeInvalid
  * @return sizeTypeInvalid
  */
  @JsonProperty("size_type_invalid")
  public Integer getSizeTypeInvalid() {
    return sizeTypeInvalid;
  }

  /**
   * Sets the <code>sizeTypeInvalid</code> property.
   */
 public void setSizeTypeInvalid(Integer sizeTypeInvalid) {
    this.sizeTypeInvalid = sizeTypeInvalid;
  }

  /**
   * Sets the <code>sizeTypeInvalid</code> property.
   */
  public CatalogsFeedValidationWarnings sizeTypeInvalid(Integer sizeTypeInvalid) {
    this.sizeTypeInvalid = sizeTypeInvalid;
    return this;
  }

 /**
  * Get linkFormatWarning
  * @return linkFormatWarning
  */
  @JsonProperty("link_format_warning")
  public Integer getLinkFormatWarning() {
    return linkFormatWarning;
  }

  /**
   * Sets the <code>linkFormatWarning</code> property.
   */
 public void setLinkFormatWarning(Integer linkFormatWarning) {
    this.linkFormatWarning = linkFormatWarning;
  }

  /**
   * Sets the <code>linkFormatWarning</code> property.
   */
  public CatalogsFeedValidationWarnings linkFormatWarning(Integer linkFormatWarning) {
    this.linkFormatWarning = linkFormatWarning;
    return this;
  }

 /**
  * Get duplicateProducts
  * @return duplicateProducts
  */
  @JsonProperty("duplicate_products")
  public Integer getDuplicateProducts() {
    return duplicateProducts;
  }

  /**
   * Sets the <code>duplicateProducts</code> property.
   */
 public void setDuplicateProducts(Integer duplicateProducts) {
    this.duplicateProducts = duplicateProducts;
  }

  /**
   * Sets the <code>duplicateProducts</code> property.
   */
  public CatalogsFeedValidationWarnings duplicateProducts(Integer duplicateProducts) {
    this.duplicateProducts = duplicateProducts;
    return this;
  }

 /**
  * Get duplicateLinks
  * @return duplicateLinks
  */
  @JsonProperty("duplicate_links")
  public Integer getDuplicateLinks() {
    return duplicateLinks;
  }

  /**
   * Sets the <code>duplicateLinks</code> property.
   */
 public void setDuplicateLinks(Integer duplicateLinks) {
    this.duplicateLinks = duplicateLinks;
  }

  /**
   * Sets the <code>duplicateLinks</code> property.
   */
  public CatalogsFeedValidationWarnings duplicateLinks(Integer duplicateLinks) {
    this.duplicateLinks = duplicateLinks;
    return this;
  }

 /**
  * Get salesPriceInvalid
  * @return salesPriceInvalid
  */
  @JsonProperty("sales_price_invalid")
  public Integer getSalesPriceInvalid() {
    return salesPriceInvalid;
  }

  /**
   * Sets the <code>salesPriceInvalid</code> property.
   */
 public void setSalesPriceInvalid(Integer salesPriceInvalid) {
    this.salesPriceInvalid = salesPriceInvalid;
  }

  /**
   * Sets the <code>salesPriceInvalid</code> property.
   */
  public CatalogsFeedValidationWarnings salesPriceInvalid(Integer salesPriceInvalid) {
    this.salesPriceInvalid = salesPriceInvalid;
    return this;
  }

 /**
  * Get productCategoryDepthWarning
  * @return productCategoryDepthWarning
  */
  @JsonProperty("product_category_depth_warning")
  public Integer getProductCategoryDepthWarning() {
    return productCategoryDepthWarning;
  }

  /**
   * Sets the <code>productCategoryDepthWarning</code> property.
   */
 public void setProductCategoryDepthWarning(Integer productCategoryDepthWarning) {
    this.productCategoryDepthWarning = productCategoryDepthWarning;
  }

  /**
   * Sets the <code>productCategoryDepthWarning</code> property.
   */
  public CatalogsFeedValidationWarnings productCategoryDepthWarning(Integer productCategoryDepthWarning) {
    this.productCategoryDepthWarning = productCategoryDepthWarning;
    return this;
  }

 /**
  * Get adwordsSameAsLink
  * @return adwordsSameAsLink
  */
  @JsonProperty("adwords_same_as_link")
  public Integer getAdwordsSameAsLink() {
    return adwordsSameAsLink;
  }

  /**
   * Sets the <code>adwordsSameAsLink</code> property.
   */
 public void setAdwordsSameAsLink(Integer adwordsSameAsLink) {
    this.adwordsSameAsLink = adwordsSameAsLink;
  }

  /**
   * Sets the <code>adwordsSameAsLink</code> property.
   */
  public CatalogsFeedValidationWarnings adwordsSameAsLink(Integer adwordsSameAsLink) {
    this.adwordsSameAsLink = adwordsSameAsLink;
    return this;
  }

 /**
  * Get duplicateHeaders
  * @return duplicateHeaders
  */
  @JsonProperty("duplicate_headers")
  public Integer getDuplicateHeaders() {
    return duplicateHeaders;
  }

  /**
   * Sets the <code>duplicateHeaders</code> property.
   */
 public void setDuplicateHeaders(Integer duplicateHeaders) {
    this.duplicateHeaders = duplicateHeaders;
  }

  /**
   * Sets the <code>duplicateHeaders</code> property.
   */
  public CatalogsFeedValidationWarnings duplicateHeaders(Integer duplicateHeaders) {
    this.duplicateHeaders = duplicateHeaders;
    return this;
  }

 /**
  * Get fetchSameSignature
  * @return fetchSameSignature
  */
  @JsonProperty("fetch_same_signature")
  public Integer getFetchSameSignature() {
    return fetchSameSignature;
  }

  /**
   * Sets the <code>fetchSameSignature</code> property.
   */
 public void setFetchSameSignature(Integer fetchSameSignature) {
    this.fetchSameSignature = fetchSameSignature;
  }

  /**
   * Sets the <code>fetchSameSignature</code> property.
   */
  public CatalogsFeedValidationWarnings fetchSameSignature(Integer fetchSameSignature) {
    this.fetchSameSignature = fetchSameSignature;
    return this;
  }

 /**
  * Get adwordsFormatWarning
  * @return adwordsFormatWarning
  */
  @JsonProperty("adwords_format_warning")
  public Integer getAdwordsFormatWarning() {
    return adwordsFormatWarning;
  }

  /**
   * Sets the <code>adwordsFormatWarning</code> property.
   */
 public void setAdwordsFormatWarning(Integer adwordsFormatWarning) {
    this.adwordsFormatWarning = adwordsFormatWarning;
  }

  /**
   * Sets the <code>adwordsFormatWarning</code> property.
   */
  public CatalogsFeedValidationWarnings adwordsFormatWarning(Integer adwordsFormatWarning) {
    this.adwordsFormatWarning = adwordsFormatWarning;
    return this;
  }

 /**
  * Get additionalImageLinkWarning
  * @return additionalImageLinkWarning
  */
  @JsonProperty("additional_image_link_warning")
  public Integer getAdditionalImageLinkWarning() {
    return additionalImageLinkWarning;
  }

  /**
   * Sets the <code>additionalImageLinkWarning</code> property.
   */
 public void setAdditionalImageLinkWarning(Integer additionalImageLinkWarning) {
    this.additionalImageLinkWarning = additionalImageLinkWarning;
  }

  /**
   * Sets the <code>additionalImageLinkWarning</code> property.
   */
  public CatalogsFeedValidationWarnings additionalImageLinkWarning(Integer additionalImageLinkWarning) {
    this.additionalImageLinkWarning = additionalImageLinkWarning;
    return this;
  }

 /**
  * Get imageLinkWarning
  * @return imageLinkWarning
  */
  @JsonProperty("image_link_warning")
  public Integer getImageLinkWarning() {
    return imageLinkWarning;
  }

  /**
   * Sets the <code>imageLinkWarning</code> property.
   */
 public void setImageLinkWarning(Integer imageLinkWarning) {
    this.imageLinkWarning = imageLinkWarning;
  }

  /**
   * Sets the <code>imageLinkWarning</code> property.
   */
  public CatalogsFeedValidationWarnings imageLinkWarning(Integer imageLinkWarning) {
    this.imageLinkWarning = imageLinkWarning;
    return this;
  }

 /**
  * Get shippingInvalid
  * @return shippingInvalid
  */
  @JsonProperty("shipping_invalid")
  public Integer getShippingInvalid() {
    return shippingInvalid;
  }

  /**
   * Sets the <code>shippingInvalid</code> property.
   */
 public void setShippingInvalid(Integer shippingInvalid) {
    this.shippingInvalid = shippingInvalid;
  }

  /**
   * Sets the <code>shippingInvalid</code> property.
   */
  public CatalogsFeedValidationWarnings shippingInvalid(Integer shippingInvalid) {
    this.shippingInvalid = shippingInvalid;
    return this;
  }

 /**
  * Get taxInvalid
  * @return taxInvalid
  */
  @JsonProperty("tax_invalid")
  public Integer getTaxInvalid() {
    return taxInvalid;
  }

  /**
   * Sets the <code>taxInvalid</code> property.
   */
 public void setTaxInvalid(Integer taxInvalid) {
    this.taxInvalid = taxInvalid;
  }

  /**
   * Sets the <code>taxInvalid</code> property.
   */
  public CatalogsFeedValidationWarnings taxInvalid(Integer taxInvalid) {
    this.taxInvalid = taxInvalid;
    return this;
  }

 /**
  * Get shippingWeightInvalid
  * @return shippingWeightInvalid
  */
  @JsonProperty("shipping_weight_invalid")
  public Integer getShippingWeightInvalid() {
    return shippingWeightInvalid;
  }

  /**
   * Sets the <code>shippingWeightInvalid</code> property.
   */
 public void setShippingWeightInvalid(Integer shippingWeightInvalid) {
    this.shippingWeightInvalid = shippingWeightInvalid;
  }

  /**
   * Sets the <code>shippingWeightInvalid</code> property.
   */
  public CatalogsFeedValidationWarnings shippingWeightInvalid(Integer shippingWeightInvalid) {
    this.shippingWeightInvalid = shippingWeightInvalid;
    return this;
  }

 /**
  * Get expirationDateInvalid
  * @return expirationDateInvalid
  */
  @JsonProperty("expiration_date_invalid")
  public Integer getExpirationDateInvalid() {
    return expirationDateInvalid;
  }

  /**
   * Sets the <code>expirationDateInvalid</code> property.
   */
 public void setExpirationDateInvalid(Integer expirationDateInvalid) {
    this.expirationDateInvalid = expirationDateInvalid;
  }

  /**
   * Sets the <code>expirationDateInvalid</code> property.
   */
  public CatalogsFeedValidationWarnings expirationDateInvalid(Integer expirationDateInvalid) {
    this.expirationDateInvalid = expirationDateInvalid;
    return this;
  }

 /**
  * Get availabilityDateInvalid
  * @return availabilityDateInvalid
  */
  @JsonProperty("availability_date_invalid")
  public Integer getAvailabilityDateInvalid() {
    return availabilityDateInvalid;
  }

  /**
   * Sets the <code>availabilityDateInvalid</code> property.
   */
 public void setAvailabilityDateInvalid(Integer availabilityDateInvalid) {
    this.availabilityDateInvalid = availabilityDateInvalid;
  }

  /**
   * Sets the <code>availabilityDateInvalid</code> property.
   */
  public CatalogsFeedValidationWarnings availabilityDateInvalid(Integer availabilityDateInvalid) {
    this.availabilityDateInvalid = availabilityDateInvalid;
    return this;
  }

 /**
  * Get saleDateInvalid
  * @return saleDateInvalid
  */
  @JsonProperty("sale_date_invalid")
  public Integer getSaleDateInvalid() {
    return saleDateInvalid;
  }

  /**
   * Sets the <code>saleDateInvalid</code> property.
   */
 public void setSaleDateInvalid(Integer saleDateInvalid) {
    this.saleDateInvalid = saleDateInvalid;
  }

  /**
   * Sets the <code>saleDateInvalid</code> property.
   */
  public CatalogsFeedValidationWarnings saleDateInvalid(Integer saleDateInvalid) {
    this.saleDateInvalid = saleDateInvalid;
    return this;
  }

 /**
  * Get weightUnitInvalid
  * @return weightUnitInvalid
  */
  @JsonProperty("weight_unit_invalid")
  public Integer getWeightUnitInvalid() {
    return weightUnitInvalid;
  }

  /**
   * Sets the <code>weightUnitInvalid</code> property.
   */
 public void setWeightUnitInvalid(Integer weightUnitInvalid) {
    this.weightUnitInvalid = weightUnitInvalid;
  }

  /**
   * Sets the <code>weightUnitInvalid</code> property.
   */
  public CatalogsFeedValidationWarnings weightUnitInvalid(Integer weightUnitInvalid) {
    this.weightUnitInvalid = weightUnitInvalid;
    return this;
  }

 /**
  * Get isBundleInvalid
  * @return isBundleInvalid
  */
  @JsonProperty("is_bundle_invalid")
  public Integer getIsBundleInvalid() {
    return isBundleInvalid;
  }

  /**
   * Sets the <code>isBundleInvalid</code> property.
   */
 public void setIsBundleInvalid(Integer isBundleInvalid) {
    this.isBundleInvalid = isBundleInvalid;
  }

  /**
   * Sets the <code>isBundleInvalid</code> property.
   */
  public CatalogsFeedValidationWarnings isBundleInvalid(Integer isBundleInvalid) {
    this.isBundleInvalid = isBundleInvalid;
    return this;
  }

 /**
  * Get updatedTimeInvalid
  * @return updatedTimeInvalid
  */
  @JsonProperty("updated_time_invalid")
  public Integer getUpdatedTimeInvalid() {
    return updatedTimeInvalid;
  }

  /**
   * Sets the <code>updatedTimeInvalid</code> property.
   */
 public void setUpdatedTimeInvalid(Integer updatedTimeInvalid) {
    this.updatedTimeInvalid = updatedTimeInvalid;
  }

  /**
   * Sets the <code>updatedTimeInvalid</code> property.
   */
  public CatalogsFeedValidationWarnings updatedTimeInvalid(Integer updatedTimeInvalid) {
    this.updatedTimeInvalid = updatedTimeInvalid;
    return this;
  }

 /**
  * Get customLabelLengthTooLong
  * @return customLabelLengthTooLong
  */
  @JsonProperty("custom_label_length_too_long")
  public Integer getCustomLabelLengthTooLong() {
    return customLabelLengthTooLong;
  }

  /**
   * Sets the <code>customLabelLengthTooLong</code> property.
   */
 public void setCustomLabelLengthTooLong(Integer customLabelLengthTooLong) {
    this.customLabelLengthTooLong = customLabelLengthTooLong;
  }

  /**
   * Sets the <code>customLabelLengthTooLong</code> property.
   */
  public CatalogsFeedValidationWarnings customLabelLengthTooLong(Integer customLabelLengthTooLong) {
    this.customLabelLengthTooLong = customLabelLengthTooLong;
    return this;
  }

 /**
  * Get productTypeLengthTooLong
  * @return productTypeLengthTooLong
  */
  @JsonProperty("product_type_length_too_long")
  public Integer getProductTypeLengthTooLong() {
    return productTypeLengthTooLong;
  }

  /**
   * Sets the <code>productTypeLengthTooLong</code> property.
   */
 public void setProductTypeLengthTooLong(Integer productTypeLengthTooLong) {
    this.productTypeLengthTooLong = productTypeLengthTooLong;
  }

  /**
   * Sets the <code>productTypeLengthTooLong</code> property.
   */
  public CatalogsFeedValidationWarnings productTypeLengthTooLong(Integer productTypeLengthTooLong) {
    this.productTypeLengthTooLong = productTypeLengthTooLong;
    return this;
  }

 /**
  * Get tooManyAdditionalImageLinks
  * @return tooManyAdditionalImageLinks
  */
  @JsonProperty("too_many_additional_image_links")
  public Integer getTooManyAdditionalImageLinks() {
    return tooManyAdditionalImageLinks;
  }

  /**
   * Sets the <code>tooManyAdditionalImageLinks</code> property.
   */
 public void setTooManyAdditionalImageLinks(Integer tooManyAdditionalImageLinks) {
    this.tooManyAdditionalImageLinks = tooManyAdditionalImageLinks;
  }

  /**
   * Sets the <code>tooManyAdditionalImageLinks</code> property.
   */
  public CatalogsFeedValidationWarnings tooManyAdditionalImageLinks(Integer tooManyAdditionalImageLinks) {
    this.tooManyAdditionalImageLinks = tooManyAdditionalImageLinks;
    return this;
  }

 /**
  * Get multipackInvalid
  * @return multipackInvalid
  */
  @JsonProperty("multipack_invalid")
  public Integer getMultipackInvalid() {
    return multipackInvalid;
  }

  /**
   * Sets the <code>multipackInvalid</code> property.
   */
 public void setMultipackInvalid(Integer multipackInvalid) {
    this.multipackInvalid = multipackInvalid;
  }

  /**
   * Sets the <code>multipackInvalid</code> property.
   */
  public CatalogsFeedValidationWarnings multipackInvalid(Integer multipackInvalid) {
    this.multipackInvalid = multipackInvalid;
    return this;
  }

 /**
  * Get indexedProductCountLargeDelta
  * @return indexedProductCountLargeDelta
  */
  @JsonProperty("indexed_product_count_large_delta")
  public Integer getIndexedProductCountLargeDelta() {
    return indexedProductCountLargeDelta;
  }

  /**
   * Sets the <code>indexedProductCountLargeDelta</code> property.
   */
 public void setIndexedProductCountLargeDelta(Integer indexedProductCountLargeDelta) {
    this.indexedProductCountLargeDelta = indexedProductCountLargeDelta;
  }

  /**
   * Sets the <code>indexedProductCountLargeDelta</code> property.
   */
  public CatalogsFeedValidationWarnings indexedProductCountLargeDelta(Integer indexedProductCountLargeDelta) {
    this.indexedProductCountLargeDelta = indexedProductCountLargeDelta;
    return this;
  }

 /**
  * Get itemAdditionalImageDownloadFailure
  * @return itemAdditionalImageDownloadFailure
  */
  @JsonProperty("item_additional_image_download_failure")
  public Integer getItemAdditionalImageDownloadFailure() {
    return itemAdditionalImageDownloadFailure;
  }

  /**
   * Sets the <code>itemAdditionalImageDownloadFailure</code> property.
   */
 public void setItemAdditionalImageDownloadFailure(Integer itemAdditionalImageDownloadFailure) {
    this.itemAdditionalImageDownloadFailure = itemAdditionalImageDownloadFailure;
  }

  /**
   * Sets the <code>itemAdditionalImageDownloadFailure</code> property.
   */
  public CatalogsFeedValidationWarnings itemAdditionalImageDownloadFailure(Integer itemAdditionalImageDownloadFailure) {
    this.itemAdditionalImageDownloadFailure = itemAdditionalImageDownloadFailure;
    return this;
  }

 /**
  * Get optionalProductCategoryMissing
  * @return optionalProductCategoryMissing
  */
  @JsonProperty("optional_product_category_missing")
  public Integer getOptionalProductCategoryMissing() {
    return optionalProductCategoryMissing;
  }

  /**
   * Sets the <code>optionalProductCategoryMissing</code> property.
   */
 public void setOptionalProductCategoryMissing(Integer optionalProductCategoryMissing) {
    this.optionalProductCategoryMissing = optionalProductCategoryMissing;
  }

  /**
   * Sets the <code>optionalProductCategoryMissing</code> property.
   */
  public CatalogsFeedValidationWarnings optionalProductCategoryMissing(Integer optionalProductCategoryMissing) {
    this.optionalProductCategoryMissing = optionalProductCategoryMissing;
    return this;
  }

 /**
  * Get optionalProductCategoryInvalid
  * @return optionalProductCategoryInvalid
  */
  @JsonProperty("optional_product_category_invalid")
  public Integer getOptionalProductCategoryInvalid() {
    return optionalProductCategoryInvalid;
  }

  /**
   * Sets the <code>optionalProductCategoryInvalid</code> property.
   */
 public void setOptionalProductCategoryInvalid(Integer optionalProductCategoryInvalid) {
    this.optionalProductCategoryInvalid = optionalProductCategoryInvalid;
  }

  /**
   * Sets the <code>optionalProductCategoryInvalid</code> property.
   */
  public CatalogsFeedValidationWarnings optionalProductCategoryInvalid(Integer optionalProductCategoryInvalid) {
    this.optionalProductCategoryInvalid = optionalProductCategoryInvalid;
    return this;
  }

 /**
  * Get optionalConditionMissing
  * @return optionalConditionMissing
  */
  @JsonProperty("optional_condition_missing")
  public Integer getOptionalConditionMissing() {
    return optionalConditionMissing;
  }

  /**
   * Sets the <code>optionalConditionMissing</code> property.
   */
 public void setOptionalConditionMissing(Integer optionalConditionMissing) {
    this.optionalConditionMissing = optionalConditionMissing;
  }

  /**
   * Sets the <code>optionalConditionMissing</code> property.
   */
  public CatalogsFeedValidationWarnings optionalConditionMissing(Integer optionalConditionMissing) {
    this.optionalConditionMissing = optionalConditionMissing;
    return this;
  }

 /**
  * Get optionalConditionInvalid
  * @return optionalConditionInvalid
  */
  @JsonProperty("optional_condition_invalid")
  public Integer getOptionalConditionInvalid() {
    return optionalConditionInvalid;
  }

  /**
   * Sets the <code>optionalConditionInvalid</code> property.
   */
 public void setOptionalConditionInvalid(Integer optionalConditionInvalid) {
    this.optionalConditionInvalid = optionalConditionInvalid;
  }

  /**
   * Sets the <code>optionalConditionInvalid</code> property.
   */
  public CatalogsFeedValidationWarnings optionalConditionInvalid(Integer optionalConditionInvalid) {
    this.optionalConditionInvalid = optionalConditionInvalid;
    return this;
  }

 /**
  * Get iosDeepLinkInvalid
  * @return iosDeepLinkInvalid
  */
  @JsonProperty("ios_deep_link_invalid")
  public Integer getIosDeepLinkInvalid() {
    return iosDeepLinkInvalid;
  }

  /**
   * Sets the <code>iosDeepLinkInvalid</code> property.
   */
 public void setIosDeepLinkInvalid(Integer iosDeepLinkInvalid) {
    this.iosDeepLinkInvalid = iosDeepLinkInvalid;
  }

  /**
   * Sets the <code>iosDeepLinkInvalid</code> property.
   */
  public CatalogsFeedValidationWarnings iosDeepLinkInvalid(Integer iosDeepLinkInvalid) {
    this.iosDeepLinkInvalid = iosDeepLinkInvalid;
    return this;
  }

 /**
  * Get androidDeepLinkInvalid
  * @return androidDeepLinkInvalid
  */
  @JsonProperty("android_deep_link_invalid")
  public Integer getAndroidDeepLinkInvalid() {
    return androidDeepLinkInvalid;
  }

  /**
   * Sets the <code>androidDeepLinkInvalid</code> property.
   */
 public void setAndroidDeepLinkInvalid(Integer androidDeepLinkInvalid) {
    this.androidDeepLinkInvalid = androidDeepLinkInvalid;
  }

  /**
   * Sets the <code>androidDeepLinkInvalid</code> property.
   */
  public CatalogsFeedValidationWarnings androidDeepLinkInvalid(Integer androidDeepLinkInvalid) {
    this.androidDeepLinkInvalid = androidDeepLinkInvalid;
    return this;
  }

 /**
  * Get availabilityNormalized
  * @return availabilityNormalized
  */
  @JsonProperty("availability_normalized")
  public Integer getAvailabilityNormalized() {
    return availabilityNormalized;
  }

  /**
   * Sets the <code>availabilityNormalized</code> property.
   */
 public void setAvailabilityNormalized(Integer availabilityNormalized) {
    this.availabilityNormalized = availabilityNormalized;
  }

  /**
   * Sets the <code>availabilityNormalized</code> property.
   */
  public CatalogsFeedValidationWarnings availabilityNormalized(Integer availabilityNormalized) {
    this.availabilityNormalized = availabilityNormalized;
    return this;
  }

 /**
  * Get conditionNormalized
  * @return conditionNormalized
  */
  @JsonProperty("condition_normalized")
  public Integer getConditionNormalized() {
    return conditionNormalized;
  }

  /**
   * Sets the <code>conditionNormalized</code> property.
   */
 public void setConditionNormalized(Integer conditionNormalized) {
    this.conditionNormalized = conditionNormalized;
  }

  /**
   * Sets the <code>conditionNormalized</code> property.
   */
  public CatalogsFeedValidationWarnings conditionNormalized(Integer conditionNormalized) {
    this.conditionNormalized = conditionNormalized;
    return this;
  }

 /**
  * Get genderNormalized
  * @return genderNormalized
  */
  @JsonProperty("gender_normalized")
  public Integer getGenderNormalized() {
    return genderNormalized;
  }

  /**
   * Sets the <code>genderNormalized</code> property.
   */
 public void setGenderNormalized(Integer genderNormalized) {
    this.genderNormalized = genderNormalized;
  }

  /**
   * Sets the <code>genderNormalized</code> property.
   */
  public CatalogsFeedValidationWarnings genderNormalized(Integer genderNormalized) {
    this.genderNormalized = genderNormalized;
    return this;
  }

 /**
  * Get sizeTypeNormalized
  * @return sizeTypeNormalized
  */
  @JsonProperty("size_type_normalized")
  public Integer getSizeTypeNormalized() {
    return sizeTypeNormalized;
  }

  /**
   * Sets the <code>sizeTypeNormalized</code> property.
   */
 public void setSizeTypeNormalized(Integer sizeTypeNormalized) {
    this.sizeTypeNormalized = sizeTypeNormalized;
  }

  /**
   * Sets the <code>sizeTypeNormalized</code> property.
   */
  public CatalogsFeedValidationWarnings sizeTypeNormalized(Integer sizeTypeNormalized) {
    this.sizeTypeNormalized = sizeTypeNormalized;
    return this;
  }

 /**
  * Get ageGroupNormalized
  * @return ageGroupNormalized
  */
  @JsonProperty("age_group_normalized")
  public Integer getAgeGroupNormalized() {
    return ageGroupNormalized;
  }

  /**
   * Sets the <code>ageGroupNormalized</code> property.
   */
 public void setAgeGroupNormalized(Integer ageGroupNormalized) {
    this.ageGroupNormalized = ageGroupNormalized;
  }

  /**
   * Sets the <code>ageGroupNormalized</code> property.
   */
  public CatalogsFeedValidationWarnings ageGroupNormalized(Integer ageGroupNormalized) {
    this.ageGroupNormalized = ageGroupNormalized;
    return this;
  }

 /**
  * Get utmSourceAutoCorrected
  * @return utmSourceAutoCorrected
  */
  @JsonProperty("utm_source_auto_corrected")
  public Integer getUtmSourceAutoCorrected() {
    return utmSourceAutoCorrected;
  }

  /**
   * Sets the <code>utmSourceAutoCorrected</code> property.
   */
 public void setUtmSourceAutoCorrected(Integer utmSourceAutoCorrected) {
    this.utmSourceAutoCorrected = utmSourceAutoCorrected;
  }

  /**
   * Sets the <code>utmSourceAutoCorrected</code> property.
   */
  public CatalogsFeedValidationWarnings utmSourceAutoCorrected(Integer utmSourceAutoCorrected) {
    this.utmSourceAutoCorrected = utmSourceAutoCorrected;
    return this;
  }

 /**
  * Get countryDoesNotMapToCurrency
  * @return countryDoesNotMapToCurrency
  */
  @JsonProperty("country_does_not_map_to_currency")
  public Integer getCountryDoesNotMapToCurrency() {
    return countryDoesNotMapToCurrency;
  }

  /**
   * Sets the <code>countryDoesNotMapToCurrency</code> property.
   */
 public void setCountryDoesNotMapToCurrency(Integer countryDoesNotMapToCurrency) {
    this.countryDoesNotMapToCurrency = countryDoesNotMapToCurrency;
  }

  /**
   * Sets the <code>countryDoesNotMapToCurrency</code> property.
   */
  public CatalogsFeedValidationWarnings countryDoesNotMapToCurrency(Integer countryDoesNotMapToCurrency) {
    this.countryDoesNotMapToCurrency = countryDoesNotMapToCurrency;
    return this;
  }

 /**
  * Get minAdPriceInvalid
  * @return minAdPriceInvalid
  */
  @JsonProperty("min_ad_price_invalid")
  public Integer getMinAdPriceInvalid() {
    return minAdPriceInvalid;
  }

  /**
   * Sets the <code>minAdPriceInvalid</code> property.
   */
 public void setMinAdPriceInvalid(Integer minAdPriceInvalid) {
    this.minAdPriceInvalid = minAdPriceInvalid;
  }

  /**
   * Sets the <code>minAdPriceInvalid</code> property.
   */
  public CatalogsFeedValidationWarnings minAdPriceInvalid(Integer minAdPriceInvalid) {
    this.minAdPriceInvalid = minAdPriceInvalid;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedValidationWarnings {\n");
    
    sb.append("    titleLengthTooLong: ").append(toIndentedString(titleLengthTooLong)).append("\n");
    sb.append("    descriptionLengthTooLong: ").append(toIndentedString(descriptionLengthTooLong)).append("\n");
    sb.append("    genderInvalid: ").append(toIndentedString(genderInvalid)).append("\n");
    sb.append("    ageGroupInvalid: ").append(toIndentedString(ageGroupInvalid)).append("\n");
    sb.append("    sizeTypeInvalid: ").append(toIndentedString(sizeTypeInvalid)).append("\n");
    sb.append("    linkFormatWarning: ").append(toIndentedString(linkFormatWarning)).append("\n");
    sb.append("    duplicateProducts: ").append(toIndentedString(duplicateProducts)).append("\n");
    sb.append("    duplicateLinks: ").append(toIndentedString(duplicateLinks)).append("\n");
    sb.append("    salesPriceInvalid: ").append(toIndentedString(salesPriceInvalid)).append("\n");
    sb.append("    productCategoryDepthWarning: ").append(toIndentedString(productCategoryDepthWarning)).append("\n");
    sb.append("    adwordsSameAsLink: ").append(toIndentedString(adwordsSameAsLink)).append("\n");
    sb.append("    duplicateHeaders: ").append(toIndentedString(duplicateHeaders)).append("\n");
    sb.append("    fetchSameSignature: ").append(toIndentedString(fetchSameSignature)).append("\n");
    sb.append("    adwordsFormatWarning: ").append(toIndentedString(adwordsFormatWarning)).append("\n");
    sb.append("    additionalImageLinkWarning: ").append(toIndentedString(additionalImageLinkWarning)).append("\n");
    sb.append("    imageLinkWarning: ").append(toIndentedString(imageLinkWarning)).append("\n");
    sb.append("    shippingInvalid: ").append(toIndentedString(shippingInvalid)).append("\n");
    sb.append("    taxInvalid: ").append(toIndentedString(taxInvalid)).append("\n");
    sb.append("    shippingWeightInvalid: ").append(toIndentedString(shippingWeightInvalid)).append("\n");
    sb.append("    expirationDateInvalid: ").append(toIndentedString(expirationDateInvalid)).append("\n");
    sb.append("    availabilityDateInvalid: ").append(toIndentedString(availabilityDateInvalid)).append("\n");
    sb.append("    saleDateInvalid: ").append(toIndentedString(saleDateInvalid)).append("\n");
    sb.append("    weightUnitInvalid: ").append(toIndentedString(weightUnitInvalid)).append("\n");
    sb.append("    isBundleInvalid: ").append(toIndentedString(isBundleInvalid)).append("\n");
    sb.append("    updatedTimeInvalid: ").append(toIndentedString(updatedTimeInvalid)).append("\n");
    sb.append("    customLabelLengthTooLong: ").append(toIndentedString(customLabelLengthTooLong)).append("\n");
    sb.append("    productTypeLengthTooLong: ").append(toIndentedString(productTypeLengthTooLong)).append("\n");
    sb.append("    tooManyAdditionalImageLinks: ").append(toIndentedString(tooManyAdditionalImageLinks)).append("\n");
    sb.append("    multipackInvalid: ").append(toIndentedString(multipackInvalid)).append("\n");
    sb.append("    indexedProductCountLargeDelta: ").append(toIndentedString(indexedProductCountLargeDelta)).append("\n");
    sb.append("    itemAdditionalImageDownloadFailure: ").append(toIndentedString(itemAdditionalImageDownloadFailure)).append("\n");
    sb.append("    optionalProductCategoryMissing: ").append(toIndentedString(optionalProductCategoryMissing)).append("\n");
    sb.append("    optionalProductCategoryInvalid: ").append(toIndentedString(optionalProductCategoryInvalid)).append("\n");
    sb.append("    optionalConditionMissing: ").append(toIndentedString(optionalConditionMissing)).append("\n");
    sb.append("    optionalConditionInvalid: ").append(toIndentedString(optionalConditionInvalid)).append("\n");
    sb.append("    iosDeepLinkInvalid: ").append(toIndentedString(iosDeepLinkInvalid)).append("\n");
    sb.append("    androidDeepLinkInvalid: ").append(toIndentedString(androidDeepLinkInvalid)).append("\n");
    sb.append("    availabilityNormalized: ").append(toIndentedString(availabilityNormalized)).append("\n");
    sb.append("    conditionNormalized: ").append(toIndentedString(conditionNormalized)).append("\n");
    sb.append("    genderNormalized: ").append(toIndentedString(genderNormalized)).append("\n");
    sb.append("    sizeTypeNormalized: ").append(toIndentedString(sizeTypeNormalized)).append("\n");
    sb.append("    ageGroupNormalized: ").append(toIndentedString(ageGroupNormalized)).append("\n");
    sb.append("    utmSourceAutoCorrected: ").append(toIndentedString(utmSourceAutoCorrected)).append("\n");
    sb.append("    countryDoesNotMapToCurrency: ").append(toIndentedString(countryDoesNotMapToCurrency)).append("\n");
    sb.append("    minAdPriceInvalid: ").append(toIndentedString(minAdPriceInvalid)).append("\n");
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


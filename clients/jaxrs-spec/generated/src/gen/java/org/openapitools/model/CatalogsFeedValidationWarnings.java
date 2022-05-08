package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CatalogsFeedValidationWarnings")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-08T00:33:54.705491Z[Etc/UTC]")public class CatalogsFeedValidationWarnings   {
  
  private @Valid Integer titleLengthTooLong;
  private @Valid Integer descriptionLengthTooLong;
  private @Valid Integer genderInvalid;
  private @Valid Integer ageGroupInvalid;
  private @Valid Integer sizeTypeInvalid;
  private @Valid Integer linkFormatWarning;
  private @Valid Integer duplicateProducts;
  private @Valid Integer duplicateLinks;
  private @Valid Integer salesPriceInvalid;
  private @Valid Integer productCategoryDepthWarning;
  private @Valid Integer adwordsSameAsLink;
  private @Valid Integer duplicateHeaders;
  private @Valid Integer fetchSameSignature;
  private @Valid Integer adwordsFormatWarning;
  private @Valid Integer additionalImageLinkWarning;
  private @Valid Integer imageLinkWarning;
  private @Valid Integer shippingInvalid;
  private @Valid Integer taxInvalid;
  private @Valid Integer shippingWeightInvalid;
  private @Valid Integer expirationDateInvalid;
  private @Valid Integer availabilityDateInvalid;
  private @Valid Integer saleDateInvalid;
  private @Valid Integer weightUnitInvalid;
  private @Valid Integer isBundleInvalid;
  private @Valid Integer updatedTimeInvalid;
  private @Valid Integer customLabelLengthTooLong;
  private @Valid Integer productTypeLengthTooLong;
  private @Valid Integer tooManyAdditionalImageLinks;
  private @Valid Integer multipackInvalid;
  private @Valid Integer indexedProductCountLargeDelta;
  private @Valid Integer itemAdditionalImageDownloadFailure;
  private @Valid Integer optionalProductCategoryMissing;
  private @Valid Integer optionalProductCategoryInvalid;
  private @Valid Integer optionalConditionMissing;
  private @Valid Integer optionalConditionInvalid;
  private @Valid Integer iosDeepLinkInvalid;
  private @Valid Integer androidDeepLinkInvalid;
  private @Valid Integer availabilityNormalized;
  private @Valid Integer conditionNormalized;
  private @Valid Integer genderNormalized;
  private @Valid Integer sizeTypeNormalized;
  private @Valid Integer ageGroupNormalized;
  private @Valid Integer utmSourceAutoCorrected;
  private @Valid Integer countryDoesNotMapToCurrency;
  private @Valid Integer minAdPriceInvalid;

  /**
   **/
  public CatalogsFeedValidationWarnings titleLengthTooLong(Integer titleLengthTooLong) {
    this.titleLengthTooLong = titleLengthTooLong;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("title_length_too_long")
  public Integer getTitleLengthTooLong() {
    return titleLengthTooLong;
  }

  @JsonProperty("title_length_too_long")
  public void setTitleLengthTooLong(Integer titleLengthTooLong) {
    this.titleLengthTooLong = titleLengthTooLong;
  }

/**
   **/
  public CatalogsFeedValidationWarnings descriptionLengthTooLong(Integer descriptionLengthTooLong) {
    this.descriptionLengthTooLong = descriptionLengthTooLong;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("description_length_too_long")
  public Integer getDescriptionLengthTooLong() {
    return descriptionLengthTooLong;
  }

  @JsonProperty("description_length_too_long")
  public void setDescriptionLengthTooLong(Integer descriptionLengthTooLong) {
    this.descriptionLengthTooLong = descriptionLengthTooLong;
  }

/**
   **/
  public CatalogsFeedValidationWarnings genderInvalid(Integer genderInvalid) {
    this.genderInvalid = genderInvalid;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("gender_invalid")
  public Integer getGenderInvalid() {
    return genderInvalid;
  }

  @JsonProperty("gender_invalid")
  public void setGenderInvalid(Integer genderInvalid) {
    this.genderInvalid = genderInvalid;
  }

/**
   **/
  public CatalogsFeedValidationWarnings ageGroupInvalid(Integer ageGroupInvalid) {
    this.ageGroupInvalid = ageGroupInvalid;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("age_group_invalid")
  public Integer getAgeGroupInvalid() {
    return ageGroupInvalid;
  }

  @JsonProperty("age_group_invalid")
  public void setAgeGroupInvalid(Integer ageGroupInvalid) {
    this.ageGroupInvalid = ageGroupInvalid;
  }

/**
   **/
  public CatalogsFeedValidationWarnings sizeTypeInvalid(Integer sizeTypeInvalid) {
    this.sizeTypeInvalid = sizeTypeInvalid;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("size_type_invalid")
  public Integer getSizeTypeInvalid() {
    return sizeTypeInvalid;
  }

  @JsonProperty("size_type_invalid")
  public void setSizeTypeInvalid(Integer sizeTypeInvalid) {
    this.sizeTypeInvalid = sizeTypeInvalid;
  }

/**
   **/
  public CatalogsFeedValidationWarnings linkFormatWarning(Integer linkFormatWarning) {
    this.linkFormatWarning = linkFormatWarning;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("link_format_warning")
  public Integer getLinkFormatWarning() {
    return linkFormatWarning;
  }

  @JsonProperty("link_format_warning")
  public void setLinkFormatWarning(Integer linkFormatWarning) {
    this.linkFormatWarning = linkFormatWarning;
  }

/**
   **/
  public CatalogsFeedValidationWarnings duplicateProducts(Integer duplicateProducts) {
    this.duplicateProducts = duplicateProducts;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("duplicate_products")
  public Integer getDuplicateProducts() {
    return duplicateProducts;
  }

  @JsonProperty("duplicate_products")
  public void setDuplicateProducts(Integer duplicateProducts) {
    this.duplicateProducts = duplicateProducts;
  }

/**
   **/
  public CatalogsFeedValidationWarnings duplicateLinks(Integer duplicateLinks) {
    this.duplicateLinks = duplicateLinks;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("duplicate_links")
  public Integer getDuplicateLinks() {
    return duplicateLinks;
  }

  @JsonProperty("duplicate_links")
  public void setDuplicateLinks(Integer duplicateLinks) {
    this.duplicateLinks = duplicateLinks;
  }

/**
   **/
  public CatalogsFeedValidationWarnings salesPriceInvalid(Integer salesPriceInvalid) {
    this.salesPriceInvalid = salesPriceInvalid;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("sales_price_invalid")
  public Integer getSalesPriceInvalid() {
    return salesPriceInvalid;
  }

  @JsonProperty("sales_price_invalid")
  public void setSalesPriceInvalid(Integer salesPriceInvalid) {
    this.salesPriceInvalid = salesPriceInvalid;
  }

/**
   **/
  public CatalogsFeedValidationWarnings productCategoryDepthWarning(Integer productCategoryDepthWarning) {
    this.productCategoryDepthWarning = productCategoryDepthWarning;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("product_category_depth_warning")
  public Integer getProductCategoryDepthWarning() {
    return productCategoryDepthWarning;
  }

  @JsonProperty("product_category_depth_warning")
  public void setProductCategoryDepthWarning(Integer productCategoryDepthWarning) {
    this.productCategoryDepthWarning = productCategoryDepthWarning;
  }

/**
   **/
  public CatalogsFeedValidationWarnings adwordsSameAsLink(Integer adwordsSameAsLink) {
    this.adwordsSameAsLink = adwordsSameAsLink;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("adwords_same_as_link")
  public Integer getAdwordsSameAsLink() {
    return adwordsSameAsLink;
  }

  @JsonProperty("adwords_same_as_link")
  public void setAdwordsSameAsLink(Integer adwordsSameAsLink) {
    this.adwordsSameAsLink = adwordsSameAsLink;
  }

/**
   **/
  public CatalogsFeedValidationWarnings duplicateHeaders(Integer duplicateHeaders) {
    this.duplicateHeaders = duplicateHeaders;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("duplicate_headers")
  public Integer getDuplicateHeaders() {
    return duplicateHeaders;
  }

  @JsonProperty("duplicate_headers")
  public void setDuplicateHeaders(Integer duplicateHeaders) {
    this.duplicateHeaders = duplicateHeaders;
  }

/**
   **/
  public CatalogsFeedValidationWarnings fetchSameSignature(Integer fetchSameSignature) {
    this.fetchSameSignature = fetchSameSignature;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("fetch_same_signature")
  public Integer getFetchSameSignature() {
    return fetchSameSignature;
  }

  @JsonProperty("fetch_same_signature")
  public void setFetchSameSignature(Integer fetchSameSignature) {
    this.fetchSameSignature = fetchSameSignature;
  }

/**
   **/
  public CatalogsFeedValidationWarnings adwordsFormatWarning(Integer adwordsFormatWarning) {
    this.adwordsFormatWarning = adwordsFormatWarning;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("adwords_format_warning")
  public Integer getAdwordsFormatWarning() {
    return adwordsFormatWarning;
  }

  @JsonProperty("adwords_format_warning")
  public void setAdwordsFormatWarning(Integer adwordsFormatWarning) {
    this.adwordsFormatWarning = adwordsFormatWarning;
  }

/**
   **/
  public CatalogsFeedValidationWarnings additionalImageLinkWarning(Integer additionalImageLinkWarning) {
    this.additionalImageLinkWarning = additionalImageLinkWarning;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("additional_image_link_warning")
  public Integer getAdditionalImageLinkWarning() {
    return additionalImageLinkWarning;
  }

  @JsonProperty("additional_image_link_warning")
  public void setAdditionalImageLinkWarning(Integer additionalImageLinkWarning) {
    this.additionalImageLinkWarning = additionalImageLinkWarning;
  }

/**
   **/
  public CatalogsFeedValidationWarnings imageLinkWarning(Integer imageLinkWarning) {
    this.imageLinkWarning = imageLinkWarning;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("image_link_warning")
  public Integer getImageLinkWarning() {
    return imageLinkWarning;
  }

  @JsonProperty("image_link_warning")
  public void setImageLinkWarning(Integer imageLinkWarning) {
    this.imageLinkWarning = imageLinkWarning;
  }

/**
   **/
  public CatalogsFeedValidationWarnings shippingInvalid(Integer shippingInvalid) {
    this.shippingInvalid = shippingInvalid;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("shipping_invalid")
  public Integer getShippingInvalid() {
    return shippingInvalid;
  }

  @JsonProperty("shipping_invalid")
  public void setShippingInvalid(Integer shippingInvalid) {
    this.shippingInvalid = shippingInvalid;
  }

/**
   **/
  public CatalogsFeedValidationWarnings taxInvalid(Integer taxInvalid) {
    this.taxInvalid = taxInvalid;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("tax_invalid")
  public Integer getTaxInvalid() {
    return taxInvalid;
  }

  @JsonProperty("tax_invalid")
  public void setTaxInvalid(Integer taxInvalid) {
    this.taxInvalid = taxInvalid;
  }

/**
   **/
  public CatalogsFeedValidationWarnings shippingWeightInvalid(Integer shippingWeightInvalid) {
    this.shippingWeightInvalid = shippingWeightInvalid;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("shipping_weight_invalid")
  public Integer getShippingWeightInvalid() {
    return shippingWeightInvalid;
  }

  @JsonProperty("shipping_weight_invalid")
  public void setShippingWeightInvalid(Integer shippingWeightInvalid) {
    this.shippingWeightInvalid = shippingWeightInvalid;
  }

/**
   **/
  public CatalogsFeedValidationWarnings expirationDateInvalid(Integer expirationDateInvalid) {
    this.expirationDateInvalid = expirationDateInvalid;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("expiration_date_invalid")
  public Integer getExpirationDateInvalid() {
    return expirationDateInvalid;
  }

  @JsonProperty("expiration_date_invalid")
  public void setExpirationDateInvalid(Integer expirationDateInvalid) {
    this.expirationDateInvalid = expirationDateInvalid;
  }

/**
   **/
  public CatalogsFeedValidationWarnings availabilityDateInvalid(Integer availabilityDateInvalid) {
    this.availabilityDateInvalid = availabilityDateInvalid;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("availability_date_invalid")
  public Integer getAvailabilityDateInvalid() {
    return availabilityDateInvalid;
  }

  @JsonProperty("availability_date_invalid")
  public void setAvailabilityDateInvalid(Integer availabilityDateInvalid) {
    this.availabilityDateInvalid = availabilityDateInvalid;
  }

/**
   **/
  public CatalogsFeedValidationWarnings saleDateInvalid(Integer saleDateInvalid) {
    this.saleDateInvalid = saleDateInvalid;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("sale_date_invalid")
  public Integer getSaleDateInvalid() {
    return saleDateInvalid;
  }

  @JsonProperty("sale_date_invalid")
  public void setSaleDateInvalid(Integer saleDateInvalid) {
    this.saleDateInvalid = saleDateInvalid;
  }

/**
   **/
  public CatalogsFeedValidationWarnings weightUnitInvalid(Integer weightUnitInvalid) {
    this.weightUnitInvalid = weightUnitInvalid;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("weight_unit_invalid")
  public Integer getWeightUnitInvalid() {
    return weightUnitInvalid;
  }

  @JsonProperty("weight_unit_invalid")
  public void setWeightUnitInvalid(Integer weightUnitInvalid) {
    this.weightUnitInvalid = weightUnitInvalid;
  }

/**
   **/
  public CatalogsFeedValidationWarnings isBundleInvalid(Integer isBundleInvalid) {
    this.isBundleInvalid = isBundleInvalid;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("is_bundle_invalid")
  public Integer getIsBundleInvalid() {
    return isBundleInvalid;
  }

  @JsonProperty("is_bundle_invalid")
  public void setIsBundleInvalid(Integer isBundleInvalid) {
    this.isBundleInvalid = isBundleInvalid;
  }

/**
   **/
  public CatalogsFeedValidationWarnings updatedTimeInvalid(Integer updatedTimeInvalid) {
    this.updatedTimeInvalid = updatedTimeInvalid;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("updated_time_invalid")
  public Integer getUpdatedTimeInvalid() {
    return updatedTimeInvalid;
  }

  @JsonProperty("updated_time_invalid")
  public void setUpdatedTimeInvalid(Integer updatedTimeInvalid) {
    this.updatedTimeInvalid = updatedTimeInvalid;
  }

/**
   **/
  public CatalogsFeedValidationWarnings customLabelLengthTooLong(Integer customLabelLengthTooLong) {
    this.customLabelLengthTooLong = customLabelLengthTooLong;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("custom_label_length_too_long")
  public Integer getCustomLabelLengthTooLong() {
    return customLabelLengthTooLong;
  }

  @JsonProperty("custom_label_length_too_long")
  public void setCustomLabelLengthTooLong(Integer customLabelLengthTooLong) {
    this.customLabelLengthTooLong = customLabelLengthTooLong;
  }

/**
   **/
  public CatalogsFeedValidationWarnings productTypeLengthTooLong(Integer productTypeLengthTooLong) {
    this.productTypeLengthTooLong = productTypeLengthTooLong;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("product_type_length_too_long")
  public Integer getProductTypeLengthTooLong() {
    return productTypeLengthTooLong;
  }

  @JsonProperty("product_type_length_too_long")
  public void setProductTypeLengthTooLong(Integer productTypeLengthTooLong) {
    this.productTypeLengthTooLong = productTypeLengthTooLong;
  }

/**
   **/
  public CatalogsFeedValidationWarnings tooManyAdditionalImageLinks(Integer tooManyAdditionalImageLinks) {
    this.tooManyAdditionalImageLinks = tooManyAdditionalImageLinks;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("too_many_additional_image_links")
  public Integer getTooManyAdditionalImageLinks() {
    return tooManyAdditionalImageLinks;
  }

  @JsonProperty("too_many_additional_image_links")
  public void setTooManyAdditionalImageLinks(Integer tooManyAdditionalImageLinks) {
    this.tooManyAdditionalImageLinks = tooManyAdditionalImageLinks;
  }

/**
   **/
  public CatalogsFeedValidationWarnings multipackInvalid(Integer multipackInvalid) {
    this.multipackInvalid = multipackInvalid;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("multipack_invalid")
  public Integer getMultipackInvalid() {
    return multipackInvalid;
  }

  @JsonProperty("multipack_invalid")
  public void setMultipackInvalid(Integer multipackInvalid) {
    this.multipackInvalid = multipackInvalid;
  }

/**
   **/
  public CatalogsFeedValidationWarnings indexedProductCountLargeDelta(Integer indexedProductCountLargeDelta) {
    this.indexedProductCountLargeDelta = indexedProductCountLargeDelta;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("indexed_product_count_large_delta")
  public Integer getIndexedProductCountLargeDelta() {
    return indexedProductCountLargeDelta;
  }

  @JsonProperty("indexed_product_count_large_delta")
  public void setIndexedProductCountLargeDelta(Integer indexedProductCountLargeDelta) {
    this.indexedProductCountLargeDelta = indexedProductCountLargeDelta;
  }

/**
   **/
  public CatalogsFeedValidationWarnings itemAdditionalImageDownloadFailure(Integer itemAdditionalImageDownloadFailure) {
    this.itemAdditionalImageDownloadFailure = itemAdditionalImageDownloadFailure;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("item_additional_image_download_failure")
  public Integer getItemAdditionalImageDownloadFailure() {
    return itemAdditionalImageDownloadFailure;
  }

  @JsonProperty("item_additional_image_download_failure")
  public void setItemAdditionalImageDownloadFailure(Integer itemAdditionalImageDownloadFailure) {
    this.itemAdditionalImageDownloadFailure = itemAdditionalImageDownloadFailure;
  }

/**
   **/
  public CatalogsFeedValidationWarnings optionalProductCategoryMissing(Integer optionalProductCategoryMissing) {
    this.optionalProductCategoryMissing = optionalProductCategoryMissing;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("optional_product_category_missing")
  public Integer getOptionalProductCategoryMissing() {
    return optionalProductCategoryMissing;
  }

  @JsonProperty("optional_product_category_missing")
  public void setOptionalProductCategoryMissing(Integer optionalProductCategoryMissing) {
    this.optionalProductCategoryMissing = optionalProductCategoryMissing;
  }

/**
   **/
  public CatalogsFeedValidationWarnings optionalProductCategoryInvalid(Integer optionalProductCategoryInvalid) {
    this.optionalProductCategoryInvalid = optionalProductCategoryInvalid;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("optional_product_category_invalid")
  public Integer getOptionalProductCategoryInvalid() {
    return optionalProductCategoryInvalid;
  }

  @JsonProperty("optional_product_category_invalid")
  public void setOptionalProductCategoryInvalid(Integer optionalProductCategoryInvalid) {
    this.optionalProductCategoryInvalid = optionalProductCategoryInvalid;
  }

/**
   **/
  public CatalogsFeedValidationWarnings optionalConditionMissing(Integer optionalConditionMissing) {
    this.optionalConditionMissing = optionalConditionMissing;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("optional_condition_missing")
  public Integer getOptionalConditionMissing() {
    return optionalConditionMissing;
  }

  @JsonProperty("optional_condition_missing")
  public void setOptionalConditionMissing(Integer optionalConditionMissing) {
    this.optionalConditionMissing = optionalConditionMissing;
  }

/**
   **/
  public CatalogsFeedValidationWarnings optionalConditionInvalid(Integer optionalConditionInvalid) {
    this.optionalConditionInvalid = optionalConditionInvalid;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("optional_condition_invalid")
  public Integer getOptionalConditionInvalid() {
    return optionalConditionInvalid;
  }

  @JsonProperty("optional_condition_invalid")
  public void setOptionalConditionInvalid(Integer optionalConditionInvalid) {
    this.optionalConditionInvalid = optionalConditionInvalid;
  }

/**
   **/
  public CatalogsFeedValidationWarnings iosDeepLinkInvalid(Integer iosDeepLinkInvalid) {
    this.iosDeepLinkInvalid = iosDeepLinkInvalid;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("ios_deep_link_invalid")
  public Integer getIosDeepLinkInvalid() {
    return iosDeepLinkInvalid;
  }

  @JsonProperty("ios_deep_link_invalid")
  public void setIosDeepLinkInvalid(Integer iosDeepLinkInvalid) {
    this.iosDeepLinkInvalid = iosDeepLinkInvalid;
  }

/**
   **/
  public CatalogsFeedValidationWarnings androidDeepLinkInvalid(Integer androidDeepLinkInvalid) {
    this.androidDeepLinkInvalid = androidDeepLinkInvalid;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("android_deep_link_invalid")
  public Integer getAndroidDeepLinkInvalid() {
    return androidDeepLinkInvalid;
  }

  @JsonProperty("android_deep_link_invalid")
  public void setAndroidDeepLinkInvalid(Integer androidDeepLinkInvalid) {
    this.androidDeepLinkInvalid = androidDeepLinkInvalid;
  }

/**
   **/
  public CatalogsFeedValidationWarnings availabilityNormalized(Integer availabilityNormalized) {
    this.availabilityNormalized = availabilityNormalized;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("availability_normalized")
  public Integer getAvailabilityNormalized() {
    return availabilityNormalized;
  }

  @JsonProperty("availability_normalized")
  public void setAvailabilityNormalized(Integer availabilityNormalized) {
    this.availabilityNormalized = availabilityNormalized;
  }

/**
   **/
  public CatalogsFeedValidationWarnings conditionNormalized(Integer conditionNormalized) {
    this.conditionNormalized = conditionNormalized;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("condition_normalized")
  public Integer getConditionNormalized() {
    return conditionNormalized;
  }

  @JsonProperty("condition_normalized")
  public void setConditionNormalized(Integer conditionNormalized) {
    this.conditionNormalized = conditionNormalized;
  }

/**
   **/
  public CatalogsFeedValidationWarnings genderNormalized(Integer genderNormalized) {
    this.genderNormalized = genderNormalized;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("gender_normalized")
  public Integer getGenderNormalized() {
    return genderNormalized;
  }

  @JsonProperty("gender_normalized")
  public void setGenderNormalized(Integer genderNormalized) {
    this.genderNormalized = genderNormalized;
  }

/**
   **/
  public CatalogsFeedValidationWarnings sizeTypeNormalized(Integer sizeTypeNormalized) {
    this.sizeTypeNormalized = sizeTypeNormalized;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("size_type_normalized")
  public Integer getSizeTypeNormalized() {
    return sizeTypeNormalized;
  }

  @JsonProperty("size_type_normalized")
  public void setSizeTypeNormalized(Integer sizeTypeNormalized) {
    this.sizeTypeNormalized = sizeTypeNormalized;
  }

/**
   **/
  public CatalogsFeedValidationWarnings ageGroupNormalized(Integer ageGroupNormalized) {
    this.ageGroupNormalized = ageGroupNormalized;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("age_group_normalized")
  public Integer getAgeGroupNormalized() {
    return ageGroupNormalized;
  }

  @JsonProperty("age_group_normalized")
  public void setAgeGroupNormalized(Integer ageGroupNormalized) {
    this.ageGroupNormalized = ageGroupNormalized;
  }

/**
   **/
  public CatalogsFeedValidationWarnings utmSourceAutoCorrected(Integer utmSourceAutoCorrected) {
    this.utmSourceAutoCorrected = utmSourceAutoCorrected;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("utm_source_auto_corrected")
  public Integer getUtmSourceAutoCorrected() {
    return utmSourceAutoCorrected;
  }

  @JsonProperty("utm_source_auto_corrected")
  public void setUtmSourceAutoCorrected(Integer utmSourceAutoCorrected) {
    this.utmSourceAutoCorrected = utmSourceAutoCorrected;
  }

/**
   **/
  public CatalogsFeedValidationWarnings countryDoesNotMapToCurrency(Integer countryDoesNotMapToCurrency) {
    this.countryDoesNotMapToCurrency = countryDoesNotMapToCurrency;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("country_does_not_map_to_currency")
  public Integer getCountryDoesNotMapToCurrency() {
    return countryDoesNotMapToCurrency;
  }

  @JsonProperty("country_does_not_map_to_currency")
  public void setCountryDoesNotMapToCurrency(Integer countryDoesNotMapToCurrency) {
    this.countryDoesNotMapToCurrency = countryDoesNotMapToCurrency;
  }

/**
   **/
  public CatalogsFeedValidationWarnings minAdPriceInvalid(Integer minAdPriceInvalid) {
    this.minAdPriceInvalid = minAdPriceInvalid;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("min_ad_price_invalid")
  public Integer getMinAdPriceInvalid() {
    return minAdPriceInvalid;
  }

  @JsonProperty("min_ad_price_invalid")
  public void setMinAdPriceInvalid(Integer minAdPriceInvalid) {
    this.minAdPriceInvalid = minAdPriceInvalid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsFeedValidationWarnings catalogsFeedValidationWarnings = (CatalogsFeedValidationWarnings) o;
    return Objects.equals(this.titleLengthTooLong, catalogsFeedValidationWarnings.titleLengthTooLong) &&
        Objects.equals(this.descriptionLengthTooLong, catalogsFeedValidationWarnings.descriptionLengthTooLong) &&
        Objects.equals(this.genderInvalid, catalogsFeedValidationWarnings.genderInvalid) &&
        Objects.equals(this.ageGroupInvalid, catalogsFeedValidationWarnings.ageGroupInvalid) &&
        Objects.equals(this.sizeTypeInvalid, catalogsFeedValidationWarnings.sizeTypeInvalid) &&
        Objects.equals(this.linkFormatWarning, catalogsFeedValidationWarnings.linkFormatWarning) &&
        Objects.equals(this.duplicateProducts, catalogsFeedValidationWarnings.duplicateProducts) &&
        Objects.equals(this.duplicateLinks, catalogsFeedValidationWarnings.duplicateLinks) &&
        Objects.equals(this.salesPriceInvalid, catalogsFeedValidationWarnings.salesPriceInvalid) &&
        Objects.equals(this.productCategoryDepthWarning, catalogsFeedValidationWarnings.productCategoryDepthWarning) &&
        Objects.equals(this.adwordsSameAsLink, catalogsFeedValidationWarnings.adwordsSameAsLink) &&
        Objects.equals(this.duplicateHeaders, catalogsFeedValidationWarnings.duplicateHeaders) &&
        Objects.equals(this.fetchSameSignature, catalogsFeedValidationWarnings.fetchSameSignature) &&
        Objects.equals(this.adwordsFormatWarning, catalogsFeedValidationWarnings.adwordsFormatWarning) &&
        Objects.equals(this.additionalImageLinkWarning, catalogsFeedValidationWarnings.additionalImageLinkWarning) &&
        Objects.equals(this.imageLinkWarning, catalogsFeedValidationWarnings.imageLinkWarning) &&
        Objects.equals(this.shippingInvalid, catalogsFeedValidationWarnings.shippingInvalid) &&
        Objects.equals(this.taxInvalid, catalogsFeedValidationWarnings.taxInvalid) &&
        Objects.equals(this.shippingWeightInvalid, catalogsFeedValidationWarnings.shippingWeightInvalid) &&
        Objects.equals(this.expirationDateInvalid, catalogsFeedValidationWarnings.expirationDateInvalid) &&
        Objects.equals(this.availabilityDateInvalid, catalogsFeedValidationWarnings.availabilityDateInvalid) &&
        Objects.equals(this.saleDateInvalid, catalogsFeedValidationWarnings.saleDateInvalid) &&
        Objects.equals(this.weightUnitInvalid, catalogsFeedValidationWarnings.weightUnitInvalid) &&
        Objects.equals(this.isBundleInvalid, catalogsFeedValidationWarnings.isBundleInvalid) &&
        Objects.equals(this.updatedTimeInvalid, catalogsFeedValidationWarnings.updatedTimeInvalid) &&
        Objects.equals(this.customLabelLengthTooLong, catalogsFeedValidationWarnings.customLabelLengthTooLong) &&
        Objects.equals(this.productTypeLengthTooLong, catalogsFeedValidationWarnings.productTypeLengthTooLong) &&
        Objects.equals(this.tooManyAdditionalImageLinks, catalogsFeedValidationWarnings.tooManyAdditionalImageLinks) &&
        Objects.equals(this.multipackInvalid, catalogsFeedValidationWarnings.multipackInvalid) &&
        Objects.equals(this.indexedProductCountLargeDelta, catalogsFeedValidationWarnings.indexedProductCountLargeDelta) &&
        Objects.equals(this.itemAdditionalImageDownloadFailure, catalogsFeedValidationWarnings.itemAdditionalImageDownloadFailure) &&
        Objects.equals(this.optionalProductCategoryMissing, catalogsFeedValidationWarnings.optionalProductCategoryMissing) &&
        Objects.equals(this.optionalProductCategoryInvalid, catalogsFeedValidationWarnings.optionalProductCategoryInvalid) &&
        Objects.equals(this.optionalConditionMissing, catalogsFeedValidationWarnings.optionalConditionMissing) &&
        Objects.equals(this.optionalConditionInvalid, catalogsFeedValidationWarnings.optionalConditionInvalid) &&
        Objects.equals(this.iosDeepLinkInvalid, catalogsFeedValidationWarnings.iosDeepLinkInvalid) &&
        Objects.equals(this.androidDeepLinkInvalid, catalogsFeedValidationWarnings.androidDeepLinkInvalid) &&
        Objects.equals(this.availabilityNormalized, catalogsFeedValidationWarnings.availabilityNormalized) &&
        Objects.equals(this.conditionNormalized, catalogsFeedValidationWarnings.conditionNormalized) &&
        Objects.equals(this.genderNormalized, catalogsFeedValidationWarnings.genderNormalized) &&
        Objects.equals(this.sizeTypeNormalized, catalogsFeedValidationWarnings.sizeTypeNormalized) &&
        Objects.equals(this.ageGroupNormalized, catalogsFeedValidationWarnings.ageGroupNormalized) &&
        Objects.equals(this.utmSourceAutoCorrected, catalogsFeedValidationWarnings.utmSourceAutoCorrected) &&
        Objects.equals(this.countryDoesNotMapToCurrency, catalogsFeedValidationWarnings.countryDoesNotMapToCurrency) &&
        Objects.equals(this.minAdPriceInvalid, catalogsFeedValidationWarnings.minAdPriceInvalid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(titleLengthTooLong, descriptionLengthTooLong, genderInvalid, ageGroupInvalid, sizeTypeInvalid, linkFormatWarning, duplicateProducts, duplicateLinks, salesPriceInvalid, productCategoryDepthWarning, adwordsSameAsLink, duplicateHeaders, fetchSameSignature, adwordsFormatWarning, additionalImageLinkWarning, imageLinkWarning, shippingInvalid, taxInvalid, shippingWeightInvalid, expirationDateInvalid, availabilityDateInvalid, saleDateInvalid, weightUnitInvalid, isBundleInvalid, updatedTimeInvalid, customLabelLengthTooLong, productTypeLengthTooLong, tooManyAdditionalImageLinks, multipackInvalid, indexedProductCountLargeDelta, itemAdditionalImageDownloadFailure, optionalProductCategoryMissing, optionalProductCategoryInvalid, optionalConditionMissing, optionalConditionInvalid, iosDeepLinkInvalid, androidDeepLinkInvalid, availabilityNormalized, conditionNormalized, genderNormalized, sizeTypeNormalized, ageGroupNormalized, utmSourceAutoCorrected, countryDoesNotMapToCurrency, minAdPriceInvalid);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}


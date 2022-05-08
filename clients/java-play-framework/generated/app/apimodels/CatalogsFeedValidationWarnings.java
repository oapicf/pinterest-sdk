package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * CatalogsFeedValidationWarnings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-05-08T00:31:58.024547Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsFeedValidationWarnings   {
  @JsonProperty("title_length_too_long")
  
  private Integer titleLengthTooLong;

  @JsonProperty("description_length_too_long")
  
  private Integer descriptionLengthTooLong;

  @JsonProperty("gender_invalid")
  
  private Integer genderInvalid;

  @JsonProperty("age_group_invalid")
  
  private Integer ageGroupInvalid;

  @JsonProperty("size_type_invalid")
  
  private Integer sizeTypeInvalid;

  @JsonProperty("link_format_warning")
  
  private Integer linkFormatWarning;

  @JsonProperty("duplicate_products")
  
  private Integer duplicateProducts;

  @JsonProperty("duplicate_links")
  
  private Integer duplicateLinks;

  @JsonProperty("sales_price_invalid")
  
  private Integer salesPriceInvalid;

  @JsonProperty("product_category_depth_warning")
  
  private Integer productCategoryDepthWarning;

  @JsonProperty("adwords_same_as_link")
  
  private Integer adwordsSameAsLink;

  @JsonProperty("duplicate_headers")
  
  private Integer duplicateHeaders;

  @JsonProperty("fetch_same_signature")
  
  private Integer fetchSameSignature;

  @JsonProperty("adwords_format_warning")
  
  private Integer adwordsFormatWarning;

  @JsonProperty("additional_image_link_warning")
  
  private Integer additionalImageLinkWarning;

  @JsonProperty("image_link_warning")
  
  private Integer imageLinkWarning;

  @JsonProperty("shipping_invalid")
  
  private Integer shippingInvalid;

  @JsonProperty("tax_invalid")
  
  private Integer taxInvalid;

  @JsonProperty("shipping_weight_invalid")
  
  private Integer shippingWeightInvalid;

  @JsonProperty("expiration_date_invalid")
  
  private Integer expirationDateInvalid;

  @JsonProperty("availability_date_invalid")
  
  private Integer availabilityDateInvalid;

  @JsonProperty("sale_date_invalid")
  
  private Integer saleDateInvalid;

  @JsonProperty("weight_unit_invalid")
  
  private Integer weightUnitInvalid;

  @JsonProperty("is_bundle_invalid")
  
  private Integer isBundleInvalid;

  @JsonProperty("updated_time_invalid")
  
  private Integer updatedTimeInvalid;

  @JsonProperty("custom_label_length_too_long")
  
  private Integer customLabelLengthTooLong;

  @JsonProperty("product_type_length_too_long")
  
  private Integer productTypeLengthTooLong;

  @JsonProperty("too_many_additional_image_links")
  
  private Integer tooManyAdditionalImageLinks;

  @JsonProperty("multipack_invalid")
  
  private Integer multipackInvalid;

  @JsonProperty("indexed_product_count_large_delta")
  
  private Integer indexedProductCountLargeDelta;

  @JsonProperty("item_additional_image_download_failure")
  
  private Integer itemAdditionalImageDownloadFailure;

  @JsonProperty("optional_product_category_missing")
  
  private Integer optionalProductCategoryMissing;

  @JsonProperty("optional_product_category_invalid")
  
  private Integer optionalProductCategoryInvalid;

  @JsonProperty("optional_condition_missing")
  
  private Integer optionalConditionMissing;

  @JsonProperty("optional_condition_invalid")
  
  private Integer optionalConditionInvalid;

  @JsonProperty("ios_deep_link_invalid")
  
  private Integer iosDeepLinkInvalid;

  @JsonProperty("android_deep_link_invalid")
  
  private Integer androidDeepLinkInvalid;

  @JsonProperty("availability_normalized")
  
  private Integer availabilityNormalized;

  @JsonProperty("condition_normalized")
  
  private Integer conditionNormalized;

  @JsonProperty("gender_normalized")
  
  private Integer genderNormalized;

  @JsonProperty("size_type_normalized")
  
  private Integer sizeTypeNormalized;

  @JsonProperty("age_group_normalized")
  
  private Integer ageGroupNormalized;

  @JsonProperty("utm_source_auto_corrected")
  
  private Integer utmSourceAutoCorrected;

  @JsonProperty("country_does_not_map_to_currency")
  
  private Integer countryDoesNotMapToCurrency;

  @JsonProperty("min_ad_price_invalid")
  
  private Integer minAdPriceInvalid;

  public CatalogsFeedValidationWarnings titleLengthTooLong(Integer titleLengthTooLong) {
    this.titleLengthTooLong = titleLengthTooLong;
    return this;
  }

   /**
   * Get titleLengthTooLong
   * @return titleLengthTooLong
  **/
  public Integer getTitleLengthTooLong() {
    return titleLengthTooLong;
  }

  public void setTitleLengthTooLong(Integer titleLengthTooLong) {
    this.titleLengthTooLong = titleLengthTooLong;
  }

  public CatalogsFeedValidationWarnings descriptionLengthTooLong(Integer descriptionLengthTooLong) {
    this.descriptionLengthTooLong = descriptionLengthTooLong;
    return this;
  }

   /**
   * Get descriptionLengthTooLong
   * @return descriptionLengthTooLong
  **/
  public Integer getDescriptionLengthTooLong() {
    return descriptionLengthTooLong;
  }

  public void setDescriptionLengthTooLong(Integer descriptionLengthTooLong) {
    this.descriptionLengthTooLong = descriptionLengthTooLong;
  }

  public CatalogsFeedValidationWarnings genderInvalid(Integer genderInvalid) {
    this.genderInvalid = genderInvalid;
    return this;
  }

   /**
   * Get genderInvalid
   * @return genderInvalid
  **/
  public Integer getGenderInvalid() {
    return genderInvalid;
  }

  public void setGenderInvalid(Integer genderInvalid) {
    this.genderInvalid = genderInvalid;
  }

  public CatalogsFeedValidationWarnings ageGroupInvalid(Integer ageGroupInvalid) {
    this.ageGroupInvalid = ageGroupInvalid;
    return this;
  }

   /**
   * Get ageGroupInvalid
   * @return ageGroupInvalid
  **/
  public Integer getAgeGroupInvalid() {
    return ageGroupInvalid;
  }

  public void setAgeGroupInvalid(Integer ageGroupInvalid) {
    this.ageGroupInvalid = ageGroupInvalid;
  }

  public CatalogsFeedValidationWarnings sizeTypeInvalid(Integer sizeTypeInvalid) {
    this.sizeTypeInvalid = sizeTypeInvalid;
    return this;
  }

   /**
   * Get sizeTypeInvalid
   * @return sizeTypeInvalid
  **/
  public Integer getSizeTypeInvalid() {
    return sizeTypeInvalid;
  }

  public void setSizeTypeInvalid(Integer sizeTypeInvalid) {
    this.sizeTypeInvalid = sizeTypeInvalid;
  }

  public CatalogsFeedValidationWarnings linkFormatWarning(Integer linkFormatWarning) {
    this.linkFormatWarning = linkFormatWarning;
    return this;
  }

   /**
   * Get linkFormatWarning
   * @return linkFormatWarning
  **/
  public Integer getLinkFormatWarning() {
    return linkFormatWarning;
  }

  public void setLinkFormatWarning(Integer linkFormatWarning) {
    this.linkFormatWarning = linkFormatWarning;
  }

  public CatalogsFeedValidationWarnings duplicateProducts(Integer duplicateProducts) {
    this.duplicateProducts = duplicateProducts;
    return this;
  }

   /**
   * Get duplicateProducts
   * @return duplicateProducts
  **/
  public Integer getDuplicateProducts() {
    return duplicateProducts;
  }

  public void setDuplicateProducts(Integer duplicateProducts) {
    this.duplicateProducts = duplicateProducts;
  }

  public CatalogsFeedValidationWarnings duplicateLinks(Integer duplicateLinks) {
    this.duplicateLinks = duplicateLinks;
    return this;
  }

   /**
   * Get duplicateLinks
   * @return duplicateLinks
  **/
  public Integer getDuplicateLinks() {
    return duplicateLinks;
  }

  public void setDuplicateLinks(Integer duplicateLinks) {
    this.duplicateLinks = duplicateLinks;
  }

  public CatalogsFeedValidationWarnings salesPriceInvalid(Integer salesPriceInvalid) {
    this.salesPriceInvalid = salesPriceInvalid;
    return this;
  }

   /**
   * Get salesPriceInvalid
   * @return salesPriceInvalid
  **/
  public Integer getSalesPriceInvalid() {
    return salesPriceInvalid;
  }

  public void setSalesPriceInvalid(Integer salesPriceInvalid) {
    this.salesPriceInvalid = salesPriceInvalid;
  }

  public CatalogsFeedValidationWarnings productCategoryDepthWarning(Integer productCategoryDepthWarning) {
    this.productCategoryDepthWarning = productCategoryDepthWarning;
    return this;
  }

   /**
   * Get productCategoryDepthWarning
   * @return productCategoryDepthWarning
  **/
  public Integer getProductCategoryDepthWarning() {
    return productCategoryDepthWarning;
  }

  public void setProductCategoryDepthWarning(Integer productCategoryDepthWarning) {
    this.productCategoryDepthWarning = productCategoryDepthWarning;
  }

  public CatalogsFeedValidationWarnings adwordsSameAsLink(Integer adwordsSameAsLink) {
    this.adwordsSameAsLink = adwordsSameAsLink;
    return this;
  }

   /**
   * Get adwordsSameAsLink
   * @return adwordsSameAsLink
  **/
  public Integer getAdwordsSameAsLink() {
    return adwordsSameAsLink;
  }

  public void setAdwordsSameAsLink(Integer adwordsSameAsLink) {
    this.adwordsSameAsLink = adwordsSameAsLink;
  }

  public CatalogsFeedValidationWarnings duplicateHeaders(Integer duplicateHeaders) {
    this.duplicateHeaders = duplicateHeaders;
    return this;
  }

   /**
   * Get duplicateHeaders
   * @return duplicateHeaders
  **/
  public Integer getDuplicateHeaders() {
    return duplicateHeaders;
  }

  public void setDuplicateHeaders(Integer duplicateHeaders) {
    this.duplicateHeaders = duplicateHeaders;
  }

  public CatalogsFeedValidationWarnings fetchSameSignature(Integer fetchSameSignature) {
    this.fetchSameSignature = fetchSameSignature;
    return this;
  }

   /**
   * Get fetchSameSignature
   * @return fetchSameSignature
  **/
  public Integer getFetchSameSignature() {
    return fetchSameSignature;
  }

  public void setFetchSameSignature(Integer fetchSameSignature) {
    this.fetchSameSignature = fetchSameSignature;
  }

  public CatalogsFeedValidationWarnings adwordsFormatWarning(Integer adwordsFormatWarning) {
    this.adwordsFormatWarning = adwordsFormatWarning;
    return this;
  }

   /**
   * Get adwordsFormatWarning
   * @return adwordsFormatWarning
  **/
  public Integer getAdwordsFormatWarning() {
    return adwordsFormatWarning;
  }

  public void setAdwordsFormatWarning(Integer adwordsFormatWarning) {
    this.adwordsFormatWarning = adwordsFormatWarning;
  }

  public CatalogsFeedValidationWarnings additionalImageLinkWarning(Integer additionalImageLinkWarning) {
    this.additionalImageLinkWarning = additionalImageLinkWarning;
    return this;
  }

   /**
   * Get additionalImageLinkWarning
   * @return additionalImageLinkWarning
  **/
  public Integer getAdditionalImageLinkWarning() {
    return additionalImageLinkWarning;
  }

  public void setAdditionalImageLinkWarning(Integer additionalImageLinkWarning) {
    this.additionalImageLinkWarning = additionalImageLinkWarning;
  }

  public CatalogsFeedValidationWarnings imageLinkWarning(Integer imageLinkWarning) {
    this.imageLinkWarning = imageLinkWarning;
    return this;
  }

   /**
   * Get imageLinkWarning
   * @return imageLinkWarning
  **/
  public Integer getImageLinkWarning() {
    return imageLinkWarning;
  }

  public void setImageLinkWarning(Integer imageLinkWarning) {
    this.imageLinkWarning = imageLinkWarning;
  }

  public CatalogsFeedValidationWarnings shippingInvalid(Integer shippingInvalid) {
    this.shippingInvalid = shippingInvalid;
    return this;
  }

   /**
   * Get shippingInvalid
   * @return shippingInvalid
  **/
  public Integer getShippingInvalid() {
    return shippingInvalid;
  }

  public void setShippingInvalid(Integer shippingInvalid) {
    this.shippingInvalid = shippingInvalid;
  }

  public CatalogsFeedValidationWarnings taxInvalid(Integer taxInvalid) {
    this.taxInvalid = taxInvalid;
    return this;
  }

   /**
   * Get taxInvalid
   * @return taxInvalid
  **/
  public Integer getTaxInvalid() {
    return taxInvalid;
  }

  public void setTaxInvalid(Integer taxInvalid) {
    this.taxInvalid = taxInvalid;
  }

  public CatalogsFeedValidationWarnings shippingWeightInvalid(Integer shippingWeightInvalid) {
    this.shippingWeightInvalid = shippingWeightInvalid;
    return this;
  }

   /**
   * Get shippingWeightInvalid
   * @return shippingWeightInvalid
  **/
  public Integer getShippingWeightInvalid() {
    return shippingWeightInvalid;
  }

  public void setShippingWeightInvalid(Integer shippingWeightInvalid) {
    this.shippingWeightInvalid = shippingWeightInvalid;
  }

  public CatalogsFeedValidationWarnings expirationDateInvalid(Integer expirationDateInvalid) {
    this.expirationDateInvalid = expirationDateInvalid;
    return this;
  }

   /**
   * Get expirationDateInvalid
   * @return expirationDateInvalid
  **/
  public Integer getExpirationDateInvalid() {
    return expirationDateInvalid;
  }

  public void setExpirationDateInvalid(Integer expirationDateInvalid) {
    this.expirationDateInvalid = expirationDateInvalid;
  }

  public CatalogsFeedValidationWarnings availabilityDateInvalid(Integer availabilityDateInvalid) {
    this.availabilityDateInvalid = availabilityDateInvalid;
    return this;
  }

   /**
   * Get availabilityDateInvalid
   * @return availabilityDateInvalid
  **/
  public Integer getAvailabilityDateInvalid() {
    return availabilityDateInvalid;
  }

  public void setAvailabilityDateInvalid(Integer availabilityDateInvalid) {
    this.availabilityDateInvalid = availabilityDateInvalid;
  }

  public CatalogsFeedValidationWarnings saleDateInvalid(Integer saleDateInvalid) {
    this.saleDateInvalid = saleDateInvalid;
    return this;
  }

   /**
   * Get saleDateInvalid
   * @return saleDateInvalid
  **/
  public Integer getSaleDateInvalid() {
    return saleDateInvalid;
  }

  public void setSaleDateInvalid(Integer saleDateInvalid) {
    this.saleDateInvalid = saleDateInvalid;
  }

  public CatalogsFeedValidationWarnings weightUnitInvalid(Integer weightUnitInvalid) {
    this.weightUnitInvalid = weightUnitInvalid;
    return this;
  }

   /**
   * Get weightUnitInvalid
   * @return weightUnitInvalid
  **/
  public Integer getWeightUnitInvalid() {
    return weightUnitInvalid;
  }

  public void setWeightUnitInvalid(Integer weightUnitInvalid) {
    this.weightUnitInvalid = weightUnitInvalid;
  }

  public CatalogsFeedValidationWarnings isBundleInvalid(Integer isBundleInvalid) {
    this.isBundleInvalid = isBundleInvalid;
    return this;
  }

   /**
   * Get isBundleInvalid
   * @return isBundleInvalid
  **/
  public Integer getIsBundleInvalid() {
    return isBundleInvalid;
  }

  public void setIsBundleInvalid(Integer isBundleInvalid) {
    this.isBundleInvalid = isBundleInvalid;
  }

  public CatalogsFeedValidationWarnings updatedTimeInvalid(Integer updatedTimeInvalid) {
    this.updatedTimeInvalid = updatedTimeInvalid;
    return this;
  }

   /**
   * Get updatedTimeInvalid
   * @return updatedTimeInvalid
  **/
  public Integer getUpdatedTimeInvalid() {
    return updatedTimeInvalid;
  }

  public void setUpdatedTimeInvalid(Integer updatedTimeInvalid) {
    this.updatedTimeInvalid = updatedTimeInvalid;
  }

  public CatalogsFeedValidationWarnings customLabelLengthTooLong(Integer customLabelLengthTooLong) {
    this.customLabelLengthTooLong = customLabelLengthTooLong;
    return this;
  }

   /**
   * Get customLabelLengthTooLong
   * @return customLabelLengthTooLong
  **/
  public Integer getCustomLabelLengthTooLong() {
    return customLabelLengthTooLong;
  }

  public void setCustomLabelLengthTooLong(Integer customLabelLengthTooLong) {
    this.customLabelLengthTooLong = customLabelLengthTooLong;
  }

  public CatalogsFeedValidationWarnings productTypeLengthTooLong(Integer productTypeLengthTooLong) {
    this.productTypeLengthTooLong = productTypeLengthTooLong;
    return this;
  }

   /**
   * Get productTypeLengthTooLong
   * @return productTypeLengthTooLong
  **/
  public Integer getProductTypeLengthTooLong() {
    return productTypeLengthTooLong;
  }

  public void setProductTypeLengthTooLong(Integer productTypeLengthTooLong) {
    this.productTypeLengthTooLong = productTypeLengthTooLong;
  }

  public CatalogsFeedValidationWarnings tooManyAdditionalImageLinks(Integer tooManyAdditionalImageLinks) {
    this.tooManyAdditionalImageLinks = tooManyAdditionalImageLinks;
    return this;
  }

   /**
   * Get tooManyAdditionalImageLinks
   * @return tooManyAdditionalImageLinks
  **/
  public Integer getTooManyAdditionalImageLinks() {
    return tooManyAdditionalImageLinks;
  }

  public void setTooManyAdditionalImageLinks(Integer tooManyAdditionalImageLinks) {
    this.tooManyAdditionalImageLinks = tooManyAdditionalImageLinks;
  }

  public CatalogsFeedValidationWarnings multipackInvalid(Integer multipackInvalid) {
    this.multipackInvalid = multipackInvalid;
    return this;
  }

   /**
   * Get multipackInvalid
   * @return multipackInvalid
  **/
  public Integer getMultipackInvalid() {
    return multipackInvalid;
  }

  public void setMultipackInvalid(Integer multipackInvalid) {
    this.multipackInvalid = multipackInvalid;
  }

  public CatalogsFeedValidationWarnings indexedProductCountLargeDelta(Integer indexedProductCountLargeDelta) {
    this.indexedProductCountLargeDelta = indexedProductCountLargeDelta;
    return this;
  }

   /**
   * Get indexedProductCountLargeDelta
   * @return indexedProductCountLargeDelta
  **/
  public Integer getIndexedProductCountLargeDelta() {
    return indexedProductCountLargeDelta;
  }

  public void setIndexedProductCountLargeDelta(Integer indexedProductCountLargeDelta) {
    this.indexedProductCountLargeDelta = indexedProductCountLargeDelta;
  }

  public CatalogsFeedValidationWarnings itemAdditionalImageDownloadFailure(Integer itemAdditionalImageDownloadFailure) {
    this.itemAdditionalImageDownloadFailure = itemAdditionalImageDownloadFailure;
    return this;
  }

   /**
   * Get itemAdditionalImageDownloadFailure
   * @return itemAdditionalImageDownloadFailure
  **/
  public Integer getItemAdditionalImageDownloadFailure() {
    return itemAdditionalImageDownloadFailure;
  }

  public void setItemAdditionalImageDownloadFailure(Integer itemAdditionalImageDownloadFailure) {
    this.itemAdditionalImageDownloadFailure = itemAdditionalImageDownloadFailure;
  }

  public CatalogsFeedValidationWarnings optionalProductCategoryMissing(Integer optionalProductCategoryMissing) {
    this.optionalProductCategoryMissing = optionalProductCategoryMissing;
    return this;
  }

   /**
   * Get optionalProductCategoryMissing
   * @return optionalProductCategoryMissing
  **/
  public Integer getOptionalProductCategoryMissing() {
    return optionalProductCategoryMissing;
  }

  public void setOptionalProductCategoryMissing(Integer optionalProductCategoryMissing) {
    this.optionalProductCategoryMissing = optionalProductCategoryMissing;
  }

  public CatalogsFeedValidationWarnings optionalProductCategoryInvalid(Integer optionalProductCategoryInvalid) {
    this.optionalProductCategoryInvalid = optionalProductCategoryInvalid;
    return this;
  }

   /**
   * Get optionalProductCategoryInvalid
   * @return optionalProductCategoryInvalid
  **/
  public Integer getOptionalProductCategoryInvalid() {
    return optionalProductCategoryInvalid;
  }

  public void setOptionalProductCategoryInvalid(Integer optionalProductCategoryInvalid) {
    this.optionalProductCategoryInvalid = optionalProductCategoryInvalid;
  }

  public CatalogsFeedValidationWarnings optionalConditionMissing(Integer optionalConditionMissing) {
    this.optionalConditionMissing = optionalConditionMissing;
    return this;
  }

   /**
   * Get optionalConditionMissing
   * @return optionalConditionMissing
  **/
  public Integer getOptionalConditionMissing() {
    return optionalConditionMissing;
  }

  public void setOptionalConditionMissing(Integer optionalConditionMissing) {
    this.optionalConditionMissing = optionalConditionMissing;
  }

  public CatalogsFeedValidationWarnings optionalConditionInvalid(Integer optionalConditionInvalid) {
    this.optionalConditionInvalid = optionalConditionInvalid;
    return this;
  }

   /**
   * Get optionalConditionInvalid
   * @return optionalConditionInvalid
  **/
  public Integer getOptionalConditionInvalid() {
    return optionalConditionInvalid;
  }

  public void setOptionalConditionInvalid(Integer optionalConditionInvalid) {
    this.optionalConditionInvalid = optionalConditionInvalid;
  }

  public CatalogsFeedValidationWarnings iosDeepLinkInvalid(Integer iosDeepLinkInvalid) {
    this.iosDeepLinkInvalid = iosDeepLinkInvalid;
    return this;
  }

   /**
   * Get iosDeepLinkInvalid
   * @return iosDeepLinkInvalid
  **/
  public Integer getIosDeepLinkInvalid() {
    return iosDeepLinkInvalid;
  }

  public void setIosDeepLinkInvalid(Integer iosDeepLinkInvalid) {
    this.iosDeepLinkInvalid = iosDeepLinkInvalid;
  }

  public CatalogsFeedValidationWarnings androidDeepLinkInvalid(Integer androidDeepLinkInvalid) {
    this.androidDeepLinkInvalid = androidDeepLinkInvalid;
    return this;
  }

   /**
   * Get androidDeepLinkInvalid
   * @return androidDeepLinkInvalid
  **/
  public Integer getAndroidDeepLinkInvalid() {
    return androidDeepLinkInvalid;
  }

  public void setAndroidDeepLinkInvalid(Integer androidDeepLinkInvalid) {
    this.androidDeepLinkInvalid = androidDeepLinkInvalid;
  }

  public CatalogsFeedValidationWarnings availabilityNormalized(Integer availabilityNormalized) {
    this.availabilityNormalized = availabilityNormalized;
    return this;
  }

   /**
   * Get availabilityNormalized
   * @return availabilityNormalized
  **/
  public Integer getAvailabilityNormalized() {
    return availabilityNormalized;
  }

  public void setAvailabilityNormalized(Integer availabilityNormalized) {
    this.availabilityNormalized = availabilityNormalized;
  }

  public CatalogsFeedValidationWarnings conditionNormalized(Integer conditionNormalized) {
    this.conditionNormalized = conditionNormalized;
    return this;
  }

   /**
   * Get conditionNormalized
   * @return conditionNormalized
  **/
  public Integer getConditionNormalized() {
    return conditionNormalized;
  }

  public void setConditionNormalized(Integer conditionNormalized) {
    this.conditionNormalized = conditionNormalized;
  }

  public CatalogsFeedValidationWarnings genderNormalized(Integer genderNormalized) {
    this.genderNormalized = genderNormalized;
    return this;
  }

   /**
   * Get genderNormalized
   * @return genderNormalized
  **/
  public Integer getGenderNormalized() {
    return genderNormalized;
  }

  public void setGenderNormalized(Integer genderNormalized) {
    this.genderNormalized = genderNormalized;
  }

  public CatalogsFeedValidationWarnings sizeTypeNormalized(Integer sizeTypeNormalized) {
    this.sizeTypeNormalized = sizeTypeNormalized;
    return this;
  }

   /**
   * Get sizeTypeNormalized
   * @return sizeTypeNormalized
  **/
  public Integer getSizeTypeNormalized() {
    return sizeTypeNormalized;
  }

  public void setSizeTypeNormalized(Integer sizeTypeNormalized) {
    this.sizeTypeNormalized = sizeTypeNormalized;
  }

  public CatalogsFeedValidationWarnings ageGroupNormalized(Integer ageGroupNormalized) {
    this.ageGroupNormalized = ageGroupNormalized;
    return this;
  }

   /**
   * Get ageGroupNormalized
   * @return ageGroupNormalized
  **/
  public Integer getAgeGroupNormalized() {
    return ageGroupNormalized;
  }

  public void setAgeGroupNormalized(Integer ageGroupNormalized) {
    this.ageGroupNormalized = ageGroupNormalized;
  }

  public CatalogsFeedValidationWarnings utmSourceAutoCorrected(Integer utmSourceAutoCorrected) {
    this.utmSourceAutoCorrected = utmSourceAutoCorrected;
    return this;
  }

   /**
   * Get utmSourceAutoCorrected
   * @return utmSourceAutoCorrected
  **/
  public Integer getUtmSourceAutoCorrected() {
    return utmSourceAutoCorrected;
  }

  public void setUtmSourceAutoCorrected(Integer utmSourceAutoCorrected) {
    this.utmSourceAutoCorrected = utmSourceAutoCorrected;
  }

  public CatalogsFeedValidationWarnings countryDoesNotMapToCurrency(Integer countryDoesNotMapToCurrency) {
    this.countryDoesNotMapToCurrency = countryDoesNotMapToCurrency;
    return this;
  }

   /**
   * Get countryDoesNotMapToCurrency
   * @return countryDoesNotMapToCurrency
  **/
  public Integer getCountryDoesNotMapToCurrency() {
    return countryDoesNotMapToCurrency;
  }

  public void setCountryDoesNotMapToCurrency(Integer countryDoesNotMapToCurrency) {
    this.countryDoesNotMapToCurrency = countryDoesNotMapToCurrency;
  }

  public CatalogsFeedValidationWarnings minAdPriceInvalid(Integer minAdPriceInvalid) {
    this.minAdPriceInvalid = minAdPriceInvalid;
    return this;
  }

   /**
   * Get minAdPriceInvalid
   * @return minAdPriceInvalid
  **/
  public Integer getMinAdPriceInvalid() {
    return minAdPriceInvalid;
  }

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
    return Objects.equals(titleLengthTooLong, catalogsFeedValidationWarnings.titleLengthTooLong) &&
        Objects.equals(descriptionLengthTooLong, catalogsFeedValidationWarnings.descriptionLengthTooLong) &&
        Objects.equals(genderInvalid, catalogsFeedValidationWarnings.genderInvalid) &&
        Objects.equals(ageGroupInvalid, catalogsFeedValidationWarnings.ageGroupInvalid) &&
        Objects.equals(sizeTypeInvalid, catalogsFeedValidationWarnings.sizeTypeInvalid) &&
        Objects.equals(linkFormatWarning, catalogsFeedValidationWarnings.linkFormatWarning) &&
        Objects.equals(duplicateProducts, catalogsFeedValidationWarnings.duplicateProducts) &&
        Objects.equals(duplicateLinks, catalogsFeedValidationWarnings.duplicateLinks) &&
        Objects.equals(salesPriceInvalid, catalogsFeedValidationWarnings.salesPriceInvalid) &&
        Objects.equals(productCategoryDepthWarning, catalogsFeedValidationWarnings.productCategoryDepthWarning) &&
        Objects.equals(adwordsSameAsLink, catalogsFeedValidationWarnings.adwordsSameAsLink) &&
        Objects.equals(duplicateHeaders, catalogsFeedValidationWarnings.duplicateHeaders) &&
        Objects.equals(fetchSameSignature, catalogsFeedValidationWarnings.fetchSameSignature) &&
        Objects.equals(adwordsFormatWarning, catalogsFeedValidationWarnings.adwordsFormatWarning) &&
        Objects.equals(additionalImageLinkWarning, catalogsFeedValidationWarnings.additionalImageLinkWarning) &&
        Objects.equals(imageLinkWarning, catalogsFeedValidationWarnings.imageLinkWarning) &&
        Objects.equals(shippingInvalid, catalogsFeedValidationWarnings.shippingInvalid) &&
        Objects.equals(taxInvalid, catalogsFeedValidationWarnings.taxInvalid) &&
        Objects.equals(shippingWeightInvalid, catalogsFeedValidationWarnings.shippingWeightInvalid) &&
        Objects.equals(expirationDateInvalid, catalogsFeedValidationWarnings.expirationDateInvalid) &&
        Objects.equals(availabilityDateInvalid, catalogsFeedValidationWarnings.availabilityDateInvalid) &&
        Objects.equals(saleDateInvalid, catalogsFeedValidationWarnings.saleDateInvalid) &&
        Objects.equals(weightUnitInvalid, catalogsFeedValidationWarnings.weightUnitInvalid) &&
        Objects.equals(isBundleInvalid, catalogsFeedValidationWarnings.isBundleInvalid) &&
        Objects.equals(updatedTimeInvalid, catalogsFeedValidationWarnings.updatedTimeInvalid) &&
        Objects.equals(customLabelLengthTooLong, catalogsFeedValidationWarnings.customLabelLengthTooLong) &&
        Objects.equals(productTypeLengthTooLong, catalogsFeedValidationWarnings.productTypeLengthTooLong) &&
        Objects.equals(tooManyAdditionalImageLinks, catalogsFeedValidationWarnings.tooManyAdditionalImageLinks) &&
        Objects.equals(multipackInvalid, catalogsFeedValidationWarnings.multipackInvalid) &&
        Objects.equals(indexedProductCountLargeDelta, catalogsFeedValidationWarnings.indexedProductCountLargeDelta) &&
        Objects.equals(itemAdditionalImageDownloadFailure, catalogsFeedValidationWarnings.itemAdditionalImageDownloadFailure) &&
        Objects.equals(optionalProductCategoryMissing, catalogsFeedValidationWarnings.optionalProductCategoryMissing) &&
        Objects.equals(optionalProductCategoryInvalid, catalogsFeedValidationWarnings.optionalProductCategoryInvalid) &&
        Objects.equals(optionalConditionMissing, catalogsFeedValidationWarnings.optionalConditionMissing) &&
        Objects.equals(optionalConditionInvalid, catalogsFeedValidationWarnings.optionalConditionInvalid) &&
        Objects.equals(iosDeepLinkInvalid, catalogsFeedValidationWarnings.iosDeepLinkInvalid) &&
        Objects.equals(androidDeepLinkInvalid, catalogsFeedValidationWarnings.androidDeepLinkInvalid) &&
        Objects.equals(availabilityNormalized, catalogsFeedValidationWarnings.availabilityNormalized) &&
        Objects.equals(conditionNormalized, catalogsFeedValidationWarnings.conditionNormalized) &&
        Objects.equals(genderNormalized, catalogsFeedValidationWarnings.genderNormalized) &&
        Objects.equals(sizeTypeNormalized, catalogsFeedValidationWarnings.sizeTypeNormalized) &&
        Objects.equals(ageGroupNormalized, catalogsFeedValidationWarnings.ageGroupNormalized) &&
        Objects.equals(utmSourceAutoCorrected, catalogsFeedValidationWarnings.utmSourceAutoCorrected) &&
        Objects.equals(countryDoesNotMapToCurrency, catalogsFeedValidationWarnings.countryDoesNotMapToCurrency) &&
        Objects.equals(minAdPriceInvalid, catalogsFeedValidationWarnings.minAdPriceInvalid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(titleLengthTooLong, descriptionLengthTooLong, genderInvalid, ageGroupInvalid, sizeTypeInvalid, linkFormatWarning, duplicateProducts, duplicateLinks, salesPriceInvalid, productCategoryDepthWarning, adwordsSameAsLink, duplicateHeaders, fetchSameSignature, adwordsFormatWarning, additionalImageLinkWarning, imageLinkWarning, shippingInvalid, taxInvalid, shippingWeightInvalid, expirationDateInvalid, availabilityDateInvalid, saleDateInvalid, weightUnitInvalid, isBundleInvalid, updatedTimeInvalid, customLabelLengthTooLong, productTypeLengthTooLong, tooManyAdditionalImageLinks, multipackInvalid, indexedProductCountLargeDelta, itemAdditionalImageDownloadFailure, optionalProductCategoryMissing, optionalProductCategoryInvalid, optionalConditionMissing, optionalConditionInvalid, iosDeepLinkInvalid, androidDeepLinkInvalid, availabilityNormalized, conditionNormalized, genderNormalized, sizeTypeNormalized, ageGroupNormalized, utmSourceAutoCorrected, countryDoesNotMapToCurrency, minAdPriceInvalid);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


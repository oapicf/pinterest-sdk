package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsFeedValidationWarnings   {
  
  private Integer titleLengthTooLong;
  private Integer descriptionLengthTooLong;
  private Integer genderInvalid;
  private Integer ageGroupInvalid;
  private Integer sizeTypeInvalid;
  private Integer linkFormatWarning;
  private Integer duplicateProducts;
  private Integer duplicateLinks;
  private Integer salesPriceInvalid;
  private Integer productCategoryDepthWarning;
  private Integer adwordsSameAsLink;
  private Integer duplicateHeaders;
  private Integer fetchSameSignature;
  private Integer adwordsFormatWarning;
  private Integer additionalImageLinkWarning;
  private Integer imageLinkWarning;
  private Integer shippingInvalid;
  private Integer taxInvalid;
  private Integer shippingWeightInvalid;
  private Integer expirationDateInvalid;
  private Integer availabilityDateInvalid;
  private Integer saleDateInvalid;
  private Integer weightUnitInvalid;
  private Integer isBundleInvalid;
  private Integer updatedTimeInvalid;
  private Integer customLabelLengthTooLong;
  private Integer productTypeLengthTooLong;
  private Integer tooManyAdditionalImageLinks;
  private Integer multipackInvalid;
  private Integer indexedProductCountLargeDelta;
  private Integer itemAdditionalImageDownloadFailure;
  private Integer optionalProductCategoryMissing;
  private Integer optionalProductCategoryInvalid;
  private Integer optionalConditionMissing;
  private Integer optionalConditionInvalid;
  private Integer iosDeepLinkInvalid;
  private Integer androidDeepLinkInvalid;
  private Integer availabilityNormalized;
  private Integer conditionNormalized;
  private Integer genderNormalized;
  private Integer sizeTypeNormalized;
  private Integer ageGroupNormalized;
  private Integer utmSourceAutoCorrected;
  private Integer countryDoesNotMapToCurrency;
  private Integer minAdPriceInvalid;

  public CatalogsFeedValidationWarnings () {

  }

  public CatalogsFeedValidationWarnings (Integer titleLengthTooLong, Integer descriptionLengthTooLong, Integer genderInvalid, Integer ageGroupInvalid, Integer sizeTypeInvalid, Integer linkFormatWarning, Integer duplicateProducts, Integer duplicateLinks, Integer salesPriceInvalid, Integer productCategoryDepthWarning, Integer adwordsSameAsLink, Integer duplicateHeaders, Integer fetchSameSignature, Integer adwordsFormatWarning, Integer additionalImageLinkWarning, Integer imageLinkWarning, Integer shippingInvalid, Integer taxInvalid, Integer shippingWeightInvalid, Integer expirationDateInvalid, Integer availabilityDateInvalid, Integer saleDateInvalid, Integer weightUnitInvalid, Integer isBundleInvalid, Integer updatedTimeInvalid, Integer customLabelLengthTooLong, Integer productTypeLengthTooLong, Integer tooManyAdditionalImageLinks, Integer multipackInvalid, Integer indexedProductCountLargeDelta, Integer itemAdditionalImageDownloadFailure, Integer optionalProductCategoryMissing, Integer optionalProductCategoryInvalid, Integer optionalConditionMissing, Integer optionalConditionInvalid, Integer iosDeepLinkInvalid, Integer androidDeepLinkInvalid, Integer availabilityNormalized, Integer conditionNormalized, Integer genderNormalized, Integer sizeTypeNormalized, Integer ageGroupNormalized, Integer utmSourceAutoCorrected, Integer countryDoesNotMapToCurrency, Integer minAdPriceInvalid) {
    this.titleLengthTooLong = titleLengthTooLong;
    this.descriptionLengthTooLong = descriptionLengthTooLong;
    this.genderInvalid = genderInvalid;
    this.ageGroupInvalid = ageGroupInvalid;
    this.sizeTypeInvalid = sizeTypeInvalid;
    this.linkFormatWarning = linkFormatWarning;
    this.duplicateProducts = duplicateProducts;
    this.duplicateLinks = duplicateLinks;
    this.salesPriceInvalid = salesPriceInvalid;
    this.productCategoryDepthWarning = productCategoryDepthWarning;
    this.adwordsSameAsLink = adwordsSameAsLink;
    this.duplicateHeaders = duplicateHeaders;
    this.fetchSameSignature = fetchSameSignature;
    this.adwordsFormatWarning = adwordsFormatWarning;
    this.additionalImageLinkWarning = additionalImageLinkWarning;
    this.imageLinkWarning = imageLinkWarning;
    this.shippingInvalid = shippingInvalid;
    this.taxInvalid = taxInvalid;
    this.shippingWeightInvalid = shippingWeightInvalid;
    this.expirationDateInvalid = expirationDateInvalid;
    this.availabilityDateInvalid = availabilityDateInvalid;
    this.saleDateInvalid = saleDateInvalid;
    this.weightUnitInvalid = weightUnitInvalid;
    this.isBundleInvalid = isBundleInvalid;
    this.updatedTimeInvalid = updatedTimeInvalid;
    this.customLabelLengthTooLong = customLabelLengthTooLong;
    this.productTypeLengthTooLong = productTypeLengthTooLong;
    this.tooManyAdditionalImageLinks = tooManyAdditionalImageLinks;
    this.multipackInvalid = multipackInvalid;
    this.indexedProductCountLargeDelta = indexedProductCountLargeDelta;
    this.itemAdditionalImageDownloadFailure = itemAdditionalImageDownloadFailure;
    this.optionalProductCategoryMissing = optionalProductCategoryMissing;
    this.optionalProductCategoryInvalid = optionalProductCategoryInvalid;
    this.optionalConditionMissing = optionalConditionMissing;
    this.optionalConditionInvalid = optionalConditionInvalid;
    this.iosDeepLinkInvalid = iosDeepLinkInvalid;
    this.androidDeepLinkInvalid = androidDeepLinkInvalid;
    this.availabilityNormalized = availabilityNormalized;
    this.conditionNormalized = conditionNormalized;
    this.genderNormalized = genderNormalized;
    this.sizeTypeNormalized = sizeTypeNormalized;
    this.ageGroupNormalized = ageGroupNormalized;
    this.utmSourceAutoCorrected = utmSourceAutoCorrected;
    this.countryDoesNotMapToCurrency = countryDoesNotMapToCurrency;
    this.minAdPriceInvalid = minAdPriceInvalid;
  }

    
  @JsonProperty("title_length_too_long")
  public Integer getTitleLengthTooLong() {
    return titleLengthTooLong;
  }
  public void setTitleLengthTooLong(Integer titleLengthTooLong) {
    this.titleLengthTooLong = titleLengthTooLong;
  }

    
  @JsonProperty("description_length_too_long")
  public Integer getDescriptionLengthTooLong() {
    return descriptionLengthTooLong;
  }
  public void setDescriptionLengthTooLong(Integer descriptionLengthTooLong) {
    this.descriptionLengthTooLong = descriptionLengthTooLong;
  }

    
  @JsonProperty("gender_invalid")
  public Integer getGenderInvalid() {
    return genderInvalid;
  }
  public void setGenderInvalid(Integer genderInvalid) {
    this.genderInvalid = genderInvalid;
  }

    
  @JsonProperty("age_group_invalid")
  public Integer getAgeGroupInvalid() {
    return ageGroupInvalid;
  }
  public void setAgeGroupInvalid(Integer ageGroupInvalid) {
    this.ageGroupInvalid = ageGroupInvalid;
  }

    
  @JsonProperty("size_type_invalid")
  public Integer getSizeTypeInvalid() {
    return sizeTypeInvalid;
  }
  public void setSizeTypeInvalid(Integer sizeTypeInvalid) {
    this.sizeTypeInvalid = sizeTypeInvalid;
  }

    
  @JsonProperty("link_format_warning")
  public Integer getLinkFormatWarning() {
    return linkFormatWarning;
  }
  public void setLinkFormatWarning(Integer linkFormatWarning) {
    this.linkFormatWarning = linkFormatWarning;
  }

    
  @JsonProperty("duplicate_products")
  public Integer getDuplicateProducts() {
    return duplicateProducts;
  }
  public void setDuplicateProducts(Integer duplicateProducts) {
    this.duplicateProducts = duplicateProducts;
  }

    
  @JsonProperty("duplicate_links")
  public Integer getDuplicateLinks() {
    return duplicateLinks;
  }
  public void setDuplicateLinks(Integer duplicateLinks) {
    this.duplicateLinks = duplicateLinks;
  }

    
  @JsonProperty("sales_price_invalid")
  public Integer getSalesPriceInvalid() {
    return salesPriceInvalid;
  }
  public void setSalesPriceInvalid(Integer salesPriceInvalid) {
    this.salesPriceInvalid = salesPriceInvalid;
  }

    
  @JsonProperty("product_category_depth_warning")
  public Integer getProductCategoryDepthWarning() {
    return productCategoryDepthWarning;
  }
  public void setProductCategoryDepthWarning(Integer productCategoryDepthWarning) {
    this.productCategoryDepthWarning = productCategoryDepthWarning;
  }

    
  @JsonProperty("adwords_same_as_link")
  public Integer getAdwordsSameAsLink() {
    return adwordsSameAsLink;
  }
  public void setAdwordsSameAsLink(Integer adwordsSameAsLink) {
    this.adwordsSameAsLink = adwordsSameAsLink;
  }

    
  @JsonProperty("duplicate_headers")
  public Integer getDuplicateHeaders() {
    return duplicateHeaders;
  }
  public void setDuplicateHeaders(Integer duplicateHeaders) {
    this.duplicateHeaders = duplicateHeaders;
  }

    
  @JsonProperty("fetch_same_signature")
  public Integer getFetchSameSignature() {
    return fetchSameSignature;
  }
  public void setFetchSameSignature(Integer fetchSameSignature) {
    this.fetchSameSignature = fetchSameSignature;
  }

    
  @JsonProperty("adwords_format_warning")
  public Integer getAdwordsFormatWarning() {
    return adwordsFormatWarning;
  }
  public void setAdwordsFormatWarning(Integer adwordsFormatWarning) {
    this.adwordsFormatWarning = adwordsFormatWarning;
  }

    
  @JsonProperty("additional_image_link_warning")
  public Integer getAdditionalImageLinkWarning() {
    return additionalImageLinkWarning;
  }
  public void setAdditionalImageLinkWarning(Integer additionalImageLinkWarning) {
    this.additionalImageLinkWarning = additionalImageLinkWarning;
  }

    
  @JsonProperty("image_link_warning")
  public Integer getImageLinkWarning() {
    return imageLinkWarning;
  }
  public void setImageLinkWarning(Integer imageLinkWarning) {
    this.imageLinkWarning = imageLinkWarning;
  }

    
  @JsonProperty("shipping_invalid")
  public Integer getShippingInvalid() {
    return shippingInvalid;
  }
  public void setShippingInvalid(Integer shippingInvalid) {
    this.shippingInvalid = shippingInvalid;
  }

    
  @JsonProperty("tax_invalid")
  public Integer getTaxInvalid() {
    return taxInvalid;
  }
  public void setTaxInvalid(Integer taxInvalid) {
    this.taxInvalid = taxInvalid;
  }

    
  @JsonProperty("shipping_weight_invalid")
  public Integer getShippingWeightInvalid() {
    return shippingWeightInvalid;
  }
  public void setShippingWeightInvalid(Integer shippingWeightInvalid) {
    this.shippingWeightInvalid = shippingWeightInvalid;
  }

    
  @JsonProperty("expiration_date_invalid")
  public Integer getExpirationDateInvalid() {
    return expirationDateInvalid;
  }
  public void setExpirationDateInvalid(Integer expirationDateInvalid) {
    this.expirationDateInvalid = expirationDateInvalid;
  }

    
  @JsonProperty("availability_date_invalid")
  public Integer getAvailabilityDateInvalid() {
    return availabilityDateInvalid;
  }
  public void setAvailabilityDateInvalid(Integer availabilityDateInvalid) {
    this.availabilityDateInvalid = availabilityDateInvalid;
  }

    
  @JsonProperty("sale_date_invalid")
  public Integer getSaleDateInvalid() {
    return saleDateInvalid;
  }
  public void setSaleDateInvalid(Integer saleDateInvalid) {
    this.saleDateInvalid = saleDateInvalid;
  }

    
  @JsonProperty("weight_unit_invalid")
  public Integer getWeightUnitInvalid() {
    return weightUnitInvalid;
  }
  public void setWeightUnitInvalid(Integer weightUnitInvalid) {
    this.weightUnitInvalid = weightUnitInvalid;
  }

    
  @JsonProperty("is_bundle_invalid")
  public Integer getIsBundleInvalid() {
    return isBundleInvalid;
  }
  public void setIsBundleInvalid(Integer isBundleInvalid) {
    this.isBundleInvalid = isBundleInvalid;
  }

    
  @JsonProperty("updated_time_invalid")
  public Integer getUpdatedTimeInvalid() {
    return updatedTimeInvalid;
  }
  public void setUpdatedTimeInvalid(Integer updatedTimeInvalid) {
    this.updatedTimeInvalid = updatedTimeInvalid;
  }

    
  @JsonProperty("custom_label_length_too_long")
  public Integer getCustomLabelLengthTooLong() {
    return customLabelLengthTooLong;
  }
  public void setCustomLabelLengthTooLong(Integer customLabelLengthTooLong) {
    this.customLabelLengthTooLong = customLabelLengthTooLong;
  }

    
  @JsonProperty("product_type_length_too_long")
  public Integer getProductTypeLengthTooLong() {
    return productTypeLengthTooLong;
  }
  public void setProductTypeLengthTooLong(Integer productTypeLengthTooLong) {
    this.productTypeLengthTooLong = productTypeLengthTooLong;
  }

    
  @JsonProperty("too_many_additional_image_links")
  public Integer getTooManyAdditionalImageLinks() {
    return tooManyAdditionalImageLinks;
  }
  public void setTooManyAdditionalImageLinks(Integer tooManyAdditionalImageLinks) {
    this.tooManyAdditionalImageLinks = tooManyAdditionalImageLinks;
  }

    
  @JsonProperty("multipack_invalid")
  public Integer getMultipackInvalid() {
    return multipackInvalid;
  }
  public void setMultipackInvalid(Integer multipackInvalid) {
    this.multipackInvalid = multipackInvalid;
  }

    
  @JsonProperty("indexed_product_count_large_delta")
  public Integer getIndexedProductCountLargeDelta() {
    return indexedProductCountLargeDelta;
  }
  public void setIndexedProductCountLargeDelta(Integer indexedProductCountLargeDelta) {
    this.indexedProductCountLargeDelta = indexedProductCountLargeDelta;
  }

    
  @JsonProperty("item_additional_image_download_failure")
  public Integer getItemAdditionalImageDownloadFailure() {
    return itemAdditionalImageDownloadFailure;
  }
  public void setItemAdditionalImageDownloadFailure(Integer itemAdditionalImageDownloadFailure) {
    this.itemAdditionalImageDownloadFailure = itemAdditionalImageDownloadFailure;
  }

    
  @JsonProperty("optional_product_category_missing")
  public Integer getOptionalProductCategoryMissing() {
    return optionalProductCategoryMissing;
  }
  public void setOptionalProductCategoryMissing(Integer optionalProductCategoryMissing) {
    this.optionalProductCategoryMissing = optionalProductCategoryMissing;
  }

    
  @JsonProperty("optional_product_category_invalid")
  public Integer getOptionalProductCategoryInvalid() {
    return optionalProductCategoryInvalid;
  }
  public void setOptionalProductCategoryInvalid(Integer optionalProductCategoryInvalid) {
    this.optionalProductCategoryInvalid = optionalProductCategoryInvalid;
  }

    
  @JsonProperty("optional_condition_missing")
  public Integer getOptionalConditionMissing() {
    return optionalConditionMissing;
  }
  public void setOptionalConditionMissing(Integer optionalConditionMissing) {
    this.optionalConditionMissing = optionalConditionMissing;
  }

    
  @JsonProperty("optional_condition_invalid")
  public Integer getOptionalConditionInvalid() {
    return optionalConditionInvalid;
  }
  public void setOptionalConditionInvalid(Integer optionalConditionInvalid) {
    this.optionalConditionInvalid = optionalConditionInvalid;
  }

    
  @JsonProperty("ios_deep_link_invalid")
  public Integer getIosDeepLinkInvalid() {
    return iosDeepLinkInvalid;
  }
  public void setIosDeepLinkInvalid(Integer iosDeepLinkInvalid) {
    this.iosDeepLinkInvalid = iosDeepLinkInvalid;
  }

    
  @JsonProperty("android_deep_link_invalid")
  public Integer getAndroidDeepLinkInvalid() {
    return androidDeepLinkInvalid;
  }
  public void setAndroidDeepLinkInvalid(Integer androidDeepLinkInvalid) {
    this.androidDeepLinkInvalid = androidDeepLinkInvalid;
  }

    
  @JsonProperty("availability_normalized")
  public Integer getAvailabilityNormalized() {
    return availabilityNormalized;
  }
  public void setAvailabilityNormalized(Integer availabilityNormalized) {
    this.availabilityNormalized = availabilityNormalized;
  }

    
  @JsonProperty("condition_normalized")
  public Integer getConditionNormalized() {
    return conditionNormalized;
  }
  public void setConditionNormalized(Integer conditionNormalized) {
    this.conditionNormalized = conditionNormalized;
  }

    
  @JsonProperty("gender_normalized")
  public Integer getGenderNormalized() {
    return genderNormalized;
  }
  public void setGenderNormalized(Integer genderNormalized) {
    this.genderNormalized = genderNormalized;
  }

    
  @JsonProperty("size_type_normalized")
  public Integer getSizeTypeNormalized() {
    return sizeTypeNormalized;
  }
  public void setSizeTypeNormalized(Integer sizeTypeNormalized) {
    this.sizeTypeNormalized = sizeTypeNormalized;
  }

    
  @JsonProperty("age_group_normalized")
  public Integer getAgeGroupNormalized() {
    return ageGroupNormalized;
  }
  public void setAgeGroupNormalized(Integer ageGroupNormalized) {
    this.ageGroupNormalized = ageGroupNormalized;
  }

    
  @JsonProperty("utm_source_auto_corrected")
  public Integer getUtmSourceAutoCorrected() {
    return utmSourceAutoCorrected;
  }
  public void setUtmSourceAutoCorrected(Integer utmSourceAutoCorrected) {
    this.utmSourceAutoCorrected = utmSourceAutoCorrected;
  }

    
  @JsonProperty("country_does_not_map_to_currency")
  public Integer getCountryDoesNotMapToCurrency() {
    return countryDoesNotMapToCurrency;
  }
  public void setCountryDoesNotMapToCurrency(Integer countryDoesNotMapToCurrency) {
    this.countryDoesNotMapToCurrency = countryDoesNotMapToCurrency;
  }

    
  @JsonProperty("min_ad_price_invalid")
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

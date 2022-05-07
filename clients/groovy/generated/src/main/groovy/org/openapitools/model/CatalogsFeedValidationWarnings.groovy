package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CatalogsFeedValidationWarnings {
    
    Integer titleLengthTooLong
    
    Integer descriptionLengthTooLong
    
    Integer genderInvalid
    
    Integer ageGroupInvalid
    
    Integer sizeTypeInvalid
    
    Integer linkFormatWarning
    
    Integer duplicateProducts
    
    Integer duplicateLinks
    
    Integer salesPriceInvalid
    
    Integer productCategoryDepthWarning
    
    Integer adwordsSameAsLink
    
    Integer duplicateHeaders
    
    Integer fetchSameSignature
    
    Integer adwordsFormatWarning
    
    Integer additionalImageLinkWarning
    
    Integer imageLinkWarning
    
    Integer shippingInvalid
    
    Integer taxInvalid
    
    Integer shippingWeightInvalid
    
    Integer expirationDateInvalid
    
    Integer availabilityDateInvalid
    
    Integer saleDateInvalid
    
    Integer weightUnitInvalid
    
    Integer isBundleInvalid
    
    Integer updatedTimeInvalid
    
    Integer customLabelLengthTooLong
    
    Integer productTypeLengthTooLong
    
    Integer tooManyAdditionalImageLinks
    
    Integer multipackInvalid
    
    Integer indexedProductCountLargeDelta
    
    Integer itemAdditionalImageDownloadFailure
    
    Integer optionalProductCategoryMissing
    
    Integer optionalProductCategoryInvalid
    
    Integer optionalConditionMissing
    
    Integer optionalConditionInvalid
    
    Integer iosDeepLinkInvalid
    
    Integer androidDeepLinkInvalid
    
    Integer availabilityNormalized
    
    Integer conditionNormalized
    
    Integer genderNormalized
    
    Integer sizeTypeNormalized
    
    Integer ageGroupNormalized
    
    Integer utmSourceAutoCorrected
    
    Integer countryDoesNotMapToCurrency
    
    Integer minAdPriceInvalid
}

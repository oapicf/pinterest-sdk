package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CatalogsFeedValidationErrors {
    
    Integer fetchError
    
    Integer fetchInactiveFeedError
    
    Integer encodingError
    
    Integer delimiterError
    
    Integer requiredColumnsMissing
    
    Integer imageLinkInvalid
    
    Integer itemidMissing
    
    Integer titleMissing
    
    Integer descriptionMissing
    
    Integer productCategoryInvalid
    
    Integer productLinkMissing
    
    Integer imageLinkMissing
    
    Integer availabilityInvalid
    
    Integer productPriceInvalid
    
    Integer linkFormatInvalid
    
    Integer parseLineError
    
    Integer adwordsFormatInvalid
    
    Integer productCategoryMissing
    
    Integer internalServiceError
    
    Integer noVerifiedDomain
    
    Integer adultInvalid
    
    Integer invalidDomain
    
    Integer feedLengthTooLong
    
    Integer linkLengthTooLong
    
    Integer malformedXml
    
    Integer redirectInvalid
    
    Integer priceMissing
    
    Integer feedTooSmall
    
    Integer conditionInvalid
    
    Integer shopifyNoProducts
    
    Integer maxItemsPerItemGroupExceeded
    
    Integer itemMainImageDownloadFailure
    
    Integer pinjoinContentUnsafe
    
    Integer blocklistedImageSignature
}

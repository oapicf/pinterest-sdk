#
# Pinterest REST API
# 
# Pinterest's REST API
# The version of the OpenAPI document: 5.3.0
# Contact: pinterest-api@pinterest.com
# Generated by: https://openapi-generator.tech
#

import json
import tables


type CatalogsFeedValidationErrors* = object
  ## 
  fetchError*: int
  fetchInactiveFeedError*: int
  encodingError*: int
  delimiterError*: int
  requiredColumnsMissing*: int
  imageLinkInvalid*: int
  itemidMissing*: int
  titleMissing*: int
  descriptionMissing*: int
  productCategoryInvalid*: int
  productLinkMissing*: int
  imageLinkMissing*: int
  availabilityInvalid*: int
  productPriceInvalid*: int
  linkFormatInvalid*: int
  parseLineError*: int
  adwordsFormatInvalid*: int
  productCategoryMissing*: int
  internalServiceError*: int
  noVerifiedDomain*: int
  adultInvalid*: int
  invalidDomain*: int
  feedLengthTooLong*: int
  linkLengthTooLong*: int
  malformedXml*: int
  redirectInvalid*: int
  priceMissing*: int
  feedTooSmall*: int
  conditionInvalid*: int
  shopifyNoProducts*: int
  maxItemsPerItemGroupExceeded*: int
  itemMainImageDownloadFailure*: int
  pinjoinContentUnsafe*: int
  blocklistedImageSignature*: int
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


type CatalogsFeedValidationWarnings* = object
  ## 
  titleLengthTooLong*: int
  descriptionLengthTooLong*: int
  genderInvalid*: int
  ageGroupInvalid*: int
  sizeTypeInvalid*: int
  linkFormatWarning*: int
  duplicateProducts*: int
  duplicateLinks*: int
  salesPriceInvalid*: int
  productCategoryDepthWarning*: int
  adwordsSameAsLink*: int
  duplicateHeaders*: int
  fetchSameSignature*: int
  adwordsFormatWarning*: int
  additionalImageLinkWarning*: int
  imageLinkWarning*: int
  shippingInvalid*: int
  taxInvalid*: int
  shippingWeightInvalid*: int
  expirationDateInvalid*: int
  availabilityDateInvalid*: int
  saleDateInvalid*: int
  weightUnitInvalid*: int
  isBundleInvalid*: int
  updatedTimeInvalid*: int
  customLabelLengthTooLong*: int
  productTypeLengthTooLong*: int
  tooManyAdditionalImageLinks*: int
  multipackInvalid*: int
  indexedProductCountLargeDelta*: int
  itemAdditionalImageDownloadFailure*: int
  optionalProductCategoryMissing*: int
  optionalProductCategoryInvalid*: int
  optionalConditionMissing*: int
  optionalConditionInvalid*: int
  iosDeepLinkInvalid*: int
  androidDeepLinkInvalid*: int
  availabilityNormalized*: int
  conditionNormalized*: int
  genderNormalized*: int
  sizeTypeNormalized*: int
  ageGroupNormalized*: int
  utmSourceAutoCorrected*: int
  countryDoesNotMapToCurrency*: int
  minAdPriceInvalid*: int
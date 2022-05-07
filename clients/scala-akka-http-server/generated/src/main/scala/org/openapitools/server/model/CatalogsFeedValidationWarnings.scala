package org.openapitools.server.model


/**
 * @param titleLengthTooLong  for example: ''null''
 * @param descriptionLengthTooLong  for example: ''null''
 * @param genderInvalid  for example: ''null''
 * @param ageGroupInvalid  for example: ''null''
 * @param sizeTypeInvalid  for example: ''null''
 * @param linkFormatWarning  for example: ''null''
 * @param duplicateProducts  for example: ''null''
 * @param duplicateLinks  for example: ''null''
 * @param salesPriceInvalid  for example: ''null''
 * @param productCategoryDepthWarning  for example: ''null''
 * @param adwordsSameAsLink  for example: ''null''
 * @param duplicateHeaders  for example: ''null''
 * @param fetchSameSignature  for example: ''null''
 * @param adwordsFormatWarning  for example: ''null''
 * @param additionalImageLinkWarning  for example: ''null''
 * @param imageLinkWarning  for example: ''null''
 * @param shippingInvalid  for example: ''null''
 * @param taxInvalid  for example: ''null''
 * @param shippingWeightInvalid  for example: ''null''
 * @param expirationDateInvalid  for example: ''null''
 * @param availabilityDateInvalid  for example: ''null''
 * @param saleDateInvalid  for example: ''null''
 * @param weightUnitInvalid  for example: ''null''
 * @param isBundleInvalid  for example: ''null''
 * @param updatedTimeInvalid  for example: ''null''
 * @param customLabelLengthTooLong  for example: ''null''
 * @param productTypeLengthTooLong  for example: ''null''
 * @param tooManyAdditionalImageLinks  for example: ''null''
 * @param multipackInvalid  for example: ''null''
 * @param indexedProductCountLargeDelta  for example: ''null''
 * @param itemAdditionalImageDownloadFailure  for example: ''null''
 * @param optionalProductCategoryMissing  for example: ''null''
 * @param optionalProductCategoryInvalid  for example: ''null''
 * @param optionalConditionMissing  for example: ''null''
 * @param optionalConditionInvalid  for example: ''null''
 * @param iosDeepLinkInvalid  for example: ''null''
 * @param androidDeepLinkInvalid  for example: ''null''
 * @param availabilityNormalized  for example: ''null''
 * @param conditionNormalized  for example: ''null''
 * @param genderNormalized  for example: ''null''
 * @param sizeTypeNormalized  for example: ''null''
 * @param ageGroupNormalized  for example: ''null''
 * @param utmSourceAutoCorrected  for example: ''null''
 * @param countryDoesNotMapToCurrency  for example: ''null''
 * @param minAdPriceInvalid  for example: ''null''
*/
final case class CatalogsFeedValidationWarnings (
  titleLengthTooLong: Option[Int],
  descriptionLengthTooLong: Option[Int],
  genderInvalid: Option[Int],
  ageGroupInvalid: Option[Int],
  sizeTypeInvalid: Option[Int],
  linkFormatWarning: Option[Int],
  duplicateProducts: Option[Int],
  duplicateLinks: Option[Int],
  salesPriceInvalid: Option[Int],
  productCategoryDepthWarning: Option[Int],
  adwordsSameAsLink: Option[Int],
  duplicateHeaders: Option[Int],
  fetchSameSignature: Option[Int],
  adwordsFormatWarning: Option[Int],
  additionalImageLinkWarning: Option[Int],
  imageLinkWarning: Option[Int],
  shippingInvalid: Option[Int],
  taxInvalid: Option[Int],
  shippingWeightInvalid: Option[Int],
  expirationDateInvalid: Option[Int],
  availabilityDateInvalid: Option[Int],
  saleDateInvalid: Option[Int],
  weightUnitInvalid: Option[Int],
  isBundleInvalid: Option[Int],
  updatedTimeInvalid: Option[Int],
  customLabelLengthTooLong: Option[Int],
  productTypeLengthTooLong: Option[Int],
  tooManyAdditionalImageLinks: Option[Int],
  multipackInvalid: Option[Int],
  indexedProductCountLargeDelta: Option[Int],
  itemAdditionalImageDownloadFailure: Option[Int],
  optionalProductCategoryMissing: Option[Int],
  optionalProductCategoryInvalid: Option[Int],
  optionalConditionMissing: Option[Int],
  optionalConditionInvalid: Option[Int],
  iosDeepLinkInvalid: Option[Int],
  androidDeepLinkInvalid: Option[Int],
  availabilityNormalized: Option[Int],
  conditionNormalized: Option[Int],
  genderNormalized: Option[Int],
  sizeTypeNormalized: Option[Int],
  ageGroupNormalized: Option[Int],
  utmSourceAutoCorrected: Option[Int],
  countryDoesNotMapToCurrency: Option[Int],
  minAdPriceInvalid: Option[Int]
)


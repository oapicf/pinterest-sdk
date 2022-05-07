package org.openapitools.server.model


/**
 * @param fetchError  for example: ''null''
 * @param fetchInactiveFeedError  for example: ''null''
 * @param encodingError  for example: ''null''
 * @param delimiterError  for example: ''null''
 * @param requiredColumnsMissing  for example: ''null''
 * @param imageLinkInvalid  for example: ''null''
 * @param itemidMissing  for example: ''null''
 * @param titleMissing  for example: ''null''
 * @param descriptionMissing  for example: ''null''
 * @param productCategoryInvalid  for example: ''null''
 * @param productLinkMissing  for example: ''null''
 * @param imageLinkMissing  for example: ''null''
 * @param availabilityInvalid  for example: ''null''
 * @param productPriceInvalid  for example: ''null''
 * @param linkFormatInvalid  for example: ''null''
 * @param parseLineError  for example: ''null''
 * @param adwordsFormatInvalid  for example: ''null''
 * @param productCategoryMissing  for example: ''null''
 * @param internalServiceError  for example: ''null''
 * @param noVerifiedDomain  for example: ''null''
 * @param adultInvalid  for example: ''null''
 * @param invalidDomain  for example: ''null''
 * @param feedLengthTooLong  for example: ''null''
 * @param linkLengthTooLong  for example: ''null''
 * @param malformedXml  for example: ''null''
 * @param redirectInvalid  for example: ''null''
 * @param priceMissing  for example: ''null''
 * @param feedTooSmall  for example: ''null''
 * @param conditionInvalid  for example: ''null''
 * @param shopifyNoProducts  for example: ''null''
 * @param maxItemsPerItemGroupExceeded  for example: ''null''
 * @param itemMainImageDownloadFailure  for example: ''null''
 * @param pinjoinContentUnsafe  for example: ''null''
 * @param blocklistedImageSignature  for example: ''null''
*/
final case class CatalogsFeedValidationErrors (
  fetchError: Option[Int],
  fetchInactiveFeedError: Option[Int],
  encodingError: Option[Int],
  delimiterError: Option[Int],
  requiredColumnsMissing: Option[Int],
  imageLinkInvalid: Option[Int],
  itemidMissing: Option[Int],
  titleMissing: Option[Int],
  descriptionMissing: Option[Int],
  productCategoryInvalid: Option[Int],
  productLinkMissing: Option[Int],
  imageLinkMissing: Option[Int],
  availabilityInvalid: Option[Int],
  productPriceInvalid: Option[Int],
  linkFormatInvalid: Option[Int],
  parseLineError: Option[Int],
  adwordsFormatInvalid: Option[Int],
  productCategoryMissing: Option[Int],
  internalServiceError: Option[Int],
  noVerifiedDomain: Option[Int],
  adultInvalid: Option[Int],
  invalidDomain: Option[Int],
  feedLengthTooLong: Option[Int],
  linkLengthTooLong: Option[Int],
  malformedXml: Option[Int],
  redirectInvalid: Option[Int],
  priceMissing: Option[Int],
  feedTooSmall: Option[Int],
  conditionInvalid: Option[Int],
  shopifyNoProducts: Option[Int],
  maxItemsPerItemGroupExceeded: Option[Int],
  itemMainImageDownloadFailure: Option[Int],
  pinjoinContentUnsafe: Option[Int],
  blocklistedImageSignature: Option[Int]
)


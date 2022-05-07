package org.openapitools.server.model


/**
 * = catalogs_feed_processing_result_fields =
 *
 * @param ingestionDetails  for example: ''null''
 * @param status  for example: ''null''
 * @param productCounts  for example: ''null''
 * @param validationDetails  for example: ''null''
*/
final case class CatalogsFeedProcessingResultFields (
  ingestionDetails: CatalogsFeedIngestionDetails,
  status: CatalogsFeedProcessingStatus,
  productCounts: CatalogsFeedProductCounts,
  validationDetails: CatalogsFeedValidationDetails
)


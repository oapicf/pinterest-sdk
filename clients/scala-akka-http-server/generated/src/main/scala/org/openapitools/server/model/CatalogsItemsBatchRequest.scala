package org.openapitools.server.model


/**
 * = legacy_retail_only =
 *
 * Request object of catalogs items batch
 *
 * @param country  for example: ''null''
 * @param language  for example: ''null''
 * @param operation  for example: ''null''
 * @param items Array with catalogs items for example: ''null''
*/
final case class CatalogsItemsBatchRequest (
  country: Country,
  language: CatalogsItemsRequestLanguage,
  operation: BatchOperation,
  items: Seq[ItemDeleteBatchRecord]
)


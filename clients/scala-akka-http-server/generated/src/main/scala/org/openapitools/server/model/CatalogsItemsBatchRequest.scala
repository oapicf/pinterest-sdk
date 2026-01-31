package org.openapitools.server.model


/**
 * = legacy_retail_only =
 *
 * Request object of catalogs items batch
 *
 * @param country  for example: ''null''
 * @param language We recommend using the CatalogsLocale values. for example: ''null''
 * @param operation  for example: ''null''
 * @param items Array with catalogs items for example: ''null''
*/
final case class CatalogsItemsBatchRequest (
  country: Country,
  language: String,
  operation: BatchOperation,
  items: Seq[ItemDeleteBatchRecord]
)


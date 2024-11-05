package org.openapitools.server.model


/**
 * Request object to discontinue catalogs items
 *
 * @param country  for example: ''null''
 * @param language  for example: ''null''
 * @param operation  for example: ''null''
 * @param items Array with catalogs items for example: ''null''
*/
final case class CatalogsItemsDeleteDiscontinuedBatchRequest (
  country: Country,
  language: CatalogsItemsRequestLanguage,
  operation: BatchOperation,
  items: Seq[ItemDeleteDiscontinuedBatchRecord]
)


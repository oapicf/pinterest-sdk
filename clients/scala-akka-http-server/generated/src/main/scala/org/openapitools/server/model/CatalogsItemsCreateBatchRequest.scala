package org.openapitools.server.model


/**
 * Request object to create catalogs items
 *
 * @param country  for example: ''null''
 * @param language  for example: ''null''
 * @param operation  for example: ''null''
 * @param items Array with catalogs items for example: ''null''
*/
final case class CatalogsItemsCreateBatchRequest (
  country: Country,
  language: Language,
  operation: BatchOperation,
  items: Seq[ItemCreateBatchRecord]
)


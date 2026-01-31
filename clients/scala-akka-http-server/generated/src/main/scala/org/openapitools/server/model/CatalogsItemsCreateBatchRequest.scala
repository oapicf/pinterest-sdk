package org.openapitools.server.model


/**
 * Request object to create catalogs items
 *
 * @param country  for example: ''null''
 * @param items Array with catalogs items for example: ''null''
 * @param language We recommend using the CatalogsLocale values. for example: ''null''
 * @param operation  for example: ''null''
*/
final case class CatalogsItemsCreateBatchRequest (
  country: Country,
  items: Seq[ItemCreateBatchRecord],
  language: String,
  operation: BatchOperation
)


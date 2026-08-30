package org.openapitools.server.model


/**
 * Request object to discontinue catalogs items
 *
 * @param country  for example: ''null''
 * @param items Array with catalogs items for example: ''null''
 * @param language We recommend using the CatalogsLocale values. for example: ''null''
 * @param operation  for example: ''null''
*/
final case class CatalogsItemsDeleteDiscontinuedBatchRequest (
  country: Country,
  items: Seq[ItemDeleteDiscontinuedBatchRecord],
  language: String,
  operation: String
)


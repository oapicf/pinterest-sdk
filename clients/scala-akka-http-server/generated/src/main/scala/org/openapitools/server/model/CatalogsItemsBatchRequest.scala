package org.openapitools.server.model


/**
 * Request object of catalogs items batch
 *
 * @param country  for example: ''null''
 * @param language  for example: ''null''
 * @param operation  for example: ''null''
 * @param items Array with catalogs items for example: ''null''
*/
final case class CatalogsItemsBatchRequest (
  country: Option[Country],
  language: Option[Language],
  operation: Option[BatchOperation],
  items: Option[Seq[ItemBatchRecord]]
)


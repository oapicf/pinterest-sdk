package org.openapitools.server.model


/**
 * Response object of catalogs items
 *
 * @param items Array with catalogs items for example: ''null''
*/
final case class CatalogsItems (
  items: Option[Seq[ItemBatchRecord]]
)


package org.openapitools.server.model


/**
 * @param catalogType  for example: ''null''
 * @param itemIds  for example: ''null''
 * @param catalogId Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog for example: ''null''
*/
final case class CatalogsRetailItemsPostFilter (
  catalogType: String,
  itemIds: Seq[String],
  catalogId: Option[String] = None
)


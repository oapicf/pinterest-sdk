package org.openapitools.server.model


/**
 * @param catalogId Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog for example: ''null''
 * @param catalogType  for example: ''null''
 * @param itemIds  for example: ''null''
*/
final case class CatalogsRetailItemsFilter (
  catalogId: Option[String] = None,
  catalogType: String,
  itemIds: Seq[String]
)


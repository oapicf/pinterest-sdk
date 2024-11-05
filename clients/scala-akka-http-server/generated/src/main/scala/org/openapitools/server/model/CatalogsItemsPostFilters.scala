package org.openapitools.server.model


/**
 * @param catalogType  for example: ''null''
 * @param itemIds  for example: ''null''
 * @param catalogId Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog for example: ''null''
 * @param hotelIds  for example: ''null''
 * @param creativeAssetsIds  for example: ''null''
*/
final case class CatalogsItemsPostFilters (
  catalogType: CatalogsType,
  itemIds: Seq[String],
  catalogId: Option[String] = None,
  hotelIds: Seq[String],
  creativeAssetsIds: Seq[String]
)


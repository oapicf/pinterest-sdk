package org.openapitools.server.model


/**
 * @param catalogType  for example: ''null''
 * @param itemIds  for example: ''null''
 * @param catalogId Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog for example: ''null''
 * @param hotelIds  for example: ''null''
*/
final case class CatalogsItemsFilters (
  catalogType: CatalogsType,
  itemIds: Seq[String],
  catalogId: Option[String] = None,
  hotelIds: Seq[String]
)


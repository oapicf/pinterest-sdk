package org.openapitools.server.model


/**
 * @param catalogType  for example: ''null''
 * @param hotelIds  for example: ''null''
 * @param catalogId Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog for example: ''null''
*/
final case class CatalogsHotelItemsPostFilter (
  catalogType: String,
  hotelIds: Seq[String],
  catalogId: Option[String] = None
)


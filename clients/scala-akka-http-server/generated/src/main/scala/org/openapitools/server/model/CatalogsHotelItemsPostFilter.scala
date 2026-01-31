package org.openapitools.server.model


/**
 * @param catalogId Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog for example: ''null''
 * @param catalogType  for example: ''null''
 * @param hotelIds  for example: ''null''
*/
final case class CatalogsHotelItemsPostFilter (
  catalogId: Option[String] = None,
  catalogType: String,
  hotelIds: Seq[String]
)


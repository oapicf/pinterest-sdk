package org.openapitools.server.model


/**
 * Object describing a hotel record
 *
 * @param catalogType  for example: ''null''
 * @param hotelId The catalog hotel id in the merchant namespace for example: ''DS0294-M''
 * @param pins The pins mapped to the item for example: ''null''
 * @param attributes  for example: ''null''
*/
final case class CatalogsHotelItemResponse (
  catalogType: CatalogsType,
  hotelId: Option[String] = None,
  pins: Option[Seq[Pin]] = None,
  attributes: Option[CatalogsHotelAttributes] = None
)


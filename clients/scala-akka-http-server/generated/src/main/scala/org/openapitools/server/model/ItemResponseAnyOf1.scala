package org.openapitools.server.model


/**
 * @param catalogType  for example: ''null''
 * @param itemId The catalog item id in the merchant namespace for example: ''DS0294-M''
 * @param errors Array with the errors for the item id requested for example: ''null''
 * @param hotelId The catalog hotel id in the merchant namespace for example: ''DS0294-M''
 * @param creativeAssetsId The catalog creative assets id in the merchant namespace for example: ''DS0294-M''
*/
final case class ItemResponseAnyOf1 (
  catalogType: CatalogsType,
  itemId: Option[String] = None,
  errors: Option[Seq[ItemValidationEvent]] = None,
  hotelId: Option[String] = None,
  creativeAssetsId: Option[String] = None
)


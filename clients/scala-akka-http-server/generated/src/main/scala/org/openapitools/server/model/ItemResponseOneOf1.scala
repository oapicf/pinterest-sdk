package org.openapitools.server.model


/**
 * Error item response
 *
 * @param catalogType  for example: ''null''
 * @param errors  for example: ''null''
 * @param itemId The catalog item id in the merchant namespace for example: ''DS0294-M''
 * @param hotelId The catalog hotel id in the merchant namespace for example: ''DS0294-M''
 * @param creativeAssetsId The catalog creative assets id in the merchant namespace for example: ''DS0294-M''
*/
final case class ItemResponseOneOf1 (
  catalogType: CatalogsType,
  errors: Seq[ItemValidationEvent],
  itemId: Option[String] = None,
  hotelId: Option[String] = None,
  creativeAssetsId: Option[String] = None
)


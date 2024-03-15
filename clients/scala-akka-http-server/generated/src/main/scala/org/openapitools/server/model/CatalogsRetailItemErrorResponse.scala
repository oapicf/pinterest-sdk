package org.openapitools.server.model


/**
 * Object describing a retail item error
 *
 * @param catalogType  for example: ''null''
 * @param itemId The catalog item id in the merchant namespace for example: ''DS0294-M''
 * @param errors Array with the errors for the item id requested for example: ''null''
*/
final case class CatalogsRetailItemErrorResponse (
  catalogType: CatalogsType,
  itemId: Option[String] = None,
  errors: Option[Seq[ItemValidationEvent]] = None
)


package org.openapitools.server.model


/**
 * Object describing a creative assets item error
 *
 * @param catalogType  for example: ''null''
 * @param creativeAssetsId The catalog creative assets id in the merchant namespace for example: ''DS0294-M''
 * @param errors Array with the errors for the item id requested for example: ''null''
*/
final case class CatalogsCreativeAssetsItemErrorResponse (
  catalogType: CatalogsType,
  creativeAssetsId: Option[String] = None,
  errors: Option[Seq[ItemValidationEvent]] = None
)


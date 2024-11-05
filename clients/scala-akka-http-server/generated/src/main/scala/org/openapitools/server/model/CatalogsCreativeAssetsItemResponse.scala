package org.openapitools.server.model


/**
 * Object describing a hotel record
 *
 * @param catalogType  for example: ''null''
 * @param creativeAssetsId The catalog creative assets id in the merchant namespace for example: ''DS0294-M''
 * @param pins The pins mapped to the item for example: ''null''
 * @param attributes  for example: ''null''
*/
final case class CatalogsCreativeAssetsItemResponse (
  catalogType: CatalogsType,
  creativeAssetsId: Option[String] = None,
  pins: Option[Seq[Pin]] = None,
  attributes: Option[CatalogsCreativeAssetsAttributes] = None
)


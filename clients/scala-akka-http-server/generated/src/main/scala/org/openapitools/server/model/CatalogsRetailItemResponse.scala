package org.openapitools.server.model


/**
 * Object describing a retail item record
 *
 * @param attributes  for example: ''null''
 * @param catalogType  for example: ''null''
 * @param itemId The catalog retail item id in the merchant namespace for example: ''DS0294-M''
 * @param pins The pins mapped to the item for example: ''null''
*/
final case class CatalogsRetailItemResponse (
  attributes: Option[ItemAttributes] = None,
  catalogType: CatalogsType,
  itemId: Option[String] = None,
  pins: Option[Seq[Pin]] = None
)


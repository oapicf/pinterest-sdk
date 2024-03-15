package org.openapitools.server.model


/**
 * @param items Pins for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class CatalogsProductGroupPinsList200Response (
  items: Seq[CatalogsProduct],
  bookmark: Option[String] = None
)


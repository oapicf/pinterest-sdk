package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class CatalogsProductGroupsList200Response (
  items: Seq[CatalogsProductGroupsList200ResponseAllOfItemsInner],
  bookmark: Option[String] = None
)


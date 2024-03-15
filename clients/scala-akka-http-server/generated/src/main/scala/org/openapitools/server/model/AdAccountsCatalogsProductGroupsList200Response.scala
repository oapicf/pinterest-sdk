package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class AdAccountsCatalogsProductGroupsList200Response (
  items: Seq[CatalogProductGroup],
  bookmark: Option[String] = None
)


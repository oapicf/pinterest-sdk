package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class CatalogsProductGroupsList200Response (
  items: Seq[CatalogsVerticalProductGroup],
  bookmark: Option[String] = None
)


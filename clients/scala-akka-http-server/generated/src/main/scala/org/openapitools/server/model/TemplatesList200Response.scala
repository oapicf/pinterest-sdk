package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class TemplatesList200Response (
  items: Seq[TemplateResponse],
  bookmark: Option[String] = None
)


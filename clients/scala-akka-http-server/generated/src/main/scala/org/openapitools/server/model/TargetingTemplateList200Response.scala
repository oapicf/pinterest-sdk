package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class TargetingTemplateList200Response (
  items: Seq[TargetingTemplateResponseData],
  bookmark: Option[String] = None
)


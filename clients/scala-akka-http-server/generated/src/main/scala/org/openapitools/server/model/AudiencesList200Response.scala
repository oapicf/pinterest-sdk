package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class AudiencesList200Response (
  items: Seq[Audience],
  bookmark: Option[String] = None
)


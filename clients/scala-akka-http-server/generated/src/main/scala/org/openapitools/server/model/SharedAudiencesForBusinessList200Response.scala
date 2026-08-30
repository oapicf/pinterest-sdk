package org.openapitools.server.model


/**
 * @param bookmark  for example: ''null''
 * @param items  for example: ''null''
*/
final case class SharedAudiencesForBusinessList200Response (
  bookmark: Option[String] = None,
  items: Seq[Audience]
)


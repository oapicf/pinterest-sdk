package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class UserWebsitesGet200Response (
  items: Seq[UserWebsiteSummary],
  bookmark: Option[String] = None
)


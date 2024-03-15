package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class UserAccountFollowedInterests200Response (
  items: Seq[Interest],
  bookmark: Option[String] = None
)


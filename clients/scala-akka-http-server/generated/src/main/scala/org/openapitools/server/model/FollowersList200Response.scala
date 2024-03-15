package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class FollowersList200Response (
  items: Seq[UserSummary],
  bookmark: Option[String] = None
)


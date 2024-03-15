package org.openapitools.server.model


/**
 * @param items Users for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class UserFollowingGet200Response (
  items: Seq[UserSummary],
  bookmark: Option[String] = None
)


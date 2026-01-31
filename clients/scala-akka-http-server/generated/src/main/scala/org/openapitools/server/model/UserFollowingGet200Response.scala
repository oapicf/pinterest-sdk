package org.openapitools.server.model


/**
 * @param bookmark  for example: ''null''
 * @param items Users for example: ''null''
*/
final case class UserFollowingGet200Response (
  bookmark: Option[String] = None,
  items: Seq[UserSummary]
)


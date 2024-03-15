package org.openapitools.server.model


/**
 * = UserSummary =
 *
 * @param username Username for example: ''username''
 * @param `type` Always \"user\" for example: ''user''
*/
final case class UserSummary (
  username: Option[String] = None,
  `type`: Option[String] = None
)


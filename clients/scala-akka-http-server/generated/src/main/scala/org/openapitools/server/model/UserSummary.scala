package org.openapitools.server.model


/**
 * = UserSummary =
 *
 * @param `type` Always \"user\" for example: ''user''
 * @param username Username for example: ''username''
*/
final case class UserSummary (
  `type`: Option[String] = None,
  username: Option[String] = None
)


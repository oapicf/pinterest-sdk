package org.openapitools.server.model


/**
 * = Follow/following User =
 *
 * @param `type` Always 'user' for example: ''null''
 * @param username Username for example: ''null''
*/
final case class FollowUser (
  `type`: Option[String] = None,
  username: Option[String] = None
)


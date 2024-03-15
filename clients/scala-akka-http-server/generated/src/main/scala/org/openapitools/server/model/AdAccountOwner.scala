package org.openapitools.server.model


/**
 * = Ad account owner =
 *
 * @param username Public username for the user account for example: ''null''
 * @param id The owning account's user ID. for example: ''null''
*/
final case class AdAccountOwner (
  username: Option[String] = None,
  id: Option[String] = None
)


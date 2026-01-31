package org.openapitools.server.model


/**
 * @param id The owning account's user ID. for example: ''null''
 * @param username Public username for the user account for example: ''null''
*/
final case class AdAccountOwner (
  id: Option[String] = None,
  username: Option[String] = None
)


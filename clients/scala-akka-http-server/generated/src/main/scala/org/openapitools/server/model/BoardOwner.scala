package org.openapitools.server.model


/**
 * = Board owner containing the username. =
 *
 * @param username  for example: ''null''
*/
final case class BoardOwner (
  username: Option[String] = None
)


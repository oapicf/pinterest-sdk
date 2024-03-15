package org.openapitools.server.model


/**
 * = BoardUpdate =
 *
 * Board fields for updates
 *
 * @param name  for example: ''Summer Recipes''
 * @param description  for example: ''My favorite summer recipes''
 * @param privacy  for example: ''null''
*/
final case class BoardUpdate (
  name: Option[String] = None,
  description: Option[String] = None,
  privacy: Option[String] = None
)


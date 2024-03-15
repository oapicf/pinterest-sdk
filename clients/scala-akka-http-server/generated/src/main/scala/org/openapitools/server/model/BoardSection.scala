package org.openapitools.server.model


/**
 * = Board section =
 *
 * Sections help organize pins within a board.
 *
 * @param id  for example: ''549755885175''
 * @param name  for example: ''Salads''
*/
final case class BoardSection (
  id: Option[String] = None,
  name: String
)


package org.openapitools.server.model


/**
 * @param items Pins for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class BoardsListPins200Response (
  items: Seq[Pin],
  bookmark: Option[String] = None
)


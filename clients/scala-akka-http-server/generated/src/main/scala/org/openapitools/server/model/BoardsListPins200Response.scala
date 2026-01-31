package org.openapitools.server.model


/**
 * @param bookmark  for example: ''null''
 * @param items Pins for example: ''null''
*/
final case class BoardsListPins200Response (
  bookmark: Option[String] = None,
  items: Seq[Pin]
)


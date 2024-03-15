package org.openapitools.server.model


/**
 * @param boardId Unique identifier of the board to which the pin will be saved. for example: ''null''
 * @param boardSectionId Unique identifier of the board section to which the pin will be saved. for example: ''null''
*/
final case class PinsSaveRequest (
  boardId: Option[String] = None,
  boardSectionId: Option[String] = None
)


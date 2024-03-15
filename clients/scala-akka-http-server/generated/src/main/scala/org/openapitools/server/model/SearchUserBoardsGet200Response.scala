package org.openapitools.server.model


/**
 * @param items items for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class SearchUserBoardsGet200Response (
  items: Seq[Board],
  bookmark: Option[String] = None
)


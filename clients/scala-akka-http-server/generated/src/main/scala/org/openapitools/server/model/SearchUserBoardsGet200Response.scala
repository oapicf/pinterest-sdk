package org.openapitools.server.model


/**
 * @param bookmark  for example: ''null''
 * @param items items for example: ''null''
*/
final case class SearchUserBoardsGet200Response (
  bookmark: Option[String] = None,
  items: Seq[Board]
)


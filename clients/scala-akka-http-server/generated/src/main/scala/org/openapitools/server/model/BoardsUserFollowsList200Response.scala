package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class BoardsUserFollowsList200Response (
  items: Seq[Board],
  bookmark: Option[String] = None
)


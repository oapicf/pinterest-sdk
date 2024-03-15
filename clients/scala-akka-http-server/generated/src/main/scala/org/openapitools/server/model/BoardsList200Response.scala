package org.openapitools.server.model


/**
 * @param items Boards for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class BoardsList200Response (
  items: Seq[Board],
  bookmark: Option[String] = None
)


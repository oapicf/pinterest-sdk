package org.openapitools.server.model


/**
 * @param items Board sections for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class BoardSectionsList200Response (
  items: Seq[BoardSection],
  bookmark: Option[String] = None
)


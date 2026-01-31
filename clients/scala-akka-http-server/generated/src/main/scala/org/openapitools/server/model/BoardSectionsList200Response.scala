package org.openapitools.server.model


/**
 * @param bookmark  for example: ''null''
 * @param items Board sections for example: ''null''
*/
final case class BoardSectionsList200Response (
  bookmark: Option[String] = None,
  items: Seq[BoardSection]
)


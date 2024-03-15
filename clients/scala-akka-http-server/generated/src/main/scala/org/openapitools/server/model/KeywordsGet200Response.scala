package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class KeywordsGet200Response (
  items: Seq[Keyword],
  bookmark: Option[String] = None
)


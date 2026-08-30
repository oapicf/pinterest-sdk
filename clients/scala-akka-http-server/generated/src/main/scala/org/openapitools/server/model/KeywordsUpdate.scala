package org.openapitools.server.model


/**
 * Resource create or update operation model.
 *
 * @param keywords Keywords for example: ''null''
*/
final case class KeywordsUpdate (
  keywords: Option[Seq[KeywordUpdateItem]] = None
)


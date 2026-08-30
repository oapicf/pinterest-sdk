package org.openapitools.server.model


/**
 * @param errors Keyword error for example: ''null''
 * @param keywords Keywords for example: ''null''
*/
final case class Keywords (
  errors: Seq[KeywordError],
  keywords: Seq[Keyword]
)


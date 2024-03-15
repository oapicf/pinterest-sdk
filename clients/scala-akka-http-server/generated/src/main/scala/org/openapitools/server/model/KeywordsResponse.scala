package org.openapitools.server.model


/**
 * @param errors  for example: ''null''
 * @param keywords  for example: ''null''
*/
final case class KeywordsResponse (
  errors: Option[Seq[KeywordError]] = None,
  keywords: Option[Seq[Keyword]] = None
)


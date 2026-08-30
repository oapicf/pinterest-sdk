package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param keywords Keywords for example: ''null''
 * @param parentId Keyword data for example: ''null''
*/
final case class KeywordsCreate (
  keywords: Seq[KeywordCreateItem],
  parentId: String
)


package org.openapitools.server.model


/**
 * @param keywords Keyword JSON array. Each array element has 3 fields for example: ''null''
 * @param parentId Keyword parent entity ID (advertiser, campaign, ad group). for example: ''null''
*/
final case class KeywordsRequest (
  keywords: Seq[KeywordsCommon],
  parentId: String
)


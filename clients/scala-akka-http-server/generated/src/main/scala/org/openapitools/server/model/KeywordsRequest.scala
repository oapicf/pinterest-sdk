package org.openapitools.server.model


/**
 * @param keywords Keyword JSON array. Each array element has 3 fields for example: ''null''
 * @param parentId Keyword parent entity ID (advertiser, campaign, ad group). for example: ''383791336903426391''
*/
final case class KeywordsRequest (
  keywords: Seq[KeywordsCommon],
  parentId: String
)


package org.openapitools.server.model


/**
 * @param bid Keyword custom bid in microcurrency - null if inherited from parent ad group. for example: ''200000''
 * @param matchType  for example: ''null''
 * @param value Keyword value (120 chars max). for example: ''null''
*/
final case class KeywordsCommon (
  bid: Option[Int] = None,
  matchType: MatchTypeResponse,
  value: String
)


package org.openapitools.server.model


/**
 * @param bid </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. for example: ''null''
 * @param matchType  for example: ''null''
 * @param value Keyword value (120 chars max). for example: ''null''
*/
final case class KeywordsCommon (
  bid: Option[Int] = None,
  matchType: MatchTypeResponse,
  value: String
)


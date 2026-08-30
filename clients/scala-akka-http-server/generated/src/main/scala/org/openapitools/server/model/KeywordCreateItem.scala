package org.openapitools.server.model


/**
 * @param bid **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. for example: ''null''
 * @param matchType Keyword [match type](/docs/api-features/targeting-overview/) for example: ''null''
 * @param value Keyword value (120 chars max). for example: ''null''
*/
final case class KeywordCreateItem (
  bid: Option[Int] = None,
  matchType: MatchType,
  value: String
)


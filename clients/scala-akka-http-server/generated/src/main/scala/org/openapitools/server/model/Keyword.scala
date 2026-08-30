package org.openapitools.server.model


/**
 * @param archived  for example: ''false''
 * @param bid **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. for example: ''null''
 * @param id Keyword ID . for example: ''383791336903426391''
 * @param matchType Keyword [match type](/docs/api-features/targeting-overview/) for example: ''null''
 * @param parentId Keyword parent entity ID (advertiser, campaign, ad group). for example: ''383791336903426391''
 * @param parentType Parent entity type (advertiser, campaign, ad group). for example: ''campaign''
 * @param `type` Always keyword for example: ''keyword''
 * @param value Keyword value (120 chars max). for example: ''null''
*/
final case class Keyword (
  archived: Option[Boolean] = None,
  bid: Option[Int] = None,
  id: String,
  matchType: MatchType,
  parentId: String,
  parentType: Option[String] = None,
  `type`: Option[String] = None,
  value: String
)


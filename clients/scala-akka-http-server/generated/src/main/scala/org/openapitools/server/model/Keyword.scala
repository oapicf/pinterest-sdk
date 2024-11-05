package org.openapitools.server.model


/**
 * @param bid </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. for example: ''null''
 * @param matchType  for example: ''null''
 * @param value Keyword value (120 chars max). for example: ''null''
 * @param archived  for example: ''false''
 * @param id Keyword ID . for example: ''383791336903426391''
 * @param parentId Keyword parent entity ID (advertiser, campaign, ad group). for example: ''383791336903426391''
 * @param parentType Parent entity type for example: ''campaign''
 * @param `type` Always keyword for example: ''keyword''
*/
final case class Keyword (
  bid: Option[Int] = None,
  matchType: MatchTypeResponse,
  value: String,
  archived: Option[Boolean] = None,
  id: Option[String] = None,
  parentId: Option[String] = None,
  parentType: Option[String] = None,
  `type`: Option[String] = None
)


package org.openapitools.server.model


/**
 * @param matchType  for example: ''null''
 * @param value Keyword value (120 chars max). for example: ''null''
*/
final case class AdGroupAudienceSizingRequestKeywordsInner (
  matchType: MatchTypeResponse,
  value: String
)


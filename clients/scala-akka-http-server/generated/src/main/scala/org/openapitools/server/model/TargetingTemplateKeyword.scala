package org.openapitools.server.model


/**
 * @param matchType  for example: ''null''
 * @param value The keyword targeting (120 chars max). for example: ''couples halloween costumes''
*/
final case class TargetingTemplateKeyword (
  matchType: Option[MatchType] = None,
  value: Option[String] = None
)


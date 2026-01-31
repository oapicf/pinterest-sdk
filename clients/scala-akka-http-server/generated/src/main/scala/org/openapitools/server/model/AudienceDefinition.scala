package org.openapitools.server.model


/**
 * = AudienceDefinition =
 *
 * Queryable audience representation.
 *
 * @param date Generation date for example: ''2022-10-09''
 * @param scope  for example: ''PARTNER''
 * @param `type`  for example: ''IMPRESSION_PLUS_ENGAGEMENT''
*/
final case class AudienceDefinition (
  date: Option[String] = None,
  scope: Option[String] = None,
  `type`: Option[String] = None
)


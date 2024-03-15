package org.openapitools.server.model


/**
 * = AudienceDefinition =
 *
 * Queryable audience representation.
 *
 * @param date Generation date for example: ''2022-10-09''
 * @param `type` Generated audience type to request. for example: ''null''
 * @param scope Generated audience scope to request. for example: ''null''
*/
final case class AudienceDefinition (
  date: Option[String] = None,
  `type`: Option[String] = None,
  scope: Option[String] = None
)


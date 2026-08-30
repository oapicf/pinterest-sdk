package org.openapitools.server.model


/**
 * Breakdown of asset counts by entity status.
 *
 * @param ACTIVE Count of ACTIVE assets for example: ''null''
 * @param ARCHIVED Count of ARCHIVED assets for example: ''null''
 * @param PAUSED Count of PAUSED assets for example: ''null''
*/
final case class TotalCountByEntityStatus (
  ACTIVE: Option[Int] = None,
  ARCHIVED: Option[Int] = None,
  PAUSED: Option[Int] = None
)


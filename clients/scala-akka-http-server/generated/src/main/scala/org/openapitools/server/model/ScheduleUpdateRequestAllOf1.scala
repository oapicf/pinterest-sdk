package org.openapitools.server.model


/**
 * @param entityId  for example: ''null''
 * @param entityType Entity type for example: ''null''
 * @param id Schedule ID. for example: ''null''
*/
final case class ScheduleUpdateRequestAllOf1 (
  entityId: Option[String] = None,
  entityType: Option[String] = None,
  id: String
)


package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param scheduleId Schedule ID. for example: ''null''
 * @param exceptions  for example: ''null''
*/
final case class SchedulesCreate200ResponseInnerDataOneOf (
  id: String,
  scheduleId: String,
  exceptions: Error
)


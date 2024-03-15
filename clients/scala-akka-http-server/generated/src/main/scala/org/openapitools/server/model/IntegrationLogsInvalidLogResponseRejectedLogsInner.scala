package org.openapitools.server.model


/**
 * @param logIndex Index of the log in the batch. for example: ''null''
 * @param field The field name containing an invalid value. for example: ''null''
 * @param value The value that is invalid. for example: ''null''
 * @param reason The reason the value is invalid. for example: ''null''
*/
final case class IntegrationLogsInvalidLogResponseRejectedLogsInner (
  logIndex: Option[Int] = None,
  field: String,
  value: String,
  reason: String
)


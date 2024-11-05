package org.openapitools.server.model


/**
 * @param audienceId Unique identifier of an audience for example: ''2542621871096''
 * @param operationType  for example: ''null''
*/
final case class SharedAudienceCommon (
  audienceId: Option[String] = None,
  operationType: Option[OperationType] = None
)


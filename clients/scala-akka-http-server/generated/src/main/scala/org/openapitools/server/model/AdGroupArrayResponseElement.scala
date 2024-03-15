package org.openapitools.server.model


/**
 * @param data  for example: ''null''
 * @param exceptions  for example: ''null''
*/
final case class AdGroupArrayResponseElement (
  data: Option[AdGroupResponse] = None,
  exceptions: Option[Seq[Exception]] = None
)


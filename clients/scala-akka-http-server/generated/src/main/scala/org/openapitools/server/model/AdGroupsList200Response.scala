package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class AdGroupsList200Response (
  items: Seq[AdGroupResponse],
  bookmark: Option[String] = None
)


package org.openapitools.server.model


/**
 * @param exception  for example: ''null''
 * @param memberOrPartnerId  for example: ''1234567890123''
*/
final case class UpdatePartnerResultsResponseArrayItemsInner (
  exception: Option[BusinessAccessError] = None,
  memberOrPartnerId: Option[String] = None
)


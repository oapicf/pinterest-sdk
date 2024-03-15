package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class BillingProfilesGet200Response (
  items: Seq[BillingProfilesResponse],
  bookmark: Option[String] = None
)


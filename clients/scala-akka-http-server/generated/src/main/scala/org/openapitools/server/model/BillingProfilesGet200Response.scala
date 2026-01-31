package org.openapitools.server.model


/**
 * @param bookmark  for example: ''null''
 * @param items  for example: ''null''
*/
final case class BillingProfilesGet200Response (
  bookmark: Option[String] = None,
  items: Seq[BillingProfilesResponse]
)


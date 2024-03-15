package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class AdAccountsSubscriptionsGetList200Response (
  items: Seq[AdAccountGetSubscriptionResponse],
  bookmark: Option[String] = None
)


package org.openapitools.server.model


/**
 * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
 *
 * @param subscriberKey Text field value that uniquely identifies a subscriber. for example: ''null''
*/
final case class AdAccountCreateSubscriptionRequestPartnerMetadata (
  subscriberKey: Option[String] = None
)


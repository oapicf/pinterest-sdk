package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param country  for example: ''null''
 * @param currency  for example: ''null''
 * @param name Ad account name. for example: ''null''
 * @param ownerUserId Advertiser's owning user ID. for example: ''null''
 * @param timeZone The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. for example: ''America/Los_Angeles''
*/
final case class AdAccountCreate (
  country: Option[Country] = None,
  currency: Option[Currency] = None,
  name: Option[String] = None,
  ownerUserId: Option[String] = None,
  timeZone: Option[String] = None
)


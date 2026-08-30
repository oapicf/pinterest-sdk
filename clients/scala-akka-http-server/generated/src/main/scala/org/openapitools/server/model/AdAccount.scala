package org.openapitools.server.model


/**
 * @param country  for example: ''null''
 * @param createdTime  Creation time. Unix timestamp in seconds. for example: ''null''
 * @param currency  for example: ''null''
 * @param id  for example: ''null''
 * @param name Ad account name. for example: ''null''
 * @param owner Ad account owner for example: ''null''
 * @param permissions  for example: ''null''
 * @param timeZone The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. for example: ''America/Los_Angeles''
 * @param updatedTime  for example: ''null''
*/
final case class AdAccount (
  country: Option[Country] = None,
  createdTime: Option[Int] = None,
  currency: Option[Currency] = None,
  id: String,
  name: Option[String] = None,
  owner: Option[AdAccountOwner] = None,
  permissions: Option[Seq[BusinessAccessRole]] = None,
  timeZone: Option[String] = None,
  updatedTime: Option[Int] = None
)


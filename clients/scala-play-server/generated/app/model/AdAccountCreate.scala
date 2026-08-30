package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param name Ad account name.
  * @param ownerUserId Advertiser's owning user ID.
  * @param timeZone The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdAccountCreate(
  country: Option[Country],
  currency: Option[Currency],
  name: Option[String],
  ownerUserId: Option[String],
  timeZone: Option[String]
)

object AdAccountCreate {
  implicit lazy val adAccountCreateJsonFormat: Format[AdAccountCreate] = Json.format[AdAccountCreate]
}


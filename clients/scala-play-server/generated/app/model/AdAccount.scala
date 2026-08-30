package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdAccount.
  * @param createdTime  Creation time. Unix timestamp in seconds.
  * @param name Ad account name.
  * @param owner Ad account owner
  * @param timeZone The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdAccount(
  country: Option[Country],
  createdTime: Option[Int],
  currency: Option[Currency],
  id: String,
  name: Option[String],
  owner: Option[AdAccountOwner],
  permissions: Option[List[BusinessAccessRole]],
  timeZone: Option[String],
  updatedTime: Option[Int]
)

object AdAccount {
  implicit lazy val adAccountJsonFormat: Format[AdAccount] = Json.format[AdAccount]
}


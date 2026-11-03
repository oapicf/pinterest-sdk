package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ad_accounts_subscriptions_get_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AdAccountsSubscriptionsGetList200Response(
  bookmark: Option[String],
  items: List[LeadSubscription]
)

object AdAccountsSubscriptionsGetList200Response {
  implicit lazy val adAccountsSubscriptionsGetList200ResponseJsonFormat: Format[AdAccountsSubscriptionsGetList200Response] = Json.format[AdAccountsSubscriptionsGetList200Response]
}


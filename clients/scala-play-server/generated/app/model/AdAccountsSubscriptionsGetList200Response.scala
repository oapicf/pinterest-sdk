package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ad_accounts_subscriptions_get_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdAccountsSubscriptionsGetList200Response(
  items: List[AdAccountGetSubscriptionResponse],
  bookmark: Option[String]
)

object AdAccountsSubscriptionsGetList200Response {
  implicit lazy val adAccountsSubscriptionsGetList200ResponseJsonFormat: Format[AdAccountsSubscriptionsGetList200Response] = Json.format[AdAccountsSubscriptionsGetList200Response]
}


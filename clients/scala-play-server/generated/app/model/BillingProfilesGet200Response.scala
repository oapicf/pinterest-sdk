package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for billing_profiles_get_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class BillingProfilesGet200Response(
  items: List[BillingProfilesResponse],
  bookmark: Option[String]
)

object BillingProfilesGet200Response {
  implicit lazy val billingProfilesGet200ResponseJsonFormat: Format[BillingProfilesGet200Response] = Json.format[BillingProfilesGet200Response]
}


package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for billing_profiles_get_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BillingProfilesGet200Response(
  bookmark: Option[String],
  items: List[BillingProfilesResponse]
)

object BillingProfilesGet200Response {
  implicit lazy val billingProfilesGet200ResponseJsonFormat: Format[BillingProfilesGet200Response] = Json.format[BillingProfilesGet200Response]
}


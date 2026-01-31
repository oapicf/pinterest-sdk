package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for billing_profiles_get_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BillingProfilesGet200Response(
  items: List[BillingProfilesResponse],
  bookmark: Option[String]
)

object BillingProfilesGet200Response {
  implicit lazy val billingProfilesGet200ResponseJsonFormat: Format[BillingProfilesGet200Response] = Json.format[BillingProfilesGet200Response]
}


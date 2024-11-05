package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for billing_profiles_get_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class BillingProfilesGet200Response(
  items: List[BillingProfilesResponse],
  bookmark: Option[String]
)

object BillingProfilesGet200Response {
  implicit lazy val billingProfilesGet200ResponseJsonFormat: Format[BillingProfilesGet200Response] = Json.format[BillingProfilesGet200Response]
}


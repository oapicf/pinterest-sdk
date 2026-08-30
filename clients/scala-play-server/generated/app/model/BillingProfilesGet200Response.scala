package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for billing_profiles_get_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BillingProfilesGet200Response(
  bookmark: Option[String],
  items: List[BillingProfilesResponse]
)

object BillingProfilesGet200Response {
  implicit lazy val billingProfilesGet200ResponseJsonFormat: Format[BillingProfilesGet200Response] = Json.format[BillingProfilesGet200Response]
}


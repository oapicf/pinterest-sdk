package model

import play.api.libs.json._

/**
  * Response for lead data test API.
  * @param subscriptionId Subscription ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LeadFormTestResponse(
  subscriptionId: Option[String]
)

object LeadFormTestResponse {
  implicit lazy val leadFormTestResponseJsonFormat: Format[LeadFormTestResponse] = Json.format[LeadFormTestResponse]
}


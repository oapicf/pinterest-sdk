package model

import play.api.libs.json._

/**
  * Response for lead data test API.
  * @param subscriptionId Subscription ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class LeadFormTestResponse(
  subscriptionId: Option[String]
)

object LeadFormTestResponse {
  implicit lazy val leadFormTestResponseJsonFormat: Format[LeadFormTestResponse] = Json.format[LeadFormTestResponse]
}


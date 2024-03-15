package model

import play.api.libs.json._

/**
  * Response for lead data test API.
  * @param subscriptionId Subscription ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class LeadFormTestResponse(
  subscriptionId: Option[String]
)

object LeadFormTestResponse {
  implicit lazy val leadFormTestResponseJsonFormat: Format[LeadFormTestResponse] = Json.format[LeadFormTestResponse]
}


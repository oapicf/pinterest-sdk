package model

import play.api.libs.json._

/**
  * Response for lead data test API.
  * @param subscriptionId Subscription ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class LeadFormTestResponse(
  subscriptionId: Option[String]
)

object LeadFormTestResponse {
  implicit lazy val leadFormTestResponseJsonFormat: Format[LeadFormTestResponse] = Json.format[LeadFormTestResponse]
}


package model

import play.api.libs.json._

/**
  * Request to create test data for lead data test API.
  * @param answers Test lead answers. Should follow the creation order.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class LeadFormTestRequest(
  answers: List[String]
)

object LeadFormTestRequest {
  implicit lazy val leadFormTestRequestJsonFormat: Format[LeadFormTestRequest] = Json.format[LeadFormTestRequest]
}


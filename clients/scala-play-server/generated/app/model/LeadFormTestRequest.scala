package model

import play.api.libs.json._

/**
  * Request to create test data for lead data test API.
  * @param answers Test lead answers. Should follow the creation order.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class LeadFormTestRequest(
  answers: List[String]
)

object LeadFormTestRequest {
  implicit lazy val leadFormTestRequestJsonFormat: Format[LeadFormTestRequest] = Json.format[LeadFormTestRequest]
}


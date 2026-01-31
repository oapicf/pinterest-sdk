package model

import play.api.libs.json._

/**
  * Request to create test data for lead data test API.
  * @param answers Test lead answers. Should follow the creation order.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LeadFormTestRequest(
  answers: List[String]
)

object LeadFormTestRequest {
  implicit lazy val leadFormTestRequestJsonFormat: Format[LeadFormTestRequest] = Json.format[LeadFormTestRequest]
}


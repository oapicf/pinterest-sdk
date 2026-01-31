package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeadFormArrayResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LeadFormArrayResponse(
  items: Option[List[LeadFormArrayResponseItemsInner]]
)

object LeadFormArrayResponse {
  implicit lazy val leadFormArrayResponseJsonFormat: Format[LeadFormArrayResponse] = Json.format[LeadFormArrayResponse]
}


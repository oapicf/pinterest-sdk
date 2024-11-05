package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeadFormArrayResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class LeadFormArrayResponse(
  items: Option[List[LeadFormArrayResponseItemsInner]]
)

object LeadFormArrayResponse {
  implicit lazy val leadFormArrayResponseJsonFormat: Format[LeadFormArrayResponse] = Json.format[LeadFormArrayResponse]
}


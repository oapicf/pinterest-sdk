package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeadFormArrayResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class LeadFormArrayResponse(
  items: Option[List[LeadFormArrayResponseItemsInner]]
)

object LeadFormArrayResponse {
  implicit lazy val leadFormArrayResponseJsonFormat: Format[LeadFormArrayResponse] = Json.format[LeadFormArrayResponse]
}


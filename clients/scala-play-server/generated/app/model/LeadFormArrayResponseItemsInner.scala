package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeadFormArrayResponse_items_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class LeadFormArrayResponseItemsInner(
  data: Option[LeadFormResponse],
  exceptions: Option[List[Exception]]
)

object LeadFormArrayResponseItemsInner {
  implicit lazy val leadFormArrayResponseItemsInnerJsonFormat: Format[LeadFormArrayResponseItemsInner] = Json.format[LeadFormArrayResponseItemsInner]
}


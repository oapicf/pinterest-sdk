package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for items_issues_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ItemsIssuesList200Response(
  bookmark: Option[String],
  items: List[CatalogsItemValidationIssues]
)

object ItemsIssuesList200Response {
  implicit lazy val itemsIssuesList200ResponseJsonFormat: Format[ItemsIssuesList200Response] = Json.format[ItemsIssuesList200Response]
}


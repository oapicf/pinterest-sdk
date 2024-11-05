package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for items_issues_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ItemsIssuesList200Response(
  items: List[CatalogsItemValidationIssues],
  bookmark: Option[String]
)

object ItemsIssuesList200Response {
  implicit lazy val itemsIssuesList200ResponseJsonFormat: Format[ItemsIssuesList200Response] = Json.format[ItemsIssuesList200Response]
}


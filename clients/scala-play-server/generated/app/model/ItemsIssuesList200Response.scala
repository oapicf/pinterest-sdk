package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for items_issues_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ItemsIssuesList200Response(
  items: List[CatalogsItemValidationIssues],
  bookmark: Option[String]
)

object ItemsIssuesList200Response {
  implicit lazy val itemsIssuesList200ResponseJsonFormat: Format[ItemsIssuesList200Response] = Json.format[ItemsIssuesList200Response]
}


package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeleteMemberAccessResultsResponseArray.
  * @param items List of member asset permissions that were deleted.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class DeleteMemberAccessResultsResponseArray(
  items: Option[List[DeleteMemberAccessResult]]
)

object DeleteMemberAccessResultsResponseArray {
  implicit lazy val deleteMemberAccessResultsResponseArrayJsonFormat: Format[DeleteMemberAccessResultsResponseArray] = Json.format[DeleteMemberAccessResultsResponseArray]
}


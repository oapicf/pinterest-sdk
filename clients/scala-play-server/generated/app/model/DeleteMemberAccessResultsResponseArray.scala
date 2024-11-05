package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeleteMemberAccessResultsResponseArray.
  * @param items List of member asset permissions that were deleted.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class DeleteMemberAccessResultsResponseArray(
  items: Option[List[DeleteMemberAccessResult]]
)

object DeleteMemberAccessResultsResponseArray {
  implicit lazy val deleteMemberAccessResultsResponseArrayJsonFormat: Format[DeleteMemberAccessResultsResponseArray] = Json.format[DeleteMemberAccessResultsResponseArray]
}


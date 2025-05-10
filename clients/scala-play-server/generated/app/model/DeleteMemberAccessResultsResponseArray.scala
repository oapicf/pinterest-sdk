package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeleteMemberAccessResultsResponseArray.
  * @param items List of member asset permissions that were deleted.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class DeleteMemberAccessResultsResponseArray(
  items: Option[List[DeleteMemberAccessResult]]
)

object DeleteMemberAccessResultsResponseArray {
  implicit lazy val deleteMemberAccessResultsResponseArrayJsonFormat: Format[DeleteMemberAccessResultsResponseArray] = Json.format[DeleteMemberAccessResultsResponseArray]
}


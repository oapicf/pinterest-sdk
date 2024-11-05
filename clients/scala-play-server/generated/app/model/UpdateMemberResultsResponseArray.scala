package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdateMemberResultsResponseArray.
  * @param items List of members with updated business access role.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class UpdateMemberResultsResponseArray(
  items: Option[List[UpdateMemberResult]]
)

object UpdateMemberResultsResponseArray {
  implicit lazy val updateMemberResultsResponseArrayJsonFormat: Format[UpdateMemberResultsResponseArray] = Json.format[UpdateMemberResultsResponseArray]
}


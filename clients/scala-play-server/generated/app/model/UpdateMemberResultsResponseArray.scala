package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdateMemberResultsResponseArray.
  * @param items List of members with updated business access role.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class UpdateMemberResultsResponseArray(
  items: Option[List[UpdateMemberResult]]
)

object UpdateMemberResultsResponseArray {
  implicit lazy val updateMemberResultsResponseArrayJsonFormat: Format[UpdateMemberResultsResponseArray] = Json.format[UpdateMemberResultsResponseArray]
}


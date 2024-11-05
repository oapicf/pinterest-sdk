package model

import play.api.libs.json._

/**
  * The terminated asset access.
  * @param assetId Unique identifier of the business asset.
  * @param memberId Unique identifier of the business member.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class DeleteMemberAccessResult(
  assetId: Option[String],
  memberId: Option[String]
)

object DeleteMemberAccessResult {
  implicit lazy val deleteMemberAccessResultJsonFormat: Format[DeleteMemberAccessResult] = Json.format[DeleteMemberAccessResult]
}


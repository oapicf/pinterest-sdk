package model

import play.api.libs.json._

/**
  * The terminated asset access.
  * @param assetId Unique identifier of the business asset.
  * @param memberId Unique identifier of the business member.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class DeleteMemberAccessResult(
  assetId: Option[String],
  memberId: Option[String]
)

object DeleteMemberAccessResult {
  implicit lazy val deleteMemberAccessResultJsonFormat: Format[DeleteMemberAccessResult] = Json.format[DeleteMemberAccessResult]
}


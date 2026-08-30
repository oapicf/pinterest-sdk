package model

import play.api.libs.json._

/**
  * The terminated asset access.
  * @param assetId Unique identifier of the business asset.
  * @param memberId Unique identifier of the business member.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class DeleteMemberAccessResult(
  assetId: Option[String],
  memberId: Option[String]
)

object DeleteMemberAccessResult {
  implicit lazy val deleteMemberAccessResultJsonFormat: Format[DeleteMemberAccessResult] = Json.format[DeleteMemberAccessResult]
}


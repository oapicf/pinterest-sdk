package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for business_member_assets_get_200_response.
  * @param items List asset permissions the given member was granted.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BusinessMemberAssetsGet200Response(
  bookmark: Option[String],
  items: List[AssetIdPermissions]
)

object BusinessMemberAssetsGet200Response {
  implicit lazy val businessMemberAssetsGet200ResponseJsonFormat: Format[BusinessMemberAssetsGet200Response] = Json.format[BusinessMemberAssetsGet200Response]
}


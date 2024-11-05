package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for business_member_assets_get_200_response.
  * @param items List asset permissions the given member was granted.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class BusinessMemberAssetsGet200Response(
  items: List[AssetIdPermissions],
  bookmark: Option[String]
)

object BusinessMemberAssetsGet200Response {
  implicit lazy val businessMemberAssetsGet200ResponseJsonFormat: Format[BusinessMemberAssetsGet200Response] = Json.format[BusinessMemberAssetsGet200Response]
}


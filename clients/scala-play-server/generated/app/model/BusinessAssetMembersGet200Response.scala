package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for business_asset_members_get_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BusinessAssetMembersGet200Response(
  bookmark: Option[String],
  items: List[UserSingleAssetBinding]
)

object BusinessAssetMembersGet200Response {
  implicit lazy val businessAssetMembersGet200ResponseJsonFormat: Format[BusinessAssetMembersGet200Response] = Json.format[BusinessAssetMembersGet200Response]
}


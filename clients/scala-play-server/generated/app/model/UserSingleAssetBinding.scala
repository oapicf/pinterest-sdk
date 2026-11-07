package model

import play.api.libs.json._

/**
  * An object containing the permissions a business member/partner has on the asset.
  * @param permissions Permission levels member or partner has on an asset.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class UserSingleAssetBinding(
  permissions: Option[List[String]],
  user: Option[BusinessAccessUserSummary]
)

object UserSingleAssetBinding {
  implicit lazy val userSingleAssetBindingJsonFormat: Format[UserSingleAssetBinding] = Json.format[UserSingleAssetBinding]
}


package model

import play.api.libs.json._

/**
  * An object containing the permissions a business member/partner has on the asset.
  * @param permissions Permission levels member or partner has on an asset.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class UserSingleAssetBinding(
  permissions: Option[List[String]],
  user: Option[BusinessAccessUserSummary]
)

object UserSingleAssetBinding {
  implicit lazy val userSingleAssetBindingJsonFormat: Format[UserSingleAssetBinding] = Json.format[UserSingleAssetBinding]
}


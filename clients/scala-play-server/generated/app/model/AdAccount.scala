package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdAccount.
  * @param createdTime Creation time. Unix timestamp in seconds.
  * @param updatedTime Last update time. Unix timestamp in seconds.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdAccount(
  id: Option[String],
  name: Option[String],
  owner: Option[AdAccountOwner],
  country: Option[Country],
  currency: Option[Currency],
  permissions: Option[List[BusinessAccessRole]],
  createdTime: Option[Int],
  updatedTime: Option[Int]
)

object AdAccount {
  implicit lazy val adAccountJsonFormat: Format[AdAccount] = Json.format[AdAccount]
}


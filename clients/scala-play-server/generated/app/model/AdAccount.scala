package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdAccount.
  * @param createdTime  Creation time. Unix timestamp in seconds.
  * @param name Ad account name.
  * @param owner Ad account owner
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdAccount(
  country: Option[Country],
  createdTime: Option[Int],
  currency: Option[Currency],
  id: String,
  name: Option[String],
  owner: Option[AdAccountOwner],
  permissions: Option[List[BusinessAccessRole]],
  updatedTime: Option[Int]
)

object AdAccount {
  implicit lazy val adAccountJsonFormat: Format[AdAccount] = Json.format[AdAccount]
}


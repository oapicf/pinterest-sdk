package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BoardOwner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class BoardOwner(
  username: Option[String]
)

object BoardOwner {
  implicit lazy val boardOwnerJsonFormat: Format[BoardOwner] = Json.format[BoardOwner]
}


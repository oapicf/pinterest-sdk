package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BoardOwner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BoardOwner(
  username: Option[String]
)

object BoardOwner {
  implicit lazy val boardOwnerJsonFormat: Format[BoardOwner] = Json.format[BoardOwner]
}


package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UserSummary.
  * @param `type` Always \"user\"
  * @param username Username
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UserSummary(
  `type`: Option[String],
  username: Option[String]
)

object UserSummary {
  implicit lazy val userSummaryJsonFormat: Format[UserSummary] = Json.format[UserSummary]
}


package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UserSummary.
  * @param username Username
  * @param `type` Always \"user\"
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UserSummary(
  username: Option[String],
  `type`: Option[String]
)

object UserSummary {
  implicit lazy val userSummaryJsonFormat: Format[UserSummary] = Json.format[UserSummary]
}


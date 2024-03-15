package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UserSummary.
  * @param username Username
  * @param `type` Always \"user\"
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class UserSummary(
  username: Option[String],
  `type`: Option[String]
)

object UserSummary {
  implicit lazy val userSummaryJsonFormat: Format[UserSummary] = Json.format[UserSummary]
}


package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConversionDeletionRequestUserEmailTargets.
  * @param userEmails Array of plain text user emails.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ConversionDeletionRequestUserEmailTargets(
  userEmails: List[String]
)

object ConversionDeletionRequestUserEmailTargets {
  implicit lazy val conversionDeletionRequestUserEmailTargetsJsonFormat: Format[ConversionDeletionRequestUserEmailTargets] = Json.format[ConversionDeletionRequestUserEmailTargets]
}


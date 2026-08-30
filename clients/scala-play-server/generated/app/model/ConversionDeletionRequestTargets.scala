package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConversionDeletionRequestTargets.
  * @param userEmails Array of plain text user emails.
  * @param epiks Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ConversionDeletionRequestTargets(
  userEmails: List[String],
  epiks: List[String]
)

object ConversionDeletionRequestTargets {
  implicit lazy val conversionDeletionRequestTargetsJsonFormat: Format[ConversionDeletionRequestTargets] = Json.format[ConversionDeletionRequestTargets]
}


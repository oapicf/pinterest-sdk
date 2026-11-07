package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConversionDeletionRequestEPIKTargets.
  * @param epiks Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ConversionDeletionRequestEPIKTargets(
  epiks: List[String]
)

object ConversionDeletionRequestEPIKTargets {
  implicit lazy val conversionDeletionRequestEPIKTargetsJsonFormat: Format[ConversionDeletionRequestEPIKTargets] = Json.format[ConversionDeletionRequestEPIKTargets]
}


package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ScrollupGoalMetadata.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ScrollupGoalMetadata(
  scrollupGoalValueInMicroCurrency: Option[String]
)

object ScrollupGoalMetadata {
  implicit lazy val scrollupGoalMetadataJsonFormat: Format[ScrollupGoalMetadata] = Json.format[ScrollupGoalMetadata]
}


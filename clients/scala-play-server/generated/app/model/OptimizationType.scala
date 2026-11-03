package model

import play.api.libs.json._

/**
  * Optimization type for ad group delivery estimates. Supported types vary by objective.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class OptimizationType(
)

object OptimizationType {
  implicit lazy val optimizationTypeJsonFormat: Format[OptimizationType] = Json.format[OptimizationType]
}


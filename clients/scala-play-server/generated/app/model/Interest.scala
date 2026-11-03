package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Interest.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class Interest(
  canonicalUrl: Option[String],
  id: Option[String],
  key: Option[String],
  name: Option[String]
)

object Interest {
  implicit lazy val interestJsonFormat: Format[Interest] = Json.format[Interest]
}


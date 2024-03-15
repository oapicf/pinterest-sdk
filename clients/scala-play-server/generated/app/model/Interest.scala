package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Interest.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class Interest(
  canonicalUrl: Option[String],
  id: Option[String],
  key: Option[String],
  name: Option[String]
)

object Interest {
  implicit lazy val interestJsonFormat: Format[Interest] = Json.format[Interest]
}


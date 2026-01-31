package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdArrayResponseElement.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdArrayResponseElement(
  data: Option[AdResponse],
  exceptions: Option[Exception]
)

object AdArrayResponseElement {
  implicit lazy val adArrayResponseElementJsonFormat: Format[AdArrayResponseElement] = Json.format[AdArrayResponseElement]
}


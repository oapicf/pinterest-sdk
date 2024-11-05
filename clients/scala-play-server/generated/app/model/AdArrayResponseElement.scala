package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdArrayResponseElement.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdArrayResponseElement(
  data: Option[AdResponse],
  exceptions: Option[Exception]
)

object AdArrayResponseElement {
  implicit lazy val adArrayResponseElementJsonFormat: Format[AdArrayResponseElement] = Json.format[AdArrayResponseElement]
}


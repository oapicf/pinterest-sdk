package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Paginated.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class Paginated(
  items: List[JsObject],
  bookmark: Option[String]
)

object Paginated {
  implicit lazy val paginatedJsonFormat: Format[Paginated] = Json.format[Paginated]
}


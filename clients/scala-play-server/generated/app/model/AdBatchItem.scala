package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdBatchItem.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AdBatchItem(
  data: Option[Ad],
  exceptions: Option[Error]
)

object AdBatchItem {
  implicit lazy val adBatchItemJsonFormat: Format[AdBatchItem] = Json.format[AdBatchItem]
}


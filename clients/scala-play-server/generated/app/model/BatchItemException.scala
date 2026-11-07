package model

import play.api.libs.json._

/**
  * Exception details for a batch operation item.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BatchItemException(
  code: Option[Int],
  message: String
)

object BatchItemException {
  implicit lazy val pinterestLibBatchItemExceptionJsonFormat: Format[BatchItemException] = Json.format[BatchItemException]
}


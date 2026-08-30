package model

import play.api.libs.json._

/**
  * Exception details for a batch operation item.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BatchItemException(
  code: Option[Int],
  message: String
)

object BatchItemException {
  implicit lazy val pinterestLibBatchItemExceptionJsonFormat: Format[BatchItemException] = Json.format[BatchItemException]
}


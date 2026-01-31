package model

import play.api.libs.json._

/**
  * The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \"Out of Stock\".
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BatchOperation(
)

object BatchOperation {
  implicit lazy val batchOperationJsonFormat: Format[BatchOperation] = Json.format[BatchOperation]
}


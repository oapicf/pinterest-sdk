package model

import play.api.libs.json._

/**
  * The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \"Out of Stock\".
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class BatchOperation(
)

object BatchOperation {
  implicit lazy val batchOperationJsonFormat: Format[BatchOperation] = Json.format[BatchOperation]
}


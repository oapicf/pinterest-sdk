package model

import play.api.libs.json._

/**
  * The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \"Out of Stock\".
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class BatchOperation(
)

object BatchOperation {
  implicit lazy val batchOperationJsonFormat: Format[BatchOperation] = Json.format[BatchOperation]
}


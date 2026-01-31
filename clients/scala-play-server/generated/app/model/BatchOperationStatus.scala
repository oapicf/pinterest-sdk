package model

import play.api.libs.json._

/**
  * The status of the operation performed by the batch
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BatchOperationStatus(
)

object BatchOperationStatus {
  implicit lazy val batchOperationStatusJsonFormat: Format[BatchOperationStatus] = Json.format[BatchOperationStatus]
}


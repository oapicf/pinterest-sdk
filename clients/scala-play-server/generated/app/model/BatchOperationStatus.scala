package model

import play.api.libs.json._

/**
  * The status of the operation performed by the batch
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BatchOperationStatus(
)

object BatchOperationStatus {
  implicit lazy val batchOperationStatusJsonFormat: Format[BatchOperationStatus] = Json.format[BatchOperationStatus]
}


package model

import play.api.libs.json._

/**
  * The status of the operation performed by the batch
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class BatchOperationStatus(
)

object BatchOperationStatus {
  implicit lazy val batchOperationStatusJsonFormat: Format[BatchOperationStatus] = Json.format[BatchOperationStatus]
}


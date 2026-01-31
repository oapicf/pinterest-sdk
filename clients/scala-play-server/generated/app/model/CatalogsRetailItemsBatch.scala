package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Object describing the catalogs retail items batch
  * @param batchId Id of the catalogs items batch
  * @param createdTime Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
  * @param completedTime Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
  * @param items Array with the catalogs items processing records part of the catalogs items batch
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsRetailItemsBatch(
  batchId: Option[String],
  createdTime: Option[OffsetDateTime],
  completedTime: Option[OffsetDateTime],
  status: Option[BatchOperationStatus],
  catalogType: CatalogsType,
  items: Option[List[ItemProcessingRecord]]
)

object CatalogsRetailItemsBatch {
  implicit lazy val catalogsRetailItemsBatchJsonFormat: Format[CatalogsRetailItemsBatch] = Json.format[CatalogsRetailItemsBatch]
}


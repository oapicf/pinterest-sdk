package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Object describing the catalogs retail items batch
  * @param batchId Id of the catalogs items batch
  * @param completedTime Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
  * @param createdTime Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss. If null, batch creation was skipped due to a recent duplicate ingestion.
  * @param items Array with the catalogs items processing records part of the catalogs items batch
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsRetailItemsBatch(
  batchId: Option[String],
  catalogType: CatalogsRetailItemsBatch.CatalogType.Value,
  completedTime: Option[OffsetDateTime],
  createdTime: OffsetDateTime,
  items: Option[List[ItemProcessingRecord]],
  status: Option[BatchOperationStatus]
)

object CatalogsRetailItemsBatch {
  implicit lazy val catalogsRetailItemsBatchJsonFormat: Format[CatalogsRetailItemsBatch] = Json.format[CatalogsRetailItemsBatch]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val RETAIL = Value("RETAIL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}


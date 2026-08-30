package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Object describing the catalogs hotel items batch. If specified, you must provide all properties.
  * @param batchId Id of the catalogs items batch
  * @param completedTime Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
  * @param createdTime Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
  * @param items Array with the catalogs items processing records part of the catalogs items batch
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsHotelItemsBatch(
  batchId: Option[String],
  catalogType: CatalogsHotelItemsBatch.CatalogType.Value,
  completedTime: Option[OffsetDateTime],
  createdTime: Option[OffsetDateTime],
  items: Option[List[HotelProcessingRecord]],
  status: Option[BatchOperationStatus]
)

object CatalogsHotelItemsBatch {
  implicit lazy val catalogsHotelItemsBatchJsonFormat: Format[CatalogsHotelItemsBatch] = Json.format[CatalogsHotelItemsBatch]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val HOTEL = Value("HOTEL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}


package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Object describing the catalogs hotel items batch
  * @param batchId Id of the catalogs items batch
  * @param createdTime Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
  * @param completedTime Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
  * @param items Array with the catalogs items processing records part of the catalogs items batch
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsHotelItemsBatch(
  batchId: Option[String],
  createdTime: Option[OffsetDateTime],
  completedTime: Option[OffsetDateTime],
  status: Option[BatchOperationStatus],
  catalogType: CatalogsType,
  items: Option[List[HotelProcessingRecord]]
)

object CatalogsHotelItemsBatch {
  implicit lazy val catalogsHotelItemsBatchJsonFormat: Format[CatalogsHotelItemsBatch] = Json.format[CatalogsHotelItemsBatch]
}


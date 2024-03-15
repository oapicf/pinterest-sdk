package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Object describing the catalogs hotel items batch
  * @param batchId Id of the catalogs items batch
  * @param createdTime Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD
  * @param completedTime Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD
  * @param items Array with the catalogs items processing records part of the catalogs items batch
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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


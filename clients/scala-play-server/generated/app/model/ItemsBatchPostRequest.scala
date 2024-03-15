package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for items_batch_post_request.
  * @param items Array with catalogs items
  * @param catalogId Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ItemsBatchPostRequest(
  catalogType: CatalogsType,
  country: Country,
  language: Language,
  items: List[ItemDeleteBatchRecord],
  catalogId: Option[String],
  operation: BatchOperation
)

object ItemsBatchPostRequest {
  implicit lazy val itemsBatchPostRequestJsonFormat: Format[ItemsBatchPostRequest] = Json.format[ItemsBatchPostRequest]
}


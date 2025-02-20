/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.swagger.client.model
import play.api.libs.json._

case class ItemsBatchPostRequest (
                  catalogType:  Option[ItemsBatchPostRequestCatalogTypeEnum.ItemsBatchPostRequestCatalogTypeEnum],
                  country: Country,
                  language: CatalogsItemsRequestLanguage,
            /* Array with catalogs items */
                  items: Seq[ItemDeleteBatchRecord],
            /* Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog */
                  catalogId: Option[String],
                  operation: BatchOperation
)

object ItemsBatchPostRequest {
implicit val format: Format[ItemsBatchPostRequest] = Json.format
}

object ItemsBatchPostRequestCatalogTypeEnum extends Enumeration {
  val   CREATIVE_ASSETS = Value
  type ItemsBatchPostRequestCatalogTypeEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[ItemsBatchPostRequestCatalogTypeEnum.type])
}

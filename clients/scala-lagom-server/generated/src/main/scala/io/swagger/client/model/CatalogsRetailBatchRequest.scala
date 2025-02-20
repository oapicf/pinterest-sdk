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

case class CatalogsRetailBatchRequest (
                  catalogType:  Option[CatalogsRetailBatchRequestCatalogTypeEnum.CatalogsRetailBatchRequestCatalogTypeEnum],
                  country: Country,
                  language: CatalogsItemsRequestLanguage,
            /* Array with catalogs item operations */
                  items: Seq[CatalogsRetailBatchRequestItemsInner]
)

object CatalogsRetailBatchRequest {
implicit val format: Format[CatalogsRetailBatchRequest] = Json.format
}

object CatalogsRetailBatchRequestCatalogTypeEnum extends Enumeration {
  val   RETAIL = Value
  type CatalogsRetailBatchRequestCatalogTypeEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[CatalogsRetailBatchRequestCatalogTypeEnum.type])
}

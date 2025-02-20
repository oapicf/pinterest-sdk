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

case class CatalogsHotelProduct (
                  catalogType:  Option[CatalogsHotelProductCatalogTypeEnum.CatalogsHotelProductCatalogTypeEnum],
                  metadata: CatalogsHotelProductMetadata,
                  pin: Pin
)

object CatalogsHotelProduct {
implicit val format: Format[CatalogsHotelProduct] = Json.format
}

object CatalogsHotelProductCatalogTypeEnum extends Enumeration {
  val   HOTEL = Value
  type CatalogsHotelProductCatalogTypeEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[CatalogsHotelProductCatalogTypeEnum.type])
}

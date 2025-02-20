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

case class CatalogsCreativeAssetsBatchItem (
            /* The catalog creative assets id in the merchant namespace */
                  creativeAssetsId: String,
                  operation:  Option[CatalogsCreativeAssetsBatchItemOperationEnum.CatalogsCreativeAssetsBatchItemOperationEnum],
                  attributes: CatalogsUpdatableCreativeAssetsAttributes
)

object CatalogsCreativeAssetsBatchItem {
implicit val format: Format[CatalogsCreativeAssetsBatchItem] = Json.format
}

object CatalogsCreativeAssetsBatchItemOperationEnum extends Enumeration {
  val   DELETE = Value
  type CatalogsCreativeAssetsBatchItemOperationEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[CatalogsCreativeAssetsBatchItemOperationEnum.type])
}

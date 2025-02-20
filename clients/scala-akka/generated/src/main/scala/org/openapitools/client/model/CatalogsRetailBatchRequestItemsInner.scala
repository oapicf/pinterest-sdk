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
package org.openapitools.client.model

import org.openapitools.client.core.ApiModel

case class CatalogsRetailBatchRequestItemsInner (
  /* The catalog item id in the merchant namespace */
  itemId: String,
  operation: CatalogsRetailBatchRequestItemsInnerEnums.Operation,
  attributes: ItemAttributesRequest,
  /* The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. */
  updateMask: Option[Seq[UpdateMaskFieldType]] = None
) extends ApiModel

object CatalogsRetailBatchRequestItemsInnerEnums {

  type Operation = Operation.Value
  object Operation extends Enumeration {
    val DELETE = Value("DELETE")
  }

}

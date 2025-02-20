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

import org.openapitools.client.model.UpdateMaskFieldType._

  /**
   * An item to be updated
   */
case class CatalogsUpdateRetailItem(
  /* The catalog item id in the merchant namespace */
  itemId: String,
  operation: CatalogsUpdateRetailItemEnums.Operation,
  attributes: UpdatableItemAttributes,
  /* The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. */
  updateMask: Option[Seq[UpdateMaskFieldType]] = None
)

object CatalogsUpdateRetailItemEnums {

  type Operation = Operation.Value
  object Operation extends Enumeration {
    val UPDATE = Value("UPDATE")
  }

}

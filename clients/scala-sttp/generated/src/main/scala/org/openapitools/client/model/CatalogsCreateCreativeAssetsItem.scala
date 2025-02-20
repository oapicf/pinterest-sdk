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


  /**
   * A creative assets item to be created.
   */
case class CatalogsCreateCreativeAssetsItem(
  /* The catalog creative assets id in the merchant namespace */
  creativeAssetsId: String,
  operation: CatalogsCreateCreativeAssetsItemEnums.Operation,
  attributes: CatalogsCreativeAssetsAttributes
)

object CatalogsCreateCreativeAssetsItemEnums {

  type Operation = Operation.Value
  object Operation extends Enumeration {
    val CREATE = Value("CREATE")
  }

}

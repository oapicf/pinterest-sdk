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

case class CatalogsCreativeAssetsItemErrorResponse (
                  catalogType: CatalogsType,
            /* The catalog creative assets id in the merchant namespace */
                  creativeAssetsId: Option[String],
            /* Array with the errors for the item id requested */
                  errors: Option[Seq[ItemValidationEvent]]
)

object CatalogsCreativeAssetsItemErrorResponse {
implicit val format: Format[CatalogsCreativeAssetsItemErrorResponse] = Json.format
}


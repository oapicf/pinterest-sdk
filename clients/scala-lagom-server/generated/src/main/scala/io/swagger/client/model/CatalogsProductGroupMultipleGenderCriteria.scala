/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.swagger.client.model
import play.api.libs.json._

case class CatalogsProductGroupMultipleGenderCriteria (
                  values: Seq[Gender],
                  negated: Option[Boolean]
)

object CatalogsProductGroupMultipleGenderCriteria {
implicit val format: Format[CatalogsProductGroupMultipleGenderCriteria] = Json.format
}

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

case class ItemValidationEvent (
            /* The attribute that the item validation event references */
                  attribute: Option[String],
            /* The event code that the item validation event references */
                  code: Option[Int],
            /* Title message describing the item validation event */
                  message: Option[String]
)

object ItemValidationEvent {
implicit val format: Format[ItemValidationEvent] = Json.format
}


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

case class PinMediaWithImageAllOfImages (
                  `150x150`: Option[Any],
                  `400x300`: Option[Any],
                  `600x`: Option[Any],
                  `1200x`: Option[Any]
)

object PinMediaWithImageAllOfImages {
implicit val format: Format[PinMediaWithImageAllOfImages] = Json.format
}


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

case class ImageMetadataImages (
                  `150x150`: Option[ImageDetails],
                  `400x300`: Option[ImageDetails],
                  `600x`: Option[ImageDetails],
                  `1200x`: Option[ImageDetails]
)

object ImageMetadataImages {
implicit val format: Format[ImageMetadataImages] = Json.format
}


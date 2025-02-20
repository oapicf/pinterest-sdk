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

case class AdPreviewRequest (
            /* Image URL. */
                  imageUrl: String,
            /* Title displayed below ad. */
                  title: String,
            /* Pin ID. */
                  pinId: String
)

object AdPreviewRequest {
implicit val format: Format[AdPreviewRequest] = Json.format
}


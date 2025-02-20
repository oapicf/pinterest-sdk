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
import java.time.OffsetDateTime

case class CatalogsFeedIngestion (
                  id: String,
                  feedId: String,
                  createdAt: OffsetDateTime,
                  status: CatalogsFeedProcessingStatus
)

object CatalogsFeedIngestion {
implicit val format: Format[CatalogsFeedIngestion] = Json.format
}


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

case class SsioOrderLinesGetByAdAccount200Response (
            /* SSIO order lines by ad acount id */
                  items: Seq[SSIOOrderLine],
                  bookmark: Option[String]
)

object SsioOrderLinesGetByAdAccount200Response {
implicit val format: Format[SsioOrderLinesGetByAdAccount200Response] = Json.format
}


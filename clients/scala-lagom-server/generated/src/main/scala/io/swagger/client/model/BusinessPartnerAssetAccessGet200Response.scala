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

case class BusinessPartnerAssetAccessGet200Response (
            /* List assets on which you granted access to your partner or assets on which your partner has granted you access. */
                  items: Seq[GetPartnerAssetsResponse],
                  bookmark: Option[String]
)

object BusinessPartnerAssetAccessGet200Response {
implicit val format: Format[BusinessPartnerAssetAccessGet200Response] = Json.format
}


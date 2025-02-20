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

case class GetBusinessPartners200Response (
            /* List of business partners. */
                  items: Seq[UserBusinessRoleBinding],
                  bookmark: Option[String]
)

object GetBusinessPartners200Response {
implicit val format: Format[GetBusinessPartners200Response] = Json.format
}


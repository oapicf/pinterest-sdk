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

case class SSIOAccountAddress (
            /* Address display */
                  display: Option[String],
            /* Purpose for which the address is used, usually Billing or Businness */
                  purpose: Option[String],
            /* Salesforce id for address */
                  addressId: Option[String],
            /* Legal entity for this insertion order */
                  orderLegalEntity: Option[String]
)

object SSIOAccountAddress {
implicit val format: Format[SSIOAccountAddress] = Json.format
}

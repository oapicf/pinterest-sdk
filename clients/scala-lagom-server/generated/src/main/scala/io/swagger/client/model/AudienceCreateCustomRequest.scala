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

case class AudienceCreateCustomRequest (
            /* Ad account ID. */
                  adAccountId: Option[String],
            /* Audience name. */
                  name: String,
                  rule: AudienceRule,
                  sharingType: AudienceSharingType,
                  dataParty: AudienceDataParty,
                  category: Option[String]
)

object AudienceCreateCustomRequest {
implicit val format: Format[AudienceCreateCustomRequest] = Json.format
}

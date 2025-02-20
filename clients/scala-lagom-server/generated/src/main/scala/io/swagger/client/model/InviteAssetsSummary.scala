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

case class InviteAssetsSummary (
            /* List of ad account IDs and respective permission levels that will be assigned. */
                  adAccounts: Option[Seq[InviteAssetsSummaryAdAccountsInner]],
            /* List of profile IDs and respective permission levels that will be assigned. */
                  profiles: Option[Seq[InviteAssetsSummaryProfilesInner]]
)

object InviteAssetsSummary {
implicit val format: Format[InviteAssetsSummary] = Json.format
}


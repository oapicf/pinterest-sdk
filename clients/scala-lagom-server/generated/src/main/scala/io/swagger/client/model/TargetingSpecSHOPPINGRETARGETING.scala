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

case class TargetingSpecSHOPPINGRETARGETING (
            /* Number of days ago to start lookback timeframe for dynamic retargeting */
                  lookbackWindow: Option[Int],
            /* Event types to target for dynamic retargeting */
                  tagTypes: Option[Seq[Int]],
            /* Number of days ago to stop lookback timeframe for dynamic retargeting */
                  exclusionWindow: Option[Int]
)

object TargetingSpecSHOPPINGRETARGETING {
implicit val format: Format[TargetingSpecSHOPPINGRETARGETING] = Json.format
}


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

case class TargetingTemplateAudienceSizingReachEstimate (
                  estimate: Option[Long],
                  lowerBound: Option[Long],
                  upperBound: Option[Long]
)

object TargetingTemplateAudienceSizingReachEstimate {
implicit val format: Format[TargetingTemplateAudienceSizingReachEstimate] = Json.format
}


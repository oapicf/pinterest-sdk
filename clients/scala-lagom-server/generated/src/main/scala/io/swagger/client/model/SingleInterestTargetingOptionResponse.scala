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

case class SingleInterestTargetingOptionResponse (
                  id: Option[String],
                  name: Option[String],
                  childInterests: Option[Seq[String]],
                  level: Option[Int]
)

object SingleInterestTargetingOptionResponse {
implicit val format: Format[SingleInterestTargetingOptionResponse] = Json.format
}


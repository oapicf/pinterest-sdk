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

case class BidFloor (
            /* A list of bid floors in micro currency. For example, [100000, 200000] */
                  bidFloors: Option[Seq[Int]],
            /* Always the string 'bidfloor' */
                  `type`: Option[String]
)

object BidFloor {
implicit val format: Format[BidFloor] = Json.format
}


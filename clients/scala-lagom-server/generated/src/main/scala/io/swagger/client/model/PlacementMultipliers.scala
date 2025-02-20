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
import java.util.HashMap

case class PlacementMultipliers (
                  PLACEMENT:  Option[PlacementMultipliersPLACEMENTEnum.PlacementMultipliersPLACEMENTEnum]
)

object PlacementMultipliers {
implicit val format: Format[PlacementMultipliers] = Json.format
}

object PlacementMultipliersPLACEMENTEnum extends Enumeration {
  val   SEARCH, BROWSE = Value
  type PlacementMultipliersPLACEMENTEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[PlacementMultipliersPLACEMENTEnum.type])
}

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

case class BoardUpdate (
                  name: Option[String],
                  description: Option[String],
                  privacy:  Option[BoardUpdatePrivacyEnum.BoardUpdatePrivacyEnum]
)

object BoardUpdate {
implicit val format: Format[BoardUpdate] = Json.format
}

object BoardUpdatePrivacyEnum extends Enumeration {
  val   PUBLIC, SECRET = Value
  type BoardUpdatePrivacyEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[BoardUpdatePrivacyEnum.type])
}
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

case class PinMediaSourceImageBase64 (
                  sourceType:  Option[PinMediaSourceImageBase64SourceTypeEnum.PinMediaSourceImageBase64SourceTypeEnum],
                  `contentType`:  Option[PinMediaSourceImageBase64&#x60;contentType&#x60;Enum.PinMediaSourceImageBase64&#x60;contentType&#x60;Enum],
                  data: String,
            /* Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. */
                  isStandard: Option[Boolean]
)

object PinMediaSourceImageBase64 {
implicit val format: Format[PinMediaSourceImageBase64] = Json.format
}

object PinMediaSourceImageBase64SourceTypeEnum extends Enumeration {
  val   image_base64 = Value
  type PinMediaSourceImageBase64SourceTypeEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[PinMediaSourceImageBase64SourceTypeEnum.type])
}
object PinMediaSourceImageBase64&#x60;contentType&#x60;Enum extends Enumeration {
  val   image/jpeg, image/png = Value
  type PinMediaSourceImageBase64&#x60;contentType&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[PinMediaSourceImageBase64&#x60;contentType&#x60;Enum.type])
}

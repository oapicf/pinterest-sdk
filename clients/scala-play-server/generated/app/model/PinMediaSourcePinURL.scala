package model

import play.api.libs.json._

/**
  * Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.
  * @param isAffiliateLink This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class PinMediaSourcePinURL(
  sourceType: PinMediaSourcePinURL.SourceType.Value,
  isAffiliateLink: Option[Boolean]
)

object PinMediaSourcePinURL {
  implicit lazy val pinMediaSourcePinURLJsonFormat: Format[PinMediaSourcePinURL] = Json.format[PinMediaSourcePinURL]

  // noinspection TypeAnnotation
  object SourceType extends Enumeration {
    val PinUrl = Value("pin_url")

    type SourceType = Value
    implicit lazy val SourceTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}


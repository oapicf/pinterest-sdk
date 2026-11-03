package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdUpdateRequestAllOf1.
  * @param id The ID of this ad.
  * @param pinId Pin ID. This field may only be updated for draft ads.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AdUpdateRequestAllOf1(
  id: String,
  pinId: Option[String]
)

object AdUpdateRequestAllOf1 {
  implicit lazy val adUpdateRequestAllOf1JsonFormat: Format[AdUpdateRequestAllOf1] = Json.format[AdUpdateRequestAllOf1]
}


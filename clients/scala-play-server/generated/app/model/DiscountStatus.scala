package model

import play.api.libs.json._

/**
  * Discount status based on the current time and start and end time of discount
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class DiscountStatus(
)

object DiscountStatus {
  implicit lazy val discountStatusJsonFormat: Format[DiscountStatus] = Json.format[DiscountStatus]
}


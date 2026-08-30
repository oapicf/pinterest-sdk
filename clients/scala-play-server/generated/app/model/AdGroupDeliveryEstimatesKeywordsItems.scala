package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdGroupDeliveryEstimatesKeywordsItems.
  * @param value Keyword value (120 chars max).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdGroupDeliveryEstimatesKeywordsItems(
  matchType: NullalbleMatchType,
  value: String
)

object AdGroupDeliveryEstimatesKeywordsItems {
  implicit lazy val adGroupDeliveryEstimatesKeywordsItemsJsonFormat: Format[AdGroupDeliveryEstimatesKeywordsItems] = Json.format[AdGroupDeliveryEstimatesKeywordsItems]
}


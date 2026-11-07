package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdGroupDeliveryEstimatesKeywordsItems.
  * @param value Keyword value (120 chars max).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AdGroupDeliveryEstimatesKeywordsItems(
  matchType: NullalbleMatchType,
  value: String
)

object AdGroupDeliveryEstimatesKeywordsItems {
  implicit lazy val adGroupDeliveryEstimatesKeywordsItemsJsonFormat: Format[AdGroupDeliveryEstimatesKeywordsItems] = Json.format[AdGroupDeliveryEstimatesKeywordsItems]
}


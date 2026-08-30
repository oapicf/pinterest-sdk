package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdGroupCreateRequestAllOf1.
  * @param autoTargetingEnabled Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
  * @param bidMultiplier <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdGroupCreateRequestAllOf1(
  autoTargetingEnabled: Option[Boolean],
  bidMultiplier: Option[BigDecimal],
  budgetType: Option[BudgetType],
  pacingDeliveryType: Option[PacingDeliveryType]
)

object AdGroupCreateRequestAllOf1 {
  implicit lazy val adGroupCreateRequestAllOf1JsonFormat: Format[AdGroupCreateRequestAllOf1] = Json.format[AdGroupCreateRequestAllOf1]
}


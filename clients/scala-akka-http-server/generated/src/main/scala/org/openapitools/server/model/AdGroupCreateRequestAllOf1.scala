package org.openapitools.server.model


/**
 * @param autoTargetingEnabled Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>. for example: ''null''
 * @param bidMultiplier <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>. for example: ''null''
 * @param budgetType  for example: ''null''
 * @param pacingDeliveryType  for example: ''null''
*/
final case class AdGroupCreateRequestAllOf1 (
  autoTargetingEnabled: Option[Boolean] = None,
  bidMultiplier: Option[Double] = None,
  budgetType: Option[BudgetType] = None,
  pacingDeliveryType: Option[PacingDeliveryType] = None
)


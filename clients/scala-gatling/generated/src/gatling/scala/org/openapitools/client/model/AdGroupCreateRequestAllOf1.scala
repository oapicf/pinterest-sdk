
package org.openapitools.client.model


case class AdGroupCreateRequestAllOf1 (
    /* Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>. */
    _autoTargetingEnabled: Option[Boolean],
    /* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>. */
    _bidMultiplier: Option[Number],
    _budgetType: Option[BudgetType],
    _pacingDeliveryType: Option[PacingDeliveryType]
)
object AdGroupCreateRequestAllOf1 {
    def toStringBody(var_autoTargetingEnabled: Object, var_bidMultiplier: Object, var_budgetType: Object, var_pacingDeliveryType: Object) =
        s"""
        | {
        | "autoTargetingEnabled":$var_autoTargetingEnabled,"bidMultiplier":$var_bidMultiplier,"budgetType":$var_budgetType,"pacingDeliveryType":$var_pacingDeliveryType
        | }
        """.stripMargin
}

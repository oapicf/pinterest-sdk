
package org.openapitools.client.model


case class AdGroupDeliveryEstimatesKeywordsItems (
    _matchType: NullalbleMatchType,
    /* Keyword value (120 chars max). */
    _value: String
)
object AdGroupDeliveryEstimatesKeywordsItems {
    def toStringBody(var_matchType: Object, var_value: Object) =
        s"""
        | {
        | "matchType":$var_matchType,"value":$var_value
        | }
        """.stripMargin
}

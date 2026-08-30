
package org.openapitools.client.model


case class TargetingSpecShoppingRetargeting (
    /* Number of days ago to stop lookback timeframe for dynamic retargeting */
    _exclusionWindow: Option[Integer],
    /* Number of days ago to start lookback timeframe for dynamic retargeting */
    _lookbackWindow: Option[Integer],
    /* Event types to target for dynamic retargeting */
    _tagTypes: Option[List[Integer]]
)
object TargetingSpecShoppingRetargeting {
    def toStringBody(var_exclusionWindow: Object, var_lookbackWindow: Object, var_tagTypes: Object) =
        s"""
        | {
        | "exclusionWindow":$var_exclusionWindow,"lookbackWindow":$var_lookbackWindow,"tagTypes":$var_tagTypes
        | }
        """.stripMargin
}

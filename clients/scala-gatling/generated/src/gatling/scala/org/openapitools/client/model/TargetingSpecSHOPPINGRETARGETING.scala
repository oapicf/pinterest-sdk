
package org.openapitools.client.model


case class TargetingSpecSHOPPINGRETARGETING (
    /* Number of days ago to start lookback timeframe for dynamic retargeting */
    _lookbackWindow: Option[Integer],
    /* Event types to target for dynamic retargeting */
    _tagTypes: Option[List[Integer]],
    /* Number of days ago to stop lookback timeframe for dynamic retargeting */
    _exclusionWindow: Option[Integer]
)
object TargetingSpecSHOPPINGRETARGETING {
    def toStringBody(var_lookbackWindow: Object, var_tagTypes: Object, var_exclusionWindow: Object) =
        s"""
        | {
        | "lookbackWindow":$var_lookbackWindow,"tagTypes":$var_tagTypes,"exclusionWindow":$var_exclusionWindow
        | }
        """.stripMargin
}

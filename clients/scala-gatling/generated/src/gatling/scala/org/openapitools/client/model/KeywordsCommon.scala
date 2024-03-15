
package org.openapitools.client.model


case class KeywordsCommon (
    /* Keyword custom bid in microcurrency - null if inherited from parent ad group. */
    _bid: Option[Integer],
    _matchType: MatchTypeResponse,
    /* Keyword value (120 chars max). */
    _value: String
)
object KeywordsCommon {
    def toStringBody(var_bid: Object, var_matchType: Object, var_value: Object) =
        s"""
        | {
        | "bid":$var_bid,"matchType":$var_matchType,"value":$var_value
        | }
        """.stripMargin
}

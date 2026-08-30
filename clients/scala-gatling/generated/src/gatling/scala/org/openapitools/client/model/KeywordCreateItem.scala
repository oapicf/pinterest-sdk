
package org.openapitools.client.model


case class KeywordCreateItem (
    /* **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. */
    _bid: Option[Integer],
    /* Keyword [match type](/docs/api-features/targeting-overview/) */
    _matchType: MatchType,
    /* Keyword value (120 chars max). */
    _value: String
)
object KeywordCreateItem {
    def toStringBody(var_bid: Object, var_matchType: Object, var_value: Object) =
        s"""
        | {
        | "bid":$var_bid,"matchType":$var_matchType,"value":$var_value
        | }
        """.stripMargin
}


package org.openapitools.client.model


case class AdGroupAudienceSizingKeyword (
    _matchType: MatchType,
    /* Keyword value (120 chars max). */
    _value: String
)
object AdGroupAudienceSizingKeyword {
    def toStringBody(var_matchType: Object, var_value: Object) =
        s"""
        | {
        | "matchType":$var_matchType,"value":$var_value
        | }
        """.stripMargin
}

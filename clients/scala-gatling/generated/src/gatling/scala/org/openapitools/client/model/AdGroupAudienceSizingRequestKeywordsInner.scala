
package org.openapitools.client.model


case class AdGroupAudienceSizingRequestKeywordsInner (
    _matchType: MatchTypeResponse,
    /* Keyword value (120 chars max). */
    _value: String
)
object AdGroupAudienceSizingRequestKeywordsInner {
    def toStringBody(var_matchType: Object, var_value: Object) =
        s"""
        | {
        | "matchType":$var_matchType,"value":$var_value
        | }
        """.stripMargin
}

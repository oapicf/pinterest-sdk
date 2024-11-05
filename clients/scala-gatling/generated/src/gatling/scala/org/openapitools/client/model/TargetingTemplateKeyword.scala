
package org.openapitools.client.model


case class TargetingTemplateKeyword (
    _matchType: Option[MatchType],
    /* The keyword targeting (120 chars max). */
    _value: Option[String]
)
object TargetingTemplateKeyword {
    def toStringBody(var_matchType: Object, var_value: Object) =
        s"""
        | {
        | "matchType":$var_matchType,"value":$var_value
        | }
        """.stripMargin
}

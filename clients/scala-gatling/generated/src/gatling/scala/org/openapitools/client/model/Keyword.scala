
package org.openapitools.client.model


case class Keyword (
    _archived: Option[Boolean],
    /* **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. */
    _bid: Option[Integer],
    /* Keyword ID . */
    _id: String,
    /* Keyword [match type](/docs/api-features/targeting-overview/) */
    _matchType: MatchType,
    /* Keyword parent entity ID (advertiser, campaign, ad group). */
    _parentId: String,
    /* Parent entity type (advertiser, campaign, ad group). */
    _parentType: Option[String],
    /* Always keyword */
    _type: Option[String],
    /* Keyword value (120 chars max). */
    _value: String
)
object Keyword {
    def toStringBody(var_archived: Object, var_bid: Object, var_id: Object, var_matchType: Object, var_parentId: Object, var_parentType: Object, var_type: Object, var_value: Object) =
        s"""
        | {
        | "archived":$var_archived,"bid":$var_bid,"id":$var_id,"matchType":$var_matchType,"parentId":$var_parentId,"parentType":$var_parentType,"type":$var_type,"value":$var_value
        | }
        """.stripMargin
}

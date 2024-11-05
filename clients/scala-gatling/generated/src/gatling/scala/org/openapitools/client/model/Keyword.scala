
package org.openapitools.client.model


case class Keyword (
    /* </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. */
    _bid: Option[Integer],
    _matchType: MatchTypeResponse,
    /* Keyword value (120 chars max). */
    _value: String,
    _archived: Option[Boolean],
    /* Keyword ID . */
    _id: Option[String],
    /* Keyword parent entity ID (advertiser, campaign, ad group). */
    _parentId: Option[String],
    /* Parent entity type */
    _parentType: Option[String],
    /* Always keyword */
    _type: Option[String]
)
object Keyword {
    def toStringBody(var_bid: Object, var_matchType: Object, var_value: Object, var_archived: Object, var_id: Object, var_parentId: Object, var_parentType: Object, var_type: Object) =
        s"""
        | {
        | "bid":$var_bid,"matchType":$var_matchType,"value":$var_value,"archived":$var_archived,"id":$var_id,"parentId":$var_parentId,"parentType":$var_parentType,"type":$var_type
        | }
        """.stripMargin
}

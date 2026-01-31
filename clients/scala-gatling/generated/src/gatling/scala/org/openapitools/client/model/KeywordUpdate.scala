
package org.openapitools.client.model


case class KeywordUpdate (
    /* Is keyword archived? */
    _archived: Option[Boolean],
    /* </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. */
    _bid: Option[Integer],
    /* Keyword ID. */
    _id: String
)
object KeywordUpdate {
    def toStringBody(var_archived: Object, var_bid: Object, var_id: Object) =
        s"""
        | {
        | "archived":$var_archived,"bid":$var_bid,"id":$var_id
        | }
        """.stripMargin
}

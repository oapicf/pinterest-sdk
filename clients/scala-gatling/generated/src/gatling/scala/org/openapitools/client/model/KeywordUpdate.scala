
package org.openapitools.client.model


case class KeywordUpdate (
    /* Keyword ID. */
    _id: String,
    /* Is keyword archived? */
    _archived: Option[Boolean],
    /* </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. */
    _bid: Option[Integer]
)
object KeywordUpdate {
    def toStringBody(var_id: Object, var_archived: Object, var_bid: Object) =
        s"""
        | {
        | "id":$var_id,"archived":$var_archived,"bid":$var_bid
        | }
        """.stripMargin
}


package org.openapitools.client.model


case class UpdatePartnerAssetsResultsResponseArray (
    /* List of assigned/updated partner asset access. */
    _items: Option[List[UpdatePartnerAssetsResult]]
)
object UpdatePartnerAssetsResultsResponseArray {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}

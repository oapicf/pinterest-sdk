
package org.openapitools.client.model


case class DeletePartnerAssetsResultsResponseArray (
    /* List of terminated asset access. */
    _items: Option[List[DeletePartnerAssetsResult]]
)
object DeletePartnerAssetsResultsResponseArray {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}

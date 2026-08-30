
package org.openapitools.client.model


case class DeletePartnerAssetAccessResultsResponseArray (
    /* List of terminated partner asset accesses. */
    _items: Option[List[DeletePartnerAssetAccessResult]]
)
object DeletePartnerAssetAccessResultsResponseArray {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}

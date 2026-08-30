
package org.openapitools.client.model


case class DeletePartnerAssetAccessBody (
    /* List of partner asset accesses to delete. */
    _accesses: List[DeletePartnerAssetAccessItem]
)
object DeletePartnerAssetAccessBody {
    def toStringBody(var_accesses: Object) =
        s"""
        | {
        | "accesses":$var_accesses
        | }
        """.stripMargin
}

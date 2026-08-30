
package org.openapitools.client.model


case class UpdatePartnerAssetAccessBody (
    /* List of partner asset accesses to assign or update. */
    _accesses: List[UpdatePartnerAssetAccessItem]
)
object UpdatePartnerAssetAccessBody {
    def toStringBody(var_accesses: Object) =
        s"""
        | {
        | "accesses":$var_accesses
        | }
        """.stripMargin
}

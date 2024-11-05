
package org.openapitools.client.model


case class UpdatePartnerAssetAccessBody (
    _accesses: List[UpdatePartnerAssetAccessBodyAccessesInner]
)
object UpdatePartnerAssetAccessBody {
    def toStringBody(var_accesses: Object) =
        s"""
        | {
        | "accesses":$var_accesses
        | }
        """.stripMargin
}

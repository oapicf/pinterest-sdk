
package org.openapitools.client.model


case class DeletePartnerAssetAccessBody (
    _accesses: List[DeletePartnerAssetAccessBodyAccessesInner]
)
object DeletePartnerAssetAccessBody {
    def toStringBody(var_accesses: Object) =
        s"""
        | {
        | "accesses":$var_accesses
        | }
        """.stripMargin
}

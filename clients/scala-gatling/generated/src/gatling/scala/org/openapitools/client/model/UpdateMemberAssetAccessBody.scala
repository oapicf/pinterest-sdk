
package org.openapitools.client.model


case class UpdateMemberAssetAccessBody (
    _accesses: List[UpdateMemberAssetAccessBodyAccessesInner]
)
object UpdateMemberAssetAccessBody {
    def toStringBody(var_accesses: Object) =
        s"""
        | {
        | "accesses":$var_accesses
        | }
        """.stripMargin
}

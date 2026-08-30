
package org.openapitools.client.model


case class UpdateMemberAssetAccessBody (
    /* List of member asset accesses to assign or update. */
    _accesses: List[UpdateMemberAssetAccessItem]
)
object UpdateMemberAssetAccessBody {
    def toStringBody(var_accesses: Object) =
        s"""
        | {
        | "accesses":$var_accesses
        | }
        """.stripMargin
}

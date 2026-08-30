
package org.openapitools.client.model


case class BusinessMembersAssetAccessDeleteBody (
    /* List of members asset access to be deleted */
    _accesses: List[DeleteMemberAssetAccessItem]
)
object BusinessMembersAssetAccessDeleteBody {
    def toStringBody(var_accesses: Object) =
        s"""
        | {
        | "accesses":$var_accesses
        | }
        """.stripMargin
}

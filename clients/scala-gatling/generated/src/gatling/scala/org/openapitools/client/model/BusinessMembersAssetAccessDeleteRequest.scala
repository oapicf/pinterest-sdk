
package org.openapitools.client.model


case class BusinessMembersAssetAccessDeleteRequest (
    /* List of members asset access to be deleted */
    _accesses: List[BusinessMembersAssetAccessDeleteRequestAccessesInner]
)
object BusinessMembersAssetAccessDeleteRequest {
    def toStringBody(var_accesses: Object) =
        s"""
        | {
        | "accesses":$var_accesses
        | }
        """.stripMargin
}


package org.openapitools.client.model


case class UpdateMemberAssetResultItem (
    _response: Option[UsersForIndividualAssetResponse]
)
object UpdateMemberAssetResultItem {
    def toStringBody(var_response: Object) =
        s"""
        | {
        | "response":$var_response
        | }
        """.stripMargin
}


package org.openapitools.client.model


case class UpdateMemberAssetsResultsResponseArrayItemsInner (
    _response: Option[UsersForIndividualAssetResponse]
)
object UpdateMemberAssetsResultsResponseArrayItemsInner {
    def toStringBody(var_response: Object) =
        s"""
        | {
        | "response":$var_response
        | }
        """.stripMargin
}

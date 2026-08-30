
package org.openapitools.client.model


case class CreateAssetAccessRequestBody (
    _assetRequests: List[CreateAssetAccessRequestItem]
)
object CreateAssetAccessRequestBody {
    def toStringBody(var_assetRequests: Object) =
        s"""
        | {
        | "assetRequests":$var_assetRequests
        | }
        """.stripMargin
}

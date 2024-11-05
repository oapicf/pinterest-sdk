
package org.openapitools.client.model


case class DeleteMemberAccessResult (
    /* Unique identifier of the business asset. */
    _assetId: Option[String],
    /* Unique identifier of the business member. */
    _memberId: Option[String]
)
object DeleteMemberAccessResult {
    def toStringBody(var_assetId: Object, var_memberId: Object) =
        s"""
        | {
        | "assetId":$var_assetId,"memberId":$var_memberId
        | }
        """.stripMargin
}

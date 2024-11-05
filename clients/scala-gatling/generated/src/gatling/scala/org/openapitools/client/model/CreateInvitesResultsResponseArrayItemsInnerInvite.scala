
package org.openapitools.client.model


case class CreateInvitesResultsResponseArrayItemsInnerInvite (
    /* Unique identifier of the invite/request. */
    _id: Option[String],
    /* Metadata for the member/partner that was sent the invite/request. */
    _user: Option[BusinessAccessUserSummary]
)
object CreateInvitesResultsResponseArrayItemsInnerInvite {
    def toStringBody(var_id: Object, var_user: Object) =
        s"""
        | {
        | "id":$var_id,"user":$var_user
        | }
        """.stripMargin
}

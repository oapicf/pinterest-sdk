
package org.openapitools.client.model


case class CancelInviteResultUser (
    /* Email of the business member/partner. */
    _email: Option[String],
    /* Unique identifier of the business member/partner. */
    _id: Option[String],
    /* Username of the business member/partner. */
    _username: Option[String]
)
object CancelInviteResultUser {
    def toStringBody(var_email: Object, var_id: Object, var_username: Object) =
        s"""
        | {
        | "email":$var_email,"id":$var_id,"username":$var_username
        | }
        """.stripMargin
}

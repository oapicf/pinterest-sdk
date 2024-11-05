
package org.openapitools.client.model


case class CreateAssetAccessRequestResponse (
    /* A list of errors associated with the asset access requests. Will be returned if there is an error. */
    _exceptions: Option[List[CreateAssetAccessRequestErrorMessageInner]],
    _invites: Option[Map[String, String]]
)
object CreateAssetAccessRequestResponse {
    def toStringBody(var_exceptions: Object, var_invites: Object) =
        s"""
        | {
        | "exceptions":$var_exceptions,"invites":$var_invites
        | }
        """.stripMargin
}

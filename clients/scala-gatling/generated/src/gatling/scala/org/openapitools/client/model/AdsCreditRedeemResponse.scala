
package org.openapitools.client.model


case class AdsCreditRedeemResponse (
    /* Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true). */
    _success: Option[Boolean],
    /* Error code type if error occurs */
    _errorCode: Option[Integer],
    /* Reason for failure */
    _errorMessage: Option[String]
)
object AdsCreditRedeemResponse {
    def toStringBody(var_success: Object, var_errorCode: Object, var_errorMessage: Object) =
        s"""
        | {
        | "success":$var_success,"errorCode":$var_errorCode,"errorMessage":$var_errorMessage
        | }
        """.stripMargin
}


package org.openapitools.client.model


case class AdsCreditRedeemResponse (
    /* Error code type if error occurs */
    _errorCode: Option[Integer],
    /* Reason for failure */
    _errorMessage: Option[String],
    /* Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true). */
    _success: Option[Boolean]
)
object AdsCreditRedeemResponse {
    def toStringBody(var_errorCode: Object, var_errorMessage: Object, var_success: Object) =
        s"""
        | {
        | "errorCode":$var_errorCode,"errorMessage":$var_errorMessage,"success":$var_success
        | }
        """.stripMargin
}

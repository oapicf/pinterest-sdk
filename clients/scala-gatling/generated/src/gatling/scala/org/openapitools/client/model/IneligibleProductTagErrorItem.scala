
package org.openapitools.client.model


case class IneligibleProductTagErrorItem (
    /* Reason why the pin is ineligible for tagging. */
    _errorMessage: IneligibleProductTagReason,
    /* Pin ID that failed eligibility check. */
    _pinId: String
)
object IneligibleProductTagErrorItem {
    def toStringBody(var_errorMessage: Object, var_pinId: Object) =
        s"""
        | {
        | "errorMessage":$var_errorMessage,"pinId":$var_pinId
        | }
        """.stripMargin
}


package org.openapitools.client.model


case class SupplementalItemValidationEvent (
    /* The item attribute referenced by the validation event eg. price, availability, ad_link */
    _attribute: String,
    /* The event code that the item validation event references */
    _code: Integer,
    /* Title message describing the item validation event */
    _message: String
)
object SupplementalItemValidationEvent {
    def toStringBody(var_attribute: Object, var_code: Object, var_message: Object) =
        s"""
        | {
        | "attribute":$var_attribute,"code":$var_code,"message":$var_message
        | }
        """.stripMargin
}

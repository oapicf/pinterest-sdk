
package org.openapitools.client.model


case class ItemValidationEvent (
    /* The attribute that the item validation event references */
    _attribute: Option[String],
    /* The event code that the item validation event references */
    _code: Option[Integer],
    /* Title message describing the item validation event */
    _message: Option[String]
)
object ItemValidationEvent {
    def toStringBody(var_attribute: Object, var_code: Object, var_message: Object) =
        s"""
        | {
        | "attribute":$var_attribute,"code":$var_code,"message":$var_message
        | }
        """.stripMargin
}

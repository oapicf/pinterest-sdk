
package org.openapitools.client.model


case class IntegrationLogClientError (
    /* Original cause of the error. */
    _cause: Option[String],
    /* Column number in the line of the file that raised the error. */
    _columnNumber: Option[Integer],
    /* Filename where the error happened. */
    _fileName: Option[String],
    /* Line number where the error happened. */
    _lineNumber: Option[Integer],
    /* Human-readable description of the error. */
    _message: Option[String],
    /* More detail about the message. */
    _messageDetail: Option[String],
    /* Filename where the error happened. */
    _name: Option[String],
    /* Integer that specifies the error code. */
    _number: Option[Integer],
    /* Stack trace of where the error happened. */
    _stackTrace: Option[String]
)
object IntegrationLogClientError {
    def toStringBody(var_cause: Object, var_columnNumber: Object, var_fileName: Object, var_lineNumber: Object, var_message: Object, var_messageDetail: Object, var_name: Object, var_number: Object, var_stackTrace: Object) =
        s"""
        | {
        | "cause":$var_cause,"columnNumber":$var_columnNumber,"fileName":$var_fileName,"lineNumber":$var_lineNumber,"message":$var_message,"messageDetail":$var_messageDetail,"name":$var_name,"number":$var_number,"stackTrace":$var_stackTrace
        | }
        """.stripMargin
}

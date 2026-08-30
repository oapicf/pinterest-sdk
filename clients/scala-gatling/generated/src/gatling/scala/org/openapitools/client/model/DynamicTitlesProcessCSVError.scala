
package org.openapitools.client.model


case class DynamicTitlesProcessCSVError (
    /* The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED. */
    _errorType: Option[String],
    /* The row number with a validation error. -1 indicates a file-level error. */
    _rowNumber: Option[Integer]
)
object DynamicTitlesProcessCSVError {
    def toStringBody(var_errorType: Object, var_rowNumber: Object) =
        s"""
        | {
        | "errorType":$var_errorType,"rowNumber":$var_rowNumber
        | }
        """.stripMargin
}

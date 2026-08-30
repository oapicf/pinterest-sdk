
package org.openapitools.client.model


case class DynamicTitlesProcessCSV (
    /* List of validation errors. Empty on success. */
    _errors: Option[List[DynamicTitlesProcessCSVError]],
    /* Processing status. Present on success. */
    _status: Option[String]
)
object DynamicTitlesProcessCSV {
    def toStringBody(var_errors: Object, var_status: Object) =
        s"""
        | {
        | "errors":$var_errors,"status":$var_status
        | }
        """.stripMargin
}

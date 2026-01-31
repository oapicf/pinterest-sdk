
package org.openapitools.client.model


case class RecordCounts (
    /* Number of invalid records processed */
    _invalid: Integer,
    /* Number of records processed */
    _processed: Integer,
    /* Number of valid records processed */
    _valid: Integer
)
object RecordCounts {
    def toStringBody(var_invalid: Object, var_processed: Object, var_valid: Object) =
        s"""
        | {
        | "invalid":$var_invalid,"processed":$var_processed,"valid":$var_valid
        | }
        """.stripMargin
}

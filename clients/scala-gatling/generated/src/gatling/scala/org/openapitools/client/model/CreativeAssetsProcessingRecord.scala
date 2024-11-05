
package org.openapitools.client.model


case class CreativeAssetsProcessingRecord (
    /* The catalog creative assets id in the merchant namespace */
    _creativeAssetsId: Option[String],
    /* Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. */
    _errors: Option[List[ItemValidationEvent]],
    /* Array with the validation warnings for the item processing record */
    _warnings: Option[List[ItemValidationEvent]],
    _status: Option[ItemProcessingStatus]
)
object CreativeAssetsProcessingRecord {
    def toStringBody(var_creativeAssetsId: Object, var_errors: Object, var_warnings: Object, var_status: Object) =
        s"""
        | {
        | "creativeAssetsId":$var_creativeAssetsId,"errors":$var_errors,"warnings":$var_warnings,"status":$var_status
        | }
        """.stripMargin
}

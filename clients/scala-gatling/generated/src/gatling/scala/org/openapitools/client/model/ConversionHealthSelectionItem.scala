
package org.openapitools.client.model


case class ConversionHealthSelectionItem (
    /* Status for conversion types */
    _conversionType: Option[Any],
    /* Status for criteria */
    _criteria: Option[Any],
    /* Status for ingestion sources */
    _ingestionSource: Option[Any],
    /* Overall status for this selection item */
    _status: AnyType
)
object ConversionHealthSelectionItem {
    def toStringBody(var_conversionType: Object, var_criteria: Object, var_ingestionSource: Object, var_status: Object) =
        s"""
        | {
        | "conversionType":$var_conversionType,"criteria":$var_criteria,"ingestionSource":$var_ingestionSource,"status":$var_status
        | }
        """.stripMargin
}

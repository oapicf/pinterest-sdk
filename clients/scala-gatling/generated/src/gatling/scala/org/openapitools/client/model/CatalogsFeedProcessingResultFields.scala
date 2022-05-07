
package org.openapitools.client.model


case class CatalogsFeedProcessingResultFields (
    _ingestionDetails: CatalogsFeedIngestionDetails,
    _status: CatalogsFeedProcessingStatus,
    _productCounts: CatalogsFeedProductCounts,
    _validationDetails: CatalogsFeedValidationDetails
)
object CatalogsFeedProcessingResultFields {
    def toStringBody(var_ingestionDetails: Object, var_status: Object, var_productCounts: Object, var_validationDetails: Object) =
        s"""
        | {
        | "ingestionDetails":$var_ingestionDetails,"status":$var_status,"productCounts":$var_productCounts,"validationDetails":$var_validationDetails
        | }
        """.stripMargin
}

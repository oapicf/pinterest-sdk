
package org.openapitools.client.model

import java.time.OffsetDateTime

case class CatalogsFeedProcessingResult (
    _createdAt: OffsetDateTime,
    _id: String,
    _updatedAt: OffsetDateTime,
    _ingestionDetails: CatalogsFeedIngestionDetails,
    _status: CatalogsFeedProcessingStatus,
    _productCounts: CatalogsFeedProductCounts,
    _validationDetails: CatalogsFeedValidationDetails
)
object CatalogsFeedProcessingResult {
    def toStringBody(var_createdAt: Object, var_id: Object, var_updatedAt: Object, var_ingestionDetails: Object, var_status: Object, var_productCounts: Object, var_validationDetails: Object) =
        s"""
        | {
        | "createdAt":$var_createdAt,"id":$var_id,"updatedAt":$var_updatedAt,"ingestionDetails":$var_ingestionDetails,"status":$var_status,"productCounts":$var_productCounts,"validationDetails":$var_validationDetails
        | }
        """.stripMargin
}

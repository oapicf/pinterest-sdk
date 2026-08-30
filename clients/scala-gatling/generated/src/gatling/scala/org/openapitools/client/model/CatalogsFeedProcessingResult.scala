
package org.openapitools.client.model

import java.time.OffsetDateTime

case class CatalogsFeedProcessingResult (
    _createdAt: OffsetDateTime,
    /* ID of the feed processing result. */
    _id: String,
    _ingestionDetails: CatalogsFeedIngestionDetails,
    _productCounts: CatalogsFeedProductCounts,
    _status: CatalogsFeedProcessingStatus,
    _updatedAt: OffsetDateTime,
    _validationDetails: CatalogsFeedValidationDetails,
    _videoCounts: Option[CatalogsFeedVideoCounts]
)
object CatalogsFeedProcessingResult {
    def toStringBody(var_createdAt: Object, var_id: Object, var_ingestionDetails: Object, var_productCounts: Object, var_status: Object, var_updatedAt: Object, var_validationDetails: Object, var_videoCounts: Object) =
        s"""
        | {
        | "createdAt":$var_createdAt,"id":$var_id,"ingestionDetails":$var_ingestionDetails,"productCounts":$var_productCounts,"status":$var_status,"updatedAt":$var_updatedAt,"validationDetails":$var_validationDetails,"videoCounts":$var_videoCounts
        | }
        """.stripMargin
}

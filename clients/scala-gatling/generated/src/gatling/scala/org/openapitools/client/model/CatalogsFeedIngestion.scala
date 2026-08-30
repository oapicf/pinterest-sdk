
package org.openapitools.client.model

import java.time.OffsetDateTime

case class CatalogsFeedIngestion (
    /* Timestamp of the feed ingestion. */
    _createdAt: OffsetDateTime,
    /* Catalog Feed id pertaining to the feed ingestion. */
    _feedId: String,
    /* Unique identifier of a feed ingestion. */
    _id: String,
    /* Status of the feed ingestion. */
    _status: CatalogsFeedProcessingStatus
)
object CatalogsFeedIngestion {
    def toStringBody(var_createdAt: Object, var_feedId: Object, var_id: Object, var_status: Object) =
        s"""
        | {
        | "createdAt":$var_createdAt,"feedId":$var_feedId,"id":$var_id,"status":$var_status
        | }
        """.stripMargin
}

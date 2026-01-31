
package org.openapitools.client.model

import java.time.OffsetDateTime

case class CatalogsFeedIngestion (
    _createdAt: OffsetDateTime,
    _feedId: String,
    _id: String,
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


package org.openapitools.client.model

import java.time.OffsetDateTime

case class CatalogsFeedIngestion (
    _id: String,
    _feedId: String,
    _createdAt: OffsetDateTime,
    _status: CatalogsFeedProcessingStatus
)
object CatalogsFeedIngestion {
    def toStringBody(var_id: Object, var_feedId: Object, var_createdAt: Object, var_status: Object) =
        s"""
        | {
        | "id":$var_id,"feedId":$var_feedId,"createdAt":$var_createdAt,"status":$var_status
        | }
        """.stripMargin
}

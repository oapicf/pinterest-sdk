
package org.openapitools.client.model

import java.time.OffsetDateTime

case class CatalogsItemsBatch (
    /* Array with the catalogs items processing records part of the catalogs items batch */
    _items: Option[List[ItemProcessingRecord]],
    /* Id of the catalogs items batch */
    _batchId: Option[String],
    /* Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD */
    _createdTime: Option[OffsetDateTime],
    /* Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD */
    _completedTime: Option[OffsetDateTime],
    _status: Option[BatchOperationStatus]
)
object CatalogsItemsBatch {
    def toStringBody(var_items: Object, var_batchId: Object, var_createdTime: Object, var_completedTime: Object, var_status: Object) =
        s"""
        | {
        | "items":$var_items,"batchId":$var_batchId,"createdTime":$var_createdTime,"completedTime":$var_completedTime,"status":$var_status
        | }
        """.stripMargin
}


package org.openapitools.client.model

import java.time.OffsetDateTime

case class CatalogsCreativeAssetsItemsBatch (
    /* Id of the catalogs items batch */
    _batchId: Option[String],
    _catalogType: String,
    /* Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss */
    _completedTime: Option[OffsetDateTime],
    /* Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss */
    _createdTime: Option[OffsetDateTime],
    /* Array with the catalogs items processing records part of the catalogs items batch */
    _items: Option[List[CreativeAssetsProcessingRecord]],
    _status: Option[BatchOperationStatus]
)
object CatalogsCreativeAssetsItemsBatch {
    def toStringBody(var_batchId: Object, var_catalogType: Object, var_completedTime: Object, var_createdTime: Object, var_items: Object, var_status: Object) =
        s"""
        | {
        | "batchId":$var_batchId,"catalogType":$var_catalogType,"completedTime":$var_completedTime,"createdTime":$var_createdTime,"items":$var_items,"status":$var_status
        | }
        """.stripMargin
}

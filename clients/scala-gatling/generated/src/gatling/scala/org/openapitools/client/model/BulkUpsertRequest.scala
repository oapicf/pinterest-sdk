
package org.openapitools.client.model


case class BulkUpsertRequest (
    _create: Option[BulkUpsertRequestCreate],
    _update: Option[BulkUpsertRequestUpdate]
)
object BulkUpsertRequest {
    def toStringBody(var_create: Object, var_update: Object) =
        s"""
        | {
        | "create":$var_create,"update":$var_update
        | }
        """.stripMargin
}

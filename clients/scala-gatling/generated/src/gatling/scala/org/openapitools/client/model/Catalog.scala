
package org.openapitools.client.model

import java.time.OffsetDateTime

case class Catalog (
    _catalogType: CatalogsType,
    _createdAt: OffsetDateTime,
    /* ID of the catalog entity. */
    _id: String,
    /* A human-friendly name associated to a catalog entity. */
    _name: String,
    _updatedAt: OffsetDateTime
)
object Catalog {
    def toStringBody(var_catalogType: Object, var_createdAt: Object, var_id: Object, var_name: Object, var_updatedAt: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"createdAt":$var_createdAt,"id":$var_id,"name":$var_name,"updatedAt":$var_updatedAt
        | }
        """.stripMargin
}

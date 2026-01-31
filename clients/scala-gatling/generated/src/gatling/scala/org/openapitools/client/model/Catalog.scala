
package org.openapitools.client.model

import java.time.OffsetDateTime

case class Catalog (
    _createdAt: OffsetDateTime,
    /* ID of the catalog entity. */
    _id: String,
    _updatedAt: OffsetDateTime,
    _catalogType: CatalogsType,
    /* A human-friendly name associated to a catalog entity. */
    _name: String
)
object Catalog {
    def toStringBody(var_createdAt: Object, var_id: Object, var_updatedAt: Object, var_catalogType: Object, var_name: Object) =
        s"""
        | {
        | "createdAt":$var_createdAt,"id":$var_id,"updatedAt":$var_updatedAt,"catalogType":$var_catalogType,"name":$var_name
        | }
        """.stripMargin
}

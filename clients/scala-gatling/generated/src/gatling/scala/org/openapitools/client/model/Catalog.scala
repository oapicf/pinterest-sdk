
package org.openapitools.client.model

import java.time.OffsetDateTime

case class Catalog (
    _createdAt: Option[OffsetDateTime],
    /* ID of the catalog entity. */
    _id: String,
    _updatedAt: Option[OffsetDateTime],
    /* A human-friendly name associated to a catalog entity. */
    _name: String,
    _catalogType: CatalogsType
)
object Catalog {
    def toStringBody(var_createdAt: Object, var_id: Object, var_updatedAt: Object, var_name: Object, var_catalogType: Object) =
        s"""
        | {
        | "createdAt":$var_createdAt,"id":$var_id,"updatedAt":$var_updatedAt,"name":$var_name,"catalogType":$var_catalogType
        | }
        """.stripMargin
}

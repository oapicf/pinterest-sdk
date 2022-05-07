
package org.openapitools.client.model

import java.time.OffsetDateTime

case class CatalogsDbItem (
    _createdAt: Option[OffsetDateTime],
    _id: Option[String],
    _updatedAt: Option[OffsetDateTime]
)
object CatalogsDbItem {
    def toStringBody(var_createdAt: Object, var_id: Object, var_updatedAt: Object) =
        s"""
        | {
        | "createdAt":$var_createdAt,"id":$var_id,"updatedAt":$var_updatedAt
        | }
        """.stripMargin
}

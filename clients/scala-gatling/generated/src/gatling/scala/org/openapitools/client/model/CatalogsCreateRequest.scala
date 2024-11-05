
package org.openapitools.client.model


case class CatalogsCreateRequest (
    /* Type of the catalog entity. */
    _catalogType: String,
    /* A human-friendly name associated to a given catalog. */
    _name: String
)
object CatalogsCreateRequest {
    def toStringBody(var_catalogType: Object, var_name: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"name":$var_name
        | }
        """.stripMargin
}

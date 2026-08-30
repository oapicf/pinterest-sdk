
package org.openapitools.client.model


case class CatalogCreate (
    _catalogType: CatalogsType,
    /* A human-friendly name associated to a catalog entity. */
    _name: String
)
object CatalogCreate {
    def toStringBody(var_catalogType: Object, var_name: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"name":$var_name
        | }
        """.stripMargin
}

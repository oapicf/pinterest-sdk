
package org.openapitools.client.model


case class CatalogUpdate (
    _catalogType: Option[CatalogsType],
    /* A human-friendly name associated to a catalog entity. */
    _name: Option[String]
)
object CatalogUpdate {
    def toStringBody(var_catalogType: Object, var_name: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"name":$var_name
        | }
        """.stripMargin
}

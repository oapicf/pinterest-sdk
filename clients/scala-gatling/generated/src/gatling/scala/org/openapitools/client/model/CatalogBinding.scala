
package org.openapitools.client.model


case class CatalogBinding (
    /* Catalog type */
    _catalogType: Option[String],
    /* Catalog ID. */
    _id: Option[String],
    /* Catalog name */
    _name: Option[String]
)
object CatalogBinding {
    def toStringBody(var_catalogType: Object, var_id: Object, var_name: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"id":$var_id,"name":$var_name
        | }
        """.stripMargin
}

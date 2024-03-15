
package org.openapitools.client.model


case class CatalogsList200Response (
    _items: List[Catalog],
    _bookmark: Option[String]
)
object CatalogsList200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}

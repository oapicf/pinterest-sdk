
package org.openapitools.client.model


case class CatalogsList200Response (
    _bookmark: Option[String],
    _items: List[Catalog]
)
object CatalogsList200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}

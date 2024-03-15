
package org.openapitools.client.model


case class AdAccountsCatalogsProductGroupsList200Response (
    _items: List[CatalogProductGroup],
    _bookmark: Option[String]
)
object AdAccountsCatalogsProductGroupsList200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}

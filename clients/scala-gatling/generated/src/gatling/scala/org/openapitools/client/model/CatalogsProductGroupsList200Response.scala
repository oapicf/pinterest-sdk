
package org.openapitools.client.model


case class CatalogsProductGroupsList200Response (
    _items: List[CatalogsVerticalProductGroup],
    _bookmark: Option[String]
)
object CatalogsProductGroupsList200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}

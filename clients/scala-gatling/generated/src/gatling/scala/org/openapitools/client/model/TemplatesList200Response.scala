
package org.openapitools.client.model


case class TemplatesList200Response (
    _items: List[TemplateResponse],
    _bookmark: Option[String]
)
object TemplatesList200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}

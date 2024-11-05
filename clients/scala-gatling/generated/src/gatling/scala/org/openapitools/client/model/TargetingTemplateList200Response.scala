
package org.openapitools.client.model


case class TargetingTemplateList200Response (
    _items: List[TargetingTemplateResponseData],
    _bookmark: Option[String]
)
object TargetingTemplateList200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}

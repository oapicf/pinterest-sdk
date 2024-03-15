
package org.openapitools.client.model


case class LeadFormsList200Response (
    _items: List[LeadFormResponse],
    _bookmark: Option[String]
)
object LeadFormsList200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}

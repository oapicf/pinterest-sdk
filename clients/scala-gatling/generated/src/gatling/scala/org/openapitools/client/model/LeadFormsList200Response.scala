
package org.openapitools.client.model


case class LeadFormsList200Response (
    _bookmark: Option[String],
    _items: List[LeadForm]
)
object LeadFormsList200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}

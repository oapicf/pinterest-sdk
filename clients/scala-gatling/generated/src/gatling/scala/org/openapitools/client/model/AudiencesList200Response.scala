
package org.openapitools.client.model


case class AudiencesList200Response (
    _items: List[Audience],
    _bookmark: Option[String]
)
object AudiencesList200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}

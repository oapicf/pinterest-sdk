
package org.openapitools.client.model


case class BoardSectionsList200Response (
    /* Board sections */
    _items: List[BoardSection],
    _bookmark: Option[String]
)
object BoardSectionsList200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}

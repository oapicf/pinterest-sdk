
package org.openapitools.client.model


case class CatalogsProductGroupPinsList200Response (
    /* Pins */
    _items: List[CatalogsProduct],
    _bookmark: Option[String]
)
object CatalogsProductGroupPinsList200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}

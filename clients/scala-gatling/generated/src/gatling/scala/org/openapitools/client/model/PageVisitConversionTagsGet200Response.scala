
package org.openapitools.client.model


case class PageVisitConversionTagsGet200Response (
    _items: List[ConversionEventResponse],
    _bookmark: Option[String]
)
object PageVisitConversionTagsGet200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}

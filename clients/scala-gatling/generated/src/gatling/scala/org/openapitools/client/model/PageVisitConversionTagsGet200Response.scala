
package org.openapitools.client.model


case class PageVisitConversionTagsGet200Response (
    _bookmark: Option[String],
    _items: List[ConversionEventResponse]
)
object PageVisitConversionTagsGet200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}

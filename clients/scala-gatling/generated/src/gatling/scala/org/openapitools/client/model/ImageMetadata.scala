
package org.openapitools.client.model


case class ImageMetadata (
    _description: Option[String],
    _images: Option[ImageSize],
    _itemType: Option[String],
    _link: Option[String],
    _title: Option[String]
)
object ImageMetadata {
    def toStringBody(var_description: Object, var_images: Object, var_itemType: Object, var_link: Object, var_title: Object) =
        s"""
        | {
        | "description":$var_description,"images":$var_images,"itemType":$var_itemType,"link":$var_link,"title":$var_title
        | }
        """.stripMargin
}

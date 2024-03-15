
package org.openapitools.client.model


case class ImageMetadata (
    _itemType: Option[String],
    _title: Option[String],
    _description: Option[String],
    _link: Option[String],
    _images: Option[ImageMetadataImages]
)
object ImageMetadata {
    def toStringBody(var_itemType: Object, var_title: Object, var_description: Object, var_link: Object, var_images: Object) =
        s"""
        | {
        | "itemType":$var_itemType,"title":$var_title,"description":$var_description,"link":$var_link,"images":$var_images
        | }
        """.stripMargin
}

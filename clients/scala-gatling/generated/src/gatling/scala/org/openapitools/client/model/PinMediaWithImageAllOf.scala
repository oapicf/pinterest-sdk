
package org.openapitools.client.model


case class PinMediaWithImageAllOf (
    _images: Option[Map[String, ImageDetails]]
)
object PinMediaWithImageAllOf {
    def toStringBody(var_images: Object) =
        s"""
        | {
        | "images":$var_images
        | }
        """.stripMargin
}

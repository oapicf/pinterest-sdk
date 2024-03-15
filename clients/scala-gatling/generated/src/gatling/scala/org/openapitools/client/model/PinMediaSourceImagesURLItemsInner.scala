
package org.openapitools.client.model


case class PinMediaSourceImagesURLItemsInner (
    _title: Option[String],
    _description: Option[String],
    /* Destination link for the image. */
    _link: Option[String],
    /* URL of image to upload. */
    _url: String
)
object PinMediaSourceImagesURLItemsInner {
    def toStringBody(var_title: Object, var_description: Object, var_link: Object, var_url: Object) =
        s"""
        | {
        | "title":$var_title,"description":$var_description,"link":$var_link,"url":$var_url
        | }
        """.stripMargin
}

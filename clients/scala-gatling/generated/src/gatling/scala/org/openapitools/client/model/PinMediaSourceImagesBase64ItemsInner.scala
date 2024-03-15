
package org.openapitools.client.model


case class PinMediaSourceImagesBase64ItemsInner (
    _title: Option[String],
    _description: Option[String],
    /* Destination link for the image. */
    _link: Option[String],
    _contentType: String,
    /* Image to upload as base64 string. */
    _data: String
)
object PinMediaSourceImagesBase64ItemsInner {
    def toStringBody(var_title: Object, var_description: Object, var_link: Object, var_contentType: Object, var_data: Object) =
        s"""
        | {
        | "title":$var_title,"description":$var_description,"link":$var_link,"contentType":$var_contentType,"data":$var_data
        | }
        """.stripMargin
}

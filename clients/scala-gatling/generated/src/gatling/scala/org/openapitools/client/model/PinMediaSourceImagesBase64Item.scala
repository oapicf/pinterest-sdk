
package org.openapitools.client.model


case class PinMediaSourceImagesBase64Item (
    _contentType: ModelContentType,
    _data: String,
    _description: Option[String],
    _link: Option[String],
    _title: Option[String]
)
object PinMediaSourceImagesBase64Item {
    def toStringBody(var_contentType: Object, var_data: Object, var_description: Object, var_link: Object, var_title: Object) =
        s"""
        | {
        | "contentType":$var_contentType,"data":$var_data,"description":$var_description,"link":$var_link,"title":$var_title
        | }
        """.stripMargin
}

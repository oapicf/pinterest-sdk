
package org.openapitools.client.model


case class PinMediaSourceImagesURLItem (
    _description: Option[String],
    _link: Option[String],
    _title: Option[String],
    _url: String
)
object PinMediaSourceImagesURLItem {
    def toStringBody(var_description: Object, var_link: Object, var_title: Object, var_url: Object) =
        s"""
        | {
        | "description":$var_description,"link":$var_link,"title":$var_title,"url":$var_url
        | }
        """.stripMargin
}

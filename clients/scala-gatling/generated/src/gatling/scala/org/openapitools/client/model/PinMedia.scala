
package org.openapitools.client.model


case class PinMedia (
    _mediaType: Option[String]
)
object PinMedia {
    def toStringBody(var_mediaType: Object) =
        s"""
        | {
        | "mediaType":$var_mediaType
        | }
        """.stripMargin
}

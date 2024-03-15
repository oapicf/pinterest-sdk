
package org.openapitools.client.model


case class SummaryPinMedia (
    _mediaType: Option[String]
)
object SummaryPinMedia {
    def toStringBody(var_mediaType: Object) =
        s"""
        | {
        | "mediaType":$var_mediaType
        | }
        """.stripMargin
}

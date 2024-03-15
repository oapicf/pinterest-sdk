
package org.openapitools.client.model


case class AdPreviewURLResponse (
    /* 'Preview URL, expires in 7 days. Can be used in an iframe. For example: https://ads.pinterest.com/ad-preview/74667c814dd2b19/ The preview object ID/key is the last param - 74667c814dd2b19' */
    _url: Option[String]
)
object AdPreviewURLResponse {
    def toStringBody(var_url: Object) =
        s"""
        | {
        | "url":$var_url
        | }
        """.stripMargin
}

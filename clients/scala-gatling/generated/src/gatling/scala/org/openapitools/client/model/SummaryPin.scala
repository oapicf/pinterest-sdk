
package org.openapitools.client.model


case class SummaryPin (
    _media: Option[SummaryPinMedia],
    _altText: Option[String],
    _link: Option[String],
    _title: Option[String],
    _description: Option[String]
)
object SummaryPin {
    def toStringBody(var_media: Object, var_altText: Object, var_link: Object, var_title: Object, var_description: Object) =
        s"""
        | {
        | "media":$var_media,"altText":$var_altText,"link":$var_link,"title":$var_title,"description":$var_description
        | }
        """.stripMargin
}

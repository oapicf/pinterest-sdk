
package org.openapitools.client.model


case class SummaryPin (
    _altText: Option[String],
    _description: Option[String],
    _id: String,
    _link: Option[String],
    _media: Option[PinMedia],
    _title: Option[String]
)
object SummaryPin {
    def toStringBody(var_altText: Object, var_description: Object, var_id: Object, var_link: Object, var_media: Object, var_title: Object) =
        s"""
        | {
        | "altText":$var_altText,"description":$var_description,"id":$var_id,"link":$var_link,"media":$var_media,"title":$var_title
        | }
        """.stripMargin
}

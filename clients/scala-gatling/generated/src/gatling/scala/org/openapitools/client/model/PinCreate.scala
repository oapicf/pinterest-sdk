
package org.openapitools.client.model


case class PinCreate (
    _altText: Option[String],
    /* The board to which this Pin belongs. */
    _boardId: Option[String],
    /* The board section to which this Pin belongs. */
    _boardSectionId: Option[String],
    _description: Option[String],
    /* Dominant pin color. Hex number, e.g. `#6E7874`. */
    _dominantColor: Option[String],
    _link: Option[String],
    _mediaSource: Option[PinMediaSource],
    /* The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). */
    _parentPinId: Option[String],
    /* The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta. */
    _sponsorId: Option[String],
    _title: Option[String]
)
object PinCreate {
    def toStringBody(var_altText: Object, var_boardId: Object, var_boardSectionId: Object, var_description: Object, var_dominantColor: Object, var_link: Object, var_mediaSource: Object, var_parentPinId: Object, var_sponsorId: Object, var_title: Object) =
        s"""
        | {
        | "altText":$var_altText,"boardId":$var_boardId,"boardSectionId":$var_boardSectionId,"description":$var_description,"dominantColor":$var_dominantColor,"link":$var_link,"mediaSource":$var_mediaSource,"parentPinId":$var_parentPinId,"sponsorId":$var_sponsorId,"title":$var_title
        | }
        """.stripMargin
}

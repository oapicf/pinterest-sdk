
package org.openapitools.client.model


case class BoardWithUpdatePrivacyUpdate (
    _description: Option[String],
    /*     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\". */
    _name: Option[String],
    _privacy: Option[BoardUpdatePrivacy]
)
object BoardWithUpdatePrivacyUpdate {
    def toStringBody(var_description: Object, var_name: Object, var_privacy: Object) =
        s"""
        | {
        | "description":$var_description,"name":$var_name,"privacy":$var_privacy
        | }
        """.stripMargin
}

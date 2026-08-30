
package org.openapitools.client.model


case class BoardCreate (
    _description: Option[String],
    /* If set to `true`, the board will be ad-only and can store ad-only Pins. */
    _isAdsOnly: Option[Boolean],
    /*     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\". */
    _name: String,
    /*     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`.  */
    _privacy: Option[BoardPrivacy]
)
object BoardCreate {
    def toStringBody(var_description: Object, var_isAdsOnly: Object, var_name: Object, var_privacy: Object) =
        s"""
        | {
        | "description":$var_description,"isAdsOnly":$var_isAdsOnly,"name":$var_name,"privacy":$var_privacy
        | }
        """.stripMargin
}

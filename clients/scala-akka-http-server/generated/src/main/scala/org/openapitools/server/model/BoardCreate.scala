package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param description  for example: ''My favorite summer recipes''
 * @param isAdsOnly If set to `true`, the board will be ad-only and can store ad-only Pins. for example: ''true''
 * @param name      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\". for example: ''Summer recipes''
 * @param privacy     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`.  for example: ''null''
*/
final case class BoardCreate (
  description: Option[String] = None,
  isAdsOnly: Option[Boolean] = None,
  name: String,
  privacy: Option[BoardPrivacy] = None
)


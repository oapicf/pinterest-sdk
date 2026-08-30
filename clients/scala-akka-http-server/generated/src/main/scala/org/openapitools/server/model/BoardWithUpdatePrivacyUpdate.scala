package org.openapitools.server.model


/**
 * Resource create or update operation model.
 *
 * @param description  for example: ''My favorite summer recipes''
 * @param name     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\". for example: ''Summer recipes''
 * @param privacy  for example: ''null''
*/
final case class BoardWithUpdatePrivacyUpdate (
  description: Option[String] = None,
  name: Option[String] = None,
  privacy: Option[BoardUpdatePrivacy] = None
)


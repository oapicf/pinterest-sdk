package org.openapitools.server.model


/**
 * Third-party tracking URLs. Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
 *
 * @param impression  for example: ''null''
 * @param click  for example: ''null''
 * @param engagement  for example: ''null''
 * @param buyableButton  for example: ''null''
 * @param audienceVerification  for example: ''null''
*/
final case class TrackingUrls (
  impression: Option[Seq[String]],
  click: Option[Seq[String]],
  engagement: Option[Seq[String]],
  buyableButton: Option[Seq[String]],
  audienceVerification: Option[Seq[String]]
)


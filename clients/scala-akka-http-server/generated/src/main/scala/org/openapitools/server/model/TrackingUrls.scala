package org.openapitools.server.model


/**
 *   Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).
 *
 * @param audienceVerification  for example: ''null''
 * @param buyableButton  for example: ''null''
 * @param click  for example: ''null''
 * @param engagement  for example: ''null''
 * @param impression  for example: ''null''
*/
final case class TrackingUrls (
  audienceVerification: Option[Seq[String]] = None,
  buyableButton: Option[Seq[String]] = None,
  click: Option[Seq[String]] = None,
  engagement: Option[Seq[String]] = None,
  impression: Option[Seq[String]] = None
)


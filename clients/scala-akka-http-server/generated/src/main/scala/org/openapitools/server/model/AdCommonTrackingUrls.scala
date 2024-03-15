package org.openapitools.server.model


/**
 * @param impression  for example: ''null''
 * @param click  for example: ''null''
 * @param engagement  for example: ''null''
 * @param buyableButton  for example: ''null''
 * @param audienceVerification  for example: ''null''
*/
final case class AdCommonTrackingUrls (
  impression: Option[Seq[String]] = None,
  click: Option[Seq[String]] = None,
  engagement: Option[Seq[String]] = None,
  buyableButton: Option[Seq[String]] = None,
  audienceVerification: Option[Seq[String]] = None
)


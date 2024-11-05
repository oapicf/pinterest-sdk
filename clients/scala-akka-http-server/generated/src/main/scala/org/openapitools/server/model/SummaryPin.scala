package org.openapitools.server.model


/**
 * = SummaryPin =
 *
 * Summarized pin information
 *
 * @param media  for example: ''null''
 * @param altText  for example: ''null''
 * @param link  for example: ''https://www.pinterest.com/''
 * @param title  for example: ''null''
 * @param description  for example: ''null''
*/
final case class SummaryPin (
  media: Option[PinMedia] = None,
  altText: Option[String] = None,
  link: Option[String] = None,
  title: Option[String] = None,
  description: Option[String] = None
)


package org.openapitools.server.model


/**
 * = SummaryPin =
 *
 * Summarized pin information
 *
 * @param altText  for example: ''null''
 * @param description  for example: ''null''
 * @param id  for example: ''null''
 * @param link  for example: ''https://www.pinterest.com/''
 * @param media  for example: ''null''
 * @param title  for example: ''null''
*/
final case class SummaryPin (
  altText: Option[String] = None,
  description: Option[String] = None,
  id: Option[String] = None,
  link: Option[String] = None,
  media: Option[PinMedia] = None,
  title: Option[String] = None
)


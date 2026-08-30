package org.openapitools.server.model


/**
 * Summarized pin information
 *
 * @param altText  for example: ''null''
 * @param description  for example: ''null''
 * @param id  for example: ''null''
 * @param link  for example: ''null''
 * @param media  for example: ''null''
 * @param title  for example: ''null''
*/
final case class SummaryPin (
  altText: Option[String] = None,
  description: Option[String] = None,
  id: String,
  link: Option[String] = None,
  media: Option[PinMedia] = None,
  title: Option[String] = None
)


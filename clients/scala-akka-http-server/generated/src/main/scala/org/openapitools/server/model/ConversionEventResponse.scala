package org.openapitools.server.model


/**
 * = ConversionEventResponse =
 *
 * @param conversionEvent  for example: ''null''
 * @param conversionTagId Id of the tag. for example: ''2614324385652''
 * @param adAccountId Id of the ad account. for example: ''549757463328''
 * @param createdTime Creation date in epoch format. for example: ''1564768710''
*/
final case class ConversionEventResponse (
  conversionEvent: Option[ConversionTagType] = None,
  conversionTagId: Option[String] = None,
  adAccountId: Option[String] = None,
  createdTime: Option[Int] = None
)


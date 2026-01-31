package org.openapitools.server.model


/**
 * = AdvertiserDefinedEvent =
 *
 * @param name raw string name of the event, usually logged as raw_event_name in our dataset for example: ''download_picture''
 * @param mappedConversionType standard type mapped to ADE for optimization for example: ''null''
*/
final case class AdvertiserDefinedEvent (
  name: Option[String] = None,
  mappedConversionType: Option[String] = None
)


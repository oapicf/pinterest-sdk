package org.openapitools.server.model


/**
 * Advertiser defined event
 *
 * @param mappedConversionType Standard type mapped to ADE for optimization for example: ''SIGNUP''
 * @param name Raw string name of the event, usually logged as raw_event_name in our dataset for example: ''newsletter_signup''
*/
final case class AdvertiserDefinedEvent (
  mappedConversionType: Option[ConversionTagTypeOptimal] = None,
  name: Option[String] = None
)


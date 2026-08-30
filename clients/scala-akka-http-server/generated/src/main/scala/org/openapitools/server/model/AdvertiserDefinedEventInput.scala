package org.openapitools.server.model


/**
 * Advertiser defined event input for create/update operations
 *
 * @param mappedConversionType Pinterest standard event type to map this custom event to for campaign optimization and reporting for example: ''SIGNUP''
 * @param name Raw string name of the event for example: ''newsletter_signup''
*/
final case class AdvertiserDefinedEventInput (
  mappedConversionType: AdvertiserDefinedEventMappingType,
  name: String
)


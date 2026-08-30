package org.openapitools.server.model


/**
 * Request body for creating or updating advertiser defined events
 *
 * @param items List of advertiser defined events to create or update for example: ''null''
*/
final case class AdvertiserDefinedEventsCreateRequest (
  items: Seq[AdvertiserDefinedEventInput]
)


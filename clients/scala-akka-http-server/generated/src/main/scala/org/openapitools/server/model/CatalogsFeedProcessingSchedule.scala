package org.openapitools.server.model


/**
 * = catalogs_processing_schedule =
 *
 * Optional daily processing schedule. Use this to configure the preferred time for processing a feed (otherwise random).
 *
 * @param time A time in format HH:MM with leading 0 (zero) for example: ''02:59''
 * @param timezone The timezone considered for the processing schedule time. for example: ''null''
*/
final case class CatalogsFeedProcessingSchedule (
  time: String,
  timezone: String
)


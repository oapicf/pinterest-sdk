goog.provide('API.Client.CatalogsFeedProcessingSchedule');

/**
 * Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
 * @record
 */
API.Client.CatalogsFeedProcessingSchedule = function() {}

/**
 * A time in format HH:MM with leading 0 (zero)
 * @type {!string}
 * @export
 */
API.Client.CatalogsFeedProcessingSchedule.prototype.time;

/**
 * The timezone considered for the processing schedule time.
 * @type {!API.Client.CatalogsFeedProcessingScheduleTimezone}
 * @export
 */
API.Client.CatalogsFeedProcessingSchedule.prototype.timezone;


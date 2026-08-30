goog.provide('API.Client.AdvertiserDefinedEventProcessingRecord');

/**
 * Processing record for an advertiser defined event operation
 * @record
 */
API.Client.AdvertiserDefinedEventProcessingRecord = function() {}

/**
 * List of exception messages if the operation failed
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdvertiserDefinedEventProcessingRecord.prototype.exceptions;

/**
 * Name of the advertiser defined event
 * @type {!string}
 * @export
 */
API.Client.AdvertiserDefinedEventProcessingRecord.prototype.name;

/**
 * Processing status (success or failure)
 * @type {!string}
 * @export
 */
API.Client.AdvertiserDefinedEventProcessingRecord.prototype.status;


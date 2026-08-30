goog.provide('API.Client.AdvertiserDefinedEventInput');

/**
 * Advertiser defined event input for create/update operations
 * @record
 */
API.Client.AdvertiserDefinedEventInput = function() {}

/**
 * Pinterest standard event type to map this custom event to for campaign optimization and reporting
 * @type {!API.Client.AdvertiserDefinedEventMappingType}
 * @export
 */
API.Client.AdvertiserDefinedEventInput.prototype.mappedConversionType;

/**
 * Raw string name of the event
 * @type {!string}
 * @export
 */
API.Client.AdvertiserDefinedEventInput.prototype.name;


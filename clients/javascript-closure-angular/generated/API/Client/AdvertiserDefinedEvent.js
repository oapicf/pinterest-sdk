goog.provide('API.Client.AdvertiserDefinedEvent');

/**
 * Advertiser defined event
 * @record
 */
API.Client.AdvertiserDefinedEvent = function() {}

/**
 * Standard type mapped to ADE for optimization
 * @type {!API.Client.ConversionTagTypeOptimal}
 * @export
 */
API.Client.AdvertiserDefinedEvent.prototype.mappedConversionType;

/**
 * Raw string name of the event, usually logged as raw_event_name in our dataset
 * @type {!string}
 * @export
 */
API.Client.AdvertiserDefinedEvent.prototype.name;


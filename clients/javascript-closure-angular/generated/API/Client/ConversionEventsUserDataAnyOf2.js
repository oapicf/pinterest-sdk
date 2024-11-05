goog.provide('API.Client.ConversionEventsUserData_anyOf_2');

/**
 * @record
 */
API.Client.ConversionEventsUserDataAnyOf2 = function() {}

/**
 * Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
 * @type {!Array<!string>}
 * @export
 */
API.Client.ConversionEventsUserDataAnyOf2.prototype.em;

/**
 * Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
 * @type {!Array<!string>}
 * @export
 */
API.Client.ConversionEventsUserDataAnyOf2.prototype.hashedMaids;

/**
 * The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsUserDataAnyOf2.prototype.clientIpAddress;

/**
 * The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsUserDataAnyOf2.prototype.clientUserAgent;


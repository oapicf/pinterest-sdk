goog.provide('API.Client.ConversionEventsUserData');

/**
 * Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
 * @record
 */
API.Client.ConversionEventsUserData = function() {}

/**
 * Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
 * @type {!Array<!string>}
 * @export
 */
API.Client.ConversionEventsUserData.prototype.ph;

/**
 * Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender. The string should be in the UTF-8 format.
 * @type {!Array<!string>}
 * @export
 */
API.Client.ConversionEventsUserData.prototype.ge;

/**
 * Sha256 hashes of user's date of birthday, given as year, month, and day. The string should be in the UTF-8 format.
 * @type {!Array<!string>}
 * @export
 */
API.Client.ConversionEventsUserData.prototype.db;

/**
 * Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
 * @type {!Array<!string>}
 * @export
 */
API.Client.ConversionEventsUserData.prototype.ln;

/**
 * Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
 * @type {!Array<!string>}
 * @export
 */
API.Client.ConversionEventsUserData.prototype.fn;

/**
 * Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format.
 * @type {!Array<!string>}
 * @export
 */
API.Client.ConversionEventsUserData.prototype.ct;

/**
 * Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format.
 * @type {!Array<!string>}
 * @export
 */
API.Client.ConversionEventsUserData.prototype.st;

/**
 * Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format.
 * @type {!Array<!string>}
 * @export
 */
API.Client.ConversionEventsUserData.prototype.zp;

/**
 * Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase. The string should be in the UTF-8 format.
 * @type {!Array<!string>}
 * @export
 */
API.Client.ConversionEventsUserData.prototype.country;

/**
 * Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
 * @type {!Array<!string>}
 * @export
 */
API.Client.ConversionEventsUserData.prototype.externalId;

/**
 * The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsUserData.prototype.clickId;

/**
 * A unique identifier of visitors' information defined by third party partners. e.g RampID
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsUserData.prototype.partnerId;

/**
 * Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
 * @type {!Array<!string>}
 * @export
 */
API.Client.ConversionEventsUserData.prototype.em;

/**
 * Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
 * @type {!Array<!string>}
 * @export
 */
API.Client.ConversionEventsUserData.prototype.hashedMaids;

/**
 * The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsUserData.prototype.clientIpAddress;

/**
 * The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsUserData.prototype.clientUserAgent;


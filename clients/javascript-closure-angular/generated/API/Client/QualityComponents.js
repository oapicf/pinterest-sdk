goog.provide('API.Client.QualityComponents');

/**
 * Set of quality components, with each component containing a event coverage and details.
 * @record
 */
API.Client.QualityComponents = function() {}

/**
 * @type {!Object<!string, API.Client.QualityComponentDetails>}
 * @export
 */
API.Client.QualityComponents.prototype.advertiserExternalId;

/**
 * @type {!Object<!string, API.Client.QualityComponentDetails>}
 * @export
 */
API.Client.QualityComponents.prototype.clickIdEpik;

/**
 * Dedup components.
 * @type {!Object<!string, API.Client.QualityComponentDetails>}
 * @export
 */
API.Client.QualityComponents.prototype.externalEventId;

/**
 * User matching identifiers.
 * @type {!Object<!string, API.Client.QualityComponentDetails>}
 * @export
 */
API.Client.QualityComponents.prototype.hashedEmail;

/**
 * @type {!Object<!string, API.Client.QualityComponentDetails>}
 * @export
 */
API.Client.QualityComponents.prototype.hashedMaid;

/**
 * @type {!Object<!string, API.Client.QualityComponentDetails>}
 * @export
 */
API.Client.QualityComponents.prototype.ipAddress;

/**
 * @type {!Object<!string, API.Client.QualityComponentDetails>}
 * @export
 */
API.Client.QualityComponents.prototype.orderId;

/**
 * @type {!Object<!string, API.Client.QualityComponentDetails>}
 * @export
 */
API.Client.QualityComponents.prototype.orderValue;

/**
 * Product/event metadata.
 * @type {!Object<!string, API.Client.QualityComponentDetails>}
 * @export
 */
API.Client.QualityComponents.prototype.productId;

/**
 * @type {!Object<!string, API.Client.QualityComponentDetails>}
 * @export
 */
API.Client.QualityComponents.prototype.sourceUrl;

/**
 * @type {!Object<!string, API.Client.QualityComponentDetails>}
 * @export
 */
API.Client.QualityComponents.prototype.userAgent;


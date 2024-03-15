goog.provide('API.Client.AudienceSubcategory');

/**
 * @record
 */
API.Client.AudienceSubcategory = function() {}

/**
 * Interest unique key (same as ID).
 * @type {!string}
 * @export
 */
API.Client.AudienceSubcategory.prototype.key;

/**
 * Subinterest name.
 * @type {!string}
 * @export
 */
API.Client.AudienceSubcategory.prototype.name;

/**
 * Subinterest's percent of category's total audience.
 * @type {!number}
 * @export
 */
API.Client.AudienceSubcategory.prototype.ratio;

/**
 * Subinterest affinity index.
 * @type {!number}
 * @export
 */
API.Client.AudienceSubcategory.prototype.index;

/**
 * Subinterest ID.
 * @type {!string}
 * @export
 */
API.Client.AudienceSubcategory.prototype.id;


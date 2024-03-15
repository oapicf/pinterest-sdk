goog.provide('API.Client.AudienceCategory');

/**
 * @record
 */
API.Client.AudienceCategory = function() {}

/**
 * Interest unique key (same as ID).
 * @type {!string}
 * @export
 */
API.Client.AudienceCategory.prototype.key;

/**
 * Interest name.
 * @type {!string}
 * @export
 */
API.Client.AudienceCategory.prototype.name;

/**
 * Interest's percent of category's total audience.
 * @type {!number}
 * @export
 */
API.Client.AudienceCategory.prototype.ratio;

/**
 * Interest affinity index.
 * @type {!number}
 * @export
 */
API.Client.AudienceCategory.prototype.index;

/**
 * Interest ID.
 * @type {!string}
 * @export
 */
API.Client.AudienceCategory.prototype.id;

/**
 * Subcategory interest distribution
 * @type {!Array<!API.Client.AudienceSubcategory>}
 * @export
 */
API.Client.AudienceCategory.prototype.subcategories;


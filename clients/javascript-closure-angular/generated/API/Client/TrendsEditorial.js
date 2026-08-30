goog.provide('API.Client.TrendsEditorial');

/**
 * Information of the published editorial article.
 * @record
 */
API.Client.TrendsEditorial = function() {}

/**
 * URL of the editorial board
 * @type {!string}
 * @export
 */
API.Client.TrendsEditorial.prototype.boardUrl;

/**
 * Description of the editorial article
 * @type {!string}
 * @export
 */
API.Client.TrendsEditorial.prototype.description;

/**
 * List of interests related to the editorial article
 * @type {!Array<!string>}
 * @export
 */
API.Client.TrendsEditorial.prototype.interests;

/**
 * URL of the pins related to the editorial article
 * @type {!Array<!string>}
 * @export
 */
API.Client.TrendsEditorial.prototype.pinsUrl;

/**
 * List of keywords related to the editorial article
 * @type {!Array<!API.Client.KeywordInfo>}
 * @export
 */
API.Client.TrendsEditorial.prototype.relatedKeywords;

/**
 * Title of the editorial article
 * @type {!string}
 * @export
 */
API.Client.TrendsEditorial.prototype.title;


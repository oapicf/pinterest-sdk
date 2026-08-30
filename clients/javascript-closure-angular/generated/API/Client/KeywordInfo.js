goog.provide('API.Client.KeywordInfo');

/**
 * Related Keyword information of the editorial article
 * @record
 */
API.Client.KeywordInfo = function() {}

/**
 * Keyword Name
 * @type {!string}
 * @export
 */
API.Client.KeywordInfo.prototype.name;

/**
 * MoM growth as a percentage, if there is no growth rate, this field is not present
 * @type {!number}
 * @export
 */
API.Client.KeywordInfo.prototype.pctGrowthMom;


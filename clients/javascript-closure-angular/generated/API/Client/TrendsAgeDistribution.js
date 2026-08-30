goog.provide('API.Client.TrendsAgeDistribution');

/**
 * This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 * @record
 */
API.Client.TrendsAgeDistribution = function() {}

/**
 * @type {!API.Client.TrendsAgeBucket}
 * @export
 */
API.Client.TrendsAgeDistribution.prototype.ageDistribution;


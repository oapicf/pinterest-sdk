goog.provide('API.Client.TrendsGenderDistribution');

/**
 * This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 * @record
 */
API.Client.TrendsGenderDistribution = function() {}

/**
 * @type {!API.Client.TrendsGender}
 * @export
 */
API.Client.TrendsGenderDistribution.prototype.genderDistribution;


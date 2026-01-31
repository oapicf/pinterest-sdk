goog.provide('API.Client.TrendingKeyword_demographics_gender_distribution');

/**
 * This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 * @record
 */
API.Client.TrendingKeywordDemographicsGenderDistribution = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.TrendingKeywordDemographicsGenderDistribution.prototype.genderDistribution;

/** @enum {string} */
API.Client.TrendingKeywordDemographicsGenderDistribution.GenderDistributionEnum = { 
  male: 'male',
  female: 'female',
  unspecified: 'unspecified',
}

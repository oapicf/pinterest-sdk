goog.provide('API.Client.TrendingKeyword_demographics_age_distribution');

/**
 * This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 * @record
 */
API.Client.TrendingKeywordDemographicsAgeDistribution = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.TrendingKeywordDemographicsAgeDistribution.prototype.ageDistribution;

/** @enum {string} */
API.Client.TrendingKeywordDemographicsAgeDistribution.AgeDistributionEnum = { 
  18-24: '18-24',
  25-34: '25-34',
  35-44: '35-44',
  45-49: '45-49',
  50-54: '50-54',
  55-64: '55-64',
  65+: '65+',
}

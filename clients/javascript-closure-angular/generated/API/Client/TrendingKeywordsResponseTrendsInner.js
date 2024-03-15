goog.provide('API.Client.TrendingKeywordsResponse_trends_inner');

/**
 * @record
 */
API.Client.TrendingKeywordsResponseTrendsInner = function() {}

/**
 * The keyword that is trending.
 * @type {!string}
 * @export
 */
API.Client.TrendingKeywordsResponseTrendsInner.prototype.keyword;

/**
 * The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
 * @type {!number}
 * @export
 */
API.Client.TrendingKeywordsResponseTrendsInner.prototype.pctGrowthWow;

/**
 * The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
 * @type {!number}
 * @export
 */
API.Client.TrendingKeywordsResponseTrendsInner.prototype.pctGrowthMom;

/**
 * The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
 * @type {!number}
 * @export
 */
API.Client.TrendingKeywordsResponseTrendsInner.prototype.pctGrowthYoy;

/**
 * @type {!API.Client.TrendingKeywordsResponse_trends_inner_time_series}
 * @export
 */
API.Client.TrendingKeywordsResponseTrendsInner.prototype.timeSeries;


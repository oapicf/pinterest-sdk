goog.provide('API.Client.TrendingKeyword');

/**
 * @record
 */
API.Client.TrendingKeyword = function() {}

/**
 * @type {!API.Client.TrendingKeyword_demographics}
 * @export
 */
API.Client.TrendingKeyword.prototype.demographics;

/**
 * Indicates whether the keyword has a prediction available for the next 90 days.<br /> This field is only applicable when `include_prediction` query parameter is set to `true`. <br /> By default, the value is `false` and no prediction data is included in the response.
 * @type {!boolean}
 * @export
 */
API.Client.TrendingKeyword.prototype.hasPrediction;

/**
 * The keyword that is trending.
 * @type {!string}
 * @export
 */
API.Client.TrendingKeyword.prototype.keyword;

/**
 * The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
 * @type {!number}
 * @export
 */
API.Client.TrendingKeyword.prototype.pctGrowthMom;

/**
 * The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
 * @type {!number}
 * @export
 */
API.Client.TrendingKeyword.prototype.pctGrowthWow;

/**
 * The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
 * @type {!number}
 * @export
 */
API.Client.TrendingKeyword.prototype.pctGrowthYoy;

/**
 * @type {!API.Client.PredictedTimeSeries}
 * @export
 */
API.Client.TrendingKeyword.prototype.predictedTimeSeries;

/**
 * @type {!API.Client.TimeSeries}
 * @export
 */
API.Client.TrendingKeyword.prototype.timeSeries;


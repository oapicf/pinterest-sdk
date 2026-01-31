package org.openapitools.server.model


/**
 * = TrendingKeyword =
 *
 * @param demographics  for example: ''null''
 * @param hasPrediction Indicates whether the keyword has a prediction available for the next 90 days.<br /> This field is only applicable when `include_prediction` query parameter is set to `true`. <br /> By default, the value is `false` and no prediction data is included in the response. for example: ''false''
 * @param keyword The keyword that is trending. for example: ''couples halloween costumes''
 * @param pctGrowthMom The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth. for example: ''400''
 * @param pctGrowthWow The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth. for example: ''50''
 * @param pctGrowthYoy The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth. for example: ''-5''
 * @param predictedTimeSeries  for example: ''null''
 * @param timeSeries  for example: ''null''
*/
final case class TrendingKeyword (
  demographics: Option[TrendingKeywordDemographics] = None,
  hasPrediction: Option[Boolean] = None,
  keyword: Option[String] = None,
  pctGrowthMom: Option[Int] = None,
  pctGrowthWow: Option[Int] = None,
  pctGrowthYoy: Option[Int] = None,
  predictedTimeSeries: Option[PredictedTimeSeries] = None,
  timeSeries: Option[TimeSeries] = None
)


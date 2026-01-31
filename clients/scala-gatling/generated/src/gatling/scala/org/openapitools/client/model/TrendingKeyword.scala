
package org.openapitools.client.model


case class TrendingKeyword (
    _demographics: Option[TrendingKeywordDemographics],
    /* Indicates whether the keyword has a prediction available for the next 90 days.<br /> This field is only applicable when `include_prediction` query parameter is set to `true`. <br /> By default, the value is `false` and no prediction data is included in the response. */
    _hasPrediction: Option[Boolean],
    /* The keyword that is trending. */
    _keyword: Option[String],
    /* The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth. */
    _pctGrowthMom: Option[Integer],
    /* The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth. */
    _pctGrowthWow: Option[Integer],
    /* The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth. */
    _pctGrowthYoy: Option[Integer],
    _predictedTimeSeries: Option[PredictedTimeSeries],
    _timeSeries: Option[TimeSeries]
)
object TrendingKeyword {
    def toStringBody(var_demographics: Object, var_hasPrediction: Object, var_keyword: Object, var_pctGrowthMom: Object, var_pctGrowthWow: Object, var_pctGrowthYoy: Object, var_predictedTimeSeries: Object, var_timeSeries: Object) =
        s"""
        | {
        | "demographics":$var_demographics,"hasPrediction":$var_hasPrediction,"keyword":$var_keyword,"pctGrowthMom":$var_pctGrowthMom,"pctGrowthWow":$var_pctGrowthWow,"pctGrowthYoy":$var_pctGrowthYoy,"predictedTimeSeries":$var_predictedTimeSeries,"timeSeries":$var_timeSeries
        | }
        """.stripMargin
}

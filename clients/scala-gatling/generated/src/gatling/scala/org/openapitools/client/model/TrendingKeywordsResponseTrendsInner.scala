
package org.openapitools.client.model


case class TrendingKeywordsResponseTrendsInner (
    /* The keyword that is trending. */
    _keyword: Option[String],
    /* The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth. */
    _pctGrowthWow: Option[Integer],
    /* The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth. */
    _pctGrowthMom: Option[Integer],
    /* The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth. */
    _pctGrowthYoy: Option[Integer],
    _timeSeries: Option[TrendingKeywordsResponseTrendsInnerTimeSeries]
)
object TrendingKeywordsResponseTrendsInner {
    def toStringBody(var_keyword: Object, var_pctGrowthWow: Object, var_pctGrowthMom: Object, var_pctGrowthYoy: Object, var_timeSeries: Object) =
        s"""
        | {
        | "keyword":$var_keyword,"pctGrowthWow":$var_pctGrowthWow,"pctGrowthMom":$var_pctGrowthMom,"pctGrowthYoy":$var_pctGrowthYoy,"timeSeries":$var_timeSeries
        | }
        """.stripMargin
}

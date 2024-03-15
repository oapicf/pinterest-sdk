package models

type TrendingKeywordsResponseTrendsInner struct {

	// The keyword that is trending.
	Keyword string `json:"keyword,omitempty"`

	// The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
	PctGrowthWow int32 `json:"pct_growth_wow,omitempty"`

	// The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
	PctGrowthMom int32 `json:"pct_growth_mom,omitempty"`

	// The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
	PctGrowthYoy int32 `json:"pct_growth_yoy,omitempty"`

	TimeSeries TrendingKeywordsResponseTrendsInnerTimeSeries `json:"time_series,omitempty"`
}

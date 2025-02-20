/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct TrendingKeywordsResponseTrendsInner {
    /// The keyword that is trending.
    #[serde(rename = "keyword", skip_serializing_if = "Option::is_none")]
    pub keyword: Option<String>,
    /// The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
    #[serde(rename = "pct_growth_wow", skip_serializing_if = "Option::is_none")]
    pub pct_growth_wow: Option<i32>,
    /// The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
    #[serde(rename = "pct_growth_mom", skip_serializing_if = "Option::is_none")]
    pub pct_growth_mom: Option<i32>,
    /// The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
    #[serde(rename = "pct_growth_yoy", skip_serializing_if = "Option::is_none")]
    pub pct_growth_yoy: Option<i32>,
    #[serde(rename = "time_series", skip_serializing_if = "Option::is_none")]
    pub time_series: Option<models::TrendingKeywordsResponseTrendsInnerTimeSeries>,
}

impl TrendingKeywordsResponseTrendsInner {
    pub fn new() -> TrendingKeywordsResponseTrendsInner {
        TrendingKeywordsResponseTrendsInner {
            keyword: None,
            pct_growth_wow: None,
            pct_growth_mom: None,
            pct_growth_yoy: None,
            time_series: None,
        }
    }
}


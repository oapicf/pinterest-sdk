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

/// DataStatus : Metrics availablity, e.g., \"READY\".
/// Metrics availablity, e.g., \"READY\".
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum DataStatus {
    #[serde(rename = "PROCESSING")]
    Processing,
    #[serde(rename = "READY")]
    Ready,
    #[serde(rename = "ESTIMATE")]
    Estimate,
    #[serde(rename = "BEFORE_BUSINESS_CREATED")]
    BeforeBusinessCreated,
    #[serde(rename = "BEFORE_DATA_RETENTION_PERIOD")]
    BeforeDataRetentionPeriod,
    #[serde(rename = "BEFORE_PIN_DATA_RETENTION_PERIOD")]
    BeforePinDataRetentionPeriod,
    #[serde(rename = "BEFORE_METRIC_START_DATE")]
    BeforeMetricStartDate,
    #[serde(rename = "BEFORE_CORE_METRIC_START_DATE")]
    BeforeCoreMetricStartDate,
    #[serde(rename = "BEFORE_PIN_FORMAT_METRIC_START_DATE")]
    BeforePinFormatMetricStartDate,
    #[serde(rename = "BEFORE_AUDIENCE_METRIC_START_DATE")]
    BeforeAudienceMetricStartDate,
    #[serde(rename = "BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE")]
    BeforeAudienceMonthlyMetricStartDate,
    #[serde(rename = "BEFORE_VIDEO_METRIC_START_DATE")]
    BeforeVideoMetricStartDate,
    #[serde(rename = "BEFORE_CONVERSION_METRIC_START_DATE")]
    BeforeConversionMetricStartDate,
    #[serde(rename = "PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD")]
    PurchasersMetricSmallerThanThreshold,
    #[serde(rename = "IN_BAD_TAG_DATE")]
    InBadTagDate,
    #[serde(rename = "BEFORE_PUBLISHED_METRIC_START_DATE")]
    BeforePublishedMetricStartDate,
    #[serde(rename = "BEFORE_ASSIST_METRIC_START_DATE")]
    BeforeAssistMetricStartDate,
    #[serde(rename = "BEFORE_PIN_CREATED")]
    BeforePinCreated,
    #[serde(rename = "BEFORE_ACCOUNT_CLAIMED")]
    BeforeAccountClaimed,
    #[serde(rename = "BEFORE_DEMOGRAPHIC_FILTERS_START_DATE")]
    BeforeDemographicFiltersStartDate,
    #[serde(rename = "AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD")]
    AudienceSegmentSmallerThanThreshold,
    #[serde(rename = "AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD")]
    AudienceTotalSmallerThanThreshold,
    #[serde(rename = "BEFORE_PRODUCT_GROUP_FILTER_START_DATE")]
    BeforeProductGroupFilterStartDate,

}

impl std::fmt::Display for DataStatus {
    fn fmt(&self, f: &mut std::fmt::Formatter) -> std::fmt::Result {
        match self {
            Self::Processing => write!(f, "PROCESSING"),
            Self::Ready => write!(f, "READY"),
            Self::Estimate => write!(f, "ESTIMATE"),
            Self::BeforeBusinessCreated => write!(f, "BEFORE_BUSINESS_CREATED"),
            Self::BeforeDataRetentionPeriod => write!(f, "BEFORE_DATA_RETENTION_PERIOD"),
            Self::BeforePinDataRetentionPeriod => write!(f, "BEFORE_PIN_DATA_RETENTION_PERIOD"),
            Self::BeforeMetricStartDate => write!(f, "BEFORE_METRIC_START_DATE"),
            Self::BeforeCoreMetricStartDate => write!(f, "BEFORE_CORE_METRIC_START_DATE"),
            Self::BeforePinFormatMetricStartDate => write!(f, "BEFORE_PIN_FORMAT_METRIC_START_DATE"),
            Self::BeforeAudienceMetricStartDate => write!(f, "BEFORE_AUDIENCE_METRIC_START_DATE"),
            Self::BeforeAudienceMonthlyMetricStartDate => write!(f, "BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE"),
            Self::BeforeVideoMetricStartDate => write!(f, "BEFORE_VIDEO_METRIC_START_DATE"),
            Self::BeforeConversionMetricStartDate => write!(f, "BEFORE_CONVERSION_METRIC_START_DATE"),
            Self::PurchasersMetricSmallerThanThreshold => write!(f, "PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD"),
            Self::InBadTagDate => write!(f, "IN_BAD_TAG_DATE"),
            Self::BeforePublishedMetricStartDate => write!(f, "BEFORE_PUBLISHED_METRIC_START_DATE"),
            Self::BeforeAssistMetricStartDate => write!(f, "BEFORE_ASSIST_METRIC_START_DATE"),
            Self::BeforePinCreated => write!(f, "BEFORE_PIN_CREATED"),
            Self::BeforeAccountClaimed => write!(f, "BEFORE_ACCOUNT_CLAIMED"),
            Self::BeforeDemographicFiltersStartDate => write!(f, "BEFORE_DEMOGRAPHIC_FILTERS_START_DATE"),
            Self::AudienceSegmentSmallerThanThreshold => write!(f, "AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD"),
            Self::AudienceTotalSmallerThanThreshold => write!(f, "AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD"),
            Self::BeforeProductGroupFilterStartDate => write!(f, "BEFORE_PRODUCT_GROUP_FILTER_START_DATE"),
        }
    }
}

impl Default for DataStatus {
    fn default() -> DataStatus {
        Self::Processing
    }
}


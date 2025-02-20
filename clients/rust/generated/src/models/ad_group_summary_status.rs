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

/// AdGroupSummaryStatus : Summary status for ad group
/// Summary status for ad group
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum AdGroupSummaryStatus {
    #[serde(rename = "RUNNING")]
    Running,
    #[serde(rename = "PAUSED")]
    Paused,
    #[serde(rename = "NOT_STARTED")]
    NotStarted,
    #[serde(rename = "COMPLETED")]
    Completed,
    #[serde(rename = "ADVERTISER_DISABLED")]
    AdvertiserDisabled,
    #[serde(rename = "ARCHIVED")]
    Archived,
    #[serde(rename = "DRAFT")]
    Draft,
    #[serde(rename = "DELETED_DRAFT")]
    DeletedDraft,

}

impl std::fmt::Display for AdGroupSummaryStatus {
    fn fmt(&self, f: &mut std::fmt::Formatter) -> std::fmt::Result {
        match self {
            Self::Running => write!(f, "RUNNING"),
            Self::Paused => write!(f, "PAUSED"),
            Self::NotStarted => write!(f, "NOT_STARTED"),
            Self::Completed => write!(f, "COMPLETED"),
            Self::AdvertiserDisabled => write!(f, "ADVERTISER_DISABLED"),
            Self::Archived => write!(f, "ARCHIVED"),
            Self::Draft => write!(f, "DRAFT"),
            Self::DeletedDraft => write!(f, "DELETED_DRAFT"),
        }
    }
}

impl Default for AdGroupSummaryStatus {
    fn default() -> AdGroupSummaryStatus {
        Self::Running
    }
}


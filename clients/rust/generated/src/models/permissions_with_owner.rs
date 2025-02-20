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

/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum PermissionsWithOwner {
    #[serde(rename = "ADMIN")]
    Admin,
    #[serde(rename = "ANALYST")]
    Analyst,
    #[serde(rename = "FINANCE_MANAGER")]
    FinanceManager,
    #[serde(rename = "AUDIENCE_MANAGER")]
    AudienceManager,
    #[serde(rename = "CAMPAIGN_MANAGER")]
    CampaignManager,
    #[serde(rename = "CATALOGS_MANAGER")]
    CatalogsManager,
    #[serde(rename = "CATALOGS_VIEWER")]
    CatalogsViewer,
    #[serde(rename = "PROFILE_PUBLISHER")]
    ProfilePublisher,
    #[serde(rename = "OWNER")]
    Owner,

}

impl std::fmt::Display for PermissionsWithOwner {
    fn fmt(&self, f: &mut std::fmt::Formatter) -> std::fmt::Result {
        match self {
            Self::Admin => write!(f, "ADMIN"),
            Self::Analyst => write!(f, "ANALYST"),
            Self::FinanceManager => write!(f, "FINANCE_MANAGER"),
            Self::AudienceManager => write!(f, "AUDIENCE_MANAGER"),
            Self::CampaignManager => write!(f, "CAMPAIGN_MANAGER"),
            Self::CatalogsManager => write!(f, "CATALOGS_MANAGER"),
            Self::CatalogsViewer => write!(f, "CATALOGS_VIEWER"),
            Self::ProfilePublisher => write!(f, "PROFILE_PUBLISHER"),
            Self::Owner => write!(f, "OWNER"),
        }
    }
}

impl Default for PermissionsWithOwner {
    fn default() -> PermissionsWithOwner {
        Self::Admin
    }
}


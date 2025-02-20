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

/// ConversionTagType : conversion tag type
/// conversion tag type
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum ConversionTagType {
    #[serde(rename = "PAGE_LOAD")]
    PageLoad,
    #[serde(rename = "UNKNOWN")]
    Unknown,
    #[serde(rename = "INITIALIZED")]
    Initialized,
    #[serde(rename = "PAGE_VISIT")]
    PageVisit,
    #[serde(rename = "SIGNUP")]
    Signup,
    #[serde(rename = "CHECKOUT")]
    Checkout,
    #[serde(rename = "CUSTOM")]
    Custom,
    #[serde(rename = "VIEW_CATEGORY")]
    ViewCategory,
    #[serde(rename = "SEARCH")]
    Search,
    #[serde(rename = "ADD_TO_CART")]
    AddToCart,
    #[serde(rename = "WATCH_VIDEO")]
    WatchVideo,
    #[serde(rename = "LEAD")]
    Lead,
    #[serde(rename = "APP_INSTALL")]
    AppInstall,
    #[serde(rename = "WEB_SESSION")]
    WebSession,
    #[serde(rename = "EXTERNAL_MEASUREMENT")]
    ExternalMeasurement,

}

impl std::fmt::Display for ConversionTagType {
    fn fmt(&self, f: &mut std::fmt::Formatter) -> std::fmt::Result {
        match self {
            Self::PageLoad => write!(f, "PAGE_LOAD"),
            Self::Unknown => write!(f, "UNKNOWN"),
            Self::Initialized => write!(f, "INITIALIZED"),
            Self::PageVisit => write!(f, "PAGE_VISIT"),
            Self::Signup => write!(f, "SIGNUP"),
            Self::Checkout => write!(f, "CHECKOUT"),
            Self::Custom => write!(f, "CUSTOM"),
            Self::ViewCategory => write!(f, "VIEW_CATEGORY"),
            Self::Search => write!(f, "SEARCH"),
            Self::AddToCart => write!(f, "ADD_TO_CART"),
            Self::WatchVideo => write!(f, "WATCH_VIDEO"),
            Self::Lead => write!(f, "LEAD"),
            Self::AppInstall => write!(f, "APP_INSTALL"),
            Self::WebSession => write!(f, "WEB_SESSION"),
            Self::ExternalMeasurement => write!(f, "EXTERNAL_MEASUREMENT"),
        }
    }
}

impl Default for ConversionTagType {
    fn default() -> ConversionTagType {
        Self::PageLoad
    }
}


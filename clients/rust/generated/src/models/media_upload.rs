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

/// MediaUpload : Media upload that has been registered but not uploaded/processed yet.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct MediaUpload {
    /// Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
    #[serde(rename = "media_id", skip_serializing_if = "Option::is_none")]
    pub media_id: Option<String>,
    #[serde(rename = "media_type", skip_serializing_if = "Option::is_none")]
    pub media_type: Option<models::MediaUploadType>,
    /// The URL where you will POST your media file.
    #[serde(rename = "upload_url", skip_serializing_if = "Option::is_none")]
    pub upload_url: Option<String>,
    #[serde(rename = "upload_parameters", skip_serializing_if = "Option::is_none")]
    pub upload_parameters: Option<Box<models::MediaUploadAllOfUploadParameters>>,
}

impl MediaUpload {
    /// Media upload that has been registered but not uploaded/processed yet.
    pub fn new() -> MediaUpload {
        MediaUpload {
            media_id: None,
            media_type: None,
            upload_url: None,
            upload_parameters: None,
        }
    }
}


/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

use crate::models;

/// MediaUploadRequest : Media upload request
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct MediaUploadRequest {
    #[serde(rename = "media_type")]
    pub media_type: models::MediaUploadType,
}

impl MediaUploadRequest {
    /// Media upload request
    pub fn new(media_type: models::MediaUploadType) -> MediaUploadRequest {
        MediaUploadRequest {
            media_type,
        }
    }
}

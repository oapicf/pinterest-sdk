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

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct PinMediaSourceImagesBase64ItemsInner {
    #[serde(rename = "title", skip_serializing_if = "Option::is_none")]
    pub title: Option<String>,
    #[serde(rename = "description", skip_serializing_if = "Option::is_none")]
    pub description: Option<String>,
    /// Destination link for the image.
    #[serde(rename = "link", skip_serializing_if = "Option::is_none")]
    pub link: Option<String>,
    #[serde(rename = "content_type")]
    pub content_type: ContentType,
    /// Image to upload as base64 string.
    #[serde(rename = "data")]
    pub data: String,
}

impl PinMediaSourceImagesBase64ItemsInner {
    pub fn new(content_type: ContentType, data: String) -> PinMediaSourceImagesBase64ItemsInner {
        PinMediaSourceImagesBase64ItemsInner {
            title: None,
            description: None,
            link: None,
            content_type,
            data,
        }
    }
}
/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum ContentType {
    #[serde(rename = "image/jpeg")]
    Jpeg,
    #[serde(rename = "image/png")]
    Png,
}

impl Default for ContentType {
    fn default() -> ContentType {
        Self::Jpeg
    }
}

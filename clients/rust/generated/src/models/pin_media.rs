/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 * Generated by: https://openapi-generator.tech
 */

/// PinMedia : Pin media objects.


#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
#[serde(tag = "mediatype")]
pub enum PinMedia {
    #[serde(rename="image")]
    PinMediaWithImage {
        #[serde(rename = "images", skip_serializing_if = "Option::is_none")]
        images: Option<::std::collections::HashMap<String, crate::models::ImageDetails>>,
    },
}




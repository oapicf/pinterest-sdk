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

/// CatalogsHotelFeedsCreateRequest : Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CatalogsHotelFeedsCreateRequest {
    #[serde(rename = "default_currency", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub default_currency: Option<Option<models::NullableCurrency>>,
    /// A human-friendly name associated to a given feed.
    #[serde(rename = "name")]
    pub name: String,
    #[serde(rename = "format")]
    pub format: models::CatalogsFormat,
    #[serde(rename = "default_locale")]
    pub default_locale: Box<models::CatalogsFeedsCreateRequestDefaultLocale>,
    #[serde(rename = "credentials", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub credentials: Option<Option<Box<models::CatalogsFeedCredentials>>>,
    /// The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
    #[serde(rename = "location")]
    pub location: String,
    #[serde(rename = "preferred_processing_schedule", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub preferred_processing_schedule: Option<Option<Box<models::CatalogsFeedProcessingSchedule>>>,
    #[serde(rename = "catalog_type")]
    pub catalog_type: models::CatalogsType,
    /// Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.
    #[serde(rename = "catalog_id", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub catalog_id: Option<Option<String>>,
}

impl CatalogsHotelFeedsCreateRequest {
    /// Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
    pub fn new(name: String, format: models::CatalogsFormat, default_locale: models::CatalogsFeedsCreateRequestDefaultLocale, location: String, catalog_type: models::CatalogsType) -> CatalogsHotelFeedsCreateRequest {
        CatalogsHotelFeedsCreateRequest {
            default_currency: None,
            name,
            format,
            default_locale: Box::new(default_locale),
            credentials: None,
            location,
            preferred_processing_schedule: None,
            catalog_type,
            catalog_id: None,
        }
    }
}

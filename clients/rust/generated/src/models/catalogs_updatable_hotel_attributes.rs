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
pub struct CatalogsUpdatableHotelAttributes {
    /// The hotel's name.
    #[serde(rename = "name", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub name: Option<Option<String>>,
    /// Link to the product page
    #[serde(rename = "link", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub link: Option<Option<String>>,
    /// Brief description of the hotel.
    #[serde(rename = "description", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub description: Option<Option<String>>,
    /// The brand to which this hotel belongs to.
    #[serde(rename = "brand", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub brand: Option<Option<String>>,
    /// Latitude of the hotel.
    #[serde(rename = "latitude", skip_serializing_if = "Option::is_none")]
    pub latitude: Option<f64>,
    /// Longitude of the hotel.
    #[serde(rename = "longitude", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub longitude: Option<Option<f64>>,
    /// A list of neighborhoods where the hotel is located
    #[serde(rename = "neighborhood", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub neighborhood: Option<Option<Vec<String>>>,
    #[serde(rename = "address", skip_serializing_if = "Option::is_none")]
    pub address: Option<Box<models::CatalogsHotelAddress>>,
    /// Custom grouping of hotels
    #[serde(rename = "custom_label_0", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub custom_label_0: Option<Option<String>>,
    /// Custom grouping of hotels
    #[serde(rename = "custom_label_1", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub custom_label_1: Option<Option<String>>,
    /// Custom grouping of hotels
    #[serde(rename = "custom_label_2", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub custom_label_2: Option<Option<String>>,
    /// Custom grouping of hotels
    #[serde(rename = "custom_label_3", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub custom_label_3: Option<Option<String>>,
    /// Custom grouping of hotels
    #[serde(rename = "custom_label_4", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub custom_label_4: Option<Option<String>>,
    /// The type of property. The category can be any type of internal description desired.
    #[serde(rename = "category", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub category: Option<Option<String>>,
    /// Base price of the hotel room per night followed by the ISO currency code
    #[serde(rename = "base_price", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub base_price: Option<Option<String>>,
    /// Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
    #[serde(rename = "sale_price", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub sale_price: Option<Option<String>>,
    #[serde(rename = "guest_ratings", skip_serializing_if = "Option::is_none")]
    pub guest_ratings: Option<Box<models::CatalogsHotelGuestRatings>>,
}

impl CatalogsUpdatableHotelAttributes {
    pub fn new() -> CatalogsUpdatableHotelAttributes {
        CatalogsUpdatableHotelAttributes {
            name: None,
            link: None,
            description: None,
            brand: None,
            latitude: None,
            longitude: None,
            neighborhood: None,
            address: None,
            custom_label_0: None,
            custom_label_1: None,
            custom_label_2: None,
            custom_label_3: None,
            custom_label_4: None,
            category: None,
            base_price: None,
            sale_price: None,
            guest_ratings: None,
        }
    }
}


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
pub struct ProductType1Filter {
    #[serde(rename = "PRODUCT_TYPE_1")]
    pub product_type_1: models::CatalogsProductGroupMultipleStringListCriteria,
}

impl ProductType1Filter {
    pub fn new(product_type_1: models::CatalogsProductGroupMultipleStringListCriteria) -> ProductType1Filter {
        ProductType1Filter {
            product_type_1,
        }
    }
}

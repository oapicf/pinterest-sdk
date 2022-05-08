/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct GoogleProductCategory2Filter {
    #[serde(rename = "GOOGLE_PRODUCT_CATEGORY_2")]
    pub google_product_category_2: crate::models::CatalogsProductGroupMultipleStringListCriteria,
}

impl GoogleProductCategory2Filter {
    pub fn new(google_product_category_2: crate::models::CatalogsProductGroupMultipleStringListCriteria) -> GoogleProductCategory2Filter {
        GoogleProductCategory2Filter {
            google_product_category_2,
        }
    }
}


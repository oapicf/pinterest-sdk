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
pub struct BrandFilter {
    #[serde(rename = "BRAND")]
    pub BRAND: crate::models::CatalogsProductGroupMultipleStringCriteria,
}

impl BrandFilter {
    pub fn new(BRAND: crate::models::CatalogsProductGroupMultipleStringCriteria) -> BrandFilter {
        BrandFilter {
            BRAND,
        }
    }
}


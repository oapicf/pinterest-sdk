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
pub struct CatalogsProductGroupPricingCriteria {
    #[serde(rename = "inclusion")]
    pub inclusion: bool,
    #[serde(rename = "values")]
    pub values: f32,
    #[serde(rename = "negated")]
    pub negated: bool,
}

impl CatalogsProductGroupPricingCriteria {
    pub fn new(inclusion: bool, values: f32, negated: bool) -> CatalogsProductGroupPricingCriteria {
        CatalogsProductGroupPricingCriteria {
            inclusion,
            values,
            negated,
        }
    }
}


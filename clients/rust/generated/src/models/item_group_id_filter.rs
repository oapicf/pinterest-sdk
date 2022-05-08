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
pub struct ItemGroupIdFilter {
    #[serde(rename = "ITEM_GROUP_ID")]
    pub ITEM_GROUP_ID: crate::models::CatalogsProductGroupMultipleStringCriteria,
}

impl ItemGroupIdFilter {
    pub fn new(ITEM_GROUP_ID: crate::models::CatalogsProductGroupMultipleStringCriteria) -> ItemGroupIdFilter {
        ItemGroupIdFilter {
            ITEM_GROUP_ID,
        }
    }
}


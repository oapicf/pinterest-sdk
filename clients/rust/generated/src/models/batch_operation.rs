/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 * Generated by: https://openapi-generator.tech
 */

/// BatchOperation : The operation performed by the batch

/// The operation performed by the batch
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum BatchOperation {
    #[serde(rename = "UPDATE")]
    UPDATE,
    #[serde(rename = "CREATE")]
    CREATE,
    #[serde(rename = "UPSERT")]
    UPSERT,

}

impl ToString for BatchOperation {
    fn to_string(&self) -> String {
        match self {
            Self::UPDATE => String::from("UPDATE"),
            Self::CREATE => String::from("CREATE"),
            Self::UPSERT => String::from("UPSERT"),
        }
    }
}

impl Default for BatchOperation {
    fn default() -> BatchOperation {
        Self::UPDATE
    }
}




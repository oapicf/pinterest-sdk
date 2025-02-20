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

/// CatalogsRetailReportParameters : Parameters for retail report
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CatalogsRetailReportParameters {
    #[serde(rename = "catalog_type")]
    pub catalog_type: CatalogType,
    #[serde(rename = "report")]
    pub report: Box<models::CatalogsHotelReportParametersReport>,
}

impl CatalogsRetailReportParameters {
    /// Parameters for retail report
    pub fn new(catalog_type: CatalogType, report: models::CatalogsHotelReportParametersReport) -> CatalogsRetailReportParameters {
        CatalogsRetailReportParameters {
            catalog_type,
            report: Box::new(report),
        }
    }
}
/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum CatalogType {
    #[serde(rename = "RETAIL")]
    Retail,
}

impl Default for CatalogType {
    fn default() -> CatalogType {
        Self::Retail
    }
}


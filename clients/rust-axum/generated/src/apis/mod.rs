pub mod ad_accounts;
pub mod ad_groups;
pub mod ads;
pub mod advanced_auction;
pub mod audience_insights;
pub mod audience_sharing;
pub mod audiences;
pub mod billing;
pub mod boards;
pub mod bulk;
pub mod business_access_assets;
pub mod business_access_invite;
pub mod business_access_relationships;
pub mod campaigns;
pub mod catalog_feeds;
pub mod catalog_items;
pub mod catalog_product_groups;
pub mod catalog_reports;
pub mod catalogs;
pub mod conversion_eqs;
pub mod conversion_events;
pub mod conversion_tags;
pub mod conversions;
pub mod customer_list_uploads;
pub mod customer_lists;
pub mod integrations;
pub mod keywords;
pub mod labels;
pub mod lead_ads;
pub mod lead_forms;
pub mod leads_export;
pub mod media;
pub mod msot_events;
pub mod notification;
pub mod oauth;
pub mod order_lines;
pub mod pins;
pub mod product_categories;
pub mod product_group_promotions;
pub mod promotions;
pub mod resources;
pub mod search;
pub mod targeting_template;
pub mod terms;
pub mod terms_of_service;
pub mod user_account;



#[derive(Debug, Clone, PartialEq, Eq, Hash)]
#[non_exhaustive]
pub enum BasicAuthKind {
    Basic,
    Bearer,
}

/// API Key Authentication - Authentication Header.
/// For `Basic token` and `Bearer token`
#[async_trait::async_trait]
pub trait ApiAuthBasic {
    type Claims;

    /// Extracting Claims from Header. Return None if the Claims are invalid.
    async fn extract_claims_from_auth_header(&self, kind: BasicAuthKind, headers: &axum::http::header::HeaderMap, key: &str) -> Option<Self::Claims>;
}


// Error handler for unhandled errors.
#[async_trait::async_trait]
pub trait ErrorHandler<E: std::fmt::Debug + Send + Sync + 'static = ()> {
    #[allow(unused_variables)]
    #[tracing::instrument(skip_all)]
    async fn handle_error(
        &self,
        method: &::http::Method,
        host: &axum_extra::extract::Host,
        cookies: &axum_extra::extract::CookieJar,
        error: E
    ) -> Result<axum::response::Response, http::StatusCode> {
        tracing::error!("Unhandled error: {:?}", error);
        axum::response::Response::builder()
            .status(http::StatusCode::INTERNAL_SERVER_ERROR)
            .body(axum::body::Body::empty())
            .map_err(|_| http::StatusCode::INTERNAL_SERVER_ERROR)
    }
}

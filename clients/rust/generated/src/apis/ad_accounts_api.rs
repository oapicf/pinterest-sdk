/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */


use reqwest;
use serde::{Deserialize, Serialize};
use crate::{apis::ResponseContent, models};
use super::{Error, configuration};


/// struct for typed errors of method [`ad_account_slash_analytics`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum AdAccountSlashAnalyticsError {
    Status400(models::Error),
    DefaultResponse(models::Error),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`ad_account_targeting_analytics_slash_get`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum AdAccountTargetingAnalyticsSlashGetError {
    DefaultResponse(models::Error),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`ad_accounts_slash_create`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum AdAccountsSlashCreateError {
    DefaultResponse(models::Error),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`ad_accounts_slash_get`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum AdAccountsSlashGetError {
    DefaultResponse(models::Error),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`ad_accounts_slash_list`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum AdAccountsSlashListError {
    DefaultResponse(models::Error),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`analytics_slash_create_mmm_report`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum AnalyticsSlashCreateMmmReportError {
    Status400(models::Error),
    DefaultResponse(models::Error),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`analytics_slash_create_report`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum AnalyticsSlashCreateReportError {
    Status400(models::Error),
    DefaultResponse(models::Error),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`analytics_slash_create_template_report`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum AnalyticsSlashCreateTemplateReportError {
    Status400(models::Error),
    DefaultResponse(models::Error),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`analytics_slash_get_mmm_report`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum AnalyticsSlashGetMmmReportError {
    Status400(models::Error),
    DefaultResponse(models::Error),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`analytics_slash_get_report`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum AnalyticsSlashGetReportError {
    Status400(models::Error),
    DefaultResponse(models::Error),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`sandbox_slash_delete`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum SandboxSlashDeleteError {
    Status400(models::Error),
    DefaultResponse(models::Error),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`templates_slash_list`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum TemplatesSlashListError {
    Status400(models::Error),
    DefaultResponse(models::Error),
    UnknownValue(serde_json::Value),
}


/// Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time.
pub async fn ad_account_slash_analytics(configuration: &configuration::Configuration, ad_account_id: &str, start_date: String, end_date: String, columns: Vec<String>, granularity: models::Granularity, click_window_days: Option<i32>, engagement_window_days: Option<i32>, view_window_days: Option<i32>, conversion_report_time: Option<&str>) -> Result<Vec<models::AdAccountAnalyticsResponseInner>, Error<AdAccountSlashAnalyticsError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/ad_accounts/{ad_account_id}/analytics", local_var_configuration.base_path, ad_account_id=crate::apis::urlencode(ad_account_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    local_var_req_builder = local_var_req_builder.query(&[("start_date", &start_date.to_string())]);
    local_var_req_builder = local_var_req_builder.query(&[("end_date", &end_date.to_string())]);
    local_var_req_builder = match "csv" {
        "multi" => local_var_req_builder.query(&columns.into_iter().map(|p| ("columns".to_owned(), p.to_string())).collect::<Vec<(std::string::String, std::string::String)>>()),
        _ => local_var_req_builder.query(&[("columns", &columns.into_iter().map(|p| p.to_string()).collect::<Vec<String>>().join(",").to_string())]),
    };
    local_var_req_builder = local_var_req_builder.query(&[("granularity", &granularity.to_string())]);
    if let Some(ref local_var_str) = click_window_days {
        local_var_req_builder = local_var_req_builder.query(&[("click_window_days", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = engagement_window_days {
        local_var_req_builder = local_var_req_builder.query(&[("engagement_window_days", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = view_window_days {
        local_var_req_builder = local_var_req_builder.query(&[("view_window_days", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = conversion_report_time {
        local_var_req_builder = local_var_req_builder.query(&[("conversion_report_time", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<AdAccountSlashAnalyticsError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
pub async fn ad_account_targeting_analytics_slash_get(configuration: &configuration::Configuration, ad_account_id: &str, start_date: String, end_date: String, targeting_types: Vec<models::AdsAnalyticsTargetingType>, columns: Vec<String>, granularity: models::Granularity, click_window_days: Option<i32>, engagement_window_days: Option<i32>, view_window_days: Option<i32>, conversion_report_time: Option<&str>, attribution_types: Option<models::ConversionReportAttributionType>) -> Result<models::MetricsResponse, Error<AdAccountTargetingAnalyticsSlashGetError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/ad_accounts/{ad_account_id}/targeting_analytics", local_var_configuration.base_path, ad_account_id=crate::apis::urlencode(ad_account_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    local_var_req_builder = local_var_req_builder.query(&[("start_date", &start_date.to_string())]);
    local_var_req_builder = local_var_req_builder.query(&[("end_date", &end_date.to_string())]);
    local_var_req_builder = match "csv" {
        "multi" => local_var_req_builder.query(&targeting_types.into_iter().map(|p| ("targeting_types".to_owned(), p.to_string())).collect::<Vec<(std::string::String, std::string::String)>>()),
        _ => local_var_req_builder.query(&[("targeting_types", &targeting_types.into_iter().map(|p| p.to_string()).collect::<Vec<String>>().join(",").to_string())]),
    };
    local_var_req_builder = match "csv" {
        "multi" => local_var_req_builder.query(&columns.into_iter().map(|p| ("columns".to_owned(), p.to_string())).collect::<Vec<(std::string::String, std::string::String)>>()),
        _ => local_var_req_builder.query(&[("columns", &columns.into_iter().map(|p| p.to_string()).collect::<Vec<String>>().join(",").to_string())]),
    };
    local_var_req_builder = local_var_req_builder.query(&[("granularity", &granularity.to_string())]);
    if let Some(ref local_var_str) = click_window_days {
        local_var_req_builder = local_var_req_builder.query(&[("click_window_days", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = engagement_window_days {
        local_var_req_builder = local_var_req_builder.query(&[("engagement_window_days", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = view_window_days {
        local_var_req_builder = local_var_req_builder.query(&[("view_window_days", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = conversion_report_time {
        local_var_req_builder = local_var_req_builder.query(&[("conversion_report_time", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = attribution_types {
        local_var_req_builder = local_var_req_builder.query(&[("attribution_types", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<AdAccountTargetingAnalyticsSlashGetError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account. <p/> You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/create-an-advertiser-account\">Create an advertiser account</a>.
pub async fn ad_accounts_slash_create(configuration: &configuration::Configuration, ad_account_create_request: models::AdAccountCreateRequest) -> Result<models::AdAccount, Error<AdAccountsSlashCreateError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/ad_accounts", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    local_var_req_builder = local_var_req_builder.json(&ad_account_create_request);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<AdAccountsSlashCreateError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Get an ad account
pub async fn ad_accounts_slash_get(configuration: &configuration::Configuration, ad_account_id: &str) -> Result<models::AdAccount, Error<AdAccountsSlashGetError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/ad_accounts/{ad_account_id}", local_var_configuration.base_path, ad_account_id=crate::apis::urlencode(ad_account_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<AdAccountsSlashGetError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.
pub async fn ad_accounts_slash_list(configuration: &configuration::Configuration, bookmark: Option<&str>, page_size: Option<i32>, include_shared_accounts: Option<bool>) -> Result<models::AdAccountsList200Response, Error<AdAccountsSlashListError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/ad_accounts", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_str) = bookmark {
        local_var_req_builder = local_var_req_builder.query(&[("bookmark", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = page_size {
        local_var_req_builder = local_var_req_builder.query(&[("page_size", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = include_shared_accounts {
        local_var_req_builder = local_var_req_builder.query(&[("include_shared_accounts", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<AdAccountsSlashListError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it's in beta release.
pub async fn analytics_slash_create_mmm_report(configuration: &configuration::Configuration, ad_account_id: &str, create_mmm_report_request: models::CreateMmmReportRequest) -> Result<models::CreateMmmReportResponse, Error<AnalyticsSlashCreateMmmReportError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/ad_accounts/{ad_account_id}/mmm_reports", local_var_configuration.base_path, ad_account_id=crate::apis::urlencode(ad_account_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    local_var_req_builder = local_var_req_builder.json(&create_mmm_report_request);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<AnalyticsSlashCreateMmmReportError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 914 days before the current date in UTC time and the max time range supported is 186 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. - If level is PRODUCT_ITEM, the furthest back you can are allowed to pull data is 92 days before the current date in UTC time and the max time range supported is 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
pub async fn analytics_slash_create_report(configuration: &configuration::Configuration, ad_account_id: &str, ads_analytics_create_async_request: models::AdsAnalyticsCreateAsyncRequest) -> Result<models::AdsAnalyticsCreateAsyncResponse, Error<AnalyticsSlashCreateReportError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/ad_accounts/{ad_account_id}/reports", local_var_configuration.base_path, ad_account_id=crate::apis::urlencode(ad_account_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    local_var_req_builder = local_var_req_builder.json(&ads_analytics_create_async_request);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<AnalyticsSlashCreateReportError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// This takes a template ID and an optional custom timeframe and constructs an asynchronous report based on the template. It returns a token that you can use to download the report when it is ready.
pub async fn analytics_slash_create_template_report(configuration: &configuration::Configuration, ad_account_id: &str, template_id: &str, start_date: Option<String>, end_date: Option<String>, granularity: Option<models::Granularity>) -> Result<models::AdsAnalyticsCreateAsyncResponse, Error<AnalyticsSlashCreateTemplateReportError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/ad_accounts/{ad_account_id}/templates/{template_id}/reports", local_var_configuration.base_path, ad_account_id=crate::apis::urlencode(ad_account_id), template_id=crate::apis::urlencode(template_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_str) = start_date {
        local_var_req_builder = local_var_req_builder.query(&[("start_date", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = end_date {
        local_var_req_builder = local_var_req_builder.query(&[("end_date", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = granularity {
        local_var_req_builder = local_var_req_builder.query(&[("granularity", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<AnalyticsSlashCreateTemplateReportError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.
pub async fn analytics_slash_get_mmm_report(configuration: &configuration::Configuration, ad_account_id: &str, token: &str) -> Result<models::GetMmmReportResponse, Error<AnalyticsSlashGetMmmReportError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/ad_accounts/{ad_account_id}/mmm_reports", local_var_configuration.base_path, ad_account_id=crate::apis::urlencode(ad_account_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    local_var_req_builder = local_var_req_builder.query(&[("token", &token.to_string())]);
    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<AnalyticsSlashGetMmmReportError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
pub async fn analytics_slash_get_report(configuration: &configuration::Configuration, ad_account_id: &str, token: &str) -> Result<models::AdsAnalyticsGetAsyncResponse, Error<AnalyticsSlashGetReportError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/ad_accounts/{ad_account_id}/reports", local_var_configuration.base_path, ad_account_id=crate::apis::urlencode(ad_account_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    local_var_req_builder = local_var_req_builder.query(&[("token", &token.to_string())]);
    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<AnalyticsSlashGetReportError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.
pub async fn sandbox_slash_delete(configuration: &configuration::Configuration, ad_account_id: &str) -> Result<String, Error<SandboxSlashDeleteError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/ad_accounts/{ad_account_id}/sandbox", local_var_configuration.base_path, ad_account_id=crate::apis::urlencode(ad_account_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::DELETE, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<SandboxSlashDeleteError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Gets all Templates associated with an ad account ID.
pub async fn templates_slash_list(configuration: &configuration::Configuration, ad_account_id: &str, page_size: Option<i32>, order: Option<&str>, bookmark: Option<&str>) -> Result<models::TemplatesList200Response, Error<TemplatesSlashListError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/ad_accounts/{ad_account_id}/templates", local_var_configuration.base_path, ad_account_id=crate::apis::urlencode(ad_account_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_str) = page_size {
        local_var_req_builder = local_var_req_builder.query(&[("page_size", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = order {
        local_var_req_builder = local_var_req_builder.query(&[("order", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = bookmark {
        local_var_req_builder = local_var_req_builder.query(&[("bookmark", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<TemplatesSlashListError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}


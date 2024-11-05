use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Multipart};
use bytes::Bytes;
use http::Method;
use serde::{Deserialize, Serialize};

use crate::{models, types::*};

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BoardsUserFollowsSlashListResponse {
    /// Success
    Status200_Success
    (models::BoardsUserFollowsList200Response)
    ,
    /// Invalid user id
    Status400_InvalidUserId
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum FollowUserSlashUpdateResponse {
    /// Success
    Status200_Success
    (models::UserSummary)
    ,
    /// User not found
    Status404_UserNotFound
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum FollowersSlashListResponse {
    /// Success
    Status200_Success
    (models::FollowersList200Response)
    ,
    /// Invalid user id
    Status400_InvalidUserId
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum LinkedBusinessAccountsSlashGetResponse {
    /// Success
    Status200_Success
    (Vec<models::LinkedBusiness>)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UnverifyWebsiteSlashDeleteResponse {
    /// Successfully unverified website
    Status204_SuccessfullyUnverifiedWebsite
    ,
    /// Website not in user list.
    Status404_WebsiteNotInUserList
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UserAccountSlashAnalyticsResponse {
    /// Success
    Status200_Success
    (std::collections::HashMap<String, models::AnalyticsMetricsResponse>)
    ,
    /// Invalid user accounts analytics parameters.
    Status400_InvalidUserAccountsAnalyticsParameters
    (models::Error)
    ,
    /// Not authorized to access the user account analytics.
    Status403_NotAuthorizedToAccessTheUserAccountAnalytics
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UserAccountSlashAnalyticsSlashTopPinsResponse {
    /// Success
    Status200_Success
    (models::TopPinsAnalyticsResponse)
    ,
    /// Not authorized to access the user account analytics.
    Status403_NotAuthorizedToAccessTheUserAccountAnalytics
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UserAccountSlashAnalyticsSlashTopVideoPinsResponse {
    /// Success
    Status200_Success
    (models::TopVideoPinsAnalyticsResponse)
    ,
    /// Not authorized to access the user account analytics.
    Status403_NotAuthorizedToAccessTheUserAccountAnalytics
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UserAccountSlashFollowedInterestsResponse {
    /// Success
    Status200_Success
    (models::UserAccountFollowedInterests200Response)
    ,
    /// Invalid parameters
    Status400_InvalidParameters
    (models::Error)
    ,
    /// Authorization failed
    Status401_AuthorizationFailed
    (models::Error)
    ,
    /// User not found
    Status404_UserNotFound
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UserAccountSlashGetResponse {
    /// response
    Status200_Response
    (models::Account)
    ,
    /// Not authorized to access the user account.
    Status403_NotAuthorizedToAccessTheUserAccount
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UserFollowingSlashGetResponse {
    /// response
    Status200_Response
    (models::UserFollowingGet200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UserWebsitesSlashGetResponse {
    /// Success
    Status200_Success
    (models::UserWebsitesGet200Response)
    ,
    /// Not authorized to access the user website list.
    Status403_NotAuthorizedToAccessTheUserWebsiteList
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum VerifyWebsiteSlashUpdateResponse {
    /// Success
    Status200_Success
    (models::UserWebsiteSummary)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum WebsiteVerificationSlashGetResponse {
    /// Success
    Status200_Success
    (models::UserWebsiteVerificationCode)
    ,
    /// Not authorized to access the user verification code for website claiming.
    Status403_NotAuthorizedToAccessTheUserVerificationCodeForWebsiteClaiming
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// UserAccount
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait UserAccount {
    /// List following boards.
    ///
    /// BoardsUserFollowsSlashList - GET /v5/user_account/following/boards
    async fn boards_user_follows_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::BoardsUserFollowsSlashListQueryParams,
    ) -> Result<BoardsUserFollowsSlashListResponse, String>;

    /// Follow user.
    ///
    /// FollowUserSlashUpdate - POST /v5/user_account/following/{username}
    async fn follow_user_slash_update(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::FollowUserSlashUpdatePathParams,
            body: models::FollowUserRequest,
    ) -> Result<FollowUserSlashUpdateResponse, String>;

    /// List followers.
    ///
    /// FollowersSlashList - GET /v5/user_account/followers
    async fn followers_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::FollowersSlashListQueryParams,
    ) -> Result<FollowersSlashListResponse, String>;

    /// List linked businesses.
    ///
    /// LinkedBusinessAccountsSlashGet - GET /v5/user_account/businesses
    async fn linked_business_accounts_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
    ) -> Result<LinkedBusinessAccountsSlashGetResponse, String>;

    /// Unverify website.
    ///
    /// UnverifyWebsiteSlashDelete - DELETE /v5/user_account/websites
    async fn unverify_website_slash_delete(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::UnverifyWebsiteSlashDeleteQueryParams,
    ) -> Result<UnverifyWebsiteSlashDeleteResponse, String>;

    /// Get user account analytics.
    ///
    /// UserAccountSlashAnalytics - GET /v5/user_account/analytics
    async fn user_account_slash_analytics(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::UserAccountSlashAnalyticsQueryParams,
    ) -> Result<UserAccountSlashAnalyticsResponse, String>;

    /// Get user account top pins analytics.
    ///
    /// UserAccountSlashAnalyticsSlashTopPins - GET /v5/user_account/analytics/top_pins
    async fn user_account_slash_analytics_slash_top_pins(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::UserAccountSlashAnalyticsSlashTopPinsQueryParams,
    ) -> Result<UserAccountSlashAnalyticsSlashTopPinsResponse, String>;

    /// Get user account top video pins analytics.
    ///
    /// UserAccountSlashAnalyticsSlashTopVideoPins - GET /v5/user_account/analytics/top_video_pins
    async fn user_account_slash_analytics_slash_top_video_pins(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::UserAccountSlashAnalyticsSlashTopVideoPinsQueryParams,
    ) -> Result<UserAccountSlashAnalyticsSlashTopVideoPinsResponse, String>;

    /// List following interests.
    ///
    /// UserAccountSlashFollowedInterests - GET /v5/users/{username}/interests/follow
    async fn user_account_slash_followed_interests(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::UserAccountSlashFollowedInterestsPathParams,
      query_params: models::UserAccountSlashFollowedInterestsQueryParams,
    ) -> Result<UserAccountSlashFollowedInterestsResponse, String>;

    /// Get user account.
    ///
    /// UserAccountSlashGet - GET /v5/user_account
    async fn user_account_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::UserAccountSlashGetQueryParams,
    ) -> Result<UserAccountSlashGetResponse, String>;

    /// List following.
    ///
    /// UserFollowingSlashGet - GET /v5/user_account/following
    async fn user_following_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::UserFollowingSlashGetQueryParams,
    ) -> Result<UserFollowingSlashGetResponse, String>;

    /// Get user websites.
    ///
    /// UserWebsitesSlashGet - GET /v5/user_account/websites
    async fn user_websites_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::UserWebsitesSlashGetQueryParams,
    ) -> Result<UserWebsitesSlashGetResponse, String>;

    /// Verify website.
    ///
    /// VerifyWebsiteSlashUpdate - POST /v5/user_account/websites
    async fn verify_website_slash_update(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::VerifyWebsiteSlashUpdateQueryParams,
            body: models::UserWebsiteVerifyRequest,
    ) -> Result<VerifyWebsiteSlashUpdateResponse, String>;

    /// Get user verification code for website claiming.
    ///
    /// WebsiteVerificationSlashGet - GET /v5/user_account/websites/verification
    async fn website_verification_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::WebsiteVerificationSlashGetQueryParams,
    ) -> Result<WebsiteVerificationSlashGetResponse, String>;
}

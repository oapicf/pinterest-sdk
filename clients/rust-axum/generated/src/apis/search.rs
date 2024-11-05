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
pub enum SearchPartnerPinsResponse {
    /// Success
    Status200_Success
    (models::SearchPartnerPins200Response)
    ,
    /// Invalid pins
    Status400_InvalidPins
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SearchUserBoardsSlashGetResponse {
    /// response
    Status200_Response
    (models::SearchUserBoardsGet200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SearchUserPinsSlashListResponse {
    /// Success
    Status200_Success
    (models::PinsList200Response)
    ,
    /// User not found
    Status404_UserNotFound
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// Search
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Search {
    /// Search pins by a given search term.
    ///
    /// SearchPartnerPins - GET /v5/search/partner/pins
    async fn search_partner_pins(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::SearchPartnerPinsQueryParams,
    ) -> Result<SearchPartnerPinsResponse, String>;

    /// Search user's boards.
    ///
    /// SearchUserBoardsSlashGet - GET /v5/search/boards
    async fn search_user_boards_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::SearchUserBoardsSlashGetQueryParams,
    ) -> Result<SearchUserBoardsSlashGetResponse, String>;

    /// Search user's Pins.
    ///
    /// SearchUserPinsSlashList - GET /v5/search/pins
    async fn search_user_pins_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::SearchUserPinsSlashListQueryParams,
    ) -> Result<SearchUserPinsSlashListResponse, String>;
}

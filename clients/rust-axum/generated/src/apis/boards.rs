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
pub enum BoardSectionsSlashCreateResponse {
    /// response
    Status201_Response
    (models::BoardSection)
    ,
    /// Invalid board section parameters.
    Status400_InvalidBoardSectionParameters
    (models::Error)
    ,
    /// Not authorized to create board sections.
    Status403_NotAuthorizedToCreateBoardSections
    (models::Error)
    ,
    /// Could not get exclusive access to the board to create a new section.
    Status409_CouldNotGetExclusiveAccessToTheBoardToCreateANewSection
    (models::Error)
    ,
    /// Could not create a new board section.
    Status500_CouldNotCreateANewBoardSection
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BoardSectionsSlashDeleteResponse {
    /// Board section deleted successfully
    Status204_BoardSectionDeletedSuccessfully
    ,
    /// Not authorized to delete board section.
    Status403_NotAuthorizedToDeleteBoardSection
    (models::Error)
    ,
    /// Board section not found.
    Status404_BoardSectionNotFound
    (models::Error)
    ,
    /// Board section conflict.
    Status409_BoardSectionConflict
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BoardSectionsSlashListResponse {
    /// response
    Status200_Response
    (models::BoardSectionsList200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BoardSectionsSlashListPinsResponse {
    /// response
    Status200_Response
    (models::BoardsListPins200Response)
    ,
    /// Not authorized to access Pins on board section.
    Status403_NotAuthorizedToAccessPinsOnBoardSection
    (models::Error)
    ,
    /// Board or section not found.
    Status404_BoardOrSectionNotFound
    (models::Error)
    ,
    /// Board section conflict.
    Status409_BoardSectionConflict
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BoardSectionsSlashUpdateResponse {
    /// response
    Status200_Response
    (models::BoardSection)
    ,
    /// Invalid board section parameters.
    Status400_InvalidBoardSectionParameters
    (models::Error)
    ,
    /// Not authorized to update board section.
    Status403_NotAuthorizedToUpdateBoardSection
    (models::Error)
    ,
    /// Board section conflict.
    Status409_BoardSectionConflict
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BoardsSlashCreateResponse {
    /// response
    Status201_Response
    (models::Board)
    ,
    /// The board name is invalid or duplicated.
    Status400_TheBoardNameIsInvalidOrDuplicated
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BoardsSlashDeleteResponse {
    /// Board deleted successfully
    Status204_BoardDeletedSuccessfully
    ,
    /// Not authorized to delete the board.
    Status403_NotAuthorizedToDeleteTheBoard
    (models::Error)
    ,
    /// Board not found.
    Status404_BoardNotFound
    (models::Error)
    ,
    /// Could not get exclusive access to delete the board.
    Status409_CouldNotGetExclusiveAccessToDeleteTheBoard
    (models::Error)
    ,
    /// This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.
    Status429_ThisRequestExceededARateLimit
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BoardsSlashGetResponse {
    /// response
    Status200_Response
    (models::Board)
    ,
    /// Board not found.
    Status404_BoardNotFound
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BoardsSlashListResponse {
    /// response
    Status200_Response
    (models::BoardsList200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BoardsSlashListPinsResponse {
    /// response
    Status200_Response
    (models::BoardsListPins200Response)
    ,
    /// Board not found.
    Status404_BoardNotFound
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BoardsSlashUpdateResponse {
    /// response
    Status200_Response
    (models::Board)
    ,
    /// Invalid board parameters.
    Status400_InvalidBoardParameters
    (models::Error)
    ,
    /// Not authorized to update the board.
    Status403_NotAuthorizedToUpdateTheBoard
    (models::Error)
    ,
    /// This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.
    Status429_ThisRequestExceededARateLimit
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// Boards
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Boards {
    /// Create board section.
    ///
    /// BoardSectionsSlashCreate - POST /v5/boards/{board_id}/sections
    async fn board_sections_slash_create(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::BoardSectionsSlashCreatePathParams,
      query_params: models::BoardSectionsSlashCreateQueryParams,
            body: models::BoardSection,
    ) -> Result<BoardSectionsSlashCreateResponse, String>;

    /// Delete board section.
    ///
    /// BoardSectionsSlashDelete - DELETE /v5/boards/{board_id}/sections/{section_id}
    async fn board_sections_slash_delete(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::BoardSectionsSlashDeletePathParams,
      query_params: models::BoardSectionsSlashDeleteQueryParams,
    ) -> Result<BoardSectionsSlashDeleteResponse, String>;

    /// List board sections.
    ///
    /// BoardSectionsSlashList - GET /v5/boards/{board_id}/sections
    async fn board_sections_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::BoardSectionsSlashListPathParams,
      query_params: models::BoardSectionsSlashListQueryParams,
    ) -> Result<BoardSectionsSlashListResponse, String>;

    /// List Pins on board section.
    ///
    /// BoardSectionsSlashListPins - GET /v5/boards/{board_id}/sections/{section_id}/pins
    async fn board_sections_slash_list_pins(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::BoardSectionsSlashListPinsPathParams,
      query_params: models::BoardSectionsSlashListPinsQueryParams,
    ) -> Result<BoardSectionsSlashListPinsResponse, String>;

    /// Update board section.
    ///
    /// BoardSectionsSlashUpdate - PATCH /v5/boards/{board_id}/sections/{section_id}
    async fn board_sections_slash_update(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::BoardSectionsSlashUpdatePathParams,
      query_params: models::BoardSectionsSlashUpdateQueryParams,
            body: models::BoardSection,
    ) -> Result<BoardSectionsSlashUpdateResponse, String>;

    /// Create board.
    ///
    /// BoardsSlashCreate - POST /v5/boards
    async fn boards_slash_create(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::BoardsSlashCreateQueryParams,
            body: models::Board,
    ) -> Result<BoardsSlashCreateResponse, String>;

    /// Delete board.
    ///
    /// BoardsSlashDelete - DELETE /v5/boards/{board_id}
    async fn boards_slash_delete(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::BoardsSlashDeletePathParams,
      query_params: models::BoardsSlashDeleteQueryParams,
    ) -> Result<BoardsSlashDeleteResponse, String>;

    /// Get board.
    ///
    /// BoardsSlashGet - GET /v5/boards/{board_id}
    async fn boards_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::BoardsSlashGetPathParams,
      query_params: models::BoardsSlashGetQueryParams,
    ) -> Result<BoardsSlashGetResponse, String>;

    /// List boards.
    ///
    /// BoardsSlashList - GET /v5/boards
    async fn boards_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::BoardsSlashListQueryParams,
    ) -> Result<BoardsSlashListResponse, String>;

    /// List Pins on board.
    ///
    /// BoardsSlashListPins - GET /v5/boards/{board_id}/pins
    async fn boards_slash_list_pins(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::BoardsSlashListPinsPathParams,
      query_params: models::BoardsSlashListPinsQueryParams,
    ) -> Result<BoardsSlashListPinsResponse, String>;

    /// Update board.
    ///
    /// BoardsSlashUpdate - PATCH /v5/boards/{board_id}
    async fn boards_slash_update(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::BoardsSlashUpdatePathParams,
      query_params: models::BoardsSlashUpdateQueryParams,
            body: models::BoardUpdate,
    ) -> Result<BoardsSlashUpdateResponse, String>;
}

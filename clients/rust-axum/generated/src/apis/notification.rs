use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::CookieJar;
use bytes::Bytes;
use headers::Host;
use http::Method;
use serde::{Deserialize, Serialize};

use crate::{models, types::*};

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum NotificationSlashPostResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::NotificationResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    Status400_TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    Status0_AnUnexpectedErrorResponse
    (models::PinterestLibError)
}




/// Notification
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Notification<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// Receive notifications from external partners..
    ///
    /// NotificationSlashPost - POST /v5/notifications
    async fn notification_slash_post(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
            body: &models::NotificationPostRequest,
    ) -> Result<NotificationSlashPostResponse, E>;
}

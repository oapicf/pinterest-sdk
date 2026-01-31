use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Host};
use bytes::Bytes;
use http::Method;
use serde::{Deserialize, Serialize};

use crate::{models, types::*};

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum NotificationSlashPostResponse {
    /// Successfully received notification
    Status200_SuccessfullyReceivedNotification
    (models::NotificationResponse)
    ,
    /// Invalid request parameter.
    Status400_InvalidRequestParameter
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
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

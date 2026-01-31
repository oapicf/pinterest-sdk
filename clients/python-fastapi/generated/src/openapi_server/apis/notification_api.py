# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.notification_api_base import BaseNotificationApi
import openapi_server.impl

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    HTTPException,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from pydantic import Field
from typing_extensions import Annotated
from openapi_server.models.error import Error
from openapi_server.models.notification_post_request import NotificationPostRequest
from openapi_server.models.notification_response import NotificationResponse
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/notifications",
    responses={
        200: {"model": NotificationResponse, "description": "Successfully received notification"},
        400: {"model": Error, "description": "Invalid request parameter."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["notification"],
    summary="Receive notifications from external partners.",
    response_model_by_alias=True,
)
async def notification_post(
    notification_post_request: Annotated[NotificationPostRequest, Field(description="notification event.")] = Body(None, description="notification event."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["user_accounts:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["user_accounts:read"]
    ),
) -> NotificationResponse:
    """Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests&#39; systems. This API is gated and you need to request access to this feature."""
    if not BaseNotificationApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseNotificationApi.subclasses[0]().notification_post(notification_post_request)

# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.oauth_api_base import BaseOauthApi
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
from pydantic import Field, StrictStr
from typing import Any, Optional
from typing_extensions import Annotated
from openapi_server.models.conversion_access_token import ConversionAccessToken
from openapi_server.models.oauth_access_token import OauthAccessToken
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.token_grant_type import TokenGrantType
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_basic

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/oauth/conversion_token",
    responses={
        200: {"model": ConversionAccessToken, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["oauth"],
    summary="Generate OAuth access token for conversion API",
    response_model_by_alias=True,
)
async def oauth_conversion_token(
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> ConversionAccessToken:
    """Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token."""
    if not BaseOauthApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseOauthApi.subclasses[0]().oauth_conversion_token()


@router.post(
    "/oauth/token",
    responses={
        200: {"model": OauthAccessToken, "description": "The request has succeeded."},
        201: {"model": OauthAccessToken, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["oauth"],
    summary="Generate OAuth access token",
    response_model_by_alias=True,
)
async def oauth_token(
    grant_type: TokenGrantType = Form(None, description=""),
    code: Optional[StrictStr] = Form(None, description=""),
    continuous_refresh: Annotated[Optional[StrictStr], Field(description="  If your app was created before **September 25, 2025**, set to `true` to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token.")] = Form(None, description="  If your app was created before **September 25, 2025**, set to &#x60;true&#x60; to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token."),
    redirect_uri: Optional[StrictStr] = Form(None, description=""),
    refresh_token: Optional[StrictStr] = Form(None, description=""),
    scope: Optional[StrictStr] = Form(None, description=""),
    token_basic: TokenModel = Security(
        get_token_basic
    ),
) -> OauthAccessToken:
    """Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the &#x60;continuous_refresh&#x60; parameter to &#x60;true&#x60; to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. """
    if not BaseOauthApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseOauthApi.subclasses[0]().oauth_token(grant_type, code, continuous_refresh, redirect_uri, refresh_token, scope)


@router.post(
    "/oauth/token/revoke",
    responses={
        200: {"description": "The request has succeeded."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["oauth"],
    summary="Revoke a token",
    response_model_by_alias=True,
)
async def token_revoke(
    token: Annotated[StrictStr, Field(description="The token to revoke.")] = Form(None, description="The token to revoke."),
    token_type_hint: Annotated[Optional[Any], Field(description="The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.")] = Form(None, description="The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information."),
    token_basic: TokenModel = Security(
        get_token_basic
    ),
) -> None:
    """Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable."""
    if not BaseOauthApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseOauthApi.subclasses[0]().token_revoke(token, token_type_hint)

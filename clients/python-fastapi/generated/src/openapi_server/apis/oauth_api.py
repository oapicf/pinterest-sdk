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
from pydantic import Field, StrictStr, field_validator
from typing import Any, Optional
from typing_extensions import Annotated
from openapi_server.models.conversion_access_token_response import ConversionAccessTokenResponse
from openapi_server.models.error import Error
from openapi_server.models.oauth_access_token_response import OauthAccessTokenResponse
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_basic

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/oauth/conversion_token",
    responses={
        200: {"model": ConversionAccessTokenResponse, "description": "response"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["oauth"],
    summary="Generate OAuth access token for conversion API",
    response_model_by_alias=True,
)
async def oauth_conversion_token(
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> ConversionAccessTokenResponse:
    """Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token."""
    if not BaseOauthApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseOauthApi.subclasses[0]().oauth_conversion_token()


@router.post(
    "/oauth/token",
    responses={
        200: {"model": OauthAccessTokenResponse, "description": "response"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["oauth"],
    summary="Generate OAuth access token",
    response_model_by_alias=True,
)
async def oauth_token(
    grant_type: StrictStr = Form(None, description=""),
    token_basic: TokenModel = Security(
        get_token_basic
    ),
) -> OauthAccessTokenResponse:
    """Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for &lt;a href&#x3D;&#39;/docs/getting-started/set-up-authentication-and-authorization/&#39; target&#x3D;&#39;blank&#39;&gt;requesting and refreshing tokens&lt;/a&gt;.  &lt;strong&gt;Note:&lt;/strong&gt; If your app was created &lt;strong&gt;before September 25, 2025&lt;/strong&gt;, make sure to set the &lt;code&gt;continuous_refresh&lt;/code&gt; parameter to &lt;code&gt;true&lt;/code&gt; to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use &lt;a href&#x3D;&#39;/docs/developer-tools/token-debugger/&#39; target&#x3D;&#39;blank&#39;&gt;Token Debugger&lt;/a&gt; to validate and inspect your access token."""
    if not BaseOauthApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseOauthApi.subclasses[0]().oauth_token(grant_type)


@router.post(
    "/oauth/token/revoke",
    responses={
        200: {"description": "Successful token revocation. No content is returned."},
        401: {"model": Error, "description": "Client authentication error."},
        403: {"model": Error, "description": "Client is not allowed to revoke token."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["oauth"],
    summary="Revoke a token",
    response_model_by_alias=True,
)
async def token_revoke(
    token: Annotated[StrictStr, Field(description="The token to revoke.")] = Form(None, description="The token to revoke."),
    token_type_hint: Annotated[Optional[StrictStr], Field(description="The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.")] = Form(None, description="The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information."),
    token_basic: TokenModel = Security(
        get_token_basic
    ),
) -> None:
    """Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable."""
    if not BaseOauthApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseOauthApi.subclasses[0]().token_revoke(token, token_type_hint)

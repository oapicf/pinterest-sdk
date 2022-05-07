# coding: utf-8

from typing import Dict, List  # noqa: F401

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from openapi_server.models.error import Error
from openapi_server.models.oauth_access_token_response import OauthAccessTokenResponse


router = APIRouter()


@router.post(
    "/oauth/token",
    responses={
        200: {"model": OauthAccessTokenResponse, "description": "response"},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["oauth"],
    summary="Generate OAuth access token",
)
async def oauth_token(
    grant_type: str = Form(None, description=""),
) -> OauthAccessTokenResponse:
    """Generate an OAuth access token by using an authorization code or a refresh token.  See &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Authentication&#39;&gt;Authentication&lt;/a&gt; for more."""
    ...

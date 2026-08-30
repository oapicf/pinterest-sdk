# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.audience_insights_api_base import BaseAudienceInsightsApi
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
from pydantic import Field, field_validator
from typing_extensions import Annotated
from openapi_server.models.audience_insight_type import AudienceInsightType
from openapi_server.models.audience_insights import AudienceInsights
from openapi_server.models.audience_insights_scope_and_type_get200_response import AudienceInsightsScopeAndTypeGet200Response
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ad_accounts/{ad_account_id}/audience_insights",
    responses={
        200: {"model": AudienceInsights, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["audience_insights"],
    summary="Get audience insights",
    response_model_by_alias=True,
)
async def audience_insights_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    audience_insight_type: Annotated[AudienceInsightType, Field(description="Type of audience insights.")] = Query(None, description="Type of audience insights.", alias="audience_insight_type"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> AudienceInsights:
    """Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account&#39;s engaged audience on Pinterest, the ad account&#39;s total audience on Pinterest and Pinterest&#39;s total audience.  [Learn more about Audience Insights](https://help.pinterest.com/en/business/article/audience-insights)."""
    if not BaseAudienceInsightsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAudienceInsightsApi.subclasses[0]().audience_insights_get(ad_account_id, audience_insight_type)


@router.get(
    "/ad_accounts/{ad_account_id}/insights/audiences",
    responses={
        200: {"model": AudienceInsightsScopeAndTypeGet200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["audience_insights"],
    summary="Get audience insights scope and type",
    response_model_by_alias=True,
)
async def audience_insights_scope_and_type_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> AudienceInsightsScopeAndTypeGet200Response:
    """Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience."""
    if not BaseAudienceInsightsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAudienceInsightsApi.subclasses[0]().audience_insights_scope_and_type_get(ad_account_id)

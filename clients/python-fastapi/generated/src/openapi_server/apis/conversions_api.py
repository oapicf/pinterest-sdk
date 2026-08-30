# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.conversions_api_base import BaseConversionsApi
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
from typing import List
from typing_extensions import Annotated
from openapi_server.models.advertiser_defined_events_create200_response import AdvertiserDefinedEventsCreate200Response
from openapi_server.models.advertiser_defined_events_create_request import AdvertiserDefinedEventsCreateRequest
from openapi_server.models.advertiser_defined_events_get200_response import AdvertiserDefinedEventsGet200Response
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ad_accounts/{ad_account_id}/advertiser_defined_events",
    responses={
        200: {"model": AdvertiserDefinedEventsGet200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["conversions"],
    summary="Get advertiser defined events",
    response_model_by_alias=True,
)
async def advertiser_defined_events_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> AdvertiserDefinedEventsGet200Response:
    """Get advertiser defined events for the given ad account."""
    if not BaseConversionsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseConversionsApi.subclasses[0]().advertiser_defined_events_get(ad_account_id)


@router.post(
    "/ad_accounts/{ad_account_id}/advertiser_defined_events",
    responses={
        200: {"model": AdvertiserDefinedEventsCreate200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["conversions"],
    summary="Create advertiser defined events",
    response_model_by_alias=True,
)
async def advertiser_defined_events_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    advertiser_defined_events_create_request: AdvertiserDefinedEventsCreateRequest = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:write"]
    ),
) -> AdvertiserDefinedEventsCreate200Response:
    """Map advertiser defined events to standard events for the given ad account."""
    if not BaseConversionsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseConversionsApi.subclasses[0]().advertiser_defined_events_create(ad_account_id, advertiser_defined_events_create_request)


@router.delete(
    "/ad_accounts/{ad_account_id}/advertiser_defined_events",
    responses={
        200: {"model": AdvertiserDefinedEventsCreate200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["conversions"],
    summary="Delete advertiser defined events",
    response_model_by_alias=True,
)
async def advertiser_defined_events_delete(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    event_names: Annotated[List[StrictStr], Field(description="List of event names to delete")] = Query(None, description="List of event names to delete", alias="event_names"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:write"]
    ),
) -> AdvertiserDefinedEventsCreate200Response:
    """Untrack advertiser defined events for the given ad account."""
    if not BaseConversionsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseConversionsApi.subclasses[0]().advertiser_defined_events_delete(ad_account_id, event_names)


@router.patch(
    "/ad_accounts/{ad_account_id}/advertiser_defined_events",
    responses={
        200: {"model": AdvertiserDefinedEventsCreate200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["conversions"],
    summary="Update advertiser defined events",
    response_model_by_alias=True,
)
async def advertiser_defined_events_update(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    advertiser_defined_events_create_request: AdvertiserDefinedEventsCreateRequest = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:write"]
    ),
) -> AdvertiserDefinedEventsCreate200Response:
    """Update advertiser defined event names or mappings for the given ad account."""
    if not BaseConversionsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseConversionsApi.subclasses[0]().advertiser_defined_events_update(ad_account_id, advertiser_defined_events_create_request)

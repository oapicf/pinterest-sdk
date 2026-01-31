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
from pydantic import Field, field_validator
from typing_extensions import Annotated
from openapi_server.models.advertiser_defined_events_response import AdvertiserDefinedEventsResponse
from openapi_server.models.error import Error
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ad_accounts/{ad_account_id}/advertiser_defined_events",
    responses={
        200: {"model": AdvertiserDefinedEventsResponse, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
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
) -> AdvertiserDefinedEventsResponse:
    """&lt;p&gt;Get advertiser defined events for the given ad account.&lt;/p&gt;"""
    if not BaseConversionsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseConversionsApi.subclasses[0]().advertiser_defined_events_get(ad_account_id)

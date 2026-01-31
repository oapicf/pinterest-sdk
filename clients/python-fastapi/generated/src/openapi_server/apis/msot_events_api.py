# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.msot_events_api_base import BaseMsotEventsApi
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
from typing import Any
from typing_extensions import Annotated
from openapi_server.models.conversion_msot_events import ConversionMSOTEvents
from openapi_server.models.error import Error
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/ad_accounts/{ad_account_id}/msot/events",
    responses={
        200: {"description": "Success"},
        400: {"model": Error, "description": "The request was invalid"},
        401: {"model": Error, "description": "Not authorized to send MSOT conversion events"},
        403: {"model": Error, "description": "Unauthorized access"},
        429: {"model": Error, "description": "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window."},
        "default": {"model": Error, "description": "Unexpected errors"},
    },
    tags=["msot_events"],
    summary="Send Measurement Source Of Truth (MSOT) attributed conversion events",
    response_model_by_alias=True,
)
async def msot_events_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    conversion_msot_events: Annotated[ConversionMSOTEvents, Field(description="Attributed MSOT conversion events")] = Body(None, description="Attributed MSOT conversion events"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["msot:write"]
    ),
) -> None:
    """&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt; &lt;br&gt; &lt;p&gt;Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their &lt;code&gt;ad_account_id&lt;/code&gt;. The request body should be a JSON object.&lt;/p&gt; - These events will NOT be used in Reporting."""
    if not BaseMsotEventsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseMsotEventsApi.subclasses[0]().msot_events_create(ad_account_id, conversion_msot_events)

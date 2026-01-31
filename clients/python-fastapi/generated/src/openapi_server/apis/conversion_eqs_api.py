# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.conversion_eqs_api_base import BaseConversionEqsApi
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
from typing import List, Optional
from typing_extensions import Annotated
from openapi_server.models.event_quality_score import EventQualityScore
from openapi_server.models.ingestion_source_options import IngestionSourceOptions
from openapi_server.models.lookback_period_options import LookbackPeriodOptions
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.source_platform_options import SourcePlatformOptions
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ad_accounts/{ad_account_id}/conversion_eqs",
    responses={
        200: {"model": List[EventQualityScore], "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["conversion_eqs"],
    summary="Get event quality score (EQS)",
    response_model_by_alias=True,
)
async def conversion_eqs_list(
    lookback_period: Annotated[LookbackPeriodOptions, Field(description="Lookback window (number of days).")] = Query(None, description="Lookback window (number of days).", alias="lookback_period"),
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    source_platform: Annotated[Optional[SourcePlatformOptions], Field(description="Source platform of event.")] = Query(None, description="Source platform of event.", alias="source_platform"),
    ingestion_source: Annotated[Optional[IngestionSourceOptions], Field(description="Ingestion source of event.")] = Query(None, description="Ingestion source of event.", alias="ingestion_source"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> List[EventQualityScore]:
    """Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user."""
    if not BaseConversionEqsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseConversionEqsApi.subclasses[0]().conversion_eqs_list(lookback_period, ad_account_id, source_platform, ingestion_source)

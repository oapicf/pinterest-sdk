# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.resources_api_base import BaseResourcesApi
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
from typing import Any, Dict, List, Optional
from typing_extensions import Annotated
from openapi_server.models.ad_account_countries_get200_response import AdAccountCountriesGet200Response
from openapi_server.models.book_closed import BookClosed
from openapi_server.models.delivery_metrics_get200_response import DeliveryMetricsGet200Response
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.public_targeting_type import PublicTargetingType
from openapi_server.models.report_type import ReportType
from openapi_server.models.single_interest_targeting_option import SingleInterestTargetingOption
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/resources/ad_account_countries",
    responses={
        200: {"model": AdAccountCountriesGet200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["resources"],
    summary="Get ad accounts countries",
    response_model_by_alias=True,
)
async def ad_account_countries_get(
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> AdAccountCountriesGet200Response:
    """Get Ad Accounts countries"""
    if not BaseResourcesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseResourcesApi.subclasses[0]().ad_account_countries_get()


@router.get(
    "/resources/delivery_metrics",
    responses={
        200: {"model": DeliveryMetricsGet200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["resources"],
    summary="Get available metrics&#39; definitions",
    response_model_by_alias=True,
)
async def delivery_metrics_get(
    report_type: Annotated[Optional[ReportType], Field(description="Report type.")] = Query(None, description="Report type.", alias="report_type"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read", "pins:read", "user_accounts:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read", "pins:read", "user_accounts:read"]
    ),
) -> DeliveryMetricsGet200Response:
    """Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The &#x60;display_name&#x60; attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information."""
    if not BaseResourcesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseResourcesApi.subclasses[0]().delivery_metrics_get(report_type)


@router.get(
    "/resources/lead_form_questions",
    responses={
        200: {"description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["resources"],
    summary="Get lead form questions",
    response_model_by_alias=True,
)
async def lead_form_questions_get(
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> None:
    """Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**"""
    if not BaseResourcesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseResourcesApi.subclasses[0]().lead_form_questions_get()


@router.get(
    "/resources/metrics_ready_state",
    responses={
        200: {"model": BookClosed, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["resources"],
    summary="Get metrics ready state",
    response_model_by_alias=True,
)
async def metrics_ready_state_get(
    var_date: Annotated[str, Field(strict=True, description="Analytics reports request date (UTC). Format: YYYY-MM-DD")] = Query(None, description="Analytics reports request date (UTC). Format: YYYY-MM-DD", alias="date", regex=r"^\d{4}-\d{2}-\d{2}$"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> BookClosed:
    """Learn whether conversion or non-conversion metrics are finalized and ready to query."""
    if not BaseResourcesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseResourcesApi.subclasses[0]().metrics_ready_state_get(var_date)


@router.get(
    "/resources/targeting/interests/{interest_id}",
    responses={
        200: {"model": SingleInterestTargetingOption, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["resources"],
    summary="Get interest details",
    response_model_by_alias=True,
)
async def interest_targeting_options_get(
    interest_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an interest.")] = Path(..., description="Unique identifier of an interest.", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> SingleInterestTargetingOption:
    """Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid&#x3D;118370875) for a spreadsheet listing interests and their IDs."""
    if not BaseResourcesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseResourcesApi.subclasses[0]().interest_targeting_options_get(interest_id)


@router.get(
    "/resources/targeting/{targeting_type}",
    responses={
        200: {"model": List[object], "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["resources"],
    summary="Get targeting options",
    response_model_by_alias=True,
)
async def targeting_options_get(
    targeting_type: Annotated[PublicTargetingType, Field(description="Public targeting type")] = Path(..., description="Public targeting type"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    client_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Client ID")] = Query(None, description="Client ID", alias="client_id", regex=r"^\d+$", max_length=18),
    oauth_signature: Annotated[Optional[StrictStr], Field(description="Oauth signature")] = Query(None, description="Oauth signature", alias="oauth_signature"),
    timestamp: Annotated[Optional[Annotated[str, Field(strict=True)]], Field(description="Timestamp.")] = Query(None, description="Timestamp.", alias="timestamp", regex=r"\d+"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> List[object]:
    """    You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      &#x60;&#x60;&#x60;     [{\&quot;36313\&quot;: \&quot;Australia: Moreton Bay - North\&quot;, \&quot;124735\&quot;: \&quot;Canada: North Battleford\&quot;, \&quot;36109\&quot;: \&quot;Australia: Murray\&quot;, \&quot;36108\&quot;: \&quot;Australia: Mid North Coast\&quot;, \&quot;36101\&quot;: \&quot;Australia: Capital Region\&quot;, \&quot;811\&quot;: \&quot;U.S.: Reno\&quot;, \&quot;36103\&quot;: \&quot;Australia: Central West\&quot;, \&quot;36102\&quot;: \&quot;Australia: Central Coast\&quot;, \&quot;36105\&quot;: \&quot;Australia: Far West and Orana\&quot;, \&quot;36104\&quot;: \&quot;Australia: Coffs Harbour - Grafton\&quot;, \&quot;36107\&quot;: \&quot;Australia: Illawarra\&quot;, \&quot;36106\&quot;: \&quot;Australia: Hunter Valley Exc Newcastle\&quot;, \&quot;554017\&quot;: \&quot;New Zealand: Wanganui\&quot;, \&quot;554016\&quot;: \&quot;New Zealand: Marlborough\&quot;, \&quot;554015\&quot;: \&quot;New Zealand: Gisborne\&quot;, \&quot;554014\&quot;: \&quot;New Zealand: Tararua\&quot;, \&quot;554013\&quot;: \&quot;New Zealand: Invercargill\&quot;, \&quot;GR\&quot;: \&quot;Greece\&quot;, \&quot;554011\&quot;: \&quot;New Zealand: Whangarei\&quot;, \&quot;554010\&quot;: \&quot;New Zealand: Far North\&quot;, \&quot;717\&quot;: \&quot;U.S.: Quincy-Hannibal-Keokuk\&quot;, \&quot;716\&quot;: \&quot;U.S.: Baton Rouge\&quot;,...}]     &#x60;&#x60;&#x60;"""
    if not BaseResourcesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseResourcesApi.subclasses[0]().targeting_options_get(targeting_type, ad_account_id, client_id, oauth_signature, timestamp)

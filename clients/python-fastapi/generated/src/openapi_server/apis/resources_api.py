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
from openapi_server.models.ad_accounts_country_response import AdAccountsCountryResponse
from openapi_server.models.book_closed_response import BookClosedResponse
from openapi_server.models.delivery_metrics_response import DeliveryMetricsResponse
from openapi_server.models.error import Error
from openapi_server.models.single_interest_targeting_option_response import SingleInterestTargetingOptionResponse
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/resources/ad_account_countries",
    responses={
        200: {"model": AdAccountsCountryResponse, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
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
) -> AdAccountsCountryResponse:
    """Get Ad Accounts countries"""
    if not BaseResourcesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseResourcesApi.subclasses[0]().ad_account_countries_get()


@router.get(
    "/resources/delivery_metrics",
    responses={
        200: {"model": DeliveryMetricsResponse, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["resources"],
    summary="Get available metrics&#39; definitions",
    response_model_by_alias=True,
)
async def delivery_metrics_get(
    report_type: Annotated[Optional[StrictStr], Field(description="Report type.")] = Query(None, description="Report type.", alias="report_type"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read", "pins:read", "user_accounts:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read", "pins:read", "user_accounts:read"]
    ),
) -> DeliveryMetricsResponse:
    """Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The &#x60;display_name&#x60; attribute will match how the metric is named in our native tools like Ads Manager. See &lt;a href&#x3D;&#39;/docs/api-features/analytics-overview/&#39;&gt;Organic Analytics&lt;/a&gt; and &lt;a href&#x3D;&#39;/docs/api-features/ads-reporting/&#39;&gt;Ads Analytics&lt;/a&gt; for more information."""
    if not BaseResourcesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseResourcesApi.subclasses[0]().delivery_metrics_get(report_type)


@router.get(
    "/resources/lead_form_questions",
    responses={
        200: {"description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
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
    """Get a list of all lead form question type names. Some questions might not be used.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/using-beta-and-restricted-features/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;"""
    if not BaseResourcesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseResourcesApi.subclasses[0]().lead_form_questions_get()


@router.get(
    "/resources/metrics_ready_state",
    responses={
        200: {"model": BookClosedResponse, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["resources"],
    summary="Get metrics ready state",
    response_model_by_alias=True,
)
async def metrics_ready_state_get(
    var_date: Annotated[str, Field(strict=True, description="Analytics reports request date (UTC). Format: YYYY-MM-DD")] = Query(None, description="Analytics reports request date (UTC). Format: YYYY-MM-DD", alias="date", regex=r"^(\d{4})-(\d{2})-(\d{2})$"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> BookClosedResponse:
    """Learn whether conversion or non-conversion metrics are finalized and ready to query."""
    if not BaseResourcesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseResourcesApi.subclasses[0]().metrics_ready_state_get(var_date)


@router.get(
    "/resources/targeting/interests/{interest_id}",
    responses={
        200: {"model": SingleInterestTargetingOptionResponse, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
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
) -> SingleInterestTargetingOptionResponse:
    """&lt;p&gt;Get details of a specific interest given interest ID.&lt;/p&gt; &lt;p&gt;Click &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid&#x3D;118370875\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; for a spreadsheet listing interests and their IDs.&lt;/p&gt;"""
    if not BaseResourcesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseResourcesApi.subclasses[0]().interest_targeting_options_get(interest_id)


@router.get(
    "/resources/targeting/{targeting_type}",
    responses={
        200: {"model": List[object], "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["resources"],
    summary="Get targeting options",
    response_model_by_alias=True,
)
async def targeting_options_get(
    targeting_type: Annotated[StrictStr, Field(description="Public targeting type.")] = Path(..., description="Public targeting type."),
    client_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Client ID.")] = Query(None, description="Client ID.", alias="client_id", regex=r"^\d+$", max_length=18),
    oauth_signature: Annotated[Optional[StrictStr], Field(description="Oauth signature")] = Query(None, description="Oauth signature", alias="oauth_signature"),
    timestamp: Annotated[Optional[Annotated[str, Field(strict=True)]], Field(description="Timestamp")] = Query(None, description="Timestamp", alias="timestamp", regex=r"\d+"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> List[object]:
    """&lt;p&gt;You can use targeting values in ads placement to define your intended audience. &lt;/p&gt; &lt;p&gt;Targeting metrics are organized around targeting specifications.&lt;/p&gt; &lt;p&gt;For more information on ads targeting, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Sample return:&lt;/b&gt;&lt;/p&gt; &lt;pre class&#x3D;\&quot;literal-block\&quot;&gt; [{&amp;quot;36313&amp;quot;: &amp;quot;Australia: Moreton Bay - North&amp;quot;, &amp;quot;124735&amp;quot;: &amp;quot;Canada: North Battleford&amp;quot;, &amp;quot;36109&amp;quot;: &amp;quot;Australia: Murray&amp;quot;, &amp;quot;36108&amp;quot;: &amp;quot;Australia: Mid North Coast&amp;quot;, &amp;quot;36101&amp;quot;: &amp;quot;Australia: Capital Region&amp;quot;, &amp;quot;811&amp;quot;: &amp;quot;U.S.: Reno&amp;quot;, &amp;quot;36103&amp;quot;: &amp;quot;Australia: Central West&amp;quot;, &amp;quot;36102&amp;quot;: &amp;quot;Australia: Central Coast&amp;quot;, &amp;quot;36105&amp;quot;: &amp;quot;Australia: Far West and Orana&amp;quot;, &amp;quot;36104&amp;quot;: &amp;quot;Australia: Coffs Harbour - Grafton&amp;quot;, &amp;quot;36107&amp;quot;: &amp;quot;Australia: Illawarra&amp;quot;, &amp;quot;36106&amp;quot;: &amp;quot;Australia: Hunter Valley Exc Newcastle&amp;quot;, &amp;quot;554017&amp;quot;: &amp;quot;New Zealand: Wanganui&amp;quot;, &amp;quot;554016&amp;quot;: &amp;quot;New Zealand: Marlborough&amp;quot;, &amp;quot;554015&amp;quot;: &amp;quot;New Zealand: Gisborne&amp;quot;, &amp;quot;554014&amp;quot;: &amp;quot;New Zealand: Tararua&amp;quot;, &amp;quot;554013&amp;quot;: &amp;quot;New Zealand: Invercargill&amp;quot;, &amp;quot;GR&amp;quot;: &amp;quot;Greece&amp;quot;, &amp;quot;554011&amp;quot;: &amp;quot;New Zealand: Whangarei&amp;quot;, &amp;quot;554010&amp;quot;: &amp;quot;New Zealand: Far North&amp;quot;, &amp;quot;717&amp;quot;: &amp;quot;U.S.: Quincy-Hannibal-Keokuk&amp;quot;, &amp;quot;716&amp;quot;: &amp;quot;U.S.: Baton Rouge&amp;quot;,...}] &lt;/pre&gt;"""
    if not BaseResourcesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseResourcesApi.subclasses[0]().targeting_options_get(targeting_type, client_id, oauth_signature, timestamp, ad_account_id)

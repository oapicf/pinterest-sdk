# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.lead_ads_api_base import BaseLeadAdsApi
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
from openapi_server.models.ad_accounts_subscriptions_get_list200_response import AdAccountsSubscriptionsGetList200Response
from openapi_server.models.lead_subscription import LeadSubscription
from openapi_server.models.lead_subscription_post_params_create import LeadSubscriptionPostParamsCreate
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ad_accounts/{ad_account_id}/leads/subscriptions",
    responses={
        200: {"model": AdAccountsSubscriptionsGetList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["lead_ads"],
    summary="Get lead ads subscriptions",
    response_model_by_alias=True,
)
async def ad_accounts_subscriptions_get_list(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> AdAccountsSubscriptionsGetList200Response:
    """Get the advertiser&#39;s list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed."""
    if not BaseLeadAdsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLeadAdsApi.subclasses[0]().ad_accounts_subscriptions_get_list(ad_account_id, bookmark, page_size)


@router.post(
    "/ad_accounts/{ad_account_id}/leads/subscriptions",
    responses={
        200: {"model": LeadSubscription, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["lead_ads"],
    summary="Create lead ads subscription",
    response_model_by_alias=True,
)
async def ad_accounts_subscriptions_post(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    lead_subscription_post_params_create: LeadSubscriptionPostParamsCreate = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> LeadSubscription:
    """Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM."""
    if not BaseLeadAdsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLeadAdsApi.subclasses[0]().ad_accounts_subscriptions_post(ad_account_id, lead_subscription_post_params_create)


@router.get(
    "/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}",
    responses={
        200: {"model": LeadSubscription, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["lead_ads"],
    summary="Get lead ads subscription by ID",
    response_model_by_alias=True,
)
async def ad_accounts_subscriptions_get_by_id(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    subscription_id: Annotated[str, Field(strict=True, description="Unique identifier of a subscription.")] = Path(..., description="Unique identifier of a subscription.", regex=r"^\d+$"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> LeadSubscription:
    """Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.&#39;"""
    if not BaseLeadAdsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLeadAdsApi.subclasses[0]().ad_accounts_subscriptions_get_by_id(ad_account_id, subscription_id)


@router.delete(
    "/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}",
    responses={
        200: {"model": LeadSubscription, "description": "The request has succeeded."},
        204: {"description": "Resource deleted successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["lead_ads"],
    summary="Delete lead ads subscription",
    response_model_by_alias=True,
)
async def ad_accounts_subscriptions_del_by_id(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    subscription_id: Annotated[str, Field(strict=True, description="Unique identifier of a subscription.")] = Path(..., description="Unique identifier of a subscription.", regex=r"^\d+$"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> LeadSubscription:
    """Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.&#39;"""
    if not BaseLeadAdsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseLeadAdsApi.subclasses[0]().ad_accounts_subscriptions_del_by_id(ad_account_id, subscription_id)

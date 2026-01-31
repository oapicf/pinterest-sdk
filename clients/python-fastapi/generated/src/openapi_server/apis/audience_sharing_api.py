# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.audience_sharing_api_base import BaseAudienceSharingApi
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
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.ad_accounts_audiences_shared_accounts_list200_response import AdAccountsAudiencesSharedAccountsList200Response
from openapi_server.models.audience_account_type import AudienceAccountType
from openapi_server.models.audiences_list200_response import AudiencesList200Response
from openapi_server.models.business_shared_audience import BusinessSharedAudience
from openapi_server.models.business_shared_audience_response import BusinessSharedAudienceResponse
from openapi_server.models.error import Error
from openapi_server.models.shared_audience import SharedAudience
from openapi_server.models.shared_audience_response import SharedAudienceResponse
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ad_accounts/{ad_account_id}/audiences/shared/accounts",
    responses={
        200: {"model": AdAccountsAudiencesSharedAccountsList200Response, "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account audiences shared accounts parameters."},
        404: {"model": Error, "description": "Shared accounts not found."},
        "default": {"model": Error, "description": "Unexpected error."},
    },
    tags=["audience_sharing"],
    summary="List accounts with access to an audience owned by an ad account",
    response_model_by_alias=True,
)
async def ad_accounts_audiences_shared_accounts_list(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    audience_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of the audience to use to filter the results.")] = Query(None, description="Unique identifier of the audience to use to filter the results.", alias="audience_id", regex=r"^\d+$", max_length=18),
    account_type: Annotated[AudienceAccountType, Field(description="Filter accounts by account type.")] = Query(AD_ACCOUNT, description="Filter accounts by account type.", alias="account_type"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> AdAccountsAudiencesSharedAccountsList200Response:
    """List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account."""
    if not BaseAudienceSharingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAudienceSharingApi.subclasses[0]().ad_accounts_audiences_shared_accounts_list(ad_account_id, audience_id, account_type, page_size, bookmark)


@router.patch(
    "/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared",
    responses={
        200: {"model": SharedAudienceResponse, "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account id."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["audience_sharing"],
    summary="Update audience sharing between ad accounts",
    response_model_by_alias=True,
)
async def update_ad_account_to_ad_account_shared_audience(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    shared_audience: SharedAudience = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> SharedAudienceResponse:
    """From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/create-and-manage-accounts&#39;&gt;Pinterest Business Hierarchy&lt;/a&gt; as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/using-beta-and-restricted-features/&#39;&gt;Learn more&lt;/a&gt;."""
    if not BaseAudienceSharingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAudienceSharingApi.subclasses[0]().update_ad_account_to_ad_account_shared_audience(ad_account_id, shared_audience)


@router.patch(
    "/ad_accounts/{ad_account_id}/audiences/businesses/shared",
    responses={
        200: {"model": BusinessSharedAudienceResponse, "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account id."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["audience_sharing"],
    summary="Update audience sharing from an ad account to businesses",
    response_model_by_alias=True,
)
async def update_ad_account_to_business_shared_audience(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    business_shared_audience: BusinessSharedAudience = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> BusinessSharedAudienceResponse:
    """From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/using-beta-and-restricted-features/&#39;&gt;Learn more&lt;/a&gt;."""
    if not BaseAudienceSharingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAudienceSharingApi.subclasses[0]().update_ad_account_to_business_shared_audience(ad_account_id, business_shared_audience)


@router.get(
    "/businesses/{business_id}/audiences",
    responses={
        200: {"model": AudiencesList200Response, "description": "Success"},
        400: {"model": Error, "description": "Invalid parameters."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["audience_sharing"],
    summary="List received audiences for a business",
    response_model_by_alias=True,
)
async def shared_audiences_for_business_list(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    order: Annotated[Optional[StrictStr], Field(description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")] = Query(None, description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", alias="order"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:read"]
    ),
) -> AudiencesList200Response:
    """Get a list of received audiences for the given business."""
    if not BaseAudienceSharingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAudienceSharingApi.subclasses[0]().shared_audiences_for_business_list(business_id, bookmark, order, page_size)


@router.get(
    "/businesses/{business_id}/audiences/shared/accounts",
    responses={
        200: {"model": AdAccountsAudiencesSharedAccountsList200Response, "description": "Success"},
        400: {"model": Error, "description": "Invalid business audiences shared accounts parameters."},
        404: {"model": Error, "description": "Shared accounts not found."},
        "default": {"model": Error, "description": "Unexpected error."},
    },
    tags=["audience_sharing"],
    summary="List accounts with access to an audience owned by a business",
    response_model_by_alias=True,
)
async def business_account_audiences_shared_accounts_list(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    audience_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of the audience to use to filter the results.")] = Query(None, description="Unique identifier of the audience to use to filter the results.", alias="audience_id", regex=r"^\d+$", max_length=18),
    account_type: Annotated[AudienceAccountType, Field(description="Filter accounts by account type.")] = Query(AD_ACCOUNT, description="Filter accounts by account type.", alias="account_type"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:read"]
    ),
) -> AdAccountsAudiencesSharedAccountsList200Response:
    """List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned."""
    if not BaseAudienceSharingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAudienceSharingApi.subclasses[0]().business_account_audiences_shared_accounts_list(business_id, audience_id, account_type, page_size, bookmark)


@router.patch(
    "/businesses/{business_id}/audiences/ad_accounts/shared",
    responses={
        200: {"model": SharedAudienceResponse, "description": "Success"},
        400: {"model": Error, "description": "Invalid parameters."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["audience_sharing"],
    summary="Update audience sharing from a business to ad accounts",
    response_model_by_alias=True,
)
async def update_business_to_ad_account_shared_audience(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    shared_audience: SharedAudience = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:write"]
    ),
) -> SharedAudienceResponse:
    """From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. &lt;ul&gt; &lt;li&gt;If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.&lt;/li&gt; &lt;li&gt;If the business is the recipient of the audience, it can share with any of its owned ad accounts.&lt;/li&gt; &lt;/ul&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/using-beta-and-restricted-features/&#39;&gt;Learn more&lt;/a&gt;."""
    if not BaseAudienceSharingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAudienceSharingApi.subclasses[0]().update_business_to_ad_account_shared_audience(business_id, shared_audience)


@router.patch(
    "/businesses/{business_id}/audiences/businesses/shared",
    responses={
        200: {"model": BusinessSharedAudienceResponse, "description": "Success"},
        400: {"model": Error, "description": "Invalid parameters."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["audience_sharing"],
    summary="Update audience sharing between businesses",
    response_model_by_alias=True,
)
async def update_business_to_business_shared_audience(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    business_shared_audience: BusinessSharedAudience = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:write"]
    ),
) -> BusinessSharedAudienceResponse:
    """From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/using-beta-and-restricted-features/&#39;&gt;Learn more&lt;/a&gt;."""
    if not BaseAudienceSharingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAudienceSharingApi.subclasses[0]().update_business_to_business_shared_audience(business_id, business_shared_audience)

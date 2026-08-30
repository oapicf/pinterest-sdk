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
from openapi_server.models.ad_account_to_ad_account_shared_audience import AdAccountToAdAccountSharedAudience
from openapi_server.models.ad_account_to_ad_account_shared_audience_update_with_required_body import AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
from openapi_server.models.ad_account_to_business_shared_audience import AdAccountToBusinessSharedAudience
from openapi_server.models.ad_account_to_business_shared_audience_update_with_required_body import AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
from openapi_server.models.ad_accounts_audiences_shared_accounts_list200_response import AdAccountsAudiencesSharedAccountsList200Response
from openapi_server.models.audience_account_type import AudienceAccountType
from openapi_server.models.business_to_ad_account_shared_audience import BusinessToAdAccountSharedAudience
from openapi_server.models.business_to_ad_account_shared_audience_update_with_required_body import BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
from openapi_server.models.business_to_business_shared_audience import BusinessToBusinessSharedAudience
from openapi_server.models.business_to_business_shared_audience_update_with_required_body import BusinessToBusinessSharedAudienceUpdateWithRequiredBody
from openapi_server.models.order import Order
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.shared_audiences_for_business_list200_response import SharedAudiencesForBusinessList200Response
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.patch(
    "/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared",
    responses={
        200: {"model": AdAccountToAdAccountSharedAudience, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["audience_sharing"],
    summary="Update audience sharing between ad accounts",
    response_model_by_alias=True,
)
async def update_ad_account_to_ad_account_shared_audience(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    ad_account_to_ad_account_shared_audience_update_with_required_body: AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> AdAccountToAdAccountSharedAudience:
    """From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/)."""
    if not BaseAudienceSharingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAudienceSharingApi.subclasses[0]().update_ad_account_to_ad_account_shared_audience(ad_account_id, ad_account_to_ad_account_shared_audience_update_with_required_body)


@router.patch(
    "/ad_accounts/{ad_account_id}/audiences/businesses/shared",
    responses={
        200: {"model": AdAccountToBusinessSharedAudience, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["audience_sharing"],
    summary="Update audience sharing from an ad account to businesses",
    response_model_by_alias=True,
)
async def update_ad_account_to_business_shared_audience(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    ad_account_to_business_shared_audience_update_with_required_body: AdAccountToBusinessSharedAudienceUpdateWithRequiredBody = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> AdAccountToBusinessSharedAudience:
    """From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/)."""
    if not BaseAudienceSharingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAudienceSharingApi.subclasses[0]().update_ad_account_to_business_shared_audience(ad_account_id, ad_account_to_business_shared_audience_update_with_required_body)


@router.get(
    "/ad_accounts/{ad_account_id}/audiences/shared/accounts",
    responses={
        200: {"model": AdAccountsAudiencesSharedAccountsList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["audience_sharing"],
    summary="List accounts with access to an audience owned by an ad account",
    response_model_by_alias=True,
)
async def ad_accounts_audiences_shared_accounts_list(
    audience_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of the audience to use to filter the results.")] = Query(None, description="Unique identifier of the audience to use to filter the results.", alias="audience_id", regex=r"^\d+$", max_length=18),
    account_type: Annotated[AudienceAccountType, Field(description="Filter accounts by account type.")] = Query(None, description="Filter accounts by account type.", alias="account_type"),
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
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
    return await BaseAudienceSharingApi.subclasses[0]().ad_accounts_audiences_shared_accounts_list(audience_id, account_type, ad_account_id, bookmark, page_size)


@router.get(
    "/businesses/{business_id}/audiences",
    responses={
        200: {"model": SharedAudiencesForBusinessList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["audience_sharing"],
    summary="List received audiences for a business",
    response_model_by_alias=True,
)
async def shared_audiences_for_business_list(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    order: Annotated[Optional[Order], Field(description="The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.")] = Query(None, description="The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.", alias="order"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:read"]
    ),
) -> SharedAudiencesForBusinessList200Response:
    """Get a list of received audiences for the given business."""
    if not BaseAudienceSharingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAudienceSharingApi.subclasses[0]().shared_audiences_for_business_list(business_id, order, bookmark, page_size)


@router.patch(
    "/businesses/{business_id}/audiences/ad_accounts/shared",
    responses={
        200: {"model": BusinessToAdAccountSharedAudience, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["audience_sharing"],
    summary="Update audience sharing from a business to ad accounts",
    response_model_by_alias=True,
)
async def update_business_to_ad_account_shared_audience(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    business_to_ad_account_shared_audience_update_with_required_body: BusinessToAdAccountSharedAudienceUpdateWithRequiredBody = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:write"]
    ),
) -> BusinessToAdAccountSharedAudience:
    """From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.  - If the business is the owner of the audience, it can share with any ad account within the same business hierarchy. - If the business is the recipient of the audience, it can share with any of its owned ad accounts.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/)."""
    if not BaseAudienceSharingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAudienceSharingApi.subclasses[0]().update_business_to_ad_account_shared_audience(business_id, business_to_ad_account_shared_audience_update_with_required_body)


@router.patch(
    "/businesses/{business_id}/audiences/businesses/shared",
    responses={
        200: {"model": BusinessToBusinessSharedAudience, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["audience_sharing"],
    summary="Update audience sharing between businesses",
    response_model_by_alias=True,
)
async def update_business_to_business_shared_audience(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    business_to_business_shared_audience_update_with_required_body: BusinessToBusinessSharedAudienceUpdateWithRequiredBody = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:write"]
    ),
) -> BusinessToBusinessSharedAudience:
    """From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/)."""
    if not BaseAudienceSharingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAudienceSharingApi.subclasses[0]().update_business_to_business_shared_audience(business_id, business_to_business_shared_audience_update_with_required_body)


@router.get(
    "/businesses/{business_id}/audiences/shared/accounts",
    responses={
        200: {"model": AdAccountsAudiencesSharedAccountsList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["audience_sharing"],
    summary="List accounts with access to an audience owned by a business",
    response_model_by_alias=True,
)
async def business_account_audiences_shared_accounts_list(
    business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")] = Path(..., description="Unique identifier of the requesting business.", regex=r"^\d+$", min_length=1, max_length=20),
    audience_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of the audience to use to filter the results.")] = Query(None, description="Unique identifier of the audience to use to filter the results.", alias="audience_id", regex=r"^\d+$", max_length=18),
    account_type: Annotated[AudienceAccountType, Field(description="Filter accounts by account type.")] = Query(None, description="Filter accounts by account type.", alias="account_type"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["biz_access:read"]
    ),
) -> AdAccountsAudiencesSharedAccountsList200Response:
    """List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned."""
    if not BaseAudienceSharingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAudienceSharingApi.subclasses[0]().business_account_audiences_shared_accounts_list(business_id, audience_id, account_type, bookmark, page_size)

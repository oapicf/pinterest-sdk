# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.customer_lists_api_base import BaseCustomerListsApi
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
from openapi_server.models.customer_list import CustomerList
from openapi_server.models.customer_list_request import CustomerListRequest
from openapi_server.models.customer_list_update_request import CustomerListUpdateRequest
from openapi_server.models.customer_lists_list200_response import CustomerListsList200Response
from openapi_server.models.error import Error
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ad_accounts/{ad_account_id}/customer_lists",
    responses={
        200: {"model": CustomerListsList200Response, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["customer_lists"],
    summary="Get customer lists",
    response_model_by_alias=True,
)
async def customer_lists_list(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    order: Annotated[Optional[StrictStr], Field(description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")] = Query(None, description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", alias="order"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> CustomerListsList200Response:
    """&lt;p&gt;Get a set of customer lists including id and name based on the filters provided.&lt;/p&gt; &lt;p&gt;(Customer lists are a type of audience.) For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;  or the &lt;a href&#x3D;\&quot;/docs/api-features/targeting-overview/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audiences&lt;/a&gt; section of the ads management guide.&lt;/p&gt;"""
    if not BaseCustomerListsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCustomerListsApi.subclasses[0]().customer_lists_list(ad_account_id, page_size, order, bookmark)


@router.post(
    "/ad_accounts/{ad_account_id}/customer_lists",
    responses={
        200: {"model": CustomerList, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["customer_lists"],
    summary="Create customer lists",
    response_model_by_alias=True,
)
async def customer_lists_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    customer_list_request: Annotated[CustomerListRequest, Field(description="Parameters to get Customer lists info")] = Body(None, description="Parameters to get Customer lists info"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> CustomerList:
    """&lt;p&gt;Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).&lt;/p&gt; &lt;p&gt;A customer list is one of the four types of Pinterest audiences: for more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt; or the &lt;a href&#x3D;\&quot;/docs/api-features/targeting-overview/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audiences&lt;/a&gt; section of the ads management guide.&lt;p/&gt; &lt;p&gt;&lt;b&gt;Please review our &lt;u&gt;&lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting#section-13341\&quot; target&#x3D;\&quot;_blank\&quot;&gt;requirements&lt;/a&gt;&lt;/u&gt; for what type of information is allowed when uploading a customer list.&lt;/b&gt;&lt;/p&gt; &lt;p&gt;When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.&lt;/p&gt; &lt;p&gt;To use your customer list after creating it, convert it into a customer list audience by passing the &#x60;CUSTOMER_LIST&#x60; audience type at the &lt;a href&#x3D;\&quot;https://developer.pinterest.com/docs/api/v5/audiences-create\&quot; target&#x3D;\&quot;blank\&quot;&gt;create audience endpoint&lt;/a&gt;.&lt;/p&gt;"""
    if not BaseCustomerListsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCustomerListsApi.subclasses[0]().customer_lists_create(ad_account_id, customer_list_request)


@router.get(
    "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}",
    responses={
        200: {"model": CustomerList, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["customer_lists"],
    summary="Get customer list",
    response_model_by_alias=True,
)
async def customer_lists_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    customer_list_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of a customer list")] = Path(..., description="Unique identifier of a customer list", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> CustomerList:
    """Gets a specific customer list given the customer list ID."""
    if not BaseCustomerListsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCustomerListsApi.subclasses[0]().customer_lists_get(ad_account_id, customer_list_id)


@router.patch(
    "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}",
    responses={
        200: {"model": CustomerList, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["customer_lists"],
    summary="Update customer list",
    response_model_by_alias=True,
)
async def customer_lists_update(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    customer_list_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of a customer list")] = Path(..., description="Unique identifier of a customer list", regex=r"^\d+$", max_length=18),
    customer_list_update_request: CustomerListUpdateRequest = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> CustomerList:
    """&lt;p&gt;Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)&lt;/p&gt; &lt;p&gt;When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records to add will be deleted when the matching process is complete.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt; or the &lt;a href&#x3D;\&quot;/docs/api-features/targeting-overview/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audiences&lt;/a&gt; section of the ads management guide.&lt;/p&gt;"""
    if not BaseCustomerListsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCustomerListsApi.subclasses[0]().customer_lists_update(ad_account_id, customer_list_id, customer_list_update_request)

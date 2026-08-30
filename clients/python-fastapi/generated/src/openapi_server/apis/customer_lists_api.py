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
from pydantic import Field, StrictBool, StrictStr, field_validator
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.customer_list import CustomerList
from openapi_server.models.customer_list_create import CustomerListCreate
from openapi_server.models.customer_list_update_with_required_body import CustomerListUpdateWithRequiredBody
from openapi_server.models.customer_lists_list200_response import CustomerListsList200Response
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ad_accounts/{ad_account_id}/customer_lists",
    responses={
        200: {"model": CustomerListsList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["customer_lists"],
    summary="Get customer lists",
    response_model_by_alias=True,
)
async def customer_lists_list(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18)] = Path(..., description="", regex=r"^\d+$", max_length=18),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    order: Annotated[Optional[PinterestLibPaginationOrder], Field(description="The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.")] = Query(None, description="The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.", alias="order"),
    exclude_nca: Annotated[Optional[StrictBool], Field(description="When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all).")] = Query(False, description="When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all).", alias="exclude_nca"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> CustomerListsList200Response:
    """Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide."""
    if not BaseCustomerListsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCustomerListsApi.subclasses[0]().customer_lists_list(ad_account_id, bookmark, page_size, order, exclude_nca)


@router.post(
    "/ad_accounts/{ad_account_id}/customer_lists",
    responses={
        200: {"model": CustomerList, "description": "The request has succeeded."},
        201: {"model": CustomerList, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["customer_lists"],
    summary="Create customer lists",
    response_model_by_alias=True,
)
async def customer_lists_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18)] = Path(..., description="", regex=r"^\d+$", max_length=18),
    customer_list_create: CustomerListCreate = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> CustomerList:
    """Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the &#x60;CUSTOMER_LIST&#x60; audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create)."""
    if not BaseCustomerListsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCustomerListsApi.subclasses[0]().customer_lists_create(ad_account_id, customer_list_create)


@router.get(
    "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}",
    responses={
        200: {"model": CustomerList, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["customer_lists"],
    summary="Get customer list",
    response_model_by_alias=True,
)
async def customer_lists_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18)] = Path(..., description="", regex=r"^\d+$", max_length=18),
    customer_list_id: Annotated[str, Field(strict=True, max_length=18, description="Customer list ID.")] = Path(..., description="Customer list ID.", regex=r"^\d+$", max_length=18),
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
        200: {"model": CustomerList, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["customer_lists"],
    summary="Update customer list",
    response_model_by_alias=True,
)
async def customer_lists_update(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18)] = Path(..., description="", regex=r"^\d+$", max_length=18),
    customer_list_id: Annotated[str, Field(strict=True, max_length=18, description="Customer list ID.")] = Path(..., description="Customer list ID.", regex=r"^\d+$", max_length=18),
    customer_list_update_with_required_body: CustomerListUpdateWithRequiredBody = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> CustomerList:
    """Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \&quot;CUSTOMER_LIST\&quot; audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide."""
    if not BaseCustomerListsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCustomerListsApi.subclasses[0]().customer_lists_update(ad_account_id, customer_list_id, customer_list_update_with_required_body)

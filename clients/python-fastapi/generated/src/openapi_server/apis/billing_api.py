# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.billing_api_base import BaseBillingApi
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
from datetime import date
from pydantic import Field, StrictBool, StrictStr, field_validator
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.ads_credit_redeem import AdsCreditRedeem
from openapi_server.models.ads_credit_redeem_create import AdsCreditRedeemCreate
from openapi_server.models.ads_credits_discounts_get200_response import AdsCreditsDiscountsGet200Response
from openapi_server.models.billing_invoice_document_type import BillingInvoiceDocumentType
from openapi_server.models.billing_invoice_download_response import BillingInvoiceDownloadResponse
from openapi_server.models.billing_invoice_sort_field import BillingInvoiceSortField
from openapi_server.models.billing_invoice_status import BillingInvoiceStatus
from openapi_server.models.billing_invoices_get200_response import BillingInvoicesGet200Response
from openapi_server.models.billing_profiles_get200_response import BillingProfilesGet200Response
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder
from openapi_server.models.ssio_account import SSIOAccount
from openapi_server.models.ssio_insertion_order import SSIOInsertionOrder
from openapi_server.models.ssio_insertion_order_create import SSIOInsertionOrderCreate
from openapi_server.models.ssio_insertion_order_status_response import SSIOInsertionOrderStatusResponse
from openapi_server.models.ssio_insertion_order_update import SSIOInsertionOrderUpdate
from openapi_server.models.ssio_insertion_orders_status_get_by_ad_account200_response import SsioInsertionOrdersStatusGetByAdAccount200Response
from openapi_server.models.ssio_order_lines_get_by_ad_account200_response import SsioOrderLinesGetByAdAccount200Response
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ad_accounts/{ad_account_id}/ads_credit/discounts",
    responses={
        200: {"model": AdsCreditsDiscountsGet200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["billing"],
    summary="Get ads credit discounts",
    response_model_by_alias=True,
)
async def ads_credits_discounts_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read", "billing:read"]
    ),
) -> AdsCreditsDiscountsGet200Response:
    """Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**"""
    if not BaseBillingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBillingApi.subclasses[0]().ads_credits_discounts_get(ad_account_id, bookmark, page_size)


@router.post(
    "/ad_accounts/{ad_account_id}/ads_credit/redeem",
    responses={
        200: {"model": AdsCreditRedeem, "description": "The request has succeeded."},
        201: {"model": AdsCreditRedeem, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["billing"],
    summary="Redeem ad credits",
    response_model_by_alias=True,
)
async def ads_credit_redeem(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    ads_credit_redeem_create: AdsCreditRedeemCreate = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write", "billing:write"]
    ),
) -> AdsCreditRedeem:
    """Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**"""
    if not BaseBillingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBillingApi.subclasses[0]().ads_credit_redeem(ad_account_id, ads_credit_redeem_create)


@router.get(
    "/ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download",
    responses={
        200: {"model": BillingInvoiceDownloadResponse, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["billing"],
    summary="Get download url for a billing invoice",
    response_model_by_alias=True,
)
async def billing_invoice_download_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    billing_invoice_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of a billing invoice.")] = Path(..., description="Unique identifier of a billing invoice.", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read", "billing:read"]
    ),
) -> BillingInvoiceDownloadResponse:
    """Get download url for a billing invoice."""
    if not BaseBillingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBillingApi.subclasses[0]().billing_invoice_download_get(ad_account_id, billing_invoice_id)


@router.get(
    "/ad_accounts/{ad_account_id}/billing_invoices",
    responses={
        200: {"model": BillingInvoicesGet200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["billing"],
    summary="Get billing invoices",
    response_model_by_alias=True,
)
async def billing_invoices_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    order: Annotated[Optional[PinterestLibPaginationOrder], Field(description="The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.")] = Query(None, description="The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.", alias="order"),
    sort: Annotated[Optional[BillingInvoiceSortField], Field(description="Field of which to sort billing invoices")] = Query('DUE_DATE', description="Field of which to sort billing invoices", alias="sort"),
    status: Annotated[Optional[BillingInvoiceStatus], Field(description="Status of billing invoices to filter by")] = Query(None, description="Status of billing invoices to filter by", alias="status"),
    document_type: Annotated[Optional[BillingInvoiceDocumentType], Field(description="Document type of billing invoices to filter by")] = Query(None, description="Document type of billing invoices to filter by", alias="document_type"),
    start_due_date: Annotated[Optional[date], Field(description="Starting point for due dates when searching for invoices. Format: YYYY-MM-DD")] = Query(None, description="Starting point for due dates when searching for invoices. Format: YYYY-MM-DD", alias="start_due_date"),
    end_due_date: Annotated[Optional[date], Field(description="Ending point for due dates when searching for invoices. Format: YYYY-MM-DD")] = Query(None, description="Ending point for due dates when searching for invoices. Format: YYYY-MM-DD", alias="end_due_date"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read", "billing:read"]
    ),
) -> BillingInvoicesGet200Response:
    """Get billing invoices in the advertiser account."""
    if not BaseBillingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBillingApi.subclasses[0]().billing_invoices_get(ad_account_id, bookmark, page_size, order, sort, status, document_type, start_due_date, end_due_date)


@router.get(
    "/ad_accounts/{ad_account_id}/billing_profiles",
    responses={
        200: {"model": BillingProfilesGet200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["billing"],
    summary="Get billing profiles",
    response_model_by_alias=True,
)
async def billing_profiles_get(
    is_active: Annotated[StrictBool, Field(description="Return active billing profiles, if false return all billing profiles.")] = Query(None, description="Return active billing profiles, if false return all billing profiles.", alias="is_active"),
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read", "billing:read"]
    ),
) -> BillingProfilesGet200Response:
    """Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**"""
    if not BaseBillingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBillingApi.subclasses[0]().billing_profiles_get(is_active, ad_account_id, bookmark, page_size)


@router.get(
    "/ad_accounts/{ad_account_id}/ssio/accounts",
    responses={
        200: {"model": SSIOAccount, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["billing"],
    summary="Get Salesforce account details including bill-to information.",
    response_model_by_alias=True,
)
async def ssio_accounts_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> SSIOAccount:
    """  Get Salesforce account details including bill-to information to be used in insertion orders process for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign."""
    if not BaseBillingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBillingApi.subclasses[0]().ssio_accounts_get(ad_account_id)


@router.post(
    "/ad_accounts/{ad_account_id}/ssio/insertion_orders",
    responses={
        200: {"model": SSIOInsertionOrder, "description": "The request has succeeded."},
        201: {"model": SSIOInsertionOrder, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["billing"],
    summary="Create insertion order through SSIO.",
    response_model_by_alias=True,
)
async def ssio_insertion_order_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    ssio_insertion_order_create: SSIOInsertionOrderCreate = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> SSIOInsertionOrder:
    """  Create insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign."""
    if not BaseBillingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBillingApi.subclasses[0]().ssio_insertion_order_create(ad_account_id, ssio_insertion_order_create)


@router.patch(
    "/ad_accounts/{ad_account_id}/ssio/insertion_orders",
    responses={
        200: {"model": SSIOInsertionOrder, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["billing"],
    summary="Edit insertion order through SSIO.",
    response_model_by_alias=True,
)
async def ssio_insertion_order_edit(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    ssio_insertion_order_update: SSIOInsertionOrderUpdate = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> SSIOInsertionOrder:
    """  Edit insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign."""
    if not BaseBillingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBillingApi.subclasses[0]().ssio_insertion_order_edit(ad_account_id, ssio_insertion_order_update)


@router.get(
    "/ad_accounts/{ad_account_id}/ssio/insertion_orders/status",
    responses={
        200: {"model": SsioInsertionOrdersStatusGetByAdAccount200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["billing"],
    summary="Get insertion order status by ad account id.",
    response_model_by_alias=True,
)
async def ssio_insertion_orders_status_get_by_ad_account(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> SsioInsertionOrdersStatusGetByAdAccount200Response:
    """  Get insertion order status for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign."""
    if not BaseBillingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBillingApi.subclasses[0]().ssio_insertion_orders_status_get_by_ad_account(ad_account_id, bookmark, page_size)


@router.get(
    "/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status",
    responses={
        200: {"model": SSIOInsertionOrderStatusResponse, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["billing"],
    summary="Get insertion order status by pin order id.",
    response_model_by_alias=True,
)
async def ssio_insertion_orders_status_get_by_pin_order_id(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    pin_order_id: Annotated[StrictStr, Field(description="The pin order id associated with the ssio insertion order")] = Path(..., description="The pin order id associated with the ssio insertion order"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> SSIOInsertionOrderStatusResponse:
    """  Get insertion order status for &#x60;pin_order_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign."""
    if not BaseBillingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBillingApi.subclasses[0]().ssio_insertion_orders_status_get_by_pin_order_id(ad_account_id, pin_order_id)


@router.get(
    "/ad_accounts/{ad_account_id}/ssio/order_lines",
    responses={
        200: {"model": SsioOrderLinesGetByAdAccount200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["billing"],
    summary="Get Salesforce order lines by ad account id.",
    response_model_by_alias=True,
)
async def ssio_order_lines_get_by_ad_account(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    pin_order_id: Annotated[Optional[StrictStr], Field(description="The pin order id associated with the SSIO insertion order")] = Query(None, description="The pin order id associated with the SSIO insertion order", alias="pin_order_id"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> SsioOrderLinesGetByAdAccount200Response:
    """  Get Salesforce order lines for account id &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign."""
    if not BaseBillingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBillingApi.subclasses[0]().ssio_order_lines_get_by_ad_account(ad_account_id, pin_order_id, bookmark, page_size)
